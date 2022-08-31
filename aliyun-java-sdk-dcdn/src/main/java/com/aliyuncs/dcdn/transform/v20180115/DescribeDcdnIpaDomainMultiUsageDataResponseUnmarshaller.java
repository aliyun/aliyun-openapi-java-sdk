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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainMultiUsageDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnIpaDomainMultiUsageDataResponseUnmarshaller {

	public static DescribeDcdnIpaDomainMultiUsageDataResponse unmarshall(DescribeDcdnIpaDomainMultiUsageDataResponse describeDcdnIpaDomainMultiUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnIpaDomainMultiUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.RequestId"));
		describeDcdnIpaDomainMultiUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.EndTime"));
		describeDcdnIpaDomainMultiUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.StartTime"));

		List<TrafficDataModule> trafficPerInterval = new ArrayList<TrafficDataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficPerInterval.Length"); i++) {
			TrafficDataModule trafficDataModule = new TrafficDataModule();
			trafficDataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].TimeStamp"));
			trafficDataModule.setDomain(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Domain"));
			trafficDataModule.setArea(_ctx.stringValue("DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Area"));
			trafficDataModule.setBps(_ctx.floatValue("DescribeDcdnIpaDomainMultiUsageDataResponse.TrafficPerInterval["+ i +"].Bps"));

			trafficPerInterval.add(trafficDataModule);
		}
		describeDcdnIpaDomainMultiUsageDataResponse.setTrafficPerInterval(trafficPerInterval);
	 
	 	return describeDcdnIpaDomainMultiUsageDataResponse;
	}
}