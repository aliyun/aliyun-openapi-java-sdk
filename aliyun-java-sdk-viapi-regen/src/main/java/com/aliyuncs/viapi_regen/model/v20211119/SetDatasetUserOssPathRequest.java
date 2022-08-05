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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetDatasetUserOssPathRequest extends RpcAcsRequest<SetDatasetUserOssPathResponse> {
	   

	private String userOssUrl;

	private Long datasetId;
	public SetDatasetUserOssPathRequest() {
		super("viapi-regen", "2021-11-19", "SetDatasetUserOssPath", "viapi-regen");
		setMethod(MethodType.POST);
	}

	public String getUserOssUrl() {
		return this.userOssUrl;
	}

	public void setUserOssUrl(String userOssUrl) {
		this.userOssUrl = userOssUrl;
		if(userOssUrl != null){
			putBodyParameter("UserOssUrl", userOssUrl);
		}
	}

	public Long getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putBodyParameter("DatasetId", datasetId.toString());
		}
	}

	@Override
	public Class<SetDatasetUserOssPathResponse> getResponseClass() {
		return SetDatasetUserOssPathResponse.class;
	}

}
