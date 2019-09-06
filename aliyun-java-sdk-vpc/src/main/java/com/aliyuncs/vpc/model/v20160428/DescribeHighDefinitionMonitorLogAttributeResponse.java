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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeHighDefinitionMonitorLogAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHighDefinitionMonitorLogAttributeResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String instanceId;

	private String instanceType;

	private String logProject;

	private String logStore;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getLogProject() {
		return this.logProject;
	}

	public void setLogProject(String logProject) {
		this.logProject = logProject;
	}

	public String getLogStore() {
		return this.logStore;
	}

	public void setLogStore(String logStore) {
		this.logStore = logStore;
	}

	@Override
	public DescribeHighDefinitionMonitorLogAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeHighDefinitionMonitorLogAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
