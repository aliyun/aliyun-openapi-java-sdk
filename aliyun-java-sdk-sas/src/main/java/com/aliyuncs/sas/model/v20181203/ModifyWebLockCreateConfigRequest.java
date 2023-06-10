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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyWebLockCreateConfigRequest extends RpcAcsRequest<ModifyWebLockCreateConfigResponse> {
	   

	private String localBackupDir;

	private String exclusiveFile;

	private String exclusiveFileType;

	private String dir;

	private String uuid;

	private String mode;

	private String sourceIp;

	private String lang;

	private String inclusiveFile;

	private String exclusiveDir;

	private String inclusiveFileType;

	private String defenceMode;
	public ModifyWebLockCreateConfigRequest() {
		super("Sas", "2018-12-03", "ModifyWebLockCreateConfig", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLocalBackupDir() {
		return this.localBackupDir;
	}

	public void setLocalBackupDir(String localBackupDir) {
		this.localBackupDir = localBackupDir;
		if(localBackupDir != null){
			putQueryParameter("LocalBackupDir", localBackupDir);
		}
	}

	public String getExclusiveFile() {
		return this.exclusiveFile;
	}

	public void setExclusiveFile(String exclusiveFile) {
		this.exclusiveFile = exclusiveFile;
		if(exclusiveFile != null){
			putQueryParameter("ExclusiveFile", exclusiveFile);
		}
	}

	public String getExclusiveFileType() {
		return this.exclusiveFileType;
	}

	public void setExclusiveFileType(String exclusiveFileType) {
		this.exclusiveFileType = exclusiveFileType;
		if(exclusiveFileType != null){
			putQueryParameter("ExclusiveFileType", exclusiveFileType);
		}
	}

	public String getDir() {
		return this.dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
		if(dir != null){
			putQueryParameter("Dir", dir);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getInclusiveFile() {
		return this.inclusiveFile;
	}

	public void setInclusiveFile(String inclusiveFile) {
		this.inclusiveFile = inclusiveFile;
		if(inclusiveFile != null){
			putQueryParameter("InclusiveFile", inclusiveFile);
		}
	}

	public String getExclusiveDir() {
		return this.exclusiveDir;
	}

	public void setExclusiveDir(String exclusiveDir) {
		this.exclusiveDir = exclusiveDir;
		if(exclusiveDir != null){
			putQueryParameter("ExclusiveDir", exclusiveDir);
		}
	}

	public String getInclusiveFileType() {
		return this.inclusiveFileType;
	}

	public void setInclusiveFileType(String inclusiveFileType) {
		this.inclusiveFileType = inclusiveFileType;
		if(inclusiveFileType != null){
			putQueryParameter("InclusiveFileType", inclusiveFileType);
		}
	}

	public String getDefenceMode() {
		return this.defenceMode;
	}

	public void setDefenceMode(String defenceMode) {
		this.defenceMode = defenceMode;
		if(defenceMode != null){
			putQueryParameter("DefenceMode", defenceMode);
		}
	}

	@Override
	public Class<ModifyWebLockCreateConfigResponse> getResponseClass() {
		return ModifyWebLockCreateConfigResponse.class;
	}

}
