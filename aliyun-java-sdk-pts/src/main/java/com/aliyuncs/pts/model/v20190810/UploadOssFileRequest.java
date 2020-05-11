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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadOssFileRequest extends RpcAcsRequest<UploadOssFileResponse> {
	   

	private String extension;

	private String fileName;

	private String ossUrl;

	private String uploadExtraInfo;

	private Integer uploadType;
	public UploadOssFileRequest() {
		super("PTS", "2019-08-10", "UploadOssFile", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
		if(extension != null){
			putQueryParameter("Extension", extension);
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

	public String getOssUrl() {
		return this.ossUrl;
	}

	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
		if(ossUrl != null){
			putQueryParameter("OssUrl", ossUrl);
		}
	}

	public String getUploadExtraInfo() {
		return this.uploadExtraInfo;
	}

	public void setUploadExtraInfo(String uploadExtraInfo) {
		this.uploadExtraInfo = uploadExtraInfo;
		if(uploadExtraInfo != null){
			putQueryParameter("UploadExtraInfo", uploadExtraInfo);
		}
	}

	public Integer getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(Integer uploadType) {
		this.uploadType = uploadType;
		if(uploadType != null){
			putQueryParameter("UploadType", uploadType.toString());
		}
	}

	@Override
	public Class<UploadOssFileResponse> getResponseClass() {
		return UploadOssFileResponse.class;
	}

}
