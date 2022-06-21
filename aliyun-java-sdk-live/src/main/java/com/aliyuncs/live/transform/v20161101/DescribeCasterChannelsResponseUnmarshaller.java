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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterChannelsResponseUnmarshaller {

	public static DescribeCasterChannelsResponse unmarshall(DescribeCasterChannelsResponse describeCasterChannelsResponse, UnmarshallerContext _ctx) {
		
		describeCasterChannelsResponse.setRequestId(_ctx.stringValue("DescribeCasterChannelsResponse.RequestId"));
		describeCasterChannelsResponse.setTotal(_ctx.integerValue("DescribeCasterChannelsResponse.Total"));

		List<Channel> channels = new ArrayList<Channel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterChannelsResponse.Channels.Length"); i++) {
			Channel channel = new Channel();
			channel.setChannelId(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].ChannelId"));
			channel.setResourceId(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].ResourceId"));
			channel.setStreamUrl(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].StreamUrl"));
			channel.setRtmpUrl(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].RtmpUrl"));
			channel.setRtsUrl(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].RtsUrl"));
			channel.setInputType(_ctx.integerValue("DescribeCasterChannelsResponse.Channels["+ i +"].InputType"));
			channel.setFaceBeauty(_ctx.stringValue("DescribeCasterChannelsResponse.Channels["+ i +"].FaceBeauty"));

			channels.add(channel);
		}
		describeCasterChannelsResponse.setChannels(channels);
	 
	 	return describeCasterChannelsResponse;
	}
}