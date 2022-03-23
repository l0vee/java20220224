package chap11.lecture.p01object;

public class App08HashCode {
	public static void main(String[] args) {
		Mouse a1 = new Mouse("lg",)
		
	}
	
	class Mouse {
		private String model;
		private int price;
		
		public Mouse(String model, int price) {
			this.model = model;
			this.price = price;
			
			
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mouse other = (Mouse) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		private App08HashCode getEnclosingInstance() {
			return App08HashCode.this;
		}
		
		
	}

}
