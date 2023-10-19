public class GymMember {

    private String name = "Unknown";  //max 30 chars
    private double height = 0.0;   //in meters
    private double weight = 0.0;   //in kgs
    private int membershipNumber = 99999;  //between 00001 (incl) and 99999 (excl)
    private boolean isCurrentGymMember = false;

    public GymMember(String name, double height, double weight, int membershipNumber, boolean isCurrentGymMember) {
        setName(name);
        setHeight(height);
        setWeight(weight);
        setMembershipNumber(membershipNumber);
        setCurrentGymMember(isCurrentGymMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null){
            if (name.length() > 30)
                this.name = name.substring(0,30);
            else
                this.name = name;
            }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ((height >= 0.5) && (height <= 3.0)) {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if ((weight >= 25) && (weight <= 500)) {
            this.weight = weight;
        }
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        if ((membershipNumber > 0) && (membershipNumber < 99999)) {
            this.membershipNumber = membershipNumber;
        }
    }

    public boolean isCurrentGymMember() {
        return isCurrentGymMember;
    }

    public void setCurrentGymMember(boolean currentGymMember) {
        isCurrentGymMember = currentGymMember;
    }

    @Override
    public String toString() {
        return name + ": " + height + "M, " + weight + "KG (Member Num: " + membershipNumber +
                ", current member: " + isCurrentGymMember + ")";
    }
}
