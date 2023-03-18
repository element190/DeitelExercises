package Chapter5;

public class ModifiedAutoPolicyClass {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicyClass(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if (state == " CT || MA || ME || NH || NJ || NY || PA || VT") {
            this.state = state;
        } else {
            System.out.println("Error Message");
        }

    }


    public String getState() {
        return state;
    }


    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
            case "CT":
            case "MA":
            case "ME":
            case "NH":
            case "NJ":
            case "NY":
            case "PA":
            case "VT":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                System.out.println("Error state message");
                break;

        }
        return noFaultState;
    }

}
