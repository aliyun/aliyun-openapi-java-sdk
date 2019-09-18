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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelCntDataResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelCntDataResponse.ChannelCntModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelCntDataResponseUnmarshaller {

	public static DescribeRtcChannelCntDataResponse unmarshall(DescribeRtcChannelCntDataResponse describeRtcChannelCntDataResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelCntDataResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelCntDataResponse.RequestId"));

		List<ChannelCntModule> channelCntDataPerInterval = new ArrayList<ChannelCntModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelCntDataResponse.ChannelCntDataPerInterval.Length"); i++) {
			ChannelCntModule channelCntModule = new ChannelCntModule();
			channelCntModule.setTimeStamp(_ctx.stringValue("DescribeRtcChannelCntDataResponse.ChannelCntDataPerInterval["+ i +"].TimeStamp"));
			channelCntModule.setActiveChannelCnt(_ctx.longValue("DescribeRtcChannelCntDataResponse.ChannelCntDataPerInterval["+ i +"].ActiveChannelCnt"));

			channelCntDataPerInterval.add(channelCntModule);
		}
		describeRtcChannelCntDataResponse.setChannelCntDataPerInterval(channelCntDataPerInterval);
	 
	 	return describeRtcChannelCntDataResponse;
	}
}