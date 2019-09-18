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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcPeakChannelCntDataResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcPeakChannelCntDataResponse.PeakChannelCntModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcPeakChannelCntDataResponseUnmarshaller {

	public static DescribeRtcPeakChannelCntDataResponse unmarshall(DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntDataResponse, UnmarshallerContext _ctx) {
		
		describeRtcPeakChannelCntDataResponse.setRequestId(_ctx.stringValue("DescribeRtcPeakChannelCntDataResponse.RequestId"));

		List<PeakChannelCntModule> peakChannelCntDataPerInterval = new ArrayList<PeakChannelCntModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcPeakChannelCntDataResponse.PeakChannelCntDataPerInterval.Length"); i++) {
			PeakChannelCntModule peakChannelCntModule = new PeakChannelCntModule();
			peakChannelCntModule.setTimeStamp(_ctx.stringValue("DescribeRtcPeakChannelCntDataResponse.PeakChannelCntDataPerInterval["+ i +"].TimeStamp"));
			peakChannelCntModule.setActiveChannelPeak(_ctx.longValue("DescribeRtcPeakChannelCntDataResponse.PeakChannelCntDataPerInterval["+ i +"].ActiveChannelPeak"));
			peakChannelCntModule.setActiveChannelPeakTime(_ctx.stringValue("DescribeRtcPeakChannelCntDataResponse.PeakChannelCntDataPerInterval["+ i +"].ActiveChannelPeakTime"));

			peakChannelCntDataPerInterval.add(peakChannelCntModule);
		}
		describeRtcPeakChannelCntDataResponse.setPeakChannelCntDataPerInterval(peakChannelCntDataPerInterval);
	 
	 	return describeRtcPeakChannelCntDataResponse;
	}
}