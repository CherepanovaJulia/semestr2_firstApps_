package KursProject;

public class MovieMenu {
    private String subMenu;
    private String link;
    private String details;

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }


    public String getLink() {
        return link;

    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "subMenu='" + subMenu + '\'' +
                ", link='" + link + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
