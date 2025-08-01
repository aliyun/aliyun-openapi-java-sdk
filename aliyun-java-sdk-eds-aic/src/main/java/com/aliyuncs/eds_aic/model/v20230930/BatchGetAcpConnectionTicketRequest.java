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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchGetAcpConnectionTicketRequest extends RpcAcsRequest<BatchGetAcpConnectionTicketResponse> {
	   

	private List<InstanceTasks> instanceTaskss;

	private String instanceGroupId;

	private List<String> instanceIdss;

	private String endUserId;
	public BatchGetAcpConnectionTicketRequest() {
		super("eds-aic", "2023-09-30", "BatchGetAcpConnectionTicket");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<InstanceTasks> getInstanceTaskss() {
		return this.instanceTaskss;
	}

	public void setInstanceTaskss(List<InstanceTasks> instanceTaskss) {
		this.instanceTaskss = instanceTaskss;	
		if (instanceTaskss != null) {
			for (int depth1 = 0; depth1 < instanceTaskss.size(); depth1++) {
				putQueryParameter("InstanceTasks." + (depth1 + 1) + ".InstanceId" , instanceTaskss.get(depth1).getInstanceId());
				putQueryParameter("InstanceTasks." + (depth1 + 1) + ".TaskId" , instanceTaskss.get(depth1).getTaskId());
			}
		}	
	}

	public String getInstanceGroupId() {
		return this.instanceGroupId;
	}

	public void setInstanceGroupId(String instanceGroupId) {
		this.instanceGroupId = instanceGroupId;
		if(instanceGroupId != null){
			putQueryParameter("InstanceGroupId", instanceGroupId);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public static class InstanceTasks {

		private String instanceId;

		private String taskId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public Class<BatchGetAcpConnectionTicketResponse> getResponseClass() {
		return BatchGetAcpConnectionTicketResponse.class;
	}

}
