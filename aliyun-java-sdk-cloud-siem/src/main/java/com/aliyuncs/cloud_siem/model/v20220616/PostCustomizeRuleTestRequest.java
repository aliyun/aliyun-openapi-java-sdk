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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostCustomizeRuleTestRequest extends RpcAcsRequest<PostCustomizeRuleTestResponse> {
	   

	private Long id;

	private String simulatedData;

	private String testType;
	public PostCustomizeRuleTestRequest() {
		super("cloud-siem", "2022-06-16", "PostCustomizeRuleTest", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getSimulatedData() {
		return this.simulatedData;
	}

	public void setSimulatedData(String simulatedData) {
		this.simulatedData = simulatedData;
		if(simulatedData != null){
			putBodyParameter("SimulatedData", simulatedData);
		}
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
		if(testType != null){
			putBodyParameter("TestType", testType);
		}
	}

	@Override
	public Class<PostCustomizeRuleTestResponse> getResponseClass() {
		return PostCustomizeRuleTestResponse.class;
	}

}
