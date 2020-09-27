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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MakeCallRequest extends RpcAcsRequest<MakeCallResponse> {
	   

	private String extInfo;

	private String callingNumber;

	private String commandCode;

	private String calledNumber;

	private String outerAccountId;

	private String outerAccountType;
	public MakeCallRequest() {
		super("aiccs", "2019-10-15", "MakeCall", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putQueryParameter("ExtInfo", extInfo);
		}
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
		}
	}

	public String getCommandCode() {
		return this.commandCode;
	}

	public void setCommandCode(String commandCode) {
		this.commandCode = commandCode;
		if(commandCode != null){
			putQueryParameter("CommandCode", commandCode);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getOuterAccountId() {
		return this.outerAccountId;
	}

	public void setOuterAccountId(String outerAccountId) {
		this.outerAccountId = outerAccountId;
		if(outerAccountId != null){
			putQueryParameter("OuterAccountId", outerAccountId);
		}
	}

	public String getOuterAccountType() {
		return this.outerAccountType;
	}

	public void setOuterAccountType(String outerAccountType) {
		this.outerAccountType = outerAccountType;
		if(outerAccountType != null){
			putQueryParameter("OuterAccountType", outerAccountType);
		}
	}

	@Override
	public Class<MakeCallResponse> getResponseClass() {
		return MakeCallResponse.class;
	}

}
