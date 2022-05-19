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
public class RestFirstCRequest extends RoaAcsRequest<RestFirstCResponse> {
	   

	private Long aliyunUid;

	private String name;
	public RestFirstCRequest() {
		super("LmzTest", "2010-01-01", "RestFirstC");
		setUriPattern("/test/c");
		setMethod(MethodType.POST);
	}

	public Long getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(Long aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("aliyunUid", aliyunUid.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	@Override
	public Class<RestFirstCResponse> getResponseClass() {
		return RestFirstCResponse.class;
	}

}
