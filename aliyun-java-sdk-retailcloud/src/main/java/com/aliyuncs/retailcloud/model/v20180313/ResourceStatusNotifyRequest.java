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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResourceStatusNotifyRequest extends RpcAcsRequest<ResourceStatusNotifyResponse> {
	
	public ResourceStatusNotifyRequest() {
		super("retailcloud", "2018-03-13", "ResourceStatusNotify", "retailcloud");
	}

	private String data;

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putBodyParameter("data", data);
		}
	}

	@Override
	public Class<ResourceStatusNotifyResponse> getResponseClass() {
		return ResourceStatusNotifyResponse.class;
	}

}
