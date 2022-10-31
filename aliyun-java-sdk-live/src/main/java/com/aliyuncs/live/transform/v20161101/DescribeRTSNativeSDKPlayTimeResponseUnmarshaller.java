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

import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKPlayTimeResponse;
import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKPlayTimeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRTSNativeSDKPlayTimeResponseUnmarshaller {

	public static DescribeRTSNativeSDKPlayTimeResponse unmarshall(DescribeRTSNativeSDKPlayTimeResponse describeRTSNativeSDKPlayTimeResponse, UnmarshallerContext _ctx) {
		
		describeRTSNativeSDKPlayTimeResponse.setRequestId(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.RequestId"));
		describeRTSNativeSDKPlayTimeResponse.setDataInterval(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.DataInterval"));
		describeRTSNativeSDKPlayTimeResponse.setStartTime(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.StartTime"));
		describeRTSNativeSDKPlayTimeResponse.setEndTime(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.EndTime"));

		List<Data> playTimeData = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRTSNativeSDKPlayTimeResponse.PlayTimeData.Length"); i++) {
			Data data = new Data();
			data.setTimeStamp(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.PlayTimeData["+ i +"].TimeStamp"));
			data.setPlayTime(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.PlayTimeData["+ i +"].PlayTime"));
			data.setStallTime(_ctx.stringValue("DescribeRTSNativeSDKPlayTimeResponse.PlayTimeData["+ i +"].StallTime"));

			playTimeData.add(data);
		}
		describeRTSNativeSDKPlayTimeResponse.setPlayTimeData(playTimeData);
	 
	 	return describeRTSNativeSDKPlayTimeResponse;
	}
}