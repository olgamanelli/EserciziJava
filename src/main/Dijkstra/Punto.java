package main.Dijkstra;

public class Punto {

	//attributi
	private double x;
	private double y;

	//costruttore
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	//distanza
	public double distanza(Punto p) {
		return Math.sqrt((this.x - p.getX())*(this.x - p.getX()) + (this.y - p.getY())*(this.y - p.getY()));
	}

	@Override
	public boolean equals(Object p) {
		if(! (p instanceof Punto)) {
			return false;
		}else {
			return(this.x==((Punto)p).getX() && this.y == ((Punto) p).getY());
		}
	}



}
