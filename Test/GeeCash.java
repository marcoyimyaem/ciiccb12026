package Test;

public class GeeCash {
    public static void main(String[] args) {
        User user1 = new User(1, "Marc Yim", "Fairview qc", 123459, new EmailAddress("marcyim", "21geemail"), "0995 555 55 55");
        System.out.println(user1);
    }

}

class User{

    public User(int id, String name, String address, int pin, EmailAddress email, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pin = pin;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    int id;
    String name;
    String address;
    int pin;
    EmailAddress email;
    String mobileNumber;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public EmailAddress getEmail() {
        return this.email;
    }

    public void setEmail(EmailAddress email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}

class EmailAddress{
    String emailName;
    String emailDomainName;
    
    public static  boolean isEmailValid(String emailDomainName){
        
        return (emailDomainName.startsWith("@")&&emailDomainName.startsWith("@"));
    }
    EmailAddress(String emailName,String emailDomainName){
        try{
            
        if(isEmailValid(emailDomainName)){
            this.emailName = emailName;
            this.emailDomainName = emailDomainName;}
        else
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("invalid email");
        }    
    }
}
 class MobileNumber {

    private final String value;

    public MobileNumber(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Invalid mobile number");
        }
        this.value = normalize(value);
    }

    private boolean isValid(String value) {
        // Simple validation: +63 or 09 format
        return value != null && value.matches("^(\\+63|0)9\\d{9}$");
    }

    private String normalize(String value) {
        // Convert 0917... → +63917...
        if (value.startsWith("0")) {
            return "+63" + value.substring(1);
        }
        return value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MobileNumber)) return false;
        MobileNumber other = (MobileNumber) obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}