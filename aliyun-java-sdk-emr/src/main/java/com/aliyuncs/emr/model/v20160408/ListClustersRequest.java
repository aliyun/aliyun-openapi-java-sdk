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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListClustersRequest extends RpcAcsRequest<ListClustersResponse> {
	   

	private Long resourceOwnerId;

	private List<String> statusLists;

	private Boolean isDesc;

	private String depositType;

	private Integer pageNumber;

	private String machineType;

	private String resourceGroupId;

	private Integer pageSize;

	private List<Tag> tags;

	private String createType;

	private List<String> expiredTagLists;

	private Boolean defaultStatus;

	private String name;

	private List<String> clusterTypeLists;
	public ListClustersRequest() {
		super("Emr", "2016-04-08", "ListClusters");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<String> statusLists) {
		this.statusLists = statusLists;	
		if (statusLists != null) {
			for (int i = 0; i < statusLists.size(); i++) {
				putQueryParameter("StatusList." + (i + 1) , statusLists.get(i));
			}
		}	
	}

	public Boolean getIsDesc() {
		return this.isDesc;
	}

	public void setIsDesc(Boolean isDesc) {
		this.isDesc = isDesc;
		if(isDesc != null){
			putQueryParameter("IsDesc", isDesc.toString());
		}
	}

	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
		if(depositType != null){
			putQueryParameter("DepositType", depositType);
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

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
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
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getCreateType() {
		return this.createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
		if(createType != null){
			putQueryParameter("CreateType", createType);
		}
	}

	public List<String> getExpiredTagLists() {
		return this.expiredTagLists;
	}

	public void setExpiredTagLists(List<String> expiredTagLists) {
		this.expiredTagLists = expiredTagLists;	
		if (expiredTagLists != null) {
			for (int i = 0; i < expiredTagLists.size(); i++) {
				putQueryParameter("ExpiredTagList." + (i + 1) , expiredTagLists.get(i));
			}
		}	
	}

	public Boolean getDefaultStatus() {
		return this.defaultStatus;
	}

	public void setDefaultStatus(Boolean defaultStatus) {
		this.defaultStatus = defaultStatus;
		if(defaultStatus != null){
			putQueryParameter("DefaultStatus", defaultStatus.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public List<String> getClusterTypeLists() {
		return this.clusterTypeLists;
	}

	public void setClusterTypeLists(List<String> clusterTypeLists) {
		this.clusterTypeLists = clusterTypeLists;	
		if (clusterTypeLists != null) {
			for (int i = 0; i < clusterTypeLists.size(); i++) {
				putQueryParameter("ClusterTypeList." + (i + 1) , clusterTypeLists.get(i));
			}
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
	public Class<ListClustersResponse> getResponseClass() {
		return ListClustersResponse.class;
	}

}
