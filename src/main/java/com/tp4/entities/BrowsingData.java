package com.tp4.entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "browsing_data")
public class BrowsingData {
    private int id;
	private String browser;
	private String os;
	private Date time;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((browser == null) ? 0 : browser.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		return result;
	}

	public BrowsingData(String browser, String os) {
		this.browser = browser;
		this.os = os;
		this.time = new Date();
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "browser", nullable = false, length = 50)
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}

    @Column(name = "os", nullable = false, length = 50)
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

    @Column(name = "date_time", nullable = false)
	public Date getTime() {
		return time;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrowsingData other = (BrowsingData) obj;
		if (browser == null) {
			if (other.browser != null)
				return false;
		} else if (!browser.equals(other.browser))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}
}
