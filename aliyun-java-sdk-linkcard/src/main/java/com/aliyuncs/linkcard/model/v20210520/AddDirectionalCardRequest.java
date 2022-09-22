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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddDirectionalCardRequest extends RpcAcsRequest<AddDirectionalCardResponse> {
	   

	private String uploadMethod;

	private String tagList;

	private String orderList;

	private String groupId;

	private String uploadType;

	private String groupName;

	private String fileUri;
	public AddDirectionalCardRequest() {
		super("Linkcard", "2021-05-20", "AddDirectionalCard");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUploadMethod() {
		return this.uploadMethod;
	}

	public void setUploadMethod(String uploadMethod) {
		this.uploadMethod = uploadMethod;
		if(uploadMethod != null){
			putQueryParameter("UploadMethod", uploadMethod);
		}
	}

	public String getTagList() {
		return this.tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
		if(tagList != null){
			putQueryParameter("TagList", tagList);
		}
	}

	public String getOrderList() {
		return this.orderList;
	}

	public void setOrderList(String orderList) {
		this.orderList = orderList;
		if(orderList != null){
			putQueryParameter("OrderList", orderList);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
		if(uploadType != null){
			putQueryParameter("UploadType", uploadType);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getFileUri() {
		return this.fileUri;
	}

	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
		if(fileUri != null){
			putQueryParameter("FileUri", fileUri);
		}
	}

	@Override
	public Class<AddDirectionalCardResponse> getResponseClass() {
		return AddDirectionalCardResponse.class;
	}

}
