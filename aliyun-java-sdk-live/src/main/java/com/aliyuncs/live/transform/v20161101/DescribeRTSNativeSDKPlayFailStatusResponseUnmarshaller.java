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

import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKPlayFailStatusResponse;
import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKPlayFailStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRTSNativeSDKPlayFailStatusResponseUnmarshaller {

	public static DescribeRTSNativeSDKPlayFailStatusResponse unmarshall(DescribeRTSNativeSDKPlayFailStatusResponse describeRTSNativeSDKPlayFailStatusResponse, UnmarshallerContext _ctx) {
		
		describeRTSNativeSDKPlayFailStatusResponse.setRequestId(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.RequestId"));
		describeRTSNativeSDKPlayFailStatusResponse.setDataInterval(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.DataInterval"));
		describeRTSNativeSDKPlayFailStatusResponse.setStartTime(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.StartTime"));
		describeRTSNativeSDKPlayFailStatusResponse.setEndTime(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.EndTime"));

		List<Data> playFailStatus = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus.Length"); i++) {
			Data data = new Data();
			data.setTimeStamp(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].TimeStamp"));
			data.setV20001(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20001"));
			data.setV20002(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20002"));
			data.setV20011(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20011"));
			data.setV20012(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20012"));
			data.setV20013(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20013"));
			data.setV20052(_ctx.stringValue("DescribeRTSNativeSDKPlayFailStatusResponse.PlayFailStatus["+ i +"].V20052"));

			playFailStatus.add(data);
		}
		describeRTSNativeSDKPlayFailStatusResponse.setPlayFailStatus(playFailStatus);
	 
	 	return describeRTSNativeSDKPlayFailStatusResponse;
	}
}