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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ServiceInvokeRequest extends RpcAcsRequest<ServiceInvokeResponse> {
	   

	private String xClientIp;

	private String mobileExtendParamsJsonSign;

	private String serverExtendParamsJson;

	private String doraemonAction;

	private String mobileExtendParamsJson;

	private String serviceCode;

	private Boolean testModel;

	private String applicationExternalId;
	public ServiceInvokeRequest() {
		super("idaas-doraemon", "2021-05-20", "ServiceInvoke");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getXClientIp() {
		return this.xClientIp;
	}

	public void setXClientIp(String xClientIp) {
		this.xClientIp = xClientIp;
		if(xClientIp != null){
			putQueryParameter("XClientIp", xClientIp);
		}
	}

	public String getMobileExtendParamsJsonSign() {
		return this.mobileExtendParamsJsonSign;
	}

	public void setMobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
		this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
		if(mobileExtendParamsJsonSign != null){
			putQueryParameter("MobileExtendParamsJsonSign", mobileExtendParamsJsonSign);
		}
	}

	public String getServerExtendParamsJson() {
		return this.serverExtendParamsJson;
	}

	public void setServerExtendParamsJson(String serverExtendParamsJson) {
		this.serverExtendParamsJson = serverExtendParamsJson;
		if(serverExtendParamsJson != null){
			putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
		}
	}

	public String getDoraemonAction() {
		return this.doraemonAction;
	}

	public void setDoraemonAction(String doraemonAction) {
		this.doraemonAction = doraemonAction;
		if(doraemonAction != null){
			putQueryParameter("DoraemonAction", doraemonAction);
		}
	}

	public String getMobileExtendParamsJson() {
		return this.mobileExtendParamsJson;
	}

	public void setMobileExtendParamsJson(String mobileExtendParamsJson) {
		this.mobileExtendParamsJson = mobileExtendParamsJson;
		if(mobileExtendParamsJson != null){
			putQueryParameter("MobileExtendParamsJson", mobileExtendParamsJson);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putQueryParameter("ServiceCode", serviceCode);
		}
	}

	public Boolean getTestModel() {
		return this.testModel;
	}

	public void setTestModel(Boolean testModel) {
		this.testModel = testModel;
		if(testModel != null){
			putQueryParameter("TestModel", testModel.toString());
		}
	}

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	@Override
	public Class<ServiceInvokeResponse> getResponseClass() {
		return ServiceInvokeResponse.class;
	}

}
