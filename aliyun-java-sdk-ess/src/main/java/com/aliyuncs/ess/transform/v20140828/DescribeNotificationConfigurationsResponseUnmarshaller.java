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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeNotificationConfigurationsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeNotificationConfigurationsResponse.NotificationConfigurationModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNotificationConfigurationsResponseUnmarshaller {

	public static DescribeNotificationConfigurationsResponse unmarshall(DescribeNotificationConfigurationsResponse describeNotificationConfigurationsResponse, UnmarshallerContext _ctx) {
		
		describeNotificationConfigurationsResponse.setRequestId(_ctx.stringValue("DescribeNotificationConfigurationsResponse.RequestId"));

		List<NotificationConfigurationModel> notificationConfigurationModels = new ArrayList<NotificationConfigurationModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNotificationConfigurationsResponse.NotificationConfigurationModels.Length"); i++) {
			NotificationConfigurationModel notificationConfigurationModel = new NotificationConfigurationModel();
			notificationConfigurationModel.setScalingGroupId(_ctx.stringValue("DescribeNotificationConfigurationsResponse.NotificationConfigurationModels["+ i +"].ScalingGroupId"));
			notificationConfigurationModel.setNotificationArn(_ctx.stringValue("DescribeNotificationConfigurationsResponse.NotificationConfigurationModels["+ i +"].NotificationArn"));

			List<String> notificationTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNotificationConfigurationsResponse.NotificationConfigurationModels["+ i +"].NotificationTypes.Length"); j++) {
				notificationTypes.add(_ctx.stringValue("DescribeNotificationConfigurationsResponse.NotificationConfigurationModels["+ i +"].NotificationTypes["+ j +"]"));
			}
			notificationConfigurationModel.setNotificationTypes(notificationTypes);

			notificationConfigurationModels.add(notificationConfigurationModel);
		}
		describeNotificationConfigurationsResponse.setNotificationConfigurationModels(notificationConfigurationModels);
	 
	 	return describeNotificationConfigurationsResponse;
	}
}