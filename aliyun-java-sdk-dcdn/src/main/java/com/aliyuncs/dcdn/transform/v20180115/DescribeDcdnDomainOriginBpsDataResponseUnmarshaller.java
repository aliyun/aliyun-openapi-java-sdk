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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainOriginBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainOriginBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainOriginBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainOriginBpsDataResponse unmarshall(DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainOriginBpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.RequestId"));
		describeDcdnDomainOriginBpsDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.DomainName"));
		describeDcdnDomainOriginBpsDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.StartTime"));
		describeDcdnDomainOriginBpsDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.EndTime"));
		describeDcdnDomainOriginBpsDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.DataInterval"));

		List<DataModule> originBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setOriginBps(context.floatValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].OriginBps"));
			dataModule.setDynamicHttpOriginBps(context.floatValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].DynamicHttpOriginBps"));
			dataModule.setDynamicHttpsOriginBps(context.floatValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].DynamicHttpsOriginBps"));
			dataModule.setStaticHttpOriginBps(context.floatValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].StaticHttpOriginBps"));
			dataModule.setStaticHttpsOriginBps(context.floatValue("DescribeDcdnDomainOriginBpsDataResponse.OriginBpsDataPerInterval["+ i +"].StaticHttpsOriginBps"));

			originBpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainOriginBpsDataResponse.setOriginBpsDataPerInterval(originBpsDataPerInterval);
	 
	 	return describeDcdnDomainOriginBpsDataResponse;
	}
}