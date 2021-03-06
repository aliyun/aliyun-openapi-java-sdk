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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadFileJobRequest extends RpcAcsRequest<CreateUploadFileJobResponse> {
	   

	private String fileSource;

	private String fileName;

	private String uploadURL;
	public CreateUploadFileJobRequest() {
		super("dms-enterprise", "2018-11-01", "CreateUploadFileJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileSource() {
		return this.fileSource;
	}

	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
		if(fileSource != null){
			putQueryParameter("FileSource", fileSource);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getUploadURL() {
		return this.uploadURL;
	}

	public void setUploadURL(String uploadURL) {
		this.uploadURL = uploadURL;
		if(uploadURL != null){
			putQueryParameter("UploadURL", uploadURL);
		}
	}

	@Override
	public Class<CreateUploadFileJobResponse> getResponseClass() {
		return CreateUploadFileJobResponse.class;
	}

}
