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

package com.aliyuncs.nlp_automl.model.v20190701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PredictMTModelByDocRequest extends RpcAcsRequest<PredictMTModelByDocResponse> {
	   

	private String fileType;

	private Integer modelId;

	private String fileContent;

	private Boolean needXLIFF;

	private String modelVersion;
	public PredictMTModelByDocRequest() {
		super("nlp-automl", "2019-07-01", "PredictMTModelByDoc", "nlpautoml");
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
			putQueryParameter("FileType", fileType);
		}
	}

	public Integer getModelId() {
		return this.modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId.toString());
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

	public Boolean getNeedXLIFF() {
		return this.needXLIFF;
	}

	public void setNeedXLIFF(Boolean needXLIFF) {
		this.needXLIFF = needXLIFF;
		if(needXLIFF != null){
			putQueryParameter("NeedXLIFF", needXLIFF.toString());
		}
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putQueryParameter("ModelVersion", modelVersion);
		}
	}

	@Override
	public Class<PredictMTModelByDocResponse> getResponseClass() {
		return PredictMTModelByDocResponse.class;
	}

}
