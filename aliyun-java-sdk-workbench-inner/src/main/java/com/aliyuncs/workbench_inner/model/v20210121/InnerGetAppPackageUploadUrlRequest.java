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

package com.aliyuncs.workbench_inner.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerGetAppPackageUploadUrlRequest extends RpcAcsRequest<InnerGetAppPackageUploadUrlResponse> {
	   

	private Long appId;

	private String currentOrgId;

	private String packageName;

	private Long packageSize;

	private String userId;
	public InnerGetAppPackageUploadUrlRequest() {
		super("Workbench-inner", "2021-01-21", "InnerGetAppPackageUploadUrl");
		setMethod(MethodType.POST);
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
		if(packageName != null){
			putQueryParameter("PackageName", packageName);
		}
	}

	public Long getPackageSize() {
		return this.packageSize;
	}

	public void setPackageSize(Long packageSize) {
		this.packageSize = packageSize;
		if(packageSize != null){
			putQueryParameter("PackageSize", packageSize.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<InnerGetAppPackageUploadUrlResponse> getResponseClass() {
		return InnerGetAppPackageUploadUrlResponse.class;
	}

}
