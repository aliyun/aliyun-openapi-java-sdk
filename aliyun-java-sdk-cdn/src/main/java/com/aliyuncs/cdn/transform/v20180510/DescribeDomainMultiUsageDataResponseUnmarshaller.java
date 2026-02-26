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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainMultiUsageDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainMultiUsageDataResponse.RequestDataModule;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainMultiUsageDataResponse.TrafficDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainMultiUsageDataResponseUnmarshaller {

	public static DescribeDomainMultiUsageDataResponse unmarshall(DescribeDomainMultiUsageDataResponse describeDomainMultiUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainMultiUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.RequestId"));
		describeDomainMultiUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.EndTime"));
		describeDomainMultiUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.StartTime"));

		List<RequestDataModule> requestPerInterval = new ArrayList<RequestDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainMultiUsageDataResponse.RequestPerInterval.Length"); i++) {
			RequestDataModule requestDataModule = new RequestDataModule();
			requestDataModule.setType(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Type"));
			requestDataModule.setTimeStamp(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].TimeStamp"));
			requestDataModule.setDomain(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Domain"));
			requestDataModule.setRequest(_ctx.longValue("DescribeDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Request"));

			requestPerInterval.add(requestDataModule);
		}
		describeDomainMultiUsageDataResponse.setRequestPerInterval(requestPerInterval);

		List<TrafficDataModule> trafficPerInterval = new ArrayList<TrafficDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval.Length"); i++) {
			TrafficDataModule trafficDataModule = new TrafficDataModule();
			trafficDataModule.setType(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Type"));
			trafficDataModule.setDomain(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Domain"));
			trafficDataModule.setTimeStamp(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].TimeStamp"));
			trafficDataModule.setArea(_ctx.stringValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Area"));
			trafficDataModule.setBps(_ctx.floatValue("DescribeDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Bps"));

			trafficPerInterval.add(trafficDataModule);
		}
		describeDomainMultiUsageDataResponse.setTrafficPerInterval(trafficPerInterval);
	 
	 	return describeDomainMultiUsageDataResponse;
	}
}