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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainPvDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainPvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainPvDataResponseUnmarshaller {

	public static DescribeDomainPvDataResponse unmarshall(DescribeDomainPvDataResponse describeDomainPvDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainPvDataResponse.setRequestId(_ctx.stringValue("DescribeDomainPvDataResponse.RequestId"));
		describeDomainPvDataResponse.setEndTime(_ctx.stringValue("DescribeDomainPvDataResponse.EndTime"));
		describeDomainPvDataResponse.setStartTime(_ctx.stringValue("DescribeDomainPvDataResponse.StartTime"));
		describeDomainPvDataResponse.setDomainName(_ctx.stringValue("DescribeDomainPvDataResponse.DomainName"));
		describeDomainPvDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainPvDataResponse.DataInterval"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setValue(_ctx.stringValue("DescribeDomainPvDataResponse.PvDataInterval["+ i +"].Value"));
			usageData.setTimeStamp(_ctx.stringValue("DescribeDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));

			pvDataInterval.add(usageData);
		}
		describeDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeDomainPvDataResponse;
	}
}