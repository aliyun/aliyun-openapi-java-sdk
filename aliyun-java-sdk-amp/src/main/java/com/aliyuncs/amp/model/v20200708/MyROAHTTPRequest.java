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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MyROAHTTPRequest extends RoaAcsRequest<MyROAHTTPResponse> {
	   

	private String requestId;
	public MyROAHTTPRequest() {
		super("amp", "2020-07-08", "MyROAHTTP", "jeepproduct001");
		setUriPattern("/rpc/v1/demo8");
		setMethod(MethodType.POST);
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("requestId", requestId);
		}
	}

	@Override
	public Class<MyROAHTTPResponse> getResponseClass() {
		return MyROAHTTPResponse.class;
	}

}
