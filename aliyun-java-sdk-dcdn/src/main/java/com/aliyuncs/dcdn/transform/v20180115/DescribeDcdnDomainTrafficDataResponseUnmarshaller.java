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

	public static DescribeDcdnDomainTrafficDataResponse unmarshall(DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainTrafficDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainTrafficDataResponse.RequestId"));
		describeDcdnDomainTrafficDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainTrafficDataResponse.DomainName"));
		describeDcdnDomainTrafficDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainTrafficDataResponse.StartTime"));
		describeDcdnDomainTrafficDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainTrafficDataResponse.EndTime"));
		describeDcdnDomainTrafficDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTraffic(context.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Traffic"));
			dataModule.setDynamicHttpTraffic(context.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DynamicHttpTraffic"));
			dataModule.setDynamicHttpsTraffic(context.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DynamicHttpsTraffic"));
			dataModule.setStaticHttpTraffic(context.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].StaticHttpTraffic"));
			dataModule.setStaticHttpsTraffic(context.floatValue("DescribeDcdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].StaticHttpsTraffic"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDcdnDomainTrafficDataResponse;
	}
}