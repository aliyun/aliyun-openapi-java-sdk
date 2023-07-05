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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendCallRequestRequest extends RpcAcsRequest<SendCallRequestResponse> {
	   

	private String dingId;

	private String callLocation;
	public SendCallRequestRequest() {
		super("Advisor-Share", "2018-06-08", "SendCallRequest", "advisor");
		setMethod(MethodType.POST);
	}

	public String getDingId() {
		return this.dingId;
	}

	public void setDingId(String dingId) {
		this.dingId = dingId;
		if(dingId != null){
			putQueryParameter("DingId", dingId);
		}
	}

	public String getCallLocation() {
		return this.callLocation;
	}

	public void setCallLocation(String callLocation) {
		this.callLocation = callLocation;
		if(callLocation != null){
			putQueryParameter("CallLocation", callLocation);
		}
	}

	@Override
	public Class<SendCallRequestResponse> getResponseClass() {
		return SendCallRequestResponse.class;
	}

}
