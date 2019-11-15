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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainOriginTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainOriginTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainOriginTrafficDataResponseUnmarshaller {

	public static DescribeDcdnDomainOriginTrafficDataResponse unmarshall(DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainOriginTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.RequestId"));
		describeDcdnDomainOriginTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.DomainName"));
		describeDcdnDomainOriginTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.StartTime"));
		describeDcdnDomainOriginTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.EndTime"));
		describeDcdnDomainOriginTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.DataInterval"));

		List<DataModule> originTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setOriginTraffic(_ctx.floatValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].OriginTraffic"));
			dataModule.setDynamicHttpOriginTraffic(_ctx.floatValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].DynamicHttpOriginTraffic"));
			dataModule.setDynamicHttpsOriginTraffic(_ctx.floatValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].DynamicHttpsOriginTraffic"));
			dataModule.setStaticHttpOriginTraffic(_ctx.floatValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].StaticHttpOriginTraffic"));
			dataModule.setStaticHttpsOriginTraffic(_ctx.floatValue("DescribeDcdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].StaticHttpsOriginTraffic"));

			originTrafficDataPerInterval.add(dataModule);
		}
		describeDcdnDomainOriginTrafficDataResponse.setOriginTrafficDataPerInterval(originTrafficDataPerInterval);
	 
	 	return describeDcdnDomainOriginTrafficDataResponse;
	}
}