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
public class Mobile3MetaDetailStandardVerifyRequest extends RpcAcsRequest<Mobile3MetaDetailStandardVerifyResponse> {
	   

	private String paramType;

	private String mobile;

	private String identifyNum;

	private String userName;
	public Mobile3MetaDetailStandardVerifyRequest() {
		super("Cloudauth", "2019-03-07", "Mobile3MetaDetailStandardVerify", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
		if(paramType != null){
			putBodyParameter("ParamType", paramType);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putBodyParameter("Mobile", mobile);
		}
	}

	public String getIdentifyNum() {
		return this.identifyNum;
	}

	public void setIdentifyNum(String identifyNum) {
		this.identifyNum = identifyNum;
		if(identifyNum != null){
			putBodyParameter("IdentifyNum", identifyNum);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<Mobile3MetaDetailStandardVerifyResponse> getResponseClass() {
		return Mobile3MetaDetailStandardVerifyResponse.class;
	}

}
