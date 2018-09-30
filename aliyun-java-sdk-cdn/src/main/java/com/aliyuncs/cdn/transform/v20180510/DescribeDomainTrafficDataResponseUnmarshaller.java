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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainTrafficDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTrafficDataResponseUnmarshaller {

	public static DescribeDomainTrafficDataResponse unmarshall(DescribeDomainTrafficDataResponse describeDomainTrafficDataResponse, UnmarshallerContext context) {
		
		describeDomainTrafficDataResponse.setRequestId(context.stringValue("DescribeDomainTrafficDataResponse.RequestId"));
		describeDomainTrafficDataResponse.setDomainName(context.stringValue("DescribeDomainTrafficDataResponse.DomainName"));
		describeDomainTrafficDataResponse.setStartTime(context.stringValue("DescribeDomainTrafficDataResponse.StartTime"));
		describeDomainTrafficDataResponse.setEndTime(context.stringValue("DescribeDomainTrafficDataResponse.EndTime"));
		describeDomainTrafficDataResponse.setDataInterval(context.stringValue("DescribeDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(context.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsOverseasValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDomainTrafficDataResponse;
	}
}