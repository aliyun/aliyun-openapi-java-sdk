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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainSlowRatioResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainSlowRatioResponse.SlowRatioData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSlowRatioResponseUnmarshaller {

	public static DescribeDomainSlowRatioResponse unmarshall(DescribeDomainSlowRatioResponse describeDomainSlowRatioResponse, UnmarshallerContext _ctx) {
		
		describeDomainSlowRatioResponse.setEndTime(_ctx.stringValue("DescribeDomainSlowRatioResponse.EndTime"));
		describeDomainSlowRatioResponse.setDataInterval(_ctx.integerValue("DescribeDomainSlowRatioResponse.DataInterval"));
		describeDomainSlowRatioResponse.setPageNumber(_ctx.integerValue("DescribeDomainSlowRatioResponse.PageNumber"));
		describeDomainSlowRatioResponse.setPageSize(_ctx.integerValue("DescribeDomainSlowRatioResponse.PageSize"));
		describeDomainSlowRatioResponse.setTotalCount(_ctx.integerValue("DescribeDomainSlowRatioResponse.TotalCount"));
		describeDomainSlowRatioResponse.setStartTime(_ctx.stringValue("DescribeDomainSlowRatioResponse.StartTime"));

		List<SlowRatioData> slowRatioDataPerInterval = new ArrayList<SlowRatioData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval.Length"); i++) {
			SlowRatioData slowRatioData = new SlowRatioData();
			slowRatioData.setTotalUsers(_ctx.integerValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].TotalUsers"));
			slowRatioData.setSlowUsers(_ctx.integerValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].SlowUsers"));
			slowRatioData.setSlowRatio(_ctx.floatValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].SlowRatio"));
			slowRatioData.setRegionNameZh(_ctx.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].RegionNameZh"));
			slowRatioData.setRegionNameEn(_ctx.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].RegionNameEn"));
			slowRatioData.setIspNameZh(_ctx.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].IspNameZh"));
			slowRatioData.setIspNameEn(_ctx.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].IspNameEn"));
			slowRatioData.setTime(_ctx.stringValue("DescribeDomainSlowRatioResponse.SlowRatioDataPerInterval["+ i +"].Time"));

			slowRatioDataPerInterval.add(slowRatioData);
		}
		describeDomainSlowRatioResponse.setSlowRatioDataPerInterval(slowRatioDataPerInterval);
	 
	 	return describeDomainSlowRatioResponse;
	}
}