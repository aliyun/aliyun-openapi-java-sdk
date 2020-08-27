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
public class DescribeApplicationRequest extends RpcAcsRequest<DescribeApplicationResponse> {
	   

	private String appVersions;

	private String outDetailStatParams;

	private String level;

	private String appId;
	public DescribeApplicationRequest() {
		super("Ens", "2017-11-10", "DescribeApplication", "ens");
		setMethod(MethodType.POST);
	}

	public String getAppVersions() {
		return this.appVersions;
	}

	public void setAppVersions(String appVersions) {
		this.appVersions = appVersions;
		if(appVersions != null){
			putQueryParameter("AppVersions", appVersions);
		}
	}

	public String getOutDetailStatParams() {
		return this.outDetailStatParams;
	}

	public void setOutDetailStatParams(String outDetailStatParams) {
		this.outDetailStatParams = outDetailStatParams;
		if(outDetailStatParams != null){
			putQueryParameter("OutDetailStatParams", outDetailStatParams);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
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
	public Class<DescribeApplicationResponse> getResponseClass() {
		return DescribeApplicationResponse.class;
	}

}
