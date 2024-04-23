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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceRequest extends RpcAcsRequest<GetServiceResponse> {
	   

	private List<String> showDetails;

	private String sharedAccountType;

	private Boolean filterAliUid;

	private String serviceVersion;

	private String serviceId;
	public GetServiceRequest() {
		super("ComputeNestSupplier", "2021-05-21", "GetService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getShowDetails() {
		return this.showDetails;
	}

	public void setShowDetails(List<String> showDetails) {
		this.showDetails = showDetails;	
		if (showDetails != null) {
			for (int i = 0; i < showDetails.size(); i++) {
				putQueryParameter("ShowDetail." + (i + 1) , showDetails.get(i));
			}
		}	
	}

	public String getSharedAccountType() {
		return this.sharedAccountType;
	}

	public void setSharedAccountType(String sharedAccountType) {
		this.sharedAccountType = sharedAccountType;
		if(sharedAccountType != null){
			putQueryParameter("SharedAccountType", sharedAccountType);
		}
	}

	public Boolean getFilterAliUid() {
		return this.filterAliUid;
	}

	public void setFilterAliUid(Boolean filterAliUid) {
		this.filterAliUid = filterAliUid;
		if(filterAliUid != null){
			putQueryParameter("FilterAliUid", filterAliUid.toString());
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<GetServiceResponse> getResponseClass() {
		return GetServiceResponse.class;
	}

}
