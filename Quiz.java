package Interface;

	public class Quiz implements Measurable
	{
		   private String name;
		   private double score;

		   
		   public Quiz(String string, int i) {
			// TODO Auto-generated constructor stub
		}

		public Quiz(String name, double score)
		   {
		      this.name = name;
		      this.score = score;
		   }

		   public double getMeasure()
		   {
		      return score;
		   }
	}

