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

package com.aliyuncs.umdatacloud.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTestRequest extends RpcAcsRequest<CreateTestResponse> {
	   

	private String clientToken;

	private String two;

	private String three;
	public CreateTestRequest() {
		super("UMDataCloud", "2020-04-01", "CreateTest");
		setMethod(MethodType.POST);
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

	public String getTwo() {
		return this.two;
	}

	public void setTwo(String two) {
		this.two = two;
		if(two != null){
			putQueryParameter("Two", two);
		}
	}

	public String getThree() {
		return this.three;
	}

	public void setThree(String three) {
		this.three = three;
		if(three != null){
			putQueryParameter("Three", three);
		}
	}

	@Override
	public Class<CreateTestResponse> getResponseClass() {
		return CreateTestResponse.class;
	}

}
