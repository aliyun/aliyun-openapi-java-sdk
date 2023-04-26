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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypeResourceRequest extends RpcAcsRequest<DescribeInstanceTypeResourceResponse> {
	   

	private Long resourceOwnerId;

	private List<String> instanceTypess;

	private Integer pageNumber;

	private Integer cores;

	private List<String> zoneIdss;

	private List<String> instanceTypeFamiliess;

	private List<String> searchTypess;

	private Integer pageSize;

	private List<Double> memoriess;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceTypeMatchMode;

	private Long ownerId;
	public DescribeInstanceTypeResourceRequest() {
		super("Ecs", "2016-03-14", "DescribeInstanceTypeResource", "ecs");
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

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
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

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public List<String> getZoneIdss() {
		return this.zoneIdss;
	}

	public void setZoneIdss(List<String> zoneIdss) {
		this.zoneIdss = zoneIdss;	
		if (zoneIdss != null) {
			for (int i = 0; i < zoneIdss.size(); i++) {
				putQueryParameter("ZoneIds." + (i + 1) , zoneIdss.get(i));
			}
		}	
	}

	public List<String> getInstanceTypeFamiliess() {
		return this.instanceTypeFamiliess;
	}

	public void setInstanceTypeFamiliess(List<String> instanceTypeFamiliess) {
		this.instanceTypeFamiliess = instanceTypeFamiliess;	
		if (instanceTypeFamiliess != null) {
			for (int i = 0; i < instanceTypeFamiliess.size(); i++) {
				putQueryParameter("InstanceTypeFamilies." + (i + 1) , instanceTypeFamiliess.get(i));
			}
		}	
	}

	public List<String> getSearchTypess() {
		return this.searchTypess;
	}

	public void setSearchTypess(List<String> searchTypess) {
		this.searchTypess = searchTypess;	
		if (searchTypess != null) {
			for (int i = 0; i < searchTypess.size(); i++) {
				putQueryParameter("SearchTypes." + (i + 1) , searchTypess.get(i));
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

	public List<Double> getMemoriess() {
		return this.memoriess;
	}

	public void setMemoriess(List<Double> memoriess) {
		this.memoriess = memoriess;	
		if (memoriess != null) {
			for (int i = 0; i < memoriess.size(); i++) {
				putQueryParameter("Memories." + (i + 1) , memoriess.get(i));
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getInstanceTypeMatchMode() {
		return this.instanceTypeMatchMode;
	}

	public void setInstanceTypeMatchMode(String instanceTypeMatchMode) {
		this.instanceTypeMatchMode = instanceTypeMatchMode;
		if(instanceTypeMatchMode != null){
			putQueryParameter("InstanceTypeMatchMode", instanceTypeMatchMode);
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

	@Override
	public Class<DescribeInstanceTypeResourceResponse> getResponseClass() {
		return DescribeInstanceTypeResourceResponse.class;
	}

}
