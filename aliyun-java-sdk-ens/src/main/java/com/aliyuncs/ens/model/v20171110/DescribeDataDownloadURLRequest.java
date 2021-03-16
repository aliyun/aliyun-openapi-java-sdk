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
public class DescribeDataDownloadURLRequest extends RpcAcsRequest<DescribeDataDownloadURLResponse> {
	   

	private Long expireTimeout;

	private String serverFilterStrategy;

	private String dataName;

	private String dataVersion;

	private String appId;
	public DescribeDataDownloadURLRequest() {
		super("Ens", "2017-11-10", "DescribeDataDownloadURL");
		setMethod(MethodType.GET);
	}

	public Long getExpireTimeout() {
		return this.expireTimeout;
	}

	public void setExpireTimeout(Long expireTimeout) {
		this.expireTimeout = expireTimeout;
		if(expireTimeout != null){
			putQueryParameter("ExpireTimeout", expireTimeout.toString());
		}
	}

	public String getServerFilterStrategy() {
		return this.serverFilterStrategy;
	}

	public void setServerFilterStrategy(String serverFilterStrategy) {
		this.serverFilterStrategy = serverFilterStrategy;
		if(serverFilterStrategy != null){
			putQueryParameter("ServerFilterStrategy", serverFilterStrategy);
		}
	}

	public String getDataName() {
		return this.dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
		if(dataName != null){
			putQueryParameter("DataName", dataName);
		}
	}

	public String getDataVersion() {
		return this.dataVersion;
	}

	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
		if(dataVersion != null){
			putQueryParameter("DataVersion", dataVersion);
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
	public Class<DescribeDataDownloadURLResponse> getResponseClass() {
		return DescribeDataDownloadURLResponse.class;
	}

}
