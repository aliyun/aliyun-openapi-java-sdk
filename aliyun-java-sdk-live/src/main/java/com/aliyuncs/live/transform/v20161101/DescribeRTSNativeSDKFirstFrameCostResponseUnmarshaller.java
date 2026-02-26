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

import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKFirstFrameCostResponse;
import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKFirstFrameCostResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRTSNativeSDKFirstFrameCostResponseUnmarshaller {

	public static DescribeRTSNativeSDKFirstFrameCostResponse unmarshall(DescribeRTSNativeSDKFirstFrameCostResponse describeRTSNativeSDKFirstFrameCostResponse, UnmarshallerContext _ctx) {
		
		describeRTSNativeSDKFirstFrameCostResponse.setRequestId(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.RequestId"));
		describeRTSNativeSDKFirstFrameCostResponse.setDataInterval(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.DataInterval"));
		describeRTSNativeSDKFirstFrameCostResponse.setEndTime(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.EndTime"));
		describeRTSNativeSDKFirstFrameCostResponse.setStartTime(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.StartTime"));

		List<Data> firstFrameCostData = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData.Length"); i++) {
			Data data = new Data();
			data.setConnected(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].Connected"));
			data.setFinishGetStreamInfo(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].FinishGetStreamInfo"));
			data.setFirstFrameComplete(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].FirstFrameComplete"));
			data.setFirstPacket(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].FirstPacket"));
			data.setInitialized(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].Initialized"));
			data.setTimeStamp(_ctx.stringValue("DescribeRTSNativeSDKFirstFrameCostResponse.FirstFrameCostData["+ i +"].TimeStamp"));

			firstFrameCostData.add(data);
		}
		describeRTSNativeSDKFirstFrameCostResponse.setFirstFrameCostData(firstFrameCostData);
	 
	 	return describeRTSNativeSDKFirstFrameCostResponse;
	}
}