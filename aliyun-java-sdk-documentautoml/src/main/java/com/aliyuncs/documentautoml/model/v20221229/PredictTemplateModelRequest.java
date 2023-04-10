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

package com.aliyuncs.documentautoml.model.v20221229;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PredictTemplateModelRequest extends RpcAcsRequest<PredictTemplateModelResponse> {
	   

	private String body;

	private String content;

	private Boolean binaryToText;

	private Long taskId;
	public PredictTemplateModelRequest() {
		super("documentAutoml", "2022-12-29", "PredictTemplateModel", "documentAutoml");
		setMethod(MethodType.POST);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Boolean getBinaryToText() {
		return this.binaryToText;
	}

	public void setBinaryToText(Boolean binaryToText) {
		this.binaryToText = binaryToText;
		if(binaryToText != null){
			putQueryParameter("BinaryToText", binaryToText.toString());
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<PredictTemplateModelResponse> getResponseClass() {
		return PredictTemplateModelResponse.class;
	}

}
