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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeUserTimeRangeByDayResponse;
import com.aliyuncs.vod.model.v20170321.DescribeUserTimeRangeByDayResponse.UserPlayStatisticsInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserTimeRangeByDayResponseUnmarshaller {

	public static DescribeUserTimeRangeByDayResponse unmarshall(DescribeUserTimeRangeByDayResponse describeUserTimeRangeByDayResponse, UnmarshallerContext context) {
		
		describeUserTimeRangeByDayResponse.setRequestId(context.stringValue("DescribeUserTimeRangeByDayResponse.RequestId"));

		List<UserPlayStatisticsInfo> userPlayStatisticsInfos = new ArrayList<UserPlayStatisticsInfo>();
		for (int i = 0; i < context.lengthValue("DescribeUserTimeRangeByDayResponse.UserPlayStatisticsInfos.Length"); i++) {
			UserPlayStatisticsInfo userPlayStatisticsInfo = new UserPlayStatisticsInfo();
			userPlayStatisticsInfo.setDate(context.stringValue("DescribeUserTimeRangeByDayResponse.UserPlayStatisticsInfos["+ i +"].Date"));
			userPlayStatisticsInfo.setAll(context.stringValue("DescribeUserTimeRangeByDayResponse.UserPlayStatisticsInfos["+ i +"].All"));

			userPlayStatisticsInfos.add(userPlayStatisticsInfo);
		}
		describeUserTimeRangeByDayResponse.setUserPlayStatisticsInfos(userPlayStatisticsInfos);
	 
	 	return describeUserTimeRangeByDayResponse;
	}
}