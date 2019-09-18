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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcDurationDataResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcDurationDataResponse.DurationModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcDurationDataResponseUnmarshaller {

	public static DescribeRtcDurationDataResponse unmarshall(DescribeRtcDurationDataResponse describeRtcDurationDataResponse, UnmarshallerContext _ctx) {
		
		describeRtcDurationDataResponse.setRequestId(_ctx.stringValue("DescribeRtcDurationDataResponse.RequestId"));

		List<DurationModule> durationDataPerInterval = new ArrayList<DurationModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcDurationDataResponse.DurationDataPerInterval.Length"); i++) {
			DurationModule durationModule = new DurationModule();
			durationModule.setTimeStamp(_ctx.stringValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].TimeStamp"));
			durationModule.setTotalDuration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].TotalDuration"));
			durationModule.setAudioDuration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].AudioDuration"));
			durationModule.setV360Duration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].V360Duration"));
			durationModule.setV720Duration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].V720Duration"));
			durationModule.setV1080Duration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].V1080Duration"));
			durationModule.setContentDuration(_ctx.longValue("DescribeRtcDurationDataResponse.DurationDataPerInterval["+ i +"].ContentDuration"));

			durationDataPerInterval.add(durationModule);
		}
		describeRtcDurationDataResponse.setDurationDataPerInterval(durationDataPerInterval);
	 
	 	return describeRtcDurationDataResponse;
	}
}