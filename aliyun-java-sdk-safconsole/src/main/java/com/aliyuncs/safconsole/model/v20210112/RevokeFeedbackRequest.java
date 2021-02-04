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

package com.aliyuncs.safconsole.model.v20210112;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeFeedbackRequest extends RpcAcsRequest<RevokeFeedbackResponse> {
	   

	private String sampleType;

	private String value;
	public RevokeFeedbackRequest() {
		super("safconsole", "2021-01-12", "RevokeFeedback", "safconsole");
		setMethod(MethodType.POST);
	}

	public String getSampleType() {
		return this.sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
		if(sampleType != null){
			putBodyParameter("SampleType", sampleType);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
		}
	}

	@Override
	public Class<RevokeFeedbackResponse> getResponseClass() {
		return RevokeFeedbackResponse.class;
	}

}
