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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainMultiUsageDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainMultiUsageDataResponse.RequestDataModule;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainMultiUsageDataResponse.TrafficDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainMultiUsageDataResponseUnmarshaller {

	public static DescribeDcdnDomainMultiUsageDataResponse unmarshall(DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainMultiUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.RequestId"));
		describeDcdnDomainMultiUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.StartTime"));
		describeDcdnDomainMultiUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.EndTime"));

		List<RequestDataModule> requestPerInterval = new ArrayList<RequestDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainMultiUsageDataResponse.RequestPerInterval.Length"); i++) {
			RequestDataModule requestDataModule = new RequestDataModule();
			requestDataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].TimeStamp"));
			requestDataModule.setDomain(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Domain"));
			requestDataModule.setRequest(_ctx.longValue("DescribeDcdnDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Request"));
			requestDataModule.setType(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.RequestPerInterval["+ i +"].Type"));

			requestPerInterval.add(requestDataModule);
		}
		describeDcdnDomainMultiUsageDataResponse.setRequestPerInterval(requestPerInterval);

		List<TrafficDataModule> trafficPerInterval = new ArrayList<TrafficDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval.Length"); i++) {
			TrafficDataModule trafficDataModule = new TrafficDataModule();
			trafficDataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].TimeStamp"));
			trafficDataModule.setDomain(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Domain"));
			trafficDataModule.setBps(_ctx.floatValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Bps"));
			trafficDataModule.setType(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Type"));
			trafficDataModule.setArea(_ctx.stringValue("DescribeDcdnDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Area"));

			trafficPerInterval.add(trafficDataModule);
		}
		describeDcdnDomainMultiUsageDataResponse.setTrafficPerInterval(trafficPerInterval);
	 
	 	return describeDcdnDomainMultiUsageDataResponse;
	}
}