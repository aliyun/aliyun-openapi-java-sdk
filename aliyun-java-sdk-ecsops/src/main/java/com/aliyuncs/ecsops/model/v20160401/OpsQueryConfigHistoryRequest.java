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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryConfigHistoryRequest extends RpcAcsRequest<OpsQueryConfigHistoryResponse> {
	   

	private String uniqueKey;

	private String storageKey;

	private String filePath;

	private String auditParamStr;
	public OpsQueryConfigHistoryRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryConfigHistory", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getUniqueKey() {
		return this.uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
		if(uniqueKey != null){
			putQueryParameter("UniqueKey", uniqueKey);
		}
	}

	public String getStorageKey() {
		return this.storageKey;
	}

	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
		if(storageKey != null){
			putQueryParameter("StorageKey", storageKey);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putQueryParameter("FilePath", filePath);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryConfigHistoryResponse> getResponseClass() {
		return OpsQueryConfigHistoryResponse.class;
	}

}
