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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.CreateMergeFaceGroupsJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMergeFaceGroupsJobResponse extends AcsResponse {

	private String groupIdFrom;

	private String jobType;

	private String requestId;

	private String setId;

	private String groupIdTo;

	private String jobId;

	public String getGroupIdFrom() {
		return this.groupIdFrom;
	}

	public void setGroupIdFrom(String groupIdFrom) {
		this.groupIdFrom = groupIdFrom;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getGroupIdTo() {
		return this.groupIdTo;
	}

	public void setGroupIdTo(String groupIdTo) {
		this.groupIdTo = groupIdTo;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public CreateMergeFaceGroupsJobResponse getInstance(UnmarshallerContext context) {
		return	CreateMergeFaceGroupsJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
