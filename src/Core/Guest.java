package Core;

public class Guest
{
    private String name;
    private String address;
    private String phone;
    private String email;
    private int creditCardInfo;

    /**
     *
     * @param name
     * @param address
     * @param phone
     * @param email
     * @param creditCardInfo
     */
    public Guest(String name, String address, String phone, String email, int creditCardInfo)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.creditCardInfo = creditCardInfo;
    }

    // Class Setters ----------------------------------------------------------
    /**
     *
     * @param n
     */
    public void setName(String n) {
        name = n;
    }
    /**
     *
     * @param a
     */
    public void setAddress(String a) {
        address = a;
    }
    /**
     *
     * @param p
     */
    public void setPhone(String p) {
        phone = p;
    }
    /**
     *
     * @param e
     */
    public void setEmail(String e) {
        email = e;
    }
    /**
     *
     * @param c
     */
    public void setCreditCardInfo(int c) {
        creditCardInfo = c;
    }


    // Class Getters ----------------------------------------------------------
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }
    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }
    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }
    /**
     *
     * @return
     */
    public int getCreditCardInfo() {
        return creditCardInfo;
    }
}
