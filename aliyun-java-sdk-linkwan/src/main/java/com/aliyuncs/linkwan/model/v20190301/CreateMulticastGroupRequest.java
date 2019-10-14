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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMulticastGroupRequest extends RpcAcsRequest<CreateMulticastGroupResponse> {
	   

	private String classMode;

	private Float frequency;

	private String loraVersion;

	private Integer periodicity;

	private Integer dataRate;
	public CreateMulticastGroupRequest() {
		super("LinkWAN", "2019-03-01", "CreateMulticastGroup", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClassMode() {
		return this.classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
		if(classMode != null){
			putQueryParameter("ClassMode", classMode);
		}
	}

	public Float getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Float frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency.toString());
		}
	}

	public String getLoraVersion() {
		return this.loraVersion;
	}

	public void setLoraVersion(String loraVersion) {
		this.loraVersion = loraVersion;
		if(loraVersion != null){
			putQueryParameter("LoraVersion", loraVersion);
		}
	}

	public Integer getPeriodicity() {
		return this.periodicity;
	}

	public void setPeriodicity(Integer periodicity) {
		this.periodicity = periodicity;
		if(periodicity != null){
			putQueryParameter("Periodicity", periodicity.toString());
		}
	}

	public Integer getDataRate() {
		return this.dataRate;
	}

	public void setDataRate(Integer dataRate) {
		this.dataRate = dataRate;
		if(dataRate != null){
			putQueryParameter("DataRate", dataRate.toString());
		}
	}

	@Override
	public Class<CreateMulticastGroupResponse> getResponseClass() {
		return CreateMulticastGroupResponse.class;
	}

}
