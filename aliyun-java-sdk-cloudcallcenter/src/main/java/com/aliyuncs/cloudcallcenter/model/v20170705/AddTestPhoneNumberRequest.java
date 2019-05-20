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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddTestPhoneNumberRequest extends RpcAcsRequest<AddTestPhoneNumberResponse> {
	
	public AddTestPhoneNumberRequest() {
		super("CloudCallCenter", "2017-07-05", "AddTestPhoneNumber", "CloudCallCenter", "innerAPI");
	}

	private Integer trunks;

	private String number;

	private Boolean inboundOnly;

	public Integer getTrunks() {
		return this.trunks;
	}

	public void setTrunks(Integer trunks) {
		this.trunks = trunks;
		if(trunks != null){
			putQueryParameter("Trunks", trunks.toString());
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public Boolean getInboundOnly() {
		return this.inboundOnly;
	}

	public void setInboundOnly(Boolean inboundOnly) {
		this.inboundOnly = inboundOnly;
		if(inboundOnly != null){
			putQueryParameter("InboundOnly", inboundOnly.toString());
		}
	}

	@Override
	public Class<AddTestPhoneNumberResponse> getResponseClass() {
		return AddTestPhoneNumberResponse.class;
	}

}
