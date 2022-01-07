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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateContactGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateContactGroupResponse extends AcsResponse {

	private String requestId;

	private AlertContactGroup alertContactGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlertContactGroup getAlertContactGroup() {
		return this.alertContactGroup;
	}

	public void setAlertContactGroup(AlertContactGroup alertContactGroup) {
		this.alertContactGroup = alertContactGroup;
	}

	public static class AlertContactGroup {

		private Float contactGroupId;

		private String contactGroupName;

		private String contactIds;

		public Float getContactGroupId() {
			return this.contactGroupId;
		}

		public void setContactGroupId(Float contactGroupId) {
			this.contactGroupId = contactGroupId;
		}

		public String getContactGroupName() {
			return this.contactGroupName;
		}

		public void setContactGroupName(String contactGroupName) {
			this.contactGroupName = contactGroupName;
		}

		public String getContactIds() {
			return this.contactIds;
		}

		public void setContactIds(String contactIds) {
			this.contactIds = contactIds;
		}
	}

	@Override
	public CreateOrUpdateContactGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateContactGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
