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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesRequest extends RpcAcsRequest<DescribeDBInstancesResponse> {
	   

	private Long resourceOwnerId;

	private Long pageNumber;

	private String resourceGroupId;

	private Long pageSize;

	private String dBInstanceStatus;

	private String dBInstanceDescription;

	@SerializedName("tag")
	private List<Tag> tag;

	private String dBInstanceIds;
	public DescribeDBInstancesRequest() {
		super("selectdb", "2023-05-22", "DescribeDBInstances");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDBInstanceStatus() {
		return this.dBInstanceStatus;
	}

	public void setDBInstanceStatus(String dBInstanceStatus) {
		this.dBInstanceStatus = dBInstanceStatus;
		if(dBInstanceStatus != null){
			putQueryParameter("DBInstanceStatus", dBInstanceStatus);
		}
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			putQueryParameter("Tag" , new Gson().toJson(tag));
		}	
	}

	public String getDBInstanceIds() {
		return this.dBInstanceIds;
	}

	public void setDBInstanceIds(String dBInstanceIds) {
		this.dBInstanceIds = dBInstanceIds;
		if(dBInstanceIds != null){
			putQueryParameter("DBInstanceIds", dBInstanceIds);
		}
	}

	public static class Tag {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
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
	public Class<DescribeDBInstancesResponse> getResponseClass() {
		return DescribeDBInstancesResponse.class;
	}

}
