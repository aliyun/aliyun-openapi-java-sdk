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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsRequest extends RpcAcsRequest<DescribeInvocationsResponse> {
	   

	private Long resourceOwnerId;

	private String invokeStatus;

	private Boolean includeOutput;

	private String commandId;

	private Long pageNumber;

	private String contentEncoding;

	private String repeatMode;

	private Long pageSize;

	private String invokeId;

	private Boolean timed;

	private String commandName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String commandType;

	private String instanceId;
	public DescribeInvocationsRequest() {
		super("Ecs", "2014-05-26", "DescribeInvocations", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getInvokeStatus() {
		return this.invokeStatus;
	}

	public void setInvokeStatus(String invokeStatus) {
		this.invokeStatus = invokeStatus;
		if(invokeStatus != null){
			putQueryParameter("InvokeStatus", invokeStatus);
		}
	}

	public Boolean getIncludeOutput() {
		return this.includeOutput;
	}

	public void setIncludeOutput(Boolean includeOutput) {
		this.includeOutput = includeOutput;
		if(includeOutput != null){
			putQueryParameter("IncludeOutput", includeOutput.toString());
		}
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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getContentEncoding() {
		return this.contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
		if(contentEncoding != null){
			putQueryParameter("ContentEncoding", contentEncoding);
		}
	}

	public String getRepeatMode() {
		return this.repeatMode;
	}

	public void setRepeatMode(String repeatMode) {
		this.repeatMode = repeatMode;
		if(repeatMode != null){
			putQueryParameter("RepeatMode", repeatMode);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Boolean getTimed() {
		return this.timed;
	}

	public void setTimed(Boolean timed) {
		this.timed = timed;
		if(timed != null){
			putQueryParameter("Timed", timed.toString());
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	@Override
	public Class<DescribeInvocationsResponse> getResponseClass() {
		return DescribeInvocationsResponse.class;
	}

}
