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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.GetConnectionTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConnectionTicketResponse extends AcsResponse {

	private String requestId;

	private String taskStatus;

	private String taskId;

	private String bizRegionId;

	private String ticket;

	private String appInstanceGroupId;

	private String appInstanceId;

	private String osType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	@Override
	public GetConnectionTicketResponse getInstance(UnmarshallerContext context) {
		return	GetConnectionTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
