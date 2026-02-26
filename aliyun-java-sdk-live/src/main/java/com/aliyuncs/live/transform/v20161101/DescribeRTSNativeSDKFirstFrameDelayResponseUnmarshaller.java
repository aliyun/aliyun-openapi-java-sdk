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

import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKFirstFrameDelayResponse;
import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKFirstFrameDelayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRTSNativeSDKFirstFrameDelayResponseUnmarshaller {

	public static DescribeRTSNativeSDKFirstFrameDelayResponse unmarshall(DescribeRTSNativeSDKFirstFrameDelayResponse describeRTSNativeSDKFirstFrameDelayResponse, UnmarshallerContext _ctx) {
		
		describeRTSNativeSDKFirstFrameDelayResponse.setRequestId(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.RequestId"));
		describeRTSNativeSDKFirstFrameDelayResponse.setDataInterval(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.DataInterval"));
		describeRTSNativeSDKFirstFrameDelayResponse.setEndTime(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.EndTime"));
		describeRTSNativeSDKFirstFrameDelayResponse.setStartTime(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.StartTime"));

		List<Data> frameDelayData = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRTSNativeSDKFirstFrameDelayResponse.FrameDelayData.Length"); i++) {
			Data data = new Data();
			data.setFrameDelay(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.FrameDelayData["+ i +"].FrameDelay"));
			data.setTimeStamp(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameDelayResponse.FrameDelayData["+ i +"].TimeStamp"));

			frameDelayData.add(data);
		}
		describeRTSNativeSDKFirstFrameDelayResponse.setFrameDelayData(frameDelayData);
	 
	 	return describeRTSNativeSDKFirstFrameDelayResponse;
	}
}