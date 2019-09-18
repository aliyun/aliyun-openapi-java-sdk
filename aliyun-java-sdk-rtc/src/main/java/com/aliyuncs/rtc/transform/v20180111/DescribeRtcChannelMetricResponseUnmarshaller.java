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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse.ChannelMetricInfo;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelMetricResponseUnmarshaller {

	public static DescribeRtcChannelMetricResponse unmarshall(DescribeRtcChannelMetricResponse describeRtcChannelMetricResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelMetricResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelMetricResponse.RequestId"));

		ChannelMetricInfo channelMetricInfo = new ChannelMetricInfo();

		ChannelMetric channelMetric = new ChannelMetric();
		channelMetric.setChannelId(_ctx.stringValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.ChannelId"));
		channelMetric.setUserCount(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.UserCount"));
		channelMetric.setPubUserCount(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.PubUserCount"));
		channelMetric.setSubUserCount(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.SubUserCount"));
		channelMetric.setStartTime(_ctx.stringValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.StartTime"));
		channelMetric.setEndTime(_ctx.stringValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.ChannelMetric.EndTime"));
		channelMetricInfo.setChannelMetric(channelMetric);

		Duration duration = new Duration();

		PubDuration pubDuration = new PubDuration();
		pubDuration.setAudio(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration.Audio"));
		pubDuration.setVideo360(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration.Video360"));
		pubDuration.setVideo720(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration.Video720"));
		pubDuration.setVideo1080(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration.Video1080"));
		pubDuration.setContent(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.PubDuration.Content"));
		duration.setPubDuration(pubDuration);

		SubDuration subDuration = new SubDuration();
		subDuration.setAudio(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration.Audio"));
		subDuration.setVideo360(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration.Video360"));
		subDuration.setVideo720(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration.Video720"));
		subDuration.setVideo1080(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration.Video1080"));
		subDuration.setContent(_ctx.integerValue("DescribeRtcChannelMetricResponse.ChannelMetricInfo.Duration.SubDuration.Content"));
		duration.setSubDuration(subDuration);
		channelMetricInfo.setDuration(duration);
		describeRtcChannelMetricResponse.setChannelMetricInfo(channelMetricInfo);
	 
	 	return describeRtcChannelMetricResponse;
	}
}