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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadFileRequest extends RpcAcsRequest<UploadFileResponse> {
	   

	private String fileType;

	private String corpId;

	private String fileAliasName;

	private String fileName;

	private String filePath;

	private String fileContent;

	private String dataSourceId;

	private String mD5;
	public UploadFileRequest() {
		super("Vcs", "2020-05-15", "UploadFile", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putBodyParameter("FileType", fileType);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getFileAliasName() {
		return this.fileAliasName;
	}

	public void setFileAliasName(String fileAliasName) {
		this.fileAliasName = fileAliasName;
		if(fileAliasName != null){
			putBodyParameter("FileAliasName", fileAliasName);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("FilePath", filePath);
		}
	}

	public String getFileContent() {
		return this.fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
		if(fileContent != null){
			putBodyParameter("FileContent", fileContent);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	public String getMD5() {
		return this.mD5;
	}

	public void setMD5(String mD5) {
		this.mD5 = mD5;
		if(mD5 != null){
			putBodyParameter("MD5", mD5);
		}
	}

	@Override
	public Class<UploadFileResponse> getResponseClass() {
		return UploadFileResponse.class;
	}

}
