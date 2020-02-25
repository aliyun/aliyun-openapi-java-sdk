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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUserInfoRequest extends RpcAcsRequest<GetUserInfoResponse> {
	   

	private String userFlag;

	private String appName;

	private String queryJson;

	private String bizId;
	public GetUserInfoRequest() {
		super("linkedmall", "2018-01-16", "GetUserInfo");
		setMethod(MethodType.POST);
	}

	public String getUserFlag() {
		return this.userFlag;
	}

	public void setUserFlag(String userFlag) {
		this.userFlag = userFlag;
		if(userFlag != null){
			putQueryParameter("UserFlag", userFlag);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getQueryJson() {
		return this.queryJson;
	}

	public void setQueryJson(String queryJson) {
		this.queryJson = queryJson;
		if(queryJson != null){
			putBodyParameter("QueryJson", queryJson);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<GetUserInfoResponse> getResponseClass() {
		return GetUserInfoResponse.class;
	}

}
