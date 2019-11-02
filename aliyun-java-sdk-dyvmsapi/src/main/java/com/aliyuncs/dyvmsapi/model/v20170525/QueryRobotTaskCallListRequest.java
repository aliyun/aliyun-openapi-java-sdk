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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryRobotTaskCallListRequest extends RpcAcsRequest<QueryRobotTaskCallListResponse> {
	   

	private Long resourceOwnerId;

	private String called;

	private String dialogCountTo;

	private String durationFrom;

	private Integer pageSize;

	private String taskId;

	private String resourceOwnerAccount;

	private String dialogCountFrom;

	private String durationTo;

	private String hangupDirection;

	private Long ownerId;

	private Integer pageNo;

	private String callResult;
	public QueryRobotTaskCallListRequest() {
		super("Dyvmsapi", "2017-05-25", "QueryRobotTaskCallList");
		setMethod(MethodType.POST);
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

	public String getCalled() {
		return this.called;
	}

	public void setCalled(String called) {
		this.called = called;
		if(called != null){
			putQueryParameter("Called", called);
		}
	}

	public String getDialogCountTo() {
		return this.dialogCountTo;
	}

	public void setDialogCountTo(String dialogCountTo) {
		this.dialogCountTo = dialogCountTo;
		if(dialogCountTo != null){
			putQueryParameter("DialogCountTo", dialogCountTo);
		}
	}

	public String getDurationFrom() {
		return this.durationFrom;
	}

	public void setDurationFrom(String durationFrom) {
		this.durationFrom = durationFrom;
		if(durationFrom != null){
			putQueryParameter("DurationFrom", durationFrom);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
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

	public String getDialogCountFrom() {
		return this.dialogCountFrom;
	}

	public void setDialogCountFrom(String dialogCountFrom) {
		this.dialogCountFrom = dialogCountFrom;
		if(dialogCountFrom != null){
			putQueryParameter("DialogCountFrom", dialogCountFrom);
		}
	}

	public String getDurationTo() {
		return this.durationTo;
	}

	public void setDurationTo(String durationTo) {
		this.durationTo = durationTo;
		if(durationTo != null){
			putQueryParameter("DurationTo", durationTo);
		}
	}

	public String getHangupDirection() {
		return this.hangupDirection;
	}

	public void setHangupDirection(String hangupDirection) {
		this.hangupDirection = hangupDirection;
		if(hangupDirection != null){
			putQueryParameter("HangupDirection", hangupDirection);
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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getCallResult() {
		return this.callResult;
	}

	public void setCallResult(String callResult) {
		this.callResult = callResult;
		if(callResult != null){
			putQueryParameter("CallResult", callResult);
		}
	}

	@Override
	public Class<QueryRobotTaskCallListResponse> getResponseClass() {
		return QueryRobotTaskCallListResponse.class;
	}

}
