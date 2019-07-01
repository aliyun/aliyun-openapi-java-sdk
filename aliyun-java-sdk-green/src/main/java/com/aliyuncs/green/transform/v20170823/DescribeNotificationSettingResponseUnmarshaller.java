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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeNotificationSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNotificationSettingResponseUnmarshaller {

	public static DescribeNotificationSettingResponse unmarshall(DescribeNotificationSettingResponse describeNotificationSettingResponse, UnmarshallerContext context) {
		
		describeNotificationSettingResponse.setRequestId(context.stringValue("DescribeNotificationSettingResponse.RequestId"));
		describeNotificationSettingResponse.setEmail(context.stringValue("DescribeNotificationSettingResponse.Email"));
		describeNotificationSettingResponse.setPhone(context.stringValue("DescribeNotificationSettingResponse.Phone"));
		describeNotificationSettingResponse.setScheduleMessageTime(context.integerValue("DescribeNotificationSettingResponse.ScheduleMessageTime"));
		describeNotificationSettingResponse.setScheduleMessageTimeZone(context.integerValue("DescribeNotificationSettingResponse.ScheduleMessageTimeZone"));

		List<String> realtimeMessageList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeNotificationSettingResponse.RealtimeMessageList.Length"); i++) {
			realtimeMessageList.add(context.stringValue("DescribeNotificationSettingResponse.RealtimeMessageList["+ i +"]"));
		}
		describeNotificationSettingResponse.setRealtimeMessageList(realtimeMessageList);

		List<String> reminderModeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeNotificationSettingResponse.ReminderModeList.Length"); i++) {
			reminderModeList.add(context.stringValue("DescribeNotificationSettingResponse.ReminderModeList["+ i +"]"));
		}
		describeNotificationSettingResponse.setReminderModeList(reminderModeList);
	 
	 	return describeNotificationSettingResponse;
	}
}