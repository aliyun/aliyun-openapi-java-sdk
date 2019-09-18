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

import com.aliyuncs.rtc.model.v20180111.DescribeStatisResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeStatisResponse.StatisInfo;
import com.aliyuncs.rtc.model.v20180111.DescribeStatisResponse.StatisInfo.ChannelStatisItem;
import com.aliyuncs.rtc.model.v20180111.DescribeStatisResponse.StatisInfo.DurationItem;
import com.aliyuncs.rtc.model.v20180111.DescribeStatisResponse.StatisInfo.UserStatisItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatisResponseUnmarshaller {

	public static DescribeStatisResponse unmarshall(DescribeStatisResponse describeStatisResponse, UnmarshallerContext _ctx) {
		
		describeStatisResponse.setRequestId(_ctx.stringValue("DescribeStatisResponse.RequestId"));

		List<StatisInfo> statisInfos = new ArrayList<StatisInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatisResponse.StatisInfos.Length"); i++) {
			StatisInfo statisInfo = new StatisInfo();
			statisInfo.setTime(_ctx.stringValue("DescribeStatisResponse.StatisInfos["+ i +"].Time"));

			List<DurationItem> duration = new ArrayList<DurationItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration.Length"); j++) {
				DurationItem durationItem = new DurationItem();
				durationItem.setTotalDuration(_ctx.floatValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration["+ j +"].TotalDuration"));
				durationItem.setAudioDuration(_ctx.floatValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration["+ j +"].AudioDuration"));
				durationItem.setSdDuration(_ctx.floatValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration["+ j +"].SdDuration"));
				durationItem.setHdDuration(_ctx.floatValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration["+ j +"].HdDuration"));
				durationItem.setFhdDuration(_ctx.floatValue("DescribeStatisResponse.StatisInfos["+ i +"].Duration["+ j +"].FhdDuration"));

				duration.add(durationItem);
			}
			statisInfo.setDuration(duration);

			List<UserStatisItem> userStatis = new ArrayList<UserStatisItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStatisResponse.StatisInfos["+ i +"].UserStatis.Length"); j++) {
				UserStatisItem userStatisItem = new UserStatisItem();
				userStatisItem.setActiveUserCnt(_ctx.longValue("DescribeStatisResponse.StatisInfos["+ i +"].UserStatis["+ j +"].ActiveUserCnt"));
				userStatisItem.setConSessionPeak(_ctx.longValue("DescribeStatisResponse.StatisInfos["+ i +"].UserStatis["+ j +"].ConSessionPeak"));
				userStatisItem.setConSessionPeakTime(_ctx.stringValue("DescribeStatisResponse.StatisInfos["+ i +"].UserStatis["+ j +"].ConSessionPeakTime"));

				userStatis.add(userStatisItem);
			}
			statisInfo.setUserStatis(userStatis);

			List<ChannelStatisItem> channelStatis = new ArrayList<ChannelStatisItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStatisResponse.StatisInfos["+ i +"].ChannelStatis.Length"); j++) {
				ChannelStatisItem channelStatisItem = new ChannelStatisItem();
				channelStatisItem.setAccChannelCnt(_ctx.longValue("DescribeStatisResponse.StatisInfos["+ i +"].ChannelStatis["+ j +"].AccChannelCnt"));
				channelStatisItem.setConChannelPeak(_ctx.longValue("DescribeStatisResponse.StatisInfos["+ i +"].ChannelStatis["+ j +"].ConChannelPeak"));
				channelStatisItem.setConChannelPeakTime(_ctx.stringValue("DescribeStatisResponse.StatisInfos["+ i +"].ChannelStatis["+ j +"].ConChannelPeakTime"));

				channelStatis.add(channelStatisItem);
			}
			statisInfo.setChannelStatis(channelStatis);

			statisInfos.add(statisInfo);
		}
		describeStatisResponse.setStatisInfos(statisInfos);
	 
	 	return describeStatisResponse;
	}
}