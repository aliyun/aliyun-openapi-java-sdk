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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPhoneTagsRequest extends RpcAcsRequest<AddPhoneTagsResponse> {
	   

	private String regionNameProvince;

	private Integer type;

	private Integer concurrency;

	private String instanceId;

	private String provider;

	private List<String> phoneNumberLists;

	private String serviceTag;

	private String sipTag;

	private String regionNameCity;
	public AddPhoneTagsRequest() {
		super("CCC", "2017-07-05", "AddPhoneTags");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRegionNameProvince() {
		return this.regionNameProvince;
	}

	public void setRegionNameProvince(String regionNameProvince) {
		this.regionNameProvince = regionNameProvince;
		if(regionNameProvince != null){
			putQueryParameter("RegionNameProvince", regionNameProvince);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public Integer getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(Integer concurrency) {
		this.concurrency = concurrency;
		if(concurrency != null){
			putQueryParameter("Concurrency", concurrency.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public List<String> getPhoneNumberLists() {
		return this.phoneNumberLists;
	}

	public void setPhoneNumberLists(List<String> phoneNumberLists) {
		this.phoneNumberLists = phoneNumberLists;	
		if (phoneNumberLists != null) {
			for (int i = 0; i < phoneNumberLists.size(); i++) {
				putQueryParameter("PhoneNumberList." + (i + 1) , phoneNumberLists.get(i));
			}
		}	
	}

	public String getServiceTag() {
		return this.serviceTag;
	}

	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
		if(serviceTag != null){
			putQueryParameter("ServiceTag", serviceTag);
		}
	}

	public String getSipTag() {
		return this.sipTag;
	}

	public void setSipTag(String sipTag) {
		this.sipTag = sipTag;
		if(sipTag != null){
			putQueryParameter("SipTag", sipTag);
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("RegionNameCity", regionNameCity);
		}
	}

	@Override
	public Class<AddPhoneTagsResponse> getResponseClass() {
		return AddPhoneTagsResponse.class;
	}

}
