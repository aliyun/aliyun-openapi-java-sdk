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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushApplicationDataRequest extends RpcAcsRequest<PushApplicationDataResponse> {
	   

	private String data;

	private Integer timeout;

	private String pushStrategy;

	private String appId;
	public PushApplicationDataRequest() {
		super("Ens", "2017-11-10", "PushApplicationData", "ens");
		setMethod(MethodType.POST);
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getPushStrategy() {
		return this.pushStrategy;
	}

	public void setPushStrategy(String pushStrategy) {
		this.pushStrategy = pushStrategy;
		if(pushStrategy != null){
			putQueryParameter("PushStrategy", pushStrategy);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<PushApplicationDataResponse> getResponseClass() {
		return PushApplicationDataResponse.class;
	}

}
