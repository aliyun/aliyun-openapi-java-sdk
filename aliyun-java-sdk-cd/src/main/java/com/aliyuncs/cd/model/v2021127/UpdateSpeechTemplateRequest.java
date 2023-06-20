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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateSpeechTemplateRequest extends RoaAcsRequest<UpdateSpeechTemplateResponse> {
	   

	private String country;

	private String type;

	private String contents;
	public UpdateSpeechTemplateRequest() {
		super("cd", "2021-12-7", "UpdateSpeechTemplate");
		setUriPattern("/UpdateSpeechTemplate");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("country", country);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
		if(contents != null){
			putBodyParameter("Contents", contents);
		}
	}

	@Override
	public Class<UpdateSpeechTemplateResponse> getResponseClass() {
		return UpdateSpeechTemplateResponse.class;
	}

}
