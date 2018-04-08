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

package com.aliyuncs.green.model.v20170825;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class VoiceAsyncScanResultsRequest extends RoaAcsRequest<VoiceAsyncScanResultsResponse> {
	
	public VoiceAsyncScanResultsRequest() {
		super("Green", "2017-08-25", "VoiceAsyncScanResults", "green");
		setUriPattern("/green/voice/results");
		setMethod(MethodType.POST);
	}

	private String clientInfo;

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
		if(clientInfo != null){
			putQueryParameter("ClientInfo", clientInfo);
		}
	}

	@Override
	public Class<VoiceAsyncScanResultsResponse> getResponseClass() {
		return VoiceAsyncScanResultsResponse.class;
	}

}
