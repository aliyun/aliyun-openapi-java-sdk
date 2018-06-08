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

	public static DescribeScdnDomainOriginTrafficDataResponse unmarshall(DescribeScdnDomainOriginTrafficDataResponse describeScdnDomainOriginTrafficDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainOriginTrafficDataResponse.setRequestId(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.RequestId"));
		describeScdnDomainOriginTrafficDataResponse.setDomainName(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.DomainName"));
		describeScdnDomainOriginTrafficDataResponse.setStartTime(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.StartTime"));
		describeScdnDomainOriginTrafficDataResponse.setEndTime(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.EndTime"));
		describeScdnDomainOriginTrafficDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.DataInterval"));

		List<DataModule> originTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].TrafficValue"));
			dataModule.setHttpTrafficValue(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].HttpTrafficValue"));
			dataModule.setHttpsTrafficValue(context.stringValue("DescribeScdnDomainOriginTrafficDataResponse.OriginTrafficDataPerInterval["+ i +"].HttpsTrafficValue"));

			originTrafficDataPerInterval.add(dataModule);
		}
		describeScdnDomainOriginTrafficDataResponse.setOriginTrafficDataPerInterval(originTrafficDataPerInterval);
	 
	 	return describeScdnDomainOriginTrafficDataResponse;
	}
}