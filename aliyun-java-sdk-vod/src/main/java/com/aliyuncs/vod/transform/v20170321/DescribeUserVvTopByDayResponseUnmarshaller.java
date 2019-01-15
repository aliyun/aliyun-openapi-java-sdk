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

import com.aliyuncs.vod.model.v20170321.DescribeUserVvTopByDayResponse;
import com.aliyuncs.vod.model.v20170321.DescribeUserVvTopByDayResponse.UserPlayStatisticsInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVvTopByDayResponseUnmarshaller {

	public static DescribeUserVvTopByDayResponse unmarshall(DescribeUserVvTopByDayResponse describeUserVvTopByDayResponse, UnmarshallerContext context) {
		
		describeUserVvTopByDayResponse.setRequestId(context.stringValue("DescribeUserVvTopByDayResponse.RequestId"));

		List<UserPlayStatisticsInfo> userPlayStatisticsInfos = new ArrayList<UserPlayStatisticsInfo>();
		for (int i = 0; i < context.lengthValue("DescribeUserVvTopByDayResponse.UserPlayStatisticsInfos.Length"); i++) {
			UserPlayStatisticsInfo userPlayStatisticsInfo = new UserPlayStatisticsInfo();
			userPlayStatisticsInfo.setCount(context.stringValue("DescribeUserVvTopByDayResponse.UserPlayStatisticsInfos["+ i +"].Count"));
			userPlayStatisticsInfo.setVideoid(context.stringValue("DescribeUserVvTopByDayResponse.UserPlayStatisticsInfos["+ i +"].Videoid"));
			userPlayStatisticsInfo.setVideoName(context.stringValue("DescribeUserVvTopByDayResponse.UserPlayStatisticsInfos["+ i +"].VideoName"));

			userPlayStatisticsInfos.add(userPlayStatisticsInfo);
		}
		describeUserVvTopByDayResponse.setUserPlayStatisticsInfos(userPlayStatisticsInfos);
	 
	 	return describeUserVvTopByDayResponse;
	}
}