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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppsRequest extends RpcAcsRequest<DescribeAppsResponse> {
	   

	private String bizRegionId;

	private String installationStatus;

	private String appName;

	private String nextToken;

	private List<String> appIdLists;

	private String appType;

	private Integer maxResults;

	private String status;

	private String mD5;
	public DescribeAppsRequest() {
		super("eds-aic", "2023-09-30", "DescribeApps");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public String getInstallationStatus() {
		return this.installationStatus;
	}

	public void setInstallationStatus(String installationStatus) {
		this.installationStatus = installationStatus;
		if(installationStatus != null){
			putQueryParameter("InstallationStatus", installationStatus);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getAppIdLists() {
		return this.appIdLists;
	}

	public void setAppIdLists(List<String> appIdLists) {
		this.appIdLists = appIdLists;	
		if (appIdLists != null) {
			for (int i = 0; i < appIdLists.size(); i++) {
				putQueryParameter("AppIdList." + (i + 1) , appIdLists.get(i));
			}
		}	
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getMD5() {
		return this.mD5;
	}

	public void setMD5(String mD5) {
		this.mD5 = mD5;
		if(mD5 != null){
			putQueryParameter("MD5", mD5);
		}
	}

	@Override
	public Class<DescribeAppsResponse> getResponseClass() {
		return DescribeAppsResponse.class;
	}

}
