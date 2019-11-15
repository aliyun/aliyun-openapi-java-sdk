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

package com.aliyuncs.nlp_automl.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPredictResultRequest extends RpcAcsRequest<GetPredictResultResponse> {
	   

	private Integer topK;

	private Integer modelId;

	private String detailTag;

	private String content;

	private String modelVersion;
	public GetPredictResultRequest() {
		super("nlp-automl", "2019-11-11", "GetPredictResult", "nlpautoml");
		setMethod(MethodType.POST);
	}

	public Integer getTopK() {
		return this.topK;
	}

	public void setTopK(Integer topK) {
		this.topK = topK;
		if(topK != null){
			putBodyParameter("TopK", topK.toString());
		}
	}

	public Integer getModelId() {
		return this.modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putBodyParameter("ModelId", modelId.toString());
		}
	}

	public String getDetailTag() {
		return this.detailTag;
	}

	public void setDetailTag(String detailTag) {
		this.detailTag = detailTag;
		if(detailTag != null){
			putBodyParameter("DetailTag", detailTag);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putBodyParameter("ModelVersion", modelVersion);
		}
	}

	@Override
	public Class<GetPredictResultResponse> getResponseClass() {
		return GetPredictResultResponse.class;
	}

}
