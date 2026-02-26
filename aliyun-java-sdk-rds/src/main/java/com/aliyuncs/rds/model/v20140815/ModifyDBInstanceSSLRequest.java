/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceSSLRequest extends RpcAcsRequest<ModifyDBInstanceSSLResponse> {
	   

	private Long resourceOwnerId;

	private String connectionString;

	private String serverKey;

	private Integer clientCrlEnabled;

	private String certificate;

	private String aCL;

	private String passWord;

	private String clientCertRevocationList;

	private String serverCert;

	private String dBInstanceId;

	private String forceEncryption;

	private Integer clientCAEnabled;

	private String clientCACert;

	private String replicationACL;

	private String resourceOwnerAccount;

	private String cAType;

	private String ownerAccount;

	private Long ownerId;

	private Integer sSLEnabled;

	private String tlsVersion;
	public ModifyDBInstanceSSLRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceSSL", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
		if(connectionString != null){
			putQueryParameter("ConnectionString", connectionString);
		}
	}

	public String getServerKey() {
		return this.serverKey;
	}

	public void setServerKey(String serverKey) {
		this.serverKey = serverKey;
		if(serverKey != null){
			putQueryParameter("ServerKey", serverKey);
		}
	}

	public Integer getClientCrlEnabled() {
		return this.clientCrlEnabled;
	}

	public void setClientCrlEnabled(Integer clientCrlEnabled) {
		this.clientCrlEnabled = clientCrlEnabled;
		if(clientCrlEnabled != null){
			putQueryParameter("ClientCrlEnabled", clientCrlEnabled.toString());
		}
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
		if(certificate != null){
			putQueryParameter("Certificate", certificate);
		}
	}

	public String getACL() {
		return this.aCL;
	}

	public void setACL(String aCL) {
		this.aCL = aCL;
		if(aCL != null){
			putQueryParameter("ACL", aCL);
		}
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		if(passWord != null){
			putQueryParameter("PassWord", passWord);
		}
	}

	public String getClientCertRevocationList() {
		return this.clientCertRevocationList;
	}

	public void setClientCertRevocationList(String clientCertRevocationList) {
		this.clientCertRevocationList = clientCertRevocationList;
		if(clientCertRevocationList != null){
			putQueryParameter("ClientCertRevocationList", clientCertRevocationList);
		}
	}

	public String getServerCert() {
		return this.serverCert;
	}

	public void setServerCert(String serverCert) {
		this.serverCert = serverCert;
		if(serverCert != null){
			putQueryParameter("ServerCert", serverCert);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getForceEncryption() {
		return this.forceEncryption;
	}

	public void setForceEncryption(String forceEncryption) {
		this.forceEncryption = forceEncryption;
		if(forceEncryption != null){
			putQueryParameter("ForceEncryption", forceEncryption);
		}
	}

	public Integer getClientCAEnabled() {
		return this.clientCAEnabled;
	}

	public void setClientCAEnabled(Integer clientCAEnabled) {
		this.clientCAEnabled = clientCAEnabled;
		if(clientCAEnabled != null){
			putQueryParameter("ClientCAEnabled", clientCAEnabled.toString());
		}
	}

	public String getClientCACert() {
		return this.clientCACert;
	}

	public void setClientCACert(String clientCACert) {
		this.clientCACert = clientCACert;
		if(clientCACert != null){
			putQueryParameter("ClientCACert", clientCACert);
		}
	}

	public String getReplicationACL() {
		return this.replicationACL;
	}

	public void setReplicationACL(String replicationACL) {
		this.replicationACL = replicationACL;
		if(replicationACL != null){
			putQueryParameter("ReplicationACL", replicationACL);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCAType() {
		return this.cAType;
	}

	public void setCAType(String cAType) {
		this.cAType = cAType;
		if(cAType != null){
			putQueryParameter("CAType", cAType);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getSSLEnabled() {
		return this.sSLEnabled;
	}

	public void setSSLEnabled(Integer sSLEnabled) {
		this.sSLEnabled = sSLEnabled;
		if(sSLEnabled != null){
			putQueryParameter("SSLEnabled", sSLEnabled.toString());
		}
	}

	public String getTlsVersion() {
		return this.tlsVersion;
	}

	public void setTlsVersion(String tlsVersion) {
		this.tlsVersion = tlsVersion;
		if(tlsVersion != null){
			putQueryParameter("TlsVersion", tlsVersion);
		}
	}

	@Override
	public Class<ModifyDBInstanceSSLResponse> getResponseClass() {
		return ModifyDBInstanceSSLResponse.class;
	}

}
