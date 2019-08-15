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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeRealtimeDeliveryAccResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeRealtimeDeliveryAccResponse.AccData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealtimeDeliveryAccResponseUnmarshaller {

	public static DescribeRealtimeDeliveryAccResponse unmarshall(DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAccResponse, UnmarshallerContext _ctx) {
		
		describeRealtimeDeliveryAccResponse.setRequestId(_ctx.stringValue("DescribeRealtimeDeliveryAccResponse.RequestId"));

		List<AccData> reatTimeDeliveryAccData = new ArrayList<AccData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRealtimeDeliveryAccResponse.ReatTimeDeliveryAccData.Length"); i++) {
			AccData accData = new AccData();
			accData.setTimeStamp(_ctx.stringValue("DescribeRealtimeDeliveryAccResponse.ReatTimeDeliveryAccData["+ i +"].TimeStamp"));
			accData.setSuccessNum(_ctx.integerValue("DescribeRealtimeDeliveryAccResponse.ReatTimeDeliveryAccData["+ i +"].SuccessNum"));
			accData.setFailedNum(_ctx.integerValue("DescribeRealtimeDeliveryAccResponse.ReatTimeDeliveryAccData["+ i +"].FailedNum"));

			reatTimeDeliveryAccData.add(accData);
		}
		describeRealtimeDeliveryAccResponse.setReatTimeDeliveryAccData(reatTimeDeliveryAccData);
	 
	 	return describeRealtimeDeliveryAccResponse;
	}
}