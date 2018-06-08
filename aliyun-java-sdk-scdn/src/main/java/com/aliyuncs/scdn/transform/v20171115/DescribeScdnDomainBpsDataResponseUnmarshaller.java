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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainBpsDataResponse unmarshall(DescribeScdnDomainBpsDataResponse describeScdnDomainBpsDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainBpsDataResponse.setRequestId(context.stringValue("DescribeScdnDomainBpsDataResponse.RequestId"));
		describeScdnDomainBpsDataResponse.setDomainName(context.stringValue("DescribeScdnDomainBpsDataResponse.DomainName"));
		describeScdnDomainBpsDataResponse.setStartTime(context.stringValue("DescribeScdnDomainBpsDataResponse.StartTime"));
		describeScdnDomainBpsDataResponse.setEndTime(context.stringValue("DescribeScdnDomainBpsDataResponse.EndTime"));
		describeScdnDomainBpsDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBpsValue(context.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].BpsValue"));
			dataModule.setHttpBpsValue(context.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpBpsValue"));
			dataModule.setHttpsBpsValue(context.stringValue("DescribeScdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsBpsValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeScdnDomainBpsDataResponse;
	}
}