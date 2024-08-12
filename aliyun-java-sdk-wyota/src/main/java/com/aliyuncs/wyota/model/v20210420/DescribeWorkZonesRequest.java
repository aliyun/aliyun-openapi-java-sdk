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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkZonesRequest extends RpcAcsRequest<DescribeWorkZonesResponse> {
	   

	private List<String> zoneNameLists;

	private List<String> zoneIdLists;

	private String tenantId;

	private Integer pageSize;

	private Integer pageNumber;
	public DescribeWorkZonesRequest() {
		super("wyota", "2021-04-20", "DescribeWorkZones");
		setMethod(MethodType.POST);
	}

	public List<String> getZoneNameLists() {
		return this.zoneNameLists;
	}

	public void setZoneNameLists(List<String> zoneNameLists) {
		this.zoneNameLists = zoneNameLists;	
		if (zoneNameLists != null) {
			for (int i = 0; i < zoneNameLists.size(); i++) {
				putBodyParameter("ZoneNameList." + (i + 1) , zoneNameLists.get(i));
			}
		}	
	}

	public List<String> getZoneIdLists() {
		return this.zoneIdLists;
	}

	public void setZoneIdLists(List<String> zoneIdLists) {
		this.zoneIdLists = zoneIdLists;	
		if (zoneIdLists != null) {
			for (int i = 0; i < zoneIdLists.size(); i++) {
				putBodyParameter("ZoneIdList." + (i + 1) , zoneIdLists.get(i));
			}
		}	
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribeWorkZonesResponse> getResponseClass() {
		return DescribeWorkZonesResponse.class;
	}

}
