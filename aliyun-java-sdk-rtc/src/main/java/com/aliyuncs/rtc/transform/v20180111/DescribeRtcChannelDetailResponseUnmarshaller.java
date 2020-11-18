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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelDetailResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelDetailResponse.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelDetailResponseUnmarshaller {

	public static DescribeRtcChannelDetailResponse unmarshall(DescribeRtcChannelDetailResponse describeRtcChannelDetailResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelDetailResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelDetailResponse.RequestId"));
		describeRtcChannelDetailResponse.setChannelId(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelId"));
		describeRtcChannelDetailResponse.setPageSize(_ctx.longValue("DescribeRtcChannelDetailResponse.PageSize"));
		describeRtcChannelDetailResponse.setPageNo(_ctx.longValue("DescribeRtcChannelDetailResponse.PageNo"));
		describeRtcChannelDetailResponse.setTotalCnt(_ctx.longValue("DescribeRtcChannelDetailResponse.TotalCnt"));

		List<Detail> channelInfo = new ArrayList<Detail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelDetailResponse.ChannelInfo.Length"); i++) {
			Detail detail = new Detail();
			detail.setSid(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].Sid"));
			detail.setUid(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].Uid"));
			detail.setJoinTime(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].JoinTime"));
			detail.setLeaveTime(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].LeaveTime"));
			detail.setSdkVersion(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].SdkVersion"));
			detail.setPlatform(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].Platform"));
			detail.setOS(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].OS"));
			detail.setDeviceType(_ctx.stringValue("DescribeRtcChannelDetailResponse.ChannelInfo["+ i +"].DeviceType"));

			channelInfo.add(detail);
		}
		describeRtcChannelDetailResponse.setChannelInfo(channelInfo);
	 
	 	return describeRtcChannelDetailResponse;
	}
}