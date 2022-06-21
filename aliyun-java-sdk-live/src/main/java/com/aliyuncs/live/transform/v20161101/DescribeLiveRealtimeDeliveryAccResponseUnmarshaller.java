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

import com.aliyuncs.live.model.v20161101.DescribeLiveRealtimeDeliveryAccResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRealtimeDeliveryAccResponse.AccData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRealtimeDeliveryAccResponseUnmarshaller {

	public static DescribeLiveRealtimeDeliveryAccResponse unmarshall(DescribeLiveRealtimeDeliveryAccResponse describeLiveRealtimeDeliveryAccResponse, UnmarshallerContext _ctx) {
		
		describeLiveRealtimeDeliveryAccResponse.setRequestId(_ctx.stringValue("DescribeLiveRealtimeDeliveryAccResponse.RequestId"));

		List<AccData> realTimeDeliveryAccData = new ArrayList<AccData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveRealtimeDeliveryAccResponse.RealTimeDeliveryAccData.Length"); i++) {
			AccData accData = new AccData();
			accData.setTimeStamp(_ctx.stringValue("DescribeLiveRealtimeDeliveryAccResponse.RealTimeDeliveryAccData["+ i +"].TimeStamp"));
			accData.setSuccessNum(_ctx.integerValue("DescribeLiveRealtimeDeliveryAccResponse.RealTimeDeliveryAccData["+ i +"].SuccessNum"));
			accData.setFailedNum(_ctx.integerValue("DescribeLiveRealtimeDeliveryAccResponse.RealTimeDeliveryAccData["+ i +"].FailedNum"));

			realTimeDeliveryAccData.add(accData);
		}
		describeLiveRealtimeDeliveryAccResponse.setRealTimeDeliveryAccData(realTimeDeliveryAccData);
	 
	 	return describeLiveRealtimeDeliveryAccResponse;
	}
}