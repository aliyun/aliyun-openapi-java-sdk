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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.CreateLiveMessageGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveMessageGroupResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private Boolean alreadyExists;

	private Boolean alreadyDelete;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Boolean getAlreadyExists() {
		return this.alreadyExists;
	}

	public void setAlreadyExists(Boolean alreadyExists) {
		this.alreadyExists = alreadyExists;
	}

	public Boolean getAlreadyDelete() {
		return this.alreadyDelete;
	}

	public void setAlreadyDelete(Boolean alreadyDelete) {
		this.alreadyDelete = alreadyDelete;
	}

	@Override
	public CreateLiveMessageGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateLiveMessageGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
