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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRealTimeDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRealTimeDataResponseUnmarshaller {

	public static DescribeDomainRealTimeDataResponse unmarshall(DescribeDomainRealTimeDataResponse describeDomainRealTimeDataResponse, UnmarshallerContext context) {
		
		describeDomainRealTimeDataResponse.setRequestId(context.stringValue("DescribeDomainRealTimeDataResponse.RequestId"));
		describeDomainRealTimeDataResponse.setDomainName(context.stringValue("DescribeDomainRealTimeDataResponse.DomainName"));
		describeDomainRealTimeDataResponse.setField(context.stringValue("DescribeDomainRealTimeDataResponse.Field"));
		describeDomainRealTimeDataResponse.setStartTime(context.stringValue("DescribeDomainRealTimeDataResponse.StartTime"));
		describeDomainRealTimeDataResponse.setEndTime(context.stringValue("DescribeDomainRealTimeDataResponse.EndTime"));

		List<DataModule> dataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRealTimeDataResponse.DataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainRealTimeDataResponse.DataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainRealTimeDataResponse.DataPerInterval["+ i +"].Value"));

			dataPerInterval.add(dataModule);
		}
		describeDomainRealTimeDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeDomainRealTimeDataResponse;
	}
}