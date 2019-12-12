package io.fidelmohabir.Entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "links")
public class Link {

	/**
	 * 
	 */
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String linkName;
	
	@Column(name = "url")
	private String linkAddr;
	
	public Link() {

	}
	
	public Link(String linkName, String linkAddr) {
		this.linkName = linkName;
		this.linkAddr = linkAddr;
	}
	
	public String getName() {
		return this.linkName;
	}
	
	public void setName(String name) {
		this.linkName = name;
	}
	
	public String getAddr() {
		return this.linkAddr;
	}
	
	public void setAddr(String addr) {
		this.linkAddr = addr;
	}
	
	@Override
	public String toString() {
		return "Links{" +
				"id=" + id +
				", linkName='" + linkName + '\'' +
				", linkAddr='" + linkAddr + '\'' +
				'}';
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(id, linkName, linkAddr);
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Link link = (Link) o;
		return Objects.equals(id, link.id) && 
				Objects.equals(linkName, link.linkName) &&
				Objects.equals(linkAddr, link);
	}
}
