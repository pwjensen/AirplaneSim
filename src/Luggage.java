public class Luggage {
	private int luggageNum;
	private int luggageWeight;

	public Luggage() {
		luggageNum = luggageNum + 1;
	}

	public int getLuggage() {
		return luggageNum;
	}

	public void setLugWeight(int weight) {
		luggageWeight = weight;
	}

	public int getLugWeight() {
		return luggageWeight;
	}
}
