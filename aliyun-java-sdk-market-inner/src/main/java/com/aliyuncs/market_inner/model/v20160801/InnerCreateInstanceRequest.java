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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerCreateInstanceRequest extends RpcAcsRequest<InnerCreateInstanceResponse> {
	
	public InnerCreateInstanceRequest() {
		super("Market-Inner", "2016-08-01", "InnerCreateInstance", "yunmarket", "innerAPI");
	}

	private String payLoad;

	private String clientToken;

	public String getPayLoad() {
		return this.payLoad;
	}

	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
		if(payLoad != null){
			putQueryParameter("PayLoad", payLoad);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	@Override
	public Class<InnerCreateInstanceResponse> getResponseClass() {
		return InnerCreateInstanceResponse.class;
	}

}
