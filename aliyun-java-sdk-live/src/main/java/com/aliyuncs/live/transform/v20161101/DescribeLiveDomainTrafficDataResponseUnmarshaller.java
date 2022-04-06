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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainTrafficDataResponseUnmarshaller {

	public static DescribeLiveDomainTrafficDataResponse unmarshall(DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.RequestId"));
		describeLiveDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.EndTime"));
		describeLiveDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.StartTime"));
		describeLiveDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.DomainName"));
		describeLiveDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTrafficValue(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TrafficValue"));
			dataModule.setHttpTrafficValue(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpTrafficValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsTrafficValue(_ctx.stringValue("DescribeLiveDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsTrafficValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeLiveDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeLiveDomainTrafficDataResponse;
	}
}