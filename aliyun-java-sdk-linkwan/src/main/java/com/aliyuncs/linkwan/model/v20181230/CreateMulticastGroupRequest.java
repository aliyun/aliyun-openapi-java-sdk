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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateMulticastGroupRequest extends RpcAcsRequest<CreateMulticastGroupResponse> {
	
	public CreateMulticastGroupRequest() {
		super("LinkWAN", "2018-12-30", "CreateMulticastGroup", "linkwan");
	}

	private String classMode;

	private Float frequency;

	private String loraVersion;

	private Integer periodicity;

	private Integer dataRate;

	public String getClassMode() {
		return this.classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
		if(classMode != null){
			putBodyParameter("ClassMode", classMode);
		}
	}

	public Float getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Float frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putBodyParameter("Frequency", frequency.toString());
		}
	}

	public String getLoraVersion() {
		return this.loraVersion;
	}

	public void setLoraVersion(String loraVersion) {
		this.loraVersion = loraVersion;
		if(loraVersion != null){
			putBodyParameter("LoraVersion", loraVersion);
		}
	}

	public Integer getPeriodicity() {
		return this.periodicity;
	}

	public void setPeriodicity(Integer periodicity) {
		this.periodicity = periodicity;
		if(periodicity != null){
			putBodyParameter("Periodicity", periodicity.toString());
		}
	}

	public Integer getDataRate() {
		return this.dataRate;
	}

	public void setDataRate(Integer dataRate) {
		this.dataRate = dataRate;
		if(dataRate != null){
			putBodyParameter("DataRate", dataRate.toString());
		}
	}

	@Override
	public Class<CreateMulticastGroupResponse> getResponseClass() {
		return CreateMulticastGroupResponse.class;
	}

}
