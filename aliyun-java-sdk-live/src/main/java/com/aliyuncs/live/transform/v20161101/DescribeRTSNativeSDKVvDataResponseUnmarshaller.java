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

import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKVvDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeRTSNativeSDKVvDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRTSNativeSDKVvDataResponseUnmarshaller {

	public static DescribeRTSNativeSDKVvDataResponse unmarshall(DescribeRTSNativeSDKVvDataResponse describeRTSNativeSDKVvDataResponse, UnmarshallerContext _ctx) {
		
		describeRTSNativeSDKVvDataResponse.setRequestId(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.RequestId"));
		describeRTSNativeSDKVvDataResponse.setDataInterval(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.DataInterval"));
		describeRTSNativeSDKVvDataResponse.setEndTime(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.EndTime"));
		describeRTSNativeSDKVvDataResponse.setStartTime(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.StartTime"));

		List<Data> vvData = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRTSNativeSDKVvDataResponse.VvData.Length"); i++) {
			Data data = new Data();
			data.setTimeStamp(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.VvData["+ i +"].TimeStamp"));
			data.setVvSuccess(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.VvData["+ i +"].VvSuccess"));
			data.setVvTotal(_ctx.stringValue("DescribeRTSNativeSDKVvDataResponse.VvData["+ i +"].VvTotal"));

			vvData.add(data);
		}
		describeRTSNativeSDKVvDataResponse.setVvData(vvData);
	 
	 	return describeRTSNativeSDKVvDataResponse;
	}
}