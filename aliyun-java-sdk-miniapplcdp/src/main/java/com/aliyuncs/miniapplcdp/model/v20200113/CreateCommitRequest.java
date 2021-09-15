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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCommitRequest extends RpcAcsRequest<CreateCommitResponse> {
	   

	private String clientToken;

	private String rollbackToCommitId;

	private String schemaVersion;

	private String commitType;

	private String commitLog;

	private String appId;
	public CreateCommitRequest() {
		super("miniapplcdp", "2020-01-13", "CreateCommit");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getRollbackToCommitId() {
		return this.rollbackToCommitId;
	}

	public void setRollbackToCommitId(String rollbackToCommitId) {
		this.rollbackToCommitId = rollbackToCommitId;
		if(rollbackToCommitId != null){
			putQueryParameter("RollbackToCommitId", rollbackToCommitId);
		}
	}

	public String getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
		if(schemaVersion != null){
			putQueryParameter("SchemaVersion", schemaVersion);
		}
	}

	public String getCommitType() {
		return this.commitType;
	}

	public void setCommitType(String commitType) {
		this.commitType = commitType;
		if(commitType != null){
			putQueryParameter("CommitType", commitType);
		}
	}

	public String getCommitLog() {
		return this.commitLog;
	}

	public void setCommitLog(String commitLog) {
		this.commitLog = commitLog;
		if(commitLog != null){
			putQueryParameter("CommitLog", commitLog);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<CreateCommitResponse> getResponseClass() {
		return CreateCommitResponse.class;
	}

}
