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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RestFirstARequest extends RoaAcsRequest<RestFirstAResponse> {
	   

	private String req;
	public RestFirstARequest() {
		super("LmzTest", "2010-01-01", "RestFirstA");
		setUriPattern("/test/a");
		setMethod(MethodType.POST);
	}

	public String getReq() {
		return this.req;
	}

	public void setReq(String req) {
		this.req = req;
		if(req != null){
			putBodyParameter("req", req);
		}
	}

	@Override
	public Class<RestFirstAResponse> getResponseClass() {
		return RestFirstAResponse.class;
	}

}
