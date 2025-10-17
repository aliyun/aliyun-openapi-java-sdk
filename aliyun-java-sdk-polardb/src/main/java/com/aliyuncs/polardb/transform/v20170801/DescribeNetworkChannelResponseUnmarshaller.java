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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeNetworkChannelResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeNetworkChannelResponse.ChannelInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkChannelResponseUnmarshaller {

	public static DescribeNetworkChannelResponse unmarshall(DescribeNetworkChannelResponse describeNetworkChannelResponse, UnmarshallerContext _ctx) {
		
		describeNetworkChannelResponse.setRequestId(_ctx.stringValue("DescribeNetworkChannelResponse.RequestId"));

		List<ChannelInfosItem> channelInfos = new ArrayList<ChannelInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkChannelResponse.ChannelInfos.Length"); i++) {
			ChannelInfosItem channelInfosItem = new ChannelInfosItem();
			channelInfosItem.setChannelName(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].ChannelName"));
			channelInfosItem.setDBClusterId(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].DBClusterId"));
			channelInfosItem.setNotes(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].Notes"));
			channelInfosItem.setRegionId(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].RegionId"));
			channelInfosItem.setTargetDBClusterId(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].TargetDBClusterId"));
			channelInfosItem.setTargetIp(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].TargetIp"));
			channelInfosItem.setTargetPort(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].TargetPort"));
			channelInfosItem.setTargetType(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].TargetType"));
			channelInfosItem.setVpcId(_ctx.stringValue("DescribeNetworkChannelResponse.ChannelInfos["+ i +"].VpcId"));

			channelInfos.add(channelInfosItem);
		}
		describeNetworkChannelResponse.setChannelInfos(channelInfos);
	 
	 	return describeNetworkChannelResponse;
	}
}