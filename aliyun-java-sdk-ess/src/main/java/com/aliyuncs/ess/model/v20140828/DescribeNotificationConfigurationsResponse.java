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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeNotificationConfigurationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNotificationConfigurationsResponse extends AcsResponse {

	private String requestId;

	private List<NotificationConfigurationModel> notificationConfigurationModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NotificationConfigurationModel> getNotificationConfigurationModels() {
		return this.notificationConfigurationModels;
	}

	public void setNotificationConfigurationModels(List<NotificationConfigurationModel> notificationConfigurationModels) {
		this.notificationConfigurationModels = notificationConfigurationModels;
	}

	public static class NotificationConfigurationModel {

		private String scalingGroupId;

		private String notificationArn;

		private List<String> notificationTypes;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getNotificationArn() {
			return this.notificationArn;
		}

		public void setNotificationArn(String notificationArn) {
			this.notificationArn = notificationArn;
		}

		public List<String> getNotificationTypes() {
			return this.notificationTypes;
		}

		public void setNotificationTypes(List<String> notificationTypes) {
			this.notificationTypes = notificationTypes;
		}
	}

	@Override
	public DescribeNotificationConfigurationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNotificationConfigurationsResponseUnmarshaller.unmarshall(this, context);
	}
}
