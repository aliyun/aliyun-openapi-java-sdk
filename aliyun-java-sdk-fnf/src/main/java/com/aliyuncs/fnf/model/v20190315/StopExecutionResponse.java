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

package com.aliyuncs.fnf.model.v20190315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.fnf.transform.v20190315.StopExecutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopExecutionResponse extends AcsResponse {

	private String status;

	private String stoppedTime;

	private String requestId;

	private String startedTime;

	private String flowDefinition;

	private String externalInputUri;

	private String output;

	private String flowName;

	private String externalOutputUri;

	private String name;

	private String input;

	private String roleArn;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoppedTime() {
		return this.stoppedTime;
	}

	public void setStoppedTime(String stoppedTime) {
		this.stoppedTime = stoppedTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartedTime() {
		return this.startedTime;
	}

	public void setStartedTime(String startedTime) {
		this.startedTime = startedTime;
	}

	public String getFlowDefinition() {
		return this.flowDefinition;
	}

	public void setFlowDefinition(String flowDefinition) {
		this.flowDefinition = flowDefinition;
	}

	public String getExternalInputUri() {
		return this.externalInputUri;
	}

	public void setExternalInputUri(String externalInputUri) {
		this.externalInputUri = externalInputUri;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getExternalOutputUri() {
		return this.externalOutputUri;
	}

	public void setExternalOutputUri(String externalOutputUri) {
		this.externalOutputUri = externalOutputUri;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getRoleArn() {
		return this.roleArn;
	}

	public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
	}

	@Override
	public StopExecutionResponse getInstance(UnmarshallerContext context) {
		return	StopExecutionResponseUnmarshaller.unmarshall(this, context);
	}
}
