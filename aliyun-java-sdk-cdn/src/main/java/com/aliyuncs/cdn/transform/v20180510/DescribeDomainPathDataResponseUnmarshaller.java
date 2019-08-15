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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainPathDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainPathDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainPathDataResponseUnmarshaller {

	public static DescribeDomainPathDataResponse unmarshall(DescribeDomainPathDataResponse describeDomainPathDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainPathDataResponse.setDomainName(_ctx.stringValue("DescribeDomainPathDataResponse.DomainName"));
		describeDomainPathDataResponse.setStartTime(_ctx.stringValue("DescribeDomainPathDataResponse.StartTime"));
		describeDomainPathDataResponse.setEndTime(_ctx.stringValue("DescribeDomainPathDataResponse.EndTime"));
		describeDomainPathDataResponse.setPageSize(_ctx.integerValue("DescribeDomainPathDataResponse.PageSize"));
		describeDomainPathDataResponse.setPageNumber(_ctx.integerValue("DescribeDomainPathDataResponse.PageNumber"));
		describeDomainPathDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainPathDataResponse.DataInterval"));
		describeDomainPathDataResponse.setTotalCount(_ctx.integerValue("DescribeDomainPathDataResponse.TotalCount"));

		List<UsageData> pathDataPerInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainPathDataResponse.PathDataPerInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTraffic(_ctx.integerValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Traffic"));
			usageData.setAcc(_ctx.integerValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Acc"));
			usageData.setPath(_ctx.stringValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Path"));
			usageData.setTime(_ctx.stringValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Time"));

			pathDataPerInterval.add(usageData);
		}
		describeDomainPathDataResponse.setPathDataPerInterval(pathDataPerInterval);
	 
	 	return describeDomainPathDataResponse;
	}
}