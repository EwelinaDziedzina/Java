package InheritanceFurniture;

	public class Bed extends Furniture{
		
		private String size;
		
		private HeadBoard ifHeadboard;
		
		enum HeadBoard {Yes, No};
		
		Bed(){
		}

		public Bed(String colour, String size, HeadBoard ifHeadboard) {
			super(colour);
			this.size = size;
			setIfHeadboard(ifHeadboard);
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public HeadBoard isIfHeadboard() {
			return ifHeadboard;
		}

		public void setIfHeadboard(HeadBoard ifHeadboard) {
			this.ifHeadboard = ifHeadboard;
		}

		@Override
		public String toString() {
			return "\nBed" + "\nColour: " + getColour() + "\nSize: " + size + 
					"\nHeadboard: " + ifHeadboard;
	}
}

