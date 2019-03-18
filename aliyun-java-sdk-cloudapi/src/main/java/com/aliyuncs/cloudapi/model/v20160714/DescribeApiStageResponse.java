/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiStageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiStageResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private String stageId;

	private String stageName;

	private String description;

	private String createdTime;

	private String modifiedTime;

	private List<VariableItem> variables;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public List<VariableItem> getVariables() {
		return this.variables;
	}

	public void setVariables(List<VariableItem> variables) {
		this.variables = variables;
	}

	public static class VariableItem {

		private String variableName;

		private String variableValue;

		public String getVariableName() {
			return this.variableName;
		}

		public void setVariableName(String variableName) {
			this.variableName = variableName;
		}

		public String getVariableValue() {
			return this.variableValue;
		}

		public void setVariableValue(String variableValue) {
			this.variableValue = variableValue;
		}
	}


	@Override
	public DescribeApiStageResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiStageResponseUnmarshaller.unmarshall(this, context);
	}
}
