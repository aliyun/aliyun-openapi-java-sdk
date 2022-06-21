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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AppStopRequest extends RpcAcsRequest<AppStopResponse> {
	   

	private Long appUid;

	private Long userId;
	public AppStopRequest() {
		super("SWAS", "2017-08-10", "AppStop", "SWAS");
		setMethod(MethodType.POST);
	}

	public Long getAppUid() {
		return this.appUid;
	}

	public void setAppUid(Long appUid) {
		this.appUid = appUid;
		if(appUid != null){
			putQueryParameter("AppUid", appUid.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<AppStopResponse> getResponseClass() {
		return AppStopResponse.class;
	}

}
