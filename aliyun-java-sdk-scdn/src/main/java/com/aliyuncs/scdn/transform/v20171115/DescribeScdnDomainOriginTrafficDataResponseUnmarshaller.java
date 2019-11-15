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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainOriginTrafficDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainOriginTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainOriginTrafficDataResponseUnmarshaller {

	public static DescribeScdnDomainOriginTrafficDataResponse unmarshall(DescribeScdnDomainOriginTrafficDataResponse describeScdnDomainOriginTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainOriginTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.RequestId"));
		describeScdnDomainOriginTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.DomainName"));
		describeScdnDomainOriginTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.StartTime"));
		describeScdnDomainOriginTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.EndTime"));
		describeScdnDomainOriginTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.DataInterval"));

		List<DataModule> originTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].TrafficValue"));
			dataModule.setHttpTrafficValue(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].HttpTrafficValue"));
			dataModule.setHttpsTrafficValue(_ctx.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].HttpsTrafficValue"));

			originTrafficDataPerInterval.add(dataModule);
		}
		describeScdnDomainOriginTrafficDataResponse.setOriginTrafficDataPerInterval(originTrafficDataPerInterval);
	 
	 	return describeScdnDomainOriginTrafficDataResponse;
	}
}