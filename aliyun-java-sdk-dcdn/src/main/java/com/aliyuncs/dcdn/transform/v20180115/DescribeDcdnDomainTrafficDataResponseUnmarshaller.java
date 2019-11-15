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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainTrafficDataResponse unmarshall(DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.RequestId"));
		describeDcdnDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.DomainName"));
		describeDcdnDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.StartTime"));
		describeDcdnDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.EndTime"));
		describeDcdnDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTraffic(_ctx.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Traffic"));
			dataModule.setDynamicHttpTraffic(_ctx.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DynamicHttpTraffic"));
			dataModule.setDynamicHttpsTraffic(_ctx.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DynamicHttpsTraffic"));
			dataModule.setStaticHttpTraffic(_ctx.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].StaticHttpTraffic"));
			dataModule.setStaticHttpsTraffic(_ctx.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].StaticHttpsTraffic"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDcdnDomainTrafficDataResponse;
	}
}