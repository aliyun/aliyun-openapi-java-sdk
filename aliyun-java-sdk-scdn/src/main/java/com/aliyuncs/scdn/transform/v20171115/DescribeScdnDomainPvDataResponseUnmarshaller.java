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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainPvDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainPvDataResponse.UsageData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainPvDataResponseUnmarshaller {

	public static DescribeScdnDomainPvDataResponse unmarshall(DescribeScdnDomainPvDataResponse describeScdnDomainPvDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainPvDataResponse.setRequestId(context.stringValue("DescribeScdnDomainPvDataResponse.RequestId"));
		describeScdnDomainPvDataResponse.setDomainName(context.stringValue("DescribeScdnDomainPvDataResponse.DomainName"));
		describeScdnDomainPvDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainPvDataResponse.DataInterval"));
		describeScdnDomainPvDataResponse.setStartTime(context.stringValue("DescribeScdnDomainPvDataResponse.StartTime"));
		describeScdnDomainPvDataResponse.setEndTime(context.stringValue("DescribeScdnDomainPvDataResponse.EndTime"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeScdnDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(context.stringValue("DescribeScdnDomainPvDataResponse.PvDataInterval["+ i +"].Value"));

			pvDataInterval.add(usageData);
		}
		describeScdnDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeScdnDomainPvDataResponse;
	}
}