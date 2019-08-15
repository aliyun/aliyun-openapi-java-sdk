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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainUsageDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainUsageDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainUsageDataResponseUnmarshaller {

	public static DescribeDomainUsageDataResponse unmarshall(DescribeDomainUsageDataResponse describeDomainUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDomainUsageDataResponse.RequestId"));
		describeDomainUsageDataResponse.setDomainName(_ctx.stringValue("DescribeDomainUsageDataResponse.DomainName"));
		describeDomainUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDomainUsageDataResponse.StartTime"));
		describeDomainUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDomainUsageDataResponse.EndTime"));
		describeDomainUsageDataResponse.setType(_ctx.stringValue("DescribeDomainUsageDataResponse.Type"));
		describeDomainUsageDataResponse.setArea(_ctx.stringValue("DescribeDomainUsageDataResponse.Area"));
		describeDomainUsageDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainUsageDataResponse.DataInterval"));

		List<DataModule> usageDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainUsageDataResponse.UsageDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setPeakTime(_ctx.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].PeakTime"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].Value"));
			dataModule.setSpecialValue(_ctx.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].SpecialValue"));

			usageDataPerInterval.add(dataModule);
		}
		describeDomainUsageDataResponse.setUsageDataPerInterval(usageDataPerInterval);
	 
	 	return describeDomainUsageDataResponse;
	}
}