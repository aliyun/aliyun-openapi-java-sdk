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

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOpenNLURequest extends RpcAcsRequest<GetOpenNLUResponse> {
	   

	private String sentence;

	private String labels;

	private String task;

	private String serviceCode;

	private String examples;
	public GetOpenNLURequest() {
		super("alinlp", "2020-06-29", "GetOpenNLU", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSentence() {
		return this.sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
		if(sentence != null){
			putBodyParameter("Sentence", sentence);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putBodyParameter("Labels", labels);
		}
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
		if(task != null){
			putBodyParameter("Task", task);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getExamples() {
		return this.examples;
	}

	public void setExamples(String examples) {
		this.examples = examples;
		if(examples != null){
			putBodyParameter("Examples", examples);
		}
	}

	@Override
	public Class<GetOpenNLUResponse> getResponseClass() {
		return GetOpenNLUResponse.class;
	}

}
