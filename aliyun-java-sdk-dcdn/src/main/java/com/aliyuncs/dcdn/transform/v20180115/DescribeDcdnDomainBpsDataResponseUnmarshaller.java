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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainBpsDataResponse unmarshall(DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainBpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainBpsDataResponse.RequestId"));
		describeDcdnDomainBpsDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainBpsDataResponse.DomainName"));
		describeDcdnDomainBpsDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainBpsDataResponse.StartTime"));
		describeDcdnDomainBpsDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainBpsDataResponse.EndTime"));
		describeDcdnDomainBpsDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBps(context.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Bps"));
			dataModule.setDynamicHttpBps(context.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicHttpBps"));
			dataModule.setDynamicHttpsBps(context.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DynamicHttpsBps"));
			dataModule.setStaticHttpBps(context.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticHttpBps"));
			dataModule.setStaticHttpsBps(context.floatValue("DescribeDcdnDomainBpsDataResponse.BpsDataPerInterval["+ i +"].StaticHttpsBps"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDcdnDomainBpsDataResponse;
	}
}