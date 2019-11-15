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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainUvDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainUvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainUvDataResponseUnmarshaller {

	public static DescribeDcdnDomainUvDataResponse unmarshall(DescribeDcdnDomainUvDataResponse describeDcdnDomainUvDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainUvDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.RequestId"));
		describeDcdnDomainUvDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.DomainName"));
		describeDcdnDomainUvDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.DataInterval"));
		describeDcdnDomainUvDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.StartTime"));
		describeDcdnDomainUvDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.EndTime"));

		List<UsageData> uvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainUvDataResponse.UvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.UvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(_ctx.stringValue("DescribeDcdnDomainUvDataResponse.UvDataInterval["+ i +"].Value"));

			uvDataInterval.add(usageData);
		}
		describeDcdnDomainUvDataResponse.setUvDataInterval(uvDataInterval);
	 
	 	return describeDcdnDomainUvDataResponse;
	}
}