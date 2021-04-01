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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateFileUploadURLRequest extends RpcAcsRequest<GenerateFileUploadURLResponse> {
	   

	private String fileSuffix;

	private String iotInstanceId;

	private String fileName;

	private String bizCode;
	public GenerateFileUploadURLRequest() {
		super("Iot", "2018-01-20", "GenerateFileUploadURL", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileSuffix() {
		return this.fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
		if(fileSuffix != null){
			putQueryParameter("FileSuffix", fileSuffix);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
		if(bizCode != null){
			putQueryParameter("BizCode", bizCode);
		}
	}

	@Override
	public Class<GenerateFileUploadURLResponse> getResponseClass() {
		return GenerateFileUploadURLResponse.class;
	}

}
