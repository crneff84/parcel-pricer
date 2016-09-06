class Parcels {
  public Integer mHeight;
  public Integer mLength;
  public Integer mWidth;
  public Integer mWeight;

  public Parcels(Integer height, Integer length, Integer width, Integer weight) {
    mHeight = height;
    mLength = length;
    mWidth = width;
    mWeight = weight;
  }

  public Integer costToShip() {
    Integer volume = mHeight * mLength * mWidth;
    Integer costToShip = volume + mWeight;
    System.out.println("Your volume is " + volume);
    System.out.println("Your cost is " + costToShip);
    return costToShip;
  }
}
