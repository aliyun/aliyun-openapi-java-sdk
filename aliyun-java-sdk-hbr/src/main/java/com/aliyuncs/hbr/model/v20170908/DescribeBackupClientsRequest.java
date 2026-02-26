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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupClientsRequest extends RpcAcsRequest<DescribeBackupClientsResponse> {
	   

	private String clientType;

	private String crossAccountType;

	private String crossAccountRoleName;

	private Integer pageNumber;

	@SerializedName("clientIds")
	private List<String> clientIds;

	private Integer pageSize;

	private List<Tag> tags;

	private String clusterId;

	@SerializedName("instanceIds")
	private List<String> instanceIds;

	private Long crossAccountUserId;
	public DescribeBackupClientsRequest() {
		super("hbr", "2017-09-08", "DescribeBackupClients", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType);
		}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getClientIds() {
		return this.clientIds;
	}

	public void setClientIds(List<String> clientIds) {
		this.clientIds = clientIds;	
		if (clientIds != null) {
			putBodyParameter("ClientIds" , new Gson().toJson(clientIds));
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putBodyParameter("InstanceIds" , new Gson().toJson(instanceIds));
		}	
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeBackupClientsResponse> getResponseClass() {
		return DescribeBackupClientsResponse.class;
	}

}
