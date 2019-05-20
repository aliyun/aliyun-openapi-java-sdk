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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UploadMediaCallbackRequest extends RpcAcsRequest<UploadMediaCallbackResponse> {
	
	public UploadMediaCallbackRequest() {
		super("CloudCallCenter", "2017-07-05", "UploadMediaCallback", "CloudCallCenter", "innerAPI");
	}

	private String callbackBody;

	private String instance;

	public String getCallbackBody() {
		return this.callbackBody;
	}

	public void setCallbackBody(String callbackBody) {
		this.callbackBody = callbackBody;
		if(callbackBody != null){
			putQueryParameter("CallbackBody", callbackBody);
		}
	}

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
		if(instance != null){
			putQueryParameter("Instance", instance);
		}
	}

	@Override
	public Class<UploadMediaCallbackResponse> getResponseClass() {
		return UploadMediaCallbackResponse.class;
	}

}
