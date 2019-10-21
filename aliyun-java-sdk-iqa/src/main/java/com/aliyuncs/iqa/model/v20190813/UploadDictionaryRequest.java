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

package com.aliyuncs.iqa.model.v20190813;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadDictionaryRequest extends RpcAcsRequest<UploadDictionaryResponse> {
	   

	private String dictionaryFileUrl;

	private String projectId;

	private String dictionaryData;
	public UploadDictionaryRequest() {
		super("iqa", "2019-08-13", "UploadDictionary", "iqa");
		setMethod(MethodType.POST);
	}

	public String getDictionaryFileUrl() {
		return this.dictionaryFileUrl;
	}

	public void setDictionaryFileUrl(String dictionaryFileUrl) {
		this.dictionaryFileUrl = dictionaryFileUrl;
		if(dictionaryFileUrl != null){
			putBodyParameter("DictionaryFileUrl", dictionaryFileUrl);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getDictionaryData() {
		return this.dictionaryData;
	}

	public void setDictionaryData(String dictionaryData) {
		this.dictionaryData = dictionaryData;
		if(dictionaryData != null){
			putBodyParameter("DictionaryData", dictionaryData);
		}
	}

	@Override
	public Class<UploadDictionaryResponse> getResponseClass() {
		return UploadDictionaryResponse.class;
	}

}
