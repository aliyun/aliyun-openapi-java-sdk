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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadAppSiteValidationFileRequest extends RpcAcsRequest<UploadAppSiteValidationFileResponse> {
	   

	private String fileType;

	private String siteHost;

	private String file;

	private String fileContent;

	private String domain;

	private String bizId;
	public UploadAppSiteValidationFileRequest() {
		super("WebsiteBuild", "2025-04-29", "UploadAppSiteValidationFile");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putQueryParameter("FileType", fileType);
		}
	}

	public String getSiteHost() {
		return this.siteHost;
	}

	public void setSiteHost(String siteHost) {
		this.siteHost = siteHost;
		if(siteHost != null){
			putQueryParameter("SiteHost", siteHost);
		}
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
		if(file != null){
			putQueryParameter("File", file);
		}
	}

	public String getFileContent() {
		return this.fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
		if(fileContent != null){
			putQueryParameter("FileContent", fileContent);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<UploadAppSiteValidationFileResponse> getResponseClass() {
		return UploadAppSiteValidationFileResponse.class;
	}

}
