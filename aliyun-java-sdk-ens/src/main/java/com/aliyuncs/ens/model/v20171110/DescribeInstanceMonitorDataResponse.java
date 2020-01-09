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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceMonitorDataResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<InstanceMonitorData> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<InstanceMonitorData> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<InstanceMonitorData> monitorData) {
		this.monitorData = monitorData;
	}

	public static class InstanceMonitorData {

		private String instanceId;

		private String memory;

		private String cPU;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public String getCPU() {
			return this.cPU;
		}

		public void setCPU(String cPU) {
			this.cPU = cPU;
		}
	}

	@Override
	public DescribeInstanceMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
