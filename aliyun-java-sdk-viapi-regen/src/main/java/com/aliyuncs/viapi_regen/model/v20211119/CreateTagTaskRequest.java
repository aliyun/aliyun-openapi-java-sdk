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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTagTaskRequest extends RpcAcsRequest<CreateTagTaskResponse> {
	   

	private Long labelsetId;
	public CreateTagTaskRequest() {
		super("viapi-regen", "2021-11-19", "CreateTagTask", "viapi-regen");
		setMethod(MethodType.POST);
	}

	public Long getLabelsetId() {
		return this.labelsetId;
	}

	public void setLabelsetId(Long labelsetId) {
		this.labelsetId = labelsetId;
		if(labelsetId != null){
			putBodyParameter("LabelsetId", labelsetId.toString());
		}
	}

	@Override
	public Class<CreateTagTaskResponse> getResponseClass() {
		return CreateTagTaskResponse.class;
	}

}
