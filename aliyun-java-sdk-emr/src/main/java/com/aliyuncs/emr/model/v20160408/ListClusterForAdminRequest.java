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
public class ListClusterForAdminRequest extends RpcAcsRequest<ListClusterForAdminResponse> {
	
	public ListClusterForAdminRequest() {
		super("Emr", "2016-04-08", "ListClusterForAdmin");
	}

	private Long resourceOwnerId;

	private List<String> statusLists;

	private String fuzzyName;

	private String userId;

	private Integer pageNumber;

	private List<Long> ecmClusterIdLists;

	private List<String> clusterIdLists;

	private List<String> payTypeLists;

	private String name;

	private Integer pageSize;

	private String emrVersion;

	private Boolean resize;

	private List<String> clusterTypeLists;

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

	public String getFuzzyName() {
		return this.fuzzyName;
	}

	public void setFuzzyName(String fuzzyName) {
		this.fuzzyName = fuzzyName;
		if(fuzzyName != null){
			putQueryParameter("FuzzyName", fuzzyName);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public List<Long> getEcmClusterIdLists() {
		return this.ecmClusterIdLists;
	}

	public void setEcmClusterIdLists(List<Long> ecmClusterIdLists) {
		this.ecmClusterIdLists = ecmClusterIdLists;	
		if (ecmClusterIdLists != null) {
			for (int i = 0; i < ecmClusterIdLists.size(); i++) {
				putQueryParameter("EcmClusterIdList." + (i + 1) , ecmClusterIdLists.get(i));
			}
		}	
	}

	public List<String> getClusterIdLists() {
		return this.clusterIdLists;
	}

	public void setClusterIdLists(List<String> clusterIdLists) {
		this.clusterIdLists = clusterIdLists;	
		if (clusterIdLists != null) {
			for (int i = 0; i < clusterIdLists.size(); i++) {
				putQueryParameter("ClusterIdList." + (i + 1) , clusterIdLists.get(i));
			}
		}	
	}

	public List<String> getPayTypeLists() {
		return this.payTypeLists;
	}

	public void setPayTypeLists(List<String> payTypeLists) {
		this.payTypeLists = payTypeLists;	
		if (payTypeLists != null) {
			for (int i = 0; i < payTypeLists.size(); i++) {
				putQueryParameter("PayTypeList." + (i + 1) , payTypeLists.get(i));
			}
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getEmrVersion() {
		return this.emrVersion;
	}

	public void setEmrVersion(String emrVersion) {
		this.emrVersion = emrVersion;
		if(emrVersion != null){
			putQueryParameter("EmrVersion", emrVersion);
		}
	}

	public Boolean getResize() {
		return this.resize;
	}

	public void setResize(Boolean resize) {
		this.resize = resize;
		if(resize != null){
			putQueryParameter("Resize", resize.toString());
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

	@Override
	public Class<ListClusterForAdminResponse> getResponseClass() {
		return ListClusterForAdminResponse.class;
	}

}
