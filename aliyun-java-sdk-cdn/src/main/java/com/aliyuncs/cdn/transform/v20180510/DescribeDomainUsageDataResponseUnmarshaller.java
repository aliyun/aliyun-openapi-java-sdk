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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainUsageDataResponseUnmarshaller {

	public static DescribeDomainUsageDataResponse unmarshall(DescribeDomainUsageDataResponse describeDomainUsageDataResponse, UnmarshallerContext context) {
		
		describeDomainUsageDataResponse.setRequestId(context.stringValue("DescribeDomainUsageDataResponse.RequestId"));
		describeDomainUsageDataResponse.setDomainName(context.stringValue("DescribeDomainUsageDataResponse.DomainName"));
		describeDomainUsageDataResponse.setStartTime(context.stringValue("DescribeDomainUsageDataResponse.StartTime"));
		describeDomainUsageDataResponse.setEndTime(context.stringValue("DescribeDomainUsageDataResponse.EndTime"));
		describeDomainUsageDataResponse.setType(context.stringValue("DescribeDomainUsageDataResponse.Type"));
		describeDomainUsageDataResponse.setArea(context.stringValue("DescribeDomainUsageDataResponse.Area"));
		describeDomainUsageDataResponse.setDataInterval(context.stringValue("DescribeDomainUsageDataResponse.DataInterval"));

		List<DataModule> usageDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainUsageDataResponse.UsageDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setPeakTime(context.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].PeakTime"));
			dataModule.setValue(context.stringValue("DescribeDomainUsageDataResponse.UsageDataPerInterval["+ i +"].Value"));

			usageDataPerInterval.add(dataModule);
		}
		describeDomainUsageDataResponse.setUsageDataPerInterval(usageDataPerInterval);
	 
	 	return describeDomainUsageDataResponse;
	}
}