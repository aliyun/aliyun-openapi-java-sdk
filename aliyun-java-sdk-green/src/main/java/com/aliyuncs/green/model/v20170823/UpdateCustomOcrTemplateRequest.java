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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomOcrTemplateRequest extends RpcAcsRequest<UpdateCustomOcrTemplateResponse> {
	
	public UpdateCustomOcrTemplateRequest() {
		super("Green", "2017-08-23", "UpdateCustomOcrTemplate", "green");
	}

	private String referArea;

	private String recognizeArea;

	private String name;

	private Long id;

	public String getReferArea() {
		return this.referArea;
	}

	public void setReferArea(String referArea) {
		this.referArea = referArea;
		if(referArea != null){
			putQueryParameter("ReferArea", referArea);
		}
	}

	public String getRecognizeArea() {
		return this.recognizeArea;
	}

	public void setRecognizeArea(String recognizeArea) {
		this.recognizeArea = recognizeArea;
		if(recognizeArea != null){
			putQueryParameter("RecognizeArea", recognizeArea);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<UpdateCustomOcrTemplateResponse> getResponseClass() {
		return UpdateCustomOcrTemplateResponse.class;
	}

}
