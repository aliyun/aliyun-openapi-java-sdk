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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelsResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelsResponse.Channel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelsResponseUnmarshaller {

	public static DescribeRtcChannelsResponse unmarshall(DescribeRtcChannelsResponse describeRtcChannelsResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelsResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelsResponse.RequestId"));
		describeRtcChannelsResponse.setPageSize(_ctx.longValue("DescribeRtcChannelsResponse.PageSize"));
		describeRtcChannelsResponse.setPageNo(_ctx.longValue("DescribeRtcChannelsResponse.PageNo"));
		describeRtcChannelsResponse.setTotalCnt(_ctx.longValue("DescribeRtcChannelsResponse.TotalCnt"));

		List<Channel> channels = new ArrayList<Channel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelsResponse.Channels.Length"); i++) {
			Channel channel = new Channel();
			channel.setChannelId(_ctx.stringValue("DescribeRtcChannelsResponse.Channels["+ i +"].ChannelId"));
			channel.setStartTime(_ctx.stringValue("DescribeRtcChannelsResponse.Channels["+ i +"].StartTime"));
			channel.setEndTime(_ctx.stringValue("DescribeRtcChannelsResponse.Channels["+ i +"].EndTime"));
			channel.setFinished(_ctx.booleanValue("DescribeRtcChannelsResponse.Channels["+ i +"].Finished"));

			channels.add(channel);
		}
		describeRtcChannelsResponse.setChannels(channels);
	 
	 	return describeRtcChannelsResponse;
	}
}