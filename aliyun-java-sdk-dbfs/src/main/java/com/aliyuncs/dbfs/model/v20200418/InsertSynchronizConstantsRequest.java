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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertSynchronizConstantsRequest extends RpcAcsRequest<InsertSynchronizConstantsResponse> {
	   

	private String zoneData;

	private String osversionData;

	private String endpointData;

	private Integer pageNumber;

	private String masterData;

	private String productCodeData;

	private Integer pageSize;

	private String accessData;

	private String regionData;
	public InsertSynchronizConstantsRequest() {
		super("DBFS", "2020-04-18", "InsertSynchronizConstants");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getZoneData() {
		return this.zoneData;
	}

	public void setZoneData(String zoneData) {
		this.zoneData = zoneData;
		if(zoneData != null){
			putQueryParameter("ZoneData", zoneData);
		}
	}

	public String getOsversionData() {
		return this.osversionData;
	}

	public void setOsversionData(String osversionData) {
		this.osversionData = osversionData;
		if(osversionData != null){
			putQueryParameter("OsversionData", osversionData);
		}
	}

	public String getEndpointData() {
		return this.endpointData;
	}

	public void setEndpointData(String endpointData) {
		this.endpointData = endpointData;
		if(endpointData != null){
			putQueryParameter("EndpointData", endpointData);
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

	public String getMasterData() {
		return this.masterData;
	}

	public void setMasterData(String masterData) {
		this.masterData = masterData;
		if(masterData != null){
			putQueryParameter("MasterData", masterData);
		}
	}

	public String getProductCodeData() {
		return this.productCodeData;
	}

	public void setProductCodeData(String productCodeData) {
		this.productCodeData = productCodeData;
		if(productCodeData != null){
			putQueryParameter("ProductCodeData", productCodeData);
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

	public String getAccessData() {
		return this.accessData;
	}

	public void setAccessData(String accessData) {
		this.accessData = accessData;
		if(accessData != null){
			putQueryParameter("AccessData", accessData);
		}
	}

	public String getRegionData() {
		return this.regionData;
	}

	public void setRegionData(String regionData) {
		this.regionData = regionData;
		if(regionData != null){
			putQueryParameter("RegionData", regionData);
		}
	}

	@Override
	public Class<InsertSynchronizConstantsResponse> getResponseClass() {
		return InsertSynchronizConstantsResponse.class;
	}

}
