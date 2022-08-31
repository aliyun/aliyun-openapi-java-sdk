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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainUsageDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainUsageDataResponseUnmarshaller {

	public static DescribeDcdnDomainUsageDataResponse unmarshall(DescribeDcdnDomainUsageDataResponse describeDcdnDomainUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.RequestId"));
		describeDcdnDomainUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.EndTime"));
		describeDcdnDomainUsageDataResponse.setType(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.Type"));
		describeDcdnDomainUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.StartTime"));
		describeDcdnDomainUsageDataResponse.setArea(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.Area"));
		describeDcdnDomainUsageDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.DomainName"));
		describeDcdnDomainUsageDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.DataInterval"));

		List<DataModule> usageDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainUsageDataResponse.UsageDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.UsageDataPerInterval["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.UsageDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setPeakTime(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.UsageDataPerInterval["+ i +"].PeakTime"));
			dataModule.setSpecialValue(_ctx.stringValue("DescribeDcdnDomainUsageDataResponse.UsageDataPerInterval["+ i +"].SpecialValue"));

			usageDataPerInterval.add(dataModule);
		}
		describeDcdnDomainUsageDataResponse.setUsageDataPerInterval(usageDataPerInterval);
	 
	 	return describeDcdnDomainUsageDataResponse;
	}
}