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

import com.aliyuncs.vod.model.v20170321.DescribeUserVvByDayResponse;
import com.aliyuncs.vod.model.v20170321.DescribeUserVvByDayResponse.UserPlayStatisticsInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVvByDayResponseUnmarshaller {

	public static DescribeUserVvByDayResponse unmarshall(DescribeUserVvByDayResponse describeUserVvByDayResponse, UnmarshallerContext context) {
		
		describeUserVvByDayResponse.setRequestId(context.stringValue("DescribeUserVvByDayResponse.RequestId"));

		List<UserPlayStatisticsInfo> userPlayStatisticsInfos = new ArrayList<UserPlayStatisticsInfo>();
		for (int i = 0; i < context.lengthValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos.Length"); i++) {
			UserPlayStatisticsInfo userPlayStatisticsInfo = new UserPlayStatisticsInfo();
			userPlayStatisticsInfo.setDate(context.stringValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos["+ i +"].Date"));
			userPlayStatisticsInfo.setAndroid(context.stringValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos["+ i +"].Android"));
			userPlayStatisticsInfo.setIos(context.stringValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos["+ i +"].Ios"));
			userPlayStatisticsInfo.setH5(context.stringValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos["+ i +"].H5"));
			userPlayStatisticsInfo.setFlash(context.stringValue("DescribeUserVvByDayResponse.UserPlayStatisticsInfos["+ i +"].Flash"));

			userPlayStatisticsInfos.add(userPlayStatisticsInfo);
		}
		describeUserVvByDayResponse.setUserPlayStatisticsInfos(userPlayStatisticsInfos);
	 
	 	return describeUserVvByDayResponse;
	}
}