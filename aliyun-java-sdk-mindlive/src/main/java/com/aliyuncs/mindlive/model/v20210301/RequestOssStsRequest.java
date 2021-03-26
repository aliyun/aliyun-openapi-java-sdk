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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RequestOssStsRequest extends RpcAcsRequest<RequestOssStsResponse> {
	   

	private Long expireSeconds;

	private String appCode;
	public RequestOssStsRequest() {
		super("MindLive", "2021-03-01", "RequestOssSts");
		setMethod(MethodType.POST);
	}

	public Long getExpireSeconds() {
		return this.expireSeconds;
	}

	public void setExpireSeconds(Long expireSeconds) {
		this.expireSeconds = expireSeconds;
		if(expireSeconds != null){
			putQueryParameter("ExpireSeconds", expireSeconds.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	@Override
	public Class<RequestOssStsResponse> getResponseClass() {
		return RequestOssStsResponse.class;
	}

}
