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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListInvocationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInvocationStatusResponse extends AcsResponse {

	private String requestId;

	private String commandId;

	private String invokeStatus;

	private List<InvokeInstance> invokeInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getInvokeStatus() {
		return this.invokeStatus;
	}

	public void setInvokeStatus(String invokeStatus) {
		this.invokeStatus = invokeStatus;
	}

	public List<InvokeInstance> getInvokeInstances() {
		return this.invokeInstances;
	}

	public void setInvokeInstances(List<InvokeInstance> invokeInstances) {
		this.invokeInstances = invokeInstances;
	}

	public static class InvokeInstance {

		private String instanceId;

		private String instanceInvokeStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceInvokeStatus() {
			return this.instanceInvokeStatus;
		}

		public void setInstanceInvokeStatus(String instanceInvokeStatus) {
			this.instanceInvokeStatus = instanceInvokeStatus;
		}
	}

	@Override
	public ListInvocationStatusResponse getInstance(UnmarshallerContext context) {
		return	ListInvocationStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
