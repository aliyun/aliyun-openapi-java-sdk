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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.SetMemberDeletionPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetMemberDeletionPermissionResponse extends AcsResponse {

	private String requestId;

	private String memberDeletionStatus;

	private String managementAccountId;

	private String resourceDirectoryId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMemberDeletionStatus() {
		return this.memberDeletionStatus;
	}

	public void setMemberDeletionStatus(String memberDeletionStatus) {
		this.memberDeletionStatus = memberDeletionStatus;
	}

	public String getManagementAccountId() {
		return this.managementAccountId;
	}

	public void setManagementAccountId(String managementAccountId) {
		this.managementAccountId = managementAccountId;
	}

	public String getResourceDirectoryId() {
		return this.resourceDirectoryId;
	}

	public void setResourceDirectoryId(String resourceDirectoryId) {
		this.resourceDirectoryId = resourceDirectoryId;
	}

	@Override
	public SetMemberDeletionPermissionResponse getInstance(UnmarshallerContext context) {
		return	SetMemberDeletionPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
