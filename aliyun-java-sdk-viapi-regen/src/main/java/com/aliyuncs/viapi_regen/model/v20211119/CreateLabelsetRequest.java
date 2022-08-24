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
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLabelsetRequest extends RpcAcsRequest<CreateLabelsetResponse> {
	   

	private String description;

	private String type;

	private String tagUserList;

	private String userOssUrl;

	private String objectKey;

	private String name;

	private Long datasetId;

	private String tagSettings;
	public CreateLabelsetRequest() {
		super("viapi-regen", "2021-11-19", "CreateLabelset", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getTagUserList() {
		return this.tagUserList;
	}

	public void setTagUserList(String tagUserList) {
		this.tagUserList = tagUserList;
		if(tagUserList != null){
			putBodyParameter("TagUserList", tagUserList);
		}
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

	public String getObjectKey() {
		return this.objectKey;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
		if(objectKey != null){
			putBodyParameter("ObjectKey", objectKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public String getTagSettings() {
		return this.tagSettings;
	}

	public void setTagSettings(String tagSettings) {
		this.tagSettings = tagSettings;
		if(tagSettings != null){
			putBodyParameter("TagSettings", tagSettings);
		}
	}

	@Override
	public Class<CreateLabelsetResponse> getResponseClass() {
		return CreateLabelsetResponse.class;
	}

}
