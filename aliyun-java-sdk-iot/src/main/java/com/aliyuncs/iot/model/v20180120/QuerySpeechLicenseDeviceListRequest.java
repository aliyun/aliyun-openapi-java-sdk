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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechLicenseDeviceListRequest extends RpcAcsRequest<QuerySpeechLicenseDeviceListResponse> {
	   

	private Integer pageId;

	private List<String> licenseStatusLists;

	private String iotInstanceId;

	private Integer pageSize;

	private String productKey;

	private String checkGroupId;

	private String deviceName;
	public QuerySpeechLicenseDeviceListRequest() {
		super("Iot", "2018-01-20", "QuerySpeechLicenseDeviceList", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageId() {
		return this.pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
		if(pageId != null){
			putQueryParameter("PageId", pageId.toString());
		}
	}

	public List<String> getLicenseStatusLists() {
		return this.licenseStatusLists;
	}

	public void setLicenseStatusLists(List<String> licenseStatusLists) {
		this.licenseStatusLists = licenseStatusLists;	
		if (licenseStatusLists != null) {
			for (int i = 0; i < licenseStatusLists.size(); i++) {
				putBodyParameter("LicenseStatusList." + (i + 1) , licenseStatusLists.get(i));
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public String getCheckGroupId() {
		return this.checkGroupId;
	}

	public void setCheckGroupId(String checkGroupId) {
		this.checkGroupId = checkGroupId;
		if(checkGroupId != null){
			putBodyParameter("CheckGroupId", checkGroupId);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<QuerySpeechLicenseDeviceListResponse> getResponseClass() {
		return QuerySpeechLicenseDeviceListResponse.class;
	}

}
