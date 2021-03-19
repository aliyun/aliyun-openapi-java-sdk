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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RequestResetDataRequest extends RpcAcsRequest<RequestResetDataResponse> {
	   

	private String resetAddressRequest;
	public RequestResetDataRequest() {
		super("MindLive", "2021-03-01", "RequestResetData");
		setMethod(MethodType.POST);
	}

	public String getResetAddressRequest() {
		return this.resetAddressRequest;
	}

	public void setResetAddressRequest(String resetAddressRequest) {
		this.resetAddressRequest = resetAddressRequest;
		if(resetAddressRequest != null){
			putQueryParameter("ResetAddressRequest", resetAddressRequest);
		}
	}

	@Override
	public Class<RequestResetDataResponse> getResponseClass() {
		return RequestResetDataResponse.class;
	}

}
