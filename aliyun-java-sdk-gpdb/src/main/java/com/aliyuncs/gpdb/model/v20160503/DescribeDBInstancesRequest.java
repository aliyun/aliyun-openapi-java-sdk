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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesRequest extends RpcAcsRequest<DescribeDBInstancesResponse> {
	   

	private List<String> dBInstanceModes;

	private List<String> dBInstanceStatuses;

	private Integer pageNumber;

	private Integer pageSize;

	private String dBInstanceDescription;

	private List<Tag> tags;

	private String dBInstanceIds;

	private Long ownerId;

	private List<String> dBInstanceCategories;

	private List<String> instanceDeployTypes;

	private String instanceNetworkType;
	public DescribeDBInstancesRequest() {
		super("gpdb", "2016-05-03", "DescribeDBInstances");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDBInstanceModes() {
		return this.dBInstanceModes;
	}

	public void setDBInstanceModes(List<String> dBInstanceModes) {
		this.dBInstanceModes = dBInstanceModes;	
		if (dBInstanceModes != null) {
			String dBInstanceModesArrVal = "";
			for(int depth1 = 0; depth1 < dBInstanceModes.size(); depth1++) {
				dBInstanceModesArrVal = dBInstanceModes.get(depth1) + ",";
			}
			if (dBInstanceModesArrVal.length() > 0) {
				dBInstanceModesArrVal = dBInstanceModesArrVal.substring(0, dBInstanceModesArrVal.length() - 1);
			}
			putQueryParameter("DBInstanceModes" , dBInstanceModesArrVal);
		}	
	}

	public List<String> getDBInstanceStatuses() {
		return this.dBInstanceStatuses;
	}

	public void setDBInstanceStatuses(List<String> dBInstanceStatuses) {
		this.dBInstanceStatuses = dBInstanceStatuses;	
		if (dBInstanceStatuses != null) {
			String dBInstanceStatusesArrVal = "";
			for(int depth1 = 0; depth1 < dBInstanceStatuses.size(); depth1++) {
				dBInstanceStatusesArrVal = dBInstanceStatuses.get(depth1) + ",";
			}
			if (dBInstanceStatusesArrVal.length() > 0) {
				dBInstanceStatusesArrVal = dBInstanceStatusesArrVal.substring(0, dBInstanceStatusesArrVal.length() - 1);
			}
			putQueryParameter("DBInstanceStatuses" , dBInstanceStatusesArrVal);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getDBInstanceCategories() {
		return this.dBInstanceCategories;
	}

	public void setDBInstanceCategories(List<String> dBInstanceCategories) {
		this.dBInstanceCategories = dBInstanceCategories;	
		if (dBInstanceCategories != null) {
			String dBInstanceCategoriesArrVal = "";
			for(int depth1 = 0; depth1 < dBInstanceCategories.size(); depth1++) {
				dBInstanceCategoriesArrVal = dBInstanceCategories.get(depth1) + ",";
			}
			if (dBInstanceCategoriesArrVal.length() > 0) {
				dBInstanceCategoriesArrVal = dBInstanceCategoriesArrVal.substring(0, dBInstanceCategoriesArrVal.length() - 1);
			}
			putQueryParameter("DBInstanceCategories" , dBInstanceCategoriesArrVal);
		}	
	}

	public List<String> getInstanceDeployTypes() {
		return this.instanceDeployTypes;
	}

	public void setInstanceDeployTypes(List<String> instanceDeployTypes) {
		this.instanceDeployTypes = instanceDeployTypes;	
		if (instanceDeployTypes != null) {
			String instanceDeployTypesArrVal = "";
			for(int depth1 = 0; depth1 < instanceDeployTypes.size(); depth1++) {
				instanceDeployTypesArrVal = instanceDeployTypes.get(depth1) + ",";
			}
			if (instanceDeployTypesArrVal.length() > 0) {
				instanceDeployTypesArrVal = instanceDeployTypesArrVal.substring(0, instanceDeployTypesArrVal.length() - 1);
			}
			putQueryParameter("InstanceDeployTypes" , instanceDeployTypesArrVal);
		}	
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
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
	public Class<DescribeDBInstancesResponse> getResponseClass() {
		return DescribeDBInstancesResponse.class;
	}

}
