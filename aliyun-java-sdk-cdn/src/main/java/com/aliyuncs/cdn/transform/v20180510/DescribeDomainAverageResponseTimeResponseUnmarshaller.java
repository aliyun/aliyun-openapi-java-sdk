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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainAverageResponseTimeResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainAverageResponseTimeResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainAverageResponseTimeResponseUnmarshaller {

	public static DescribeDomainAverageResponseTimeResponse unmarshall(DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTimeResponse, UnmarshallerContext context) {
		
		describeDomainAverageResponseTimeResponse.setRequestId(context.stringValue("DescribeDomainAverageResponseTimeResponse.RequestId"));
		describeDomainAverageResponseTimeResponse.setDomainName(context.stringValue("DescribeDomainAverageResponseTimeResponse.DomainName"));
		describeDomainAverageResponseTimeResponse.setDataInterval(context.stringValue("DescribeDomainAverageResponseTimeResponse.DataInterval"));
		describeDomainAverageResponseTimeResponse.setStartTime(context.stringValue("DescribeDomainAverageResponseTimeResponse.StartTime"));
		describeDomainAverageResponseTimeResponse.setEndTime(context.stringValue("DescribeDomainAverageResponseTimeResponse.EndTime"));

		List<DataModule> avgRTPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainAverageResponseTimeResponse.AvgRTPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainAverageResponseTimeResponse.AvgRTPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainAverageResponseTimeResponse.AvgRTPerInterval["+ i +"].Value"));

			avgRTPerInterval.add(dataModule);
		}
		describeDomainAverageResponseTimeResponse.setAvgRTPerInterval(avgRTPerInterval);
	 
	 	return describeDomainAverageResponseTimeResponse;
	}
}