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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateHealthCheckUrlRequest extends RoaAcsRequest<UpdateHealthCheckUrlResponse> {
	
	public UpdateHealthCheckUrlRequest() {
		super("Edas", "2017-08-01", "UpdateHealthCheckUrl");
		setUriPattern("/pop/v5/app/modify_hc_url");
		setMethod(MethodType.POST);
	}

	private String appId;

	private String hcURL;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getHcURL() {
		return this.hcURL;
	}

	public void setHcURL(String hcURL) {
		this.hcURL = hcURL;
		if(hcURL != null){
			putQueryParameter("hcURL", hcURL);
		}
	}

	@Override
	public Class<UpdateHealthCheckUrlResponse> getResponseClass() {
		return UpdateHealthCheckUrlResponse.class;
	}

}
