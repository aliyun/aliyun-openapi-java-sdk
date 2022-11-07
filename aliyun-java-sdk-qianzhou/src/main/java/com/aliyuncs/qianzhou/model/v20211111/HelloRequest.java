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

package com.aliyuncs.qianzhou.model.v20211111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HelloRequest extends RoaAcsRequest<HelloResponse> {
	   

	private String user;
	public HelloRequest() {
		super("qianzhou", "2021-11-11", "Hello");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/popapi/hello");
		setMethod(MethodType.GET);
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("user", user);
		}
	}

	@Override
	public Class<HelloResponse> getResponseClass() {
		return HelloResponse.class;
	}

}
