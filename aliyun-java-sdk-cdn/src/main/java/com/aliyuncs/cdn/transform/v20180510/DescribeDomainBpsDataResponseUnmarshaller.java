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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainBpsDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBpsDataResponseUnmarshaller {

	public static DescribeDomainBpsDataResponse unmarshall(DescribeDomainBpsDataResponse describeDomainBpsDataResponse, UnmarshallerContext context) {
		
		describeDomainBpsDataResponse.setRequestId(context.stringValue("DescribeDomainBpsDataResponse.RequestId"));
		describeDomainBpsDataResponse.setDomainName(context.stringValue("DescribeDomainBpsDataResponse.DomainName"));
		describeDomainBpsDataResponse.setStartTime(context.stringValue("DescribeDomainBpsDataResponse.StartTime"));
		describeDomainBpsDataResponse.setEndTime(context.stringValue("DescribeDomainBpsDataResponse.EndTime"));
		describeDomainBpsDataResponse.setLocationNameEn(context.stringValue("DescribeDomainBpsDataResponse.LocationNameEn"));
		describeDomainBpsDataResponse.setIspNameEn(context.stringValue("DescribeDomainBpsDataResponse.IspNameEn"));
		describeDomainBpsDataResponse.setDataInterval(context.stringValue("DescribeDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(context.stringValue("DescribeDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsOverseasValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeDomainBpsDataResponse;
	}
}