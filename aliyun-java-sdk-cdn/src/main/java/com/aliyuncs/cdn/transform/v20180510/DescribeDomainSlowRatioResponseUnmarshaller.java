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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSlowRatioResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSlowRatioResponse.SlowRatioData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSlowRatioResponseUnmarshaller {

	public static DescribeDomainSlowRatioResponse unmarshall(DescribeDomainSlowRatioResponse describeDomainSlowRatioResponse, UnmarshallerContext context) {
		
		describeDomainSlowRatioResponse.setEndTime(context.stringValue("DescribeDomainSlowRatioResponse.EndTime"));
		describeDomainSlowRatioResponse.setDataInterval(context.integerValue("DescribeDomainSlowRatioResponse.DataInterval"));
		describeDomainSlowRatioResponse.setPageNumber(context.integerValue("DescribeDomainSlowRatioResponse.PageNumber"));
		describeDomainSlowRatioResponse.setPageSize(context.integerValue("DescribeDomainSlowRatioResponse.PageSize"));
		describeDomainSlowRatioResponse.setTotalCount(context.integerValue("DescribeDomainSlowRatioResponse.TotalCount"));
		describeDomainSlowRatioResponse.setStartTime(context.stringValue("DescribeDomainSlowRatioResponse.StartTime"));

		List<SlowRatioData> slowRatioDataPerInterval = new ArrayList<SlowRatioData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval.Length"); i++) {
			SlowRatioData slowRatioData = new SlowRatioData();
			slowRatioData.setTotalUsers(context.integerValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].TotalUsers"));
			slowRatioData.setSlowUsers(context.integerValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].SlowUsers"));
			slowRatioData.setSlowRatio(context.floatValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].SlowRatio"));
			slowRatioData.setRegionNameZh(context.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].RegionNameZh"));
			slowRatioData.setRegionNameEn(context.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].RegionNameEn"));
			slowRatioData.setIspNameZh(context.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].IspNameZh"));
			slowRatioData.setIspNameEn(context.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].IspNameEn"));
			slowRatioData.setTime(context.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].Time"));

			slowRatioDataPerInterval.add(slowRatioData);
		}
		describeDomainSlowRatioResponse.setSlowRatioDataPerInterval(slowRatioDataPerInterval);
	 
	 	return describeDomainSlowRatioResponse;
	}
}