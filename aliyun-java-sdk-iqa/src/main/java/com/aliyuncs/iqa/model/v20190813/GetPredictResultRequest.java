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

package com.aliyuncs.iqa.model.v20190813;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPredictResultRequest extends RpcAcsRequest<GetPredictResultResponse> {
	   

	private Integer topK;

	private String traceTag;

	private String question;

	private String projectId;
	public GetPredictResultRequest() {
		super("iqa", "2019-08-13", "GetPredictResult", "iqa");
		setMethod(MethodType.POST);
	}

	public Integer getTopK() {
		return this.topK;
	}

	public void setTopK(Integer topK) {
		this.topK = topK;
		if(topK != null){
			putQueryParameter("TopK", topK.toString());
		}
	}

	public String getTraceTag() {
		return this.traceTag;
	}

	public void setTraceTag(String traceTag) {
		this.traceTag = traceTag;
		if(traceTag != null){
			putQueryParameter("TraceTag", traceTag);
		}
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
		if(question != null){
			putBodyParameter("Question", question);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<GetPredictResultResponse> getResponseClass() {
		return GetPredictResultResponse.class;
	}

}
