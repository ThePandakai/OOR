

		public class Point {
			private int x;
			private int y;
			
			/**
			 * Constructeur sans param tre.  
			 * Initialise x et y   0.
			 * Est appel  au moment de la cr ation de l'objet (op rateur new)
			 */
			public Point(){
				this.x = 0;
				this.y = 0;
			}
			
			/**
			 * Constructeur avec param tres qui initialise le point   (abs, ord).
			 * @param abs la valeur   donner   x
			 * @param ord la valeur   donner   y
			 */
			public Point(int abs, int ord) {
				this.x = abs;
				this.y = ord;
			}
			
			/**
			 * M thode d'alt ration pour x
			 * @param abs la valeur   donner   x
			 */
			public void setX(int abs) {
				this.x = abs;
			}
			
			/**
			 * M thode d'alt ration de y
			 * @param ord la valeur   donner   y
			 */
			public void setY(int ord) {
				this.y = ord;
			}
			
			/**
			 * M thode d'acc s   x
			 * @return la valeur de x
			 */
			public int getX() {
				return this.x;
			}
			
			/**
			 * M thode d'acc s   y
			 * @return la valeur de y
			 */
			public int getY() {
				return this.y;
			}
			
			/**
			 * Affiche le point sous la forme "(X,Y)"
			 */
			public void afficher() {
				System.out.println("(" + this.x + "," + this.y + ")");
			}
			
			/**
			 * M thode utilis e pour le d bogage.  
			 * @return une chaine repr sentant le point sous la forme "(X,Y)"
			 */
			public String toString() {
				return "(" + this.x + "," + this.y + ")";
			}
			
			/**
			 * Permet la comparaison d'objets de classe Point.
			 * @param p le point avec lequel faire la comparaison
			 * @return true si l'objet courant est  gal   p.
			 */
			public boolean equals(Point p) {
				boolean estEgal;
				if (this.x == p.getX() && this.y == p.getY()) {
					estEgal = true;
				} else {
					estEgal = false;
				}
				return estEgal;
				
			
			}
			public void distance() {
				double d= Math.sqrt(Math.pow(this.x, 2)+ Math.pow(this.y,2));
				System.out.println("La distance est: " + d );
				
			}
			
			public void q1() {
				if (this.x<0) {
					this.x*=-1;
				}
				if (this.y<0) {
					this.y*=-1;
				}
			}
			public void q2() {
				if (this.x>0) {
					this.x*=-1;
				}
				if (this.y<0) {
					this.y*=-1;
				}
			}
			public void q3() {
				if (this.x>0) {
					this.x*=-1;
				}
				if (this.y>0) {
					this.y*=-1;
				}
			}
			public void q4() {
				if (this.x<0) {
					this.x*=-1;
				}
				if (this.y>0) {
					this.y*=-1;
				}
				
			}
			
			public static void main(String[] args) {
				Point p1= new Point(-4,4);
				p1.distance();
				p1.q1();
				System.out.println(p1);
				
				
			}
		
		}
	


	

