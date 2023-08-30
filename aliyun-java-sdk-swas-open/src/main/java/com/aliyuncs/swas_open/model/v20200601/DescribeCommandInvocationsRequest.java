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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommandInvocationsRequest extends RpcAcsRequest<DescribeCommandInvocationsResponse> {
	   

	private String commandId;

	private String pageNumber;

	private String pageSize;

	private String invokeId;

	private String commandName;

	private String commandType;

	private String instanceId;

	private String invocationStatus;
	public DescribeCommandInvocationsRequest() {
		super("SWAS-OPEN", "2020-06-01", "DescribeCommandInvocations", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getInvokeId() {
		return this.invokeId;
	}

	public void setInvokeId(String invokeId) {
		this.invokeId = invokeId;
		if(invokeId != null){
			putQueryParameter("InvokeId", invokeId);
		}
	}

	public String getCommandName() {
		return this.commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
		if(commandName != null){
			putQueryParameter("CommandName", commandName);
		}
	}

	public String getCommandType() {
		return this.commandType;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
		if(commandType != null){
			putQueryParameter("CommandType", commandType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getInvocationStatus() {
		return this.invocationStatus;
	}

	public void setInvocationStatus(String invocationStatus) {
		this.invocationStatus = invocationStatus;
		if(invocationStatus != null){
			putQueryParameter("InvocationStatus", invocationStatus);
		}
	}

	@Override
	public Class<DescribeCommandInvocationsResponse> getResponseClass() {
		return DescribeCommandInvocationsResponse.class;
	}

}
