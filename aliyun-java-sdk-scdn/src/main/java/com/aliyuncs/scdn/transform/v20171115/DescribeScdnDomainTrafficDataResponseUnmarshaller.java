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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTrafficDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainTrafficDataResponseUnmarshaller {

	public static DescribeScdnDomainTrafficDataResponse unmarshall(DescribeScdnDomainTrafficDataResponse describeScdnDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.RequestId"));
		describeScdnDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.DomainName"));
		describeScdnDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.StartTime"));
		describeScdnDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.EndTime"));
		describeScdnDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TrafficValue"));
			dataModule.setHttpTrafficValue(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpTrafficValue"));
			dataModule.setHttpsTrafficValue(_ctx.stringValue("DescribeScdnDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].HttpsTrafficValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeScdnDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeScdnDomainTrafficDataResponse;
	}
}