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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIpaTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainIpaTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainIpaTrafficDataResponse unmarshall(DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainIpaTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.RequestId"));
		describeDcdnDomainIpaTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.DomainName"));
		describeDcdnDomainIpaTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.StartTime"));
		describeDcdnDomainIpaTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.EndTime"));
		describeDcdnDomainIpaTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainIpaTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainIpaTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setIpaTraffic(_ctx.floatValue("DescribeDcdnDomainIpaTrafficDataResponse.TrafficDataPerInterval["+ i +"].IpaTraffic"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainIpaTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDcdnDomainIpaTrafficDataResponse;
	}
}