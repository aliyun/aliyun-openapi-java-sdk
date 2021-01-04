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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateModelRequest extends RpcAcsRequest<CreateModelResponse> {
	   

	private String uploadModelPath;

	private String description;

	private String modelPackageStandard;

	private Long algorithmId;

	private String hardware;

	private Boolean needEncrypt;

	private String name;
	public CreateModelRequest() {
		super("Linkvisual", "2018-01-20", "CreateModel", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUploadModelPath() {
		return this.uploadModelPath;
	}

	public void setUploadModelPath(String uploadModelPath) {
		this.uploadModelPath = uploadModelPath;
		if(uploadModelPath != null){
			putQueryParameter("UploadModelPath", uploadModelPath);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getModelPackageStandard() {
		return this.modelPackageStandard;
	}

	public void setModelPackageStandard(String modelPackageStandard) {
		this.modelPackageStandard = modelPackageStandard;
		if(modelPackageStandard != null){
			putQueryParameter("ModelPackageStandard", modelPackageStandard);
		}
	}

	public Long getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(Long algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putQueryParameter("AlgorithmId", algorithmId.toString());
		}
	}

	public String getHardware() {
		return this.hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
		if(hardware != null){
			putQueryParameter("Hardware", hardware);
		}
	}

	public Boolean getNeedEncrypt() {
		return this.needEncrypt;
	}

	public void setNeedEncrypt(Boolean needEncrypt) {
		this.needEncrypt = needEncrypt;
		if(needEncrypt != null){
			putQueryParameter("NeedEncrypt", needEncrypt.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateModelResponse> getResponseClass() {
		return CreateModelResponse.class;
	}

}
