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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateEpnInstanceRequest extends RpcAcsRequest<CreateEpnInstanceResponse> {
	   

	private String networkingModel;

	private Integer internetMaxBandwidthOut;

	private String ePNInstanceType;

	private String internetChargeType;

	private String ePNInstanceName;
	public CreateEpnInstanceRequest() {
		super("Ens", "2017-11-10", "CreateEpnInstance", "ens");
		setMethod(MethodType.POST);
	}

	public String getNetworkingModel() {
		return this.networkingModel;
	}

	public void setNetworkingModel(String networkingModel) {
		this.networkingModel = networkingModel;
		if(networkingModel != null){
			putQueryParameter("NetworkingModel", networkingModel);
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getEPNInstanceType() {
		return this.ePNInstanceType;
	}

	public void setEPNInstanceType(String ePNInstanceType) {
		this.ePNInstanceType = ePNInstanceType;
		if(ePNInstanceType != null){
			putQueryParameter("EPNInstanceType", ePNInstanceType);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getEPNInstanceName() {
		return this.ePNInstanceName;
	}

	public void setEPNInstanceName(String ePNInstanceName) {
		this.ePNInstanceName = ePNInstanceName;
		if(ePNInstanceName != null){
			putQueryParameter("EPNInstanceName", ePNInstanceName);
		}
	}

	@Override
	public Class<CreateEpnInstanceResponse> getResponseClass() {
		return CreateEpnInstanceResponse.class;
	}

}
