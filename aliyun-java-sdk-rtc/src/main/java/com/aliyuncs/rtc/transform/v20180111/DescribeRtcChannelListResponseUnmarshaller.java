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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelListResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelListResponse.ChannelListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelListResponseUnmarshaller {

	public static DescribeRtcChannelListResponse unmarshall(DescribeRtcChannelListResponse describeRtcChannelListResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelListResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelListResponse.RequestId"));
		describeRtcChannelListResponse.setPageSize(_ctx.longValue("DescribeRtcChannelListResponse.PageSize"));
		describeRtcChannelListResponse.setPageNo(_ctx.longValue("DescribeRtcChannelListResponse.PageNo"));
		describeRtcChannelListResponse.setTotalCnt(_ctx.longValue("DescribeRtcChannelListResponse.TotalCnt"));

		List<ChannelListItem> channelList = new ArrayList<ChannelListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelListResponse.ChannelList.Length"); i++) {
			ChannelListItem channelListItem = new ChannelListItem();
			channelListItem.setChannelId(_ctx.stringValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].ChannelId"));
			channelListItem.setStartTime(_ctx.stringValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].StartTime"));
			channelListItem.setEndTime(_ctx.stringValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].EndTime"));
			channelListItem.setTotalUserCnt(_ctx.longValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].TotalUserCnt"));

			List<String> callArea = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].CallArea.Length"); j++) {
				callArea.add(_ctx.stringValue("DescribeRtcChannelListResponse.ChannelList["+ i +"].CallArea["+ j +"]"));
			}
			channelListItem.setCallArea(callArea);

			channelList.add(channelListItem);
		}
		describeRtcChannelListResponse.setChannelList(channelList);
	 
	 	return describeRtcChannelListResponse;
	}
}