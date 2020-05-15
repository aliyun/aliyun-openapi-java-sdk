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

package com.aliyuncs.aliyunauth.model.v20181222;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthenticateRequest extends RpcAcsRequest<AuthenticateResponse> {
	   

	private String requestFromApp;

	private String productCode;

	private String instanceId;

	private String requestWay;

	private String userNo;

	private String language;

	private String operateCode;

	private String operatorTypeEnum;
	public AuthenticateRequest() {
		super("AliyunAuth", "2018-12-22", "Authenticate");
		setMethod(MethodType.GET);
	}

	public String getRequestFromApp() {
		return this.requestFromApp;
	}

	public void setRequestFromApp(String requestFromApp) {
		this.requestFromApp = requestFromApp;
		if(requestFromApp != null){
			putQueryParameter("RequestFromApp", requestFromApp);
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
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

	public String getRequestWay() {
		return this.requestWay;
	}

	public void setRequestWay(String requestWay) {
		this.requestWay = requestWay;
		if(requestWay != null){
			putQueryParameter("RequestWay", requestWay);
		}
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
		if(userNo != null){
			putQueryParameter("UserNo", userNo);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getOperateCode() {
		return this.operateCode;
	}

	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
		if(operateCode != null){
			putQueryParameter("OperateCode", operateCode);
		}
	}

	public String getOperatorTypeEnum() {
		return this.operatorTypeEnum;
	}

	public void setOperatorTypeEnum(String operatorTypeEnum) {
		this.operatorTypeEnum = operatorTypeEnum;
		if(operatorTypeEnum != null){
			putQueryParameter("OperatorTypeEnum", operatorTypeEnum);
		}
	}

	@Override
	public Class<AuthenticateResponse> getResponseClass() {
		return AuthenticateResponse.class;
	}

}
