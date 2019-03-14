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

/**
 * @author auto create
 * @version 
 */
public class ListClustersRequest extends RpcAcsRequest<ListClustersResponse> {
	
	public ListClustersRequest() {
		super("Emr", "2016-04-08", "ListClusters");
	}

	private Long resourceOwnerId;

	private List<String> statusLists;

	private Integer pageSize;

	private List<String> clusterTypeLists;

	private Boolean isDesc;

	private String createType;

	private String depositType;

	private Boolean defaultStatus;

	private Integer pageNumber;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Boolean getIsDesc() {
		return this.isDesc;
	}

	public void setIsDesc(Boolean isDesc) {
		this.isDesc = isDesc;
		if(isDesc != null){
			putQueryParameter("IsDesc", isDesc.toString());
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

	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
		if(depositType != null){
			putQueryParameter("DepositType", depositType);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListClustersResponse> getResponseClass() {
		return ListClustersResponse.class;
	}

}
