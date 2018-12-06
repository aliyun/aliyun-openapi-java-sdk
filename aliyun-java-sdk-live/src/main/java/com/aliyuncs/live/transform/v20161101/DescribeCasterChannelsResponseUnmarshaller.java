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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterChannelsResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterChannelsResponse.Channel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterChannelsResponseUnmarshaller {

	public static DescribeCasterChannelsResponse unmarshall(DescribeCasterChannelsResponse describeCasterChannelsResponse, UnmarshallerContext context) {
		
		describeCasterChannelsResponse.setRequestId(context.stringValue("DescribeCasterChannelsResponse.RequestId"));
		describeCasterChannelsResponse.setTotal(context.integerValue("DescribeCasterChannelsResponse.Total"));

		List<Channel> channels = new ArrayList<Channel>();
		for (int i = 0; i < context.lengthValue("DescribeCasterChannelsResponse.Channels.Length"); i++) {
			Channel channel = new Channel();
			channel.setChannelId(context.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].ChannelId"));
			channel.setResourceId(context.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].ResourceId"));
			channel.setStreamUrl(context.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].StreamUrl"));
			channel.setRtmpUrl(context.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].RtmpUrl"));

			channels.add(channel);
		}
		describeCasterChannelsResponse.setChannels(channels);
	 
	 	return describeCasterChannelsResponse;
	}
}