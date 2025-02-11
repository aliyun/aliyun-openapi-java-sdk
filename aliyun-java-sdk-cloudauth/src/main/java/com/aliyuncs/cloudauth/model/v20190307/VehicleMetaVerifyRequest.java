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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VehicleMetaVerifyRequest extends RpcAcsRequest<VehicleMetaVerifyResponse> {
	   

	private String vehicleType;

	private String paramType;

	private String vehicleNum;

	private String identifyNum;

	private String verifyMetaType;

	private String userName;
	public VehicleMetaVerifyRequest() {
		super("Cloudauth", "2019-03-07", "VehicleMetaVerify", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
		if(vehicleType != null){
			putQueryParameter("VehicleType", vehicleType);
		}
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
		if(paramType != null){
			putQueryParameter("ParamType", paramType);
		}
	}

	public String getVehicleNum() {
		return this.vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
		if(vehicleNum != null){
			putQueryParameter("VehicleNum", vehicleNum);
		}
	}

	public String getIdentifyNum() {
		return this.identifyNum;
	}

	public void setIdentifyNum(String identifyNum) {
		this.identifyNum = identifyNum;
		if(identifyNum != null){
			putQueryParameter("IdentifyNum", identifyNum);
		}
	}

	public String getVerifyMetaType() {
		return this.verifyMetaType;
	}

	public void setVerifyMetaType(String verifyMetaType) {
		this.verifyMetaType = verifyMetaType;
		if(verifyMetaType != null){
			putQueryParameter("VerifyMetaType", verifyMetaType);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<VehicleMetaVerifyResponse> getResponseClass() {
		return VehicleMetaVerifyResponse.class;
	}

}
