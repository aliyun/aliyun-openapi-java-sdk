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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNumberDistrictInfoParsingTaskRequest extends RpcAcsRequest<CreateNumberDistrictInfoParsingTaskResponse> {
	   

	private Long fileSize;

	private String filePath;
	public CreateNumberDistrictInfoParsingTaskRequest() {
		super("OutboundBot", "2019-12-26", "CreateNumberDistrictInfoParsingTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
		if(fileSize != null){
			putQueryParameter("FileSize", fileSize.toString());
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putQueryParameter("FilePath", filePath);
		}
	}

	@Override
	public Class<CreateNumberDistrictInfoParsingTaskResponse> getResponseClass() {
		return CreateNumberDistrictInfoParsingTaskResponse.class;
	}

}
