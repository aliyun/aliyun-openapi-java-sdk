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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainPvDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainPvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainPvDataResponseUnmarshaller {

	public static DescribeDcdnDomainPvDataResponse unmarshall(DescribeDcdnDomainPvDataResponse describeDcdnDomainPvDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainPvDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainPvDataResponse.RequestId"));
		describeDcdnDomainPvDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainPvDataResponse.DomainName"));
		describeDcdnDomainPvDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainPvDataResponse.DataInterval"));
		describeDcdnDomainPvDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainPvDataResponse.StartTime"));
		describeDcdnDomainPvDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainPvDataResponse.EndTime"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDcdnDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(context.stringValue("DescribeDcdnDomainPvDataResponse.PvDataInterval["+ i +"].Value"));

			pvDataInterval.add(usageData);
		}
		describeDcdnDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeDcdnDomainPvDataResponse;
	}
}