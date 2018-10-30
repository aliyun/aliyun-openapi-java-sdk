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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTrafficDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainTrafficDataResponseUnmarshaller {

	public static DescribeLiveDomainTrafficDataResponse unmarshall(DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficDataResponse, UnmarshallerContext context) {
		
		describeLiveDomainTrafficDataResponse.setRequestId(context.stringValue("DescribeLiveDomainTrafficDataResponse.RequestId"));
		describeLiveDomainTrafficDataResponse.setDomainName(context.stringValue("DescribeLiveDomainTrafficDataResponse.DomainName"));
		describeLiveDomainTrafficDataResponse.setStartTime(context.stringValue("DescribeLiveDomainTrafficDataResponse.StartTime"));
		describeLiveDomainTrafficDataResponse.setEndTime(context.stringValue("DescribeLiveDomainTrafficDataResponse.EndTime"));
		describeLiveDomainTrafficDataResponse.setDataInterval(context.stringValue("DescribeLiveDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(context.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TrafficValue"));
			dataModule.setHttpTrafficValue(context.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpTrafficValue"));
			dataModule.setHttpsTrafficValue(context.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsTrafficValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeLiveDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeLiveDomainTrafficDataResponse;
	}
}