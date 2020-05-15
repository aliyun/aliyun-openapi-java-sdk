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

import com.aliyuncs.ess.model.v20140828.DescribeNotificationTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNotificationTypesResponseUnmarshaller {

	public static DescribeNotificationTypesResponse unmarshall(DescribeNotificationTypesResponse describeNotificationTypesResponse, UnmarshallerContext _ctx) {
		
		describeNotificationTypesResponse.setRequestId(_ctx.stringValue("DescribeNotificationTypesResponse.RequestId"));

		List<String> notificationTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNotificationTypesResponse.NotificationTypes.Length"); i++) {
			notificationTypes.add(_ctx.stringValue("DescribeNotificationTypesResponse.NotificationTypes["+ i +"]"));
		}
		describeNotificationTypesResponse.setNotificationTypes(notificationTypes);
	 
	 	return describeNotificationTypesResponse;
	}
}