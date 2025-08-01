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
public class FetchFileRequest extends RpcAcsRequest<FetchFileResponse> {
	   

	private String sourceFilePath;

	private String uploadType;

	private List<String> androidInstanceIdLists;

	private String uploadUrl;

	private String uploadEndpoint;
	public FetchFileRequest() {
		super("eds-aic", "2023-09-30", "FetchFile");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getSourceFilePath() {
		return this.sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
		if(sourceFilePath != null){
			putQueryParameter("SourceFilePath", sourceFilePath);
		}
	}

	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
		if(uploadType != null){
			putQueryParameter("UploadType", uploadType);
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

	public String getUploadUrl() {
		return this.uploadUrl;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
		if(uploadUrl != null){
			putQueryParameter("UploadUrl", uploadUrl);
		}
	}

	public String getUploadEndpoint() {
		return this.uploadEndpoint;
	}

	public void setUploadEndpoint(String uploadEndpoint) {
		this.uploadEndpoint = uploadEndpoint;
		if(uploadEndpoint != null){
			putQueryParameter("UploadEndpoint", uploadEndpoint);
		}
	}

	@Override
	public Class<FetchFileResponse> getResponseClass() {
		return FetchFileResponse.class;
	}

}
