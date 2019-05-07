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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcPeakUserCntDataResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcPeakUserCntDataResponse.PeakUserCntModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcPeakUserCntDataResponseUnmarshaller {

	public static DescribeRtcPeakUserCntDataResponse unmarshall(DescribeRtcPeakUserCntDataResponse describeRtcPeakUserCntDataResponse, UnmarshallerContext context) {
		
		describeRtcPeakUserCntDataResponse.setRequestId(context.stringValue("DescribeRtcPeakUserCntDataResponse.RequestId"));

		List<PeakUserCntModule> peakUserCntDataPerInterval = new ArrayList<PeakUserCntModule>();
		for (int i = 0; i < context.lengthValue("DescribeRtcPeakUserCntDataResponse.PeakUserCntDataPerInterval.Length"); i++) {
			PeakUserCntModule peakUserCntModule = new PeakUserCntModule();
			peakUserCntModule.setTimeStamp(context.stringValue("DescribeRtcPeakUserCntDataResponse.PeakUserCntDataPerInterval["+ i +"].TimeStamp"));
			peakUserCntModule.setActiveUserPeak(context.longValue("DescribeRtcPeakUserCntDataResponse.PeakUserCntDataPerInterval["+ i +"].ActiveUserPeak"));
			peakUserCntModule.setActiveUserPeakTime(context.stringValue("DescribeRtcPeakUserCntDataResponse.PeakUserCntDataPerInterval["+ i +"].ActiveUserPeakTime"));

			peakUserCntDataPerInterval.add(peakUserCntModule);
		}
		describeRtcPeakUserCntDataResponse.setPeakUserCntDataPerInterval(peakUserCntDataPerInterval);
	 
	 	return describeRtcPeakUserCntDataResponse;
	}
}