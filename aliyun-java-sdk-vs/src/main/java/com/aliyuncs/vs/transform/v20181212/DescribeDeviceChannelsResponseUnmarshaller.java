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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeDeviceChannelsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeDeviceChannelsResponse.Channel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceChannelsResponseUnmarshaller {

	public static DescribeDeviceChannelsResponse unmarshall(DescribeDeviceChannelsResponse describeDeviceChannelsResponse, UnmarshallerContext _ctx) {
		
		describeDeviceChannelsResponse.setRequestId(_ctx.stringValue("DescribeDeviceChannelsResponse.RequestId"));
		describeDeviceChannelsResponse.setPageSize(_ctx.longValue("DescribeDeviceChannelsResponse.PageSize"));
		describeDeviceChannelsResponse.setPageNum(_ctx.longValue("DescribeDeviceChannelsResponse.PageNum"));
		describeDeviceChannelsResponse.setPageCount(_ctx.longValue("DescribeDeviceChannelsResponse.PageCount"));
		describeDeviceChannelsResponse.setTotalCount(_ctx.longValue("DescribeDeviceChannelsResponse.TotalCount"));

		List<Channel> channels = new ArrayList<Channel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceChannelsResponse.Channels.Length"); i++) {
			Channel channel = new Channel();
			channel.setName(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].Name"));
			channel.setGbId(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].GbId"));
			channel.setStreamId(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].StreamId"));
			channel.setStreamStatus(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].StreamStatus"));
			channel.setDeviceId(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].DeviceId"));
			channel.setDeviceStatus(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].DeviceStatus"));
			channel.setChannelId(_ctx.longValue("DescribeDeviceChannelsResponse.Channels["+ i +"].ChannelId"));
			channel.setParams(_ctx.stringValue("DescribeDeviceChannelsResponse.Channels["+ i +"].Params"));

			channels.add(channel);
		}
		describeDeviceChannelsResponse.setChannels(channels);
	 
	 	return describeDeviceChannelsResponse;
	}
}