package com.session.immutable;

final class ImmutableClassExample { // class as final

	private final String pancardnumber; // instance variable as final

	public ImmutableClassExample(String pancardnumber) {
		this.pancardnumber = pancardnumber;
	}

	public String getPancardnumber() { // only getter not setter
		return pancardnumber;
	}

	public static void main(String[] args) {

		ImmutableClassExample im = new ImmutableClassExample("xyxsds");
		System.out.println(im.pancardnumber);
	}

}
