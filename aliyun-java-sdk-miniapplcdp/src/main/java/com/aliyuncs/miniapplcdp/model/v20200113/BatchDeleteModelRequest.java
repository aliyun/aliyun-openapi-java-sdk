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
public class BatchDeleteModelRequest extends RpcAcsRequest<BatchDeleteModelResponse> {
	   

	private String appId;

	private String modelIdList;

	private String schemaVersion;
	public BatchDeleteModelRequest() {
		super("miniapplcdp", "2020-01-13", "BatchDeleteModel");
		setMethod(MethodType.POST);
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

	public String getModelIdList() {
		return this.modelIdList;
	}

	public void setModelIdList(String modelIdList) {
		this.modelIdList = modelIdList;
		if(modelIdList != null){
			putQueryParameter("ModelIdList", modelIdList);
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

	@Override
	public Class<BatchDeleteModelResponse> getResponseClass() {
		return BatchDeleteModelResponse.class;
	}

}
