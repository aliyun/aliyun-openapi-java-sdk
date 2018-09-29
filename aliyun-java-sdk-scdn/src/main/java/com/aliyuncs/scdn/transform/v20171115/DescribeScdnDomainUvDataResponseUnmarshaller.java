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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainUvDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainUvDataResponse.UsageData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainUvDataResponseUnmarshaller {

	public static DescribeScdnDomainUvDataResponse unmarshall(DescribeScdnDomainUvDataResponse describeScdnDomainUvDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainUvDataResponse.setRequestId(context.stringValue("DescribeScdnDomainUvDataResponse.RequestId"));
		describeScdnDomainUvDataResponse.setDomainName(context.stringValue("DescribeScdnDomainUvDataResponse.DomainName"));
		describeScdnDomainUvDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainUvDataResponse.DataInterval"));
		describeScdnDomainUvDataResponse.setStartTime(context.stringValue("DescribeScdnDomainUvDataResponse.StartTime"));
		describeScdnDomainUvDataResponse.setEndTime(context.stringValue("DescribeScdnDomainUvDataResponse.EndTime"));

		List<UsageData> uvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainUvDataResponse.UvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeScdnDomainUvDataResponse.UvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(context.stringValue("DescribeScdnDomainUvDataResponse.UvDataInterval["+ i +"].Value"));

			uvDataInterval.add(usageData);
		}
		describeScdnDomainUvDataResponse.setUvDataInterval(uvDataInterval);
	 
	 	return describeScdnDomainUvDataResponse;
	}
}