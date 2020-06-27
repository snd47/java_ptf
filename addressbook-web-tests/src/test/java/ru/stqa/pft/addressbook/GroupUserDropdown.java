package ru.stqa.pft.addressbook;

public class GroupUserDropdown {
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String aday;
    private final String amonth;
    private final String new_group;

    public GroupUserDropdown(String bday, String bmonth, String byear, String aday, String amonth, String new_group) {
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.aday = aday;
        this.amonth = amonth;
        this.new_group = new_group;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }

    public String getAday() {
        return aday;
    }

    public String getAmonth() {
        return amonth;
    }

    public String getNew_group() {
        return new_group;
    }
}
