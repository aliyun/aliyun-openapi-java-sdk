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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySmbAclRequest extends RpcAcsRequest<ModifySmbAclResponse> {
	   

	private Boolean encryptData;

	private String keytab;

	private String superAdminSid;

	private String keytabMd5;

	private Boolean rejectUnencryptedAccess;

	private String fileSystemId;

	private String authCenter;

	private String homeDirPath;

	private Boolean enableAnonymousAccess;

	private String authMethod;
	public ModifySmbAclRequest() {
		super("NAS", "2017-06-26", "ModifySmbAcl", "NAS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEncryptData() {
		return this.encryptData;
	}

	public void setEncryptData(Boolean encryptData) {
		this.encryptData = encryptData;
		if(encryptData != null){
			putQueryParameter("EncryptData", encryptData.toString());
		}
	}

	public String getKeytab() {
		return this.keytab;
	}

	public void setKeytab(String keytab) {
		this.keytab = keytab;
		if(keytab != null){
			putQueryParameter("Keytab", keytab);
		}
	}

	public String getSuperAdminSid() {
		return this.superAdminSid;
	}

	public void setSuperAdminSid(String superAdminSid) {
		this.superAdminSid = superAdminSid;
		if(superAdminSid != null){
			putQueryParameter("SuperAdminSid", superAdminSid);
		}
	}

	public String getKeytabMd5() {
		return this.keytabMd5;
	}

	public void setKeytabMd5(String keytabMd5) {
		this.keytabMd5 = keytabMd5;
		if(keytabMd5 != null){
			putQueryParameter("KeytabMd5", keytabMd5);
		}
	}

	public Boolean getRejectUnencryptedAccess() {
		return this.rejectUnencryptedAccess;
	}

	public void setRejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
		this.rejectUnencryptedAccess = rejectUnencryptedAccess;
		if(rejectUnencryptedAccess != null){
			putQueryParameter("RejectUnencryptedAccess", rejectUnencryptedAccess.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getAuthCenter() {
		return this.authCenter;
	}

	public void setAuthCenter(String authCenter) {
		this.authCenter = authCenter;
		if(authCenter != null){
			putQueryParameter("AuthCenter", authCenter);
		}
	}

	public String getHomeDirPath() {
		return this.homeDirPath;
	}

	public void setHomeDirPath(String homeDirPath) {
		this.homeDirPath = homeDirPath;
		if(homeDirPath != null){
			putQueryParameter("HomeDirPath", homeDirPath);
		}
	}

	public Boolean getEnableAnonymousAccess() {
		return this.enableAnonymousAccess;
	}

	public void setEnableAnonymousAccess(Boolean enableAnonymousAccess) {
		this.enableAnonymousAccess = enableAnonymousAccess;
		if(enableAnonymousAccess != null){
			putQueryParameter("EnableAnonymousAccess", enableAnonymousAccess.toString());
		}
	}

	public String getAuthMethod() {
		return this.authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
		if(authMethod != null){
			putQueryParameter("AuthMethod", authMethod);
		}
	}

	@Override
	public Class<ModifySmbAclResponse> getResponseClass() {
		return ModifySmbAclResponse.class;
	}

}
