/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

	private String createType;

	private Boolean isDesc;

	private Integer pageNumber;

	private Integer pageSize;

	private Boolean defaultStatus;

	private List<String> clusterTypeLists;

	private List<String> statusLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getCreateType() {
		return this.createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
		putQueryParameter("CreateType", createType);
	}

	public Boolean getIsDesc() {
		return this.isDesc;
	}

	public void setIsDesc(Boolean isDesc) {
		this.isDesc = isDesc;
		putQueryParameter("IsDesc", isDesc);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Boolean getDefaultStatus() {
		return this.defaultStatus;
	}

	public void setDefaultStatus(Boolean defaultStatus) {
		this.defaultStatus = defaultStatus;
		putQueryParameter("DefaultStatus", defaultStatus);
	}

	public List<String> getClusterTypeLists() {
		return this.clusterTypeLists;
	}

	public void setClusterTypeLists(List<String> clusterTypeLists) {
		this.clusterTypeLists = clusterTypeLists;	
		for (int i = 0; i < clusterTypeLists.size(); i++) {
			putQueryParameter("ClusterTypeList." + (i + 1) , clusterTypeLists.get(i));
		}	
	}

	public List<String> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<String> statusLists) {
		this.statusLists = statusLists;	
		for (int i = 0; i < statusLists.size(); i++) {
			putQueryParameter("StatusList." + (i + 1) , statusLists.get(i));
		}	
	}

	@Override
	public Class<ListClustersResponse> getResponseClass() {
		return ListClustersResponse.class;
	}

}
