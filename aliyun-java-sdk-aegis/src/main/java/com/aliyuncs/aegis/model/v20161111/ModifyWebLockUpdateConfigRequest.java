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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyWebLockUpdateConfigRequest extends RpcAcsRequest<ModifyWebLockUpdateConfigResponse> {
	
	public ModifyWebLockUpdateConfigRequest() {
		super("aegis", "2016-11-11", "ModifyWebLockUpdateConfig", "vipaegis");
	}

	private String localBackupDir;

	private String sourceIp;

	private String exclusiveFileType;

	private Integer id;

	private String lang;

	private String dir;

	private String uuid;

	private String exclusiveDir;

	public String getLocalBackupDir() {
		return this.localBackupDir;
	}

	public void setLocalBackupDir(String localBackupDir) {
		this.localBackupDir = localBackupDir;
		if(localBackupDir != null){
			putQueryParameter("LocalBackupDir", localBackupDir);
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

	public String getExclusiveFileType() {
		return this.exclusiveFileType;
	}

	public void setExclusiveFileType(String exclusiveFileType) {
		this.exclusiveFileType = exclusiveFileType;
		if(exclusiveFileType != null){
			putQueryParameter("ExclusiveFileType", exclusiveFileType);
		}
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public String getExclusiveDir() {
		return this.exclusiveDir;
	}

	public void setExclusiveDir(String exclusiveDir) {
		this.exclusiveDir = exclusiveDir;
		if(exclusiveDir != null){
			putQueryParameter("ExclusiveDir", exclusiveDir);
		}
	}

	@Override
	public Class<ModifyWebLockUpdateConfigResponse> getResponseClass() {
		return ModifyWebLockUpdateConfigResponse.class;
	}

}
