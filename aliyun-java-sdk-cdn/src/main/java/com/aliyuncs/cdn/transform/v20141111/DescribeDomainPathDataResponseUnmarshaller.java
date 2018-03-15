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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainPathDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainPathDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainPathDataResponseUnmarshaller {

	public static DescribeDomainPathDataResponse unmarshall(DescribeDomainPathDataResponse describeDomainPathDataResponse, UnmarshallerContext context) {
		
		describeDomainPathDataResponse.setDomainName(context.stringValue("DescribeDomainPathDataResponse.DomainName"));
		describeDomainPathDataResponse.setStartTime(context.stringValue("DescribeDomainPathDataResponse.StartTime"));
		describeDomainPathDataResponse.setEndTime(context.stringValue("DescribeDomainPathDataResponse.EndTime"));
		describeDomainPathDataResponse.setPageSize(context.integerValue("DescribeDomainPathDataResponse.PageSize"));
		describeDomainPathDataResponse.setPageNumber(context.integerValue("DescribeDomainPathDataResponse.PageNumber"));
		describeDomainPathDataResponse.setDataInterval(context.stringValue("DescribeDomainPathDataResponse.DataInterval"));
		describeDomainPathDataResponse.setTotalCount(context.integerValue("DescribeDomainPathDataResponse.TotalCount"));

		List<UsageData> pathDataPerInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainPathDataResponse.PathDataPerInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTraffic(context.integerValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Traffic"));
			usageData.setAcc(context.integerValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Acc"));
			usageData.setPath(context.stringValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Path"));
			usageData.setTime(context.stringValue("DescribeDomainPathDataResponse.PathDataPerInterval["+ i +"].Time"));

			pathDataPerInterval.add(usageData);
		}
		describeDomainPathDataResponse.setPathDataPerInterval(pathDataPerInterval);
	 
	 	return describeDomainPathDataResponse;
	}
}