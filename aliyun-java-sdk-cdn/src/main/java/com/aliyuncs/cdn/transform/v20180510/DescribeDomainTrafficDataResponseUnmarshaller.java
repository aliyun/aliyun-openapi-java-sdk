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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTrafficDataResponseUnmarshaller {

	public static DescribeDomainTrafficDataResponse unmarshall(DescribeDomainTrafficDataResponse describeDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDomainTrafficDataResponse.RequestId"));
		describeDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDomainTrafficDataResponse.DomainName"));
		describeDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDomainTrafficDataResponse.StartTime"));
		describeDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDomainTrafficDataResponse.EndTime"));
		describeDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(_ctx.stringValue("DescribeDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsOverseasValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeDomainTrafficDataResponse;
	}
}