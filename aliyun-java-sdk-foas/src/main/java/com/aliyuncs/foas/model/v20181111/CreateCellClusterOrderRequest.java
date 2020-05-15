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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCellClusterOrderRequest extends RoaAcsRequest<CreateCellClusterOrderResponse> {
	   

	private Integer period;

	private Integer slaveNum;

	private String slaveSpec;

	private String region;

	private Integer masterNum;

	private String masterSpec;

	private String payModel;
	public CreateCellClusterOrderRequest() {
		super("foas", "2018-11-11", "CreateCellClusterOrder", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/realtime-compute/cell/buy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putBodyParameter("period", period.toString());
		}
	}

	public Integer getSlaveNum() {
		return this.slaveNum;
	}

	public void setSlaveNum(Integer slaveNum) {
		this.slaveNum = slaveNum;
		if(slaveNum != null){
			putBodyParameter("slaveNum", slaveNum.toString());
		}
	}

	public String getSlaveSpec() {
		return this.slaveSpec;
	}

	public void setSlaveSpec(String slaveSpec) {
		this.slaveSpec = slaveSpec;
		if(slaveSpec != null){
			putBodyParameter("slaveSpec", slaveSpec);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("region", region);
		}
	}

	public Integer getMasterNum() {
		return this.masterNum;
	}

	public void setMasterNum(Integer masterNum) {
		this.masterNum = masterNum;
		if(masterNum != null){
			putBodyParameter("masterNum", masterNum.toString());
		}
	}

	public String getMasterSpec() {
		return this.masterSpec;
	}

	public void setMasterSpec(String masterSpec) {
		this.masterSpec = masterSpec;
		if(masterSpec != null){
			putBodyParameter("masterSpec", masterSpec);
		}
	}

	public String getPayModel() {
		return this.payModel;
	}

	public void setPayModel(String payModel) {
		this.payModel = payModel;
		if(payModel != null){
			putBodyParameter("payModel", payModel);
		}
	}

	@Override
	public Class<CreateCellClusterOrderResponse> getResponseClass() {
		return CreateCellClusterOrderResponse.class;
	}

}
