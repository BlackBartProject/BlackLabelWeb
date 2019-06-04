package com.Sanmina.BlackLabelWeb.ORM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor	
@AllArgsConstructor
@Entity
@Table(name="ftpSetting", schema="dbo", catalog="db_BlackLabelWeb")
public class FtpSetting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idFtp")
	private Integer idFtp;

	@Column(name="server")
	private String server;
	
	@Column(name="[user]")
	private String user;
	
	@Column(name="password")
	private String password;
	
	@Column(name="path")
	private String path;
	
	
}
