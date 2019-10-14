package roadgraph;

public class MapTempNodeVector implements Comparable<MapTempNodeVector>{

	private MapNode startNode;
	private MapNode endNode;
	double actualDistance;
	double totalDistance;
	double lineDistance;


	public MapTempNodeVector(MapNode s, MapNode g){
		this.startNode = s;
		this.endNode = g;
		this.actualDistance = Double.POSITIVE_INFINITY;
		this.totalDistance = Double.POSITIVE_INFINITY;
		this.lineDistance = 0;
	}

	public void setEstimatedDistance(MapNode s, MapNode g){
		this.lineDistance = s.getLocation().distance(g.getLocation());
		updateTotalDistance();
	}

	public void updateTotalDistance(){
		this.totalDistance = this.actualDistance + this.lineDistance;
	}

	public void setActualDistance(double dist){
		this.actualDistance = dist;
	}

	public void initializeActualDistance(){
		this.actualDistance = 0;
	}

	public void initializePredictedDistance(){
		this.lineDistance = 0;
	}

	public MapNode getStartNode(){
		return this.startNode;
	}

	public MapNode getEndNode(){
		return this.endNode;
	}

	public double getTotalDist(){
		return this.totalDistance;
	}

	public double getActualDist(){
		return this.actualDistance;
	}

	@Override
	public int compareTo(MapTempNodeVector n2){
		if(this.totalDistance < n2.totalDistance){
			return -1;
		}
		else if(this.totalDistance > n2.totalDistance){
			return 1;
		}

		return 0;
	}

}
