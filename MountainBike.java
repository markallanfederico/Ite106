class MountainBike extends Bicycle {
	public in seatHeight;
{
	Public MountainBike(int gear, int speed, int seatHeight){
		super(gear, speed);
		seatHeight = startHeight;
	}
	public void setHeight(int newValue){
		setHeight = newHeight;
	}
	@Override public string(){
		return(super.toString() + "\nseat height is" + seatHeight);
    }
}