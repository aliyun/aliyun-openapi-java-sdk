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

package com.aliyuncs.cloudmarketing.model.v20180910;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ProcessAfterUploadFileRequest extends RpcAcsRequest<ProcessAfterUploadFileResponse> {
	
	public ProcessAfterUploadFileRequest() {
		super("cloudmarketing", "2018-09-10", "ProcessAfterUploadFile");
	}

	private String srcFileName;

	private String ossPath;

	public String getSrcFileName() {
		return this.srcFileName;
	}

	public void setSrcFileName(String srcFileName) {
		this.srcFileName = srcFileName;
		if(srcFileName != null){
			putQueryParameter("SrcFileName", srcFileName);
		}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putQueryParameter("OssPath", ossPath);
		}
	}

	@Override
	public Class<ProcessAfterUploadFileResponse> getResponseClass() {
		return ProcessAfterUploadFileResponse.class;
	}

}
