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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FtDynamicAddressHttpVpcRequest extends RpcAcsRequest<FtDynamicAddressHttpVpcResponse> {
	   

	private String p1;

	private String stringValue;

	private String otherParam;

	private Boolean booleanParam;

	private String defaultValue;
	public FtDynamicAddressHttpVpcRequest() {
		super("Ft", "2018-07-13", "FtDynamicAddressHttpVpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getP1() {
		return this.p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
		if(p1 != null){
			putQueryParameter("P1", p1);
		}
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
		if(stringValue != null){
			putQueryParameter("StringValue", stringValue);
		}
	}

	public String getOtherParam() {
		return this.otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
		if(otherParam != null){
			putQueryParameter("OtherParam", otherParam);
		}
	}

	public Boolean getBooleanParam() {
		return this.booleanParam;
	}

	public void setBooleanParam(Boolean booleanParam) {
		this.booleanParam = booleanParam;
		if(booleanParam != null){
			putQueryParameter("BooleanParam", booleanParam.toString());
		}
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		if(defaultValue != null){
			putQueryParameter("DefaultValue", defaultValue);
		}
	}

	@Override
	public Class<FtDynamicAddressHttpVpcResponse> getResponseClass() {
		return FtDynamicAddressHttpVpcResponse.class;
	}

}
