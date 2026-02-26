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
public class CreateScreenshotRequest extends RpcAcsRequest<CreateScreenshotResponse> {
	   

	private String skipCheckPolicyConfig;

	private List<String> androidInstanceIdLists;

	private String ossBucketName;
	public CreateScreenshotRequest() {
		super("eds-aic", "2023-09-30", "CreateScreenshot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getSkipCheckPolicyConfig() {
		return this.skipCheckPolicyConfig;
	}

	public void setSkipCheckPolicyConfig(String skipCheckPolicyConfig) {
		this.skipCheckPolicyConfig = skipCheckPolicyConfig;
		if(skipCheckPolicyConfig != null){
			putQueryParameter("SkipCheckPolicyConfig", skipCheckPolicyConfig);
		}
	}

	public List<String> getAndroidInstanceIdLists() {
		return this.androidInstanceIdLists;
	}

	public void setAndroidInstanceIdLists(List<String> androidInstanceIdLists) {
		this.androidInstanceIdLists = androidInstanceIdLists;	
		if (androidInstanceIdLists != null) {
			for (int i = 0; i < androidInstanceIdLists.size(); i++) {
				putQueryParameter("AndroidInstanceIdList." + (i + 1) , androidInstanceIdLists.get(i));
			}
		}	
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putQueryParameter("OssBucketName", ossBucketName);
		}
	}

	@Override
	public Class<CreateScreenshotResponse> getResponseClass() {
		return CreateScreenshotResponse.class;
	}

}
