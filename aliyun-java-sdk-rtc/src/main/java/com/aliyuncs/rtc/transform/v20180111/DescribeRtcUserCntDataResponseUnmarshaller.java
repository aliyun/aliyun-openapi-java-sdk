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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcUserCntDataResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcUserCntDataResponse.UserCntModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcUserCntDataResponseUnmarshaller {

	public static DescribeRtcUserCntDataResponse unmarshall(DescribeRtcUserCntDataResponse describeRtcUserCntDataResponse, UnmarshallerContext context) {
		
		describeRtcUserCntDataResponse.setRequestId(context.stringValue("DescribeRtcUserCntDataResponse.RequestId"));

		List<UserCntModule> userCntDataPerInterval = new ArrayList<UserCntModule>();
		for (int i = 0; i < context.lengthValue("DescribeRtcUserCntDataResponse.UserCntDataPerInterval.Length"); i++) {
			UserCntModule userCntModule = new UserCntModule();
			userCntModule.setTimeStamp(context.stringValue("DescribeRtcUserCntDataResponse.UserCntDataPerInterval["+ i +"].TimeStamp"));
			userCntModule.setActiveUserCnt(context.longValue("DescribeRtcUserCntDataResponse.UserCntDataPerInterval["+ i +"].ActiveUserCnt"));

			userCntDataPerInterval.add(userCntModule);
		}
		describeRtcUserCntDataResponse.setUserCntDataPerInterval(userCntDataPerInterval);
	 
	 	return describeRtcUserCntDataResponse;
	}
}