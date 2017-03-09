package src;

/**
 * Created by admin on 3/3/17.
 */
public class Issues {
    private String Url;
    private String repository_url;
    private int number;
    private Usver user;
    private PullRequest pull_request;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getRepository_url() {
        return repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Usver getUser() {
        return user;
    }

    public void setUser(Usver user) {
        this.user = user;
    }

    public PullRequest getPull_request() {
        return pull_request;
    }

    public void setPull_request(PullRequest pull_request) {
        this.pull_request = pull_request;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private String body;

}
