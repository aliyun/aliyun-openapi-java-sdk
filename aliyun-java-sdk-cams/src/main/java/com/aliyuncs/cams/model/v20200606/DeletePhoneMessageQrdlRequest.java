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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePhoneMessageQrdlRequest extends RpcAcsRequest<DeletePhoneMessageQrdlResponse> {
	   

	private String phoneNumber;

	private String qrdlCode;

	private String custSpaceId;
	public DeletePhoneMessageQrdlRequest() {
		super("cams", "2020-06-06", "DeletePhoneMessageQrdl", "cams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putBodyParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getQrdlCode() {
		return this.qrdlCode;
	}

	public void setQrdlCode(String qrdlCode) {
		this.qrdlCode = qrdlCode;
		if(qrdlCode != null){
			putBodyParameter("QrdlCode", qrdlCode);
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putBodyParameter("CustSpaceId", custSpaceId);
		}
	}

	@Override
	public Class<DeletePhoneMessageQrdlResponse> getResponseClass() {
		return DeletePhoneMessageQrdlResponse.class;
	}

}
