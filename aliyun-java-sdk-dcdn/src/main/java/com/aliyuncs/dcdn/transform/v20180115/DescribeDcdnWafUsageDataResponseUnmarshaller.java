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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafUsageDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafUsageDataResponse.WafUsageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafUsageDataResponseUnmarshaller {

	public static DescribeDcdnWafUsageDataResponse unmarshall(DescribeDcdnWafUsageDataResponse describeDcdnWafUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafUsageDataResponse.RequestId"));
		describeDcdnWafUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnWafUsageDataResponse.EndTime"));
		describeDcdnWafUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnWafUsageDataResponse.StartTime"));

		List<WafUsageDataItem> wafUsageData = new ArrayList<WafUsageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafUsageDataResponse.WafUsageData.Length"); i++) {
			WafUsageDataItem wafUsageDataItem = new WafUsageDataItem();
			wafUsageDataItem.setObserveCnt(_ctx.longValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].ObserveCnt"));
			wafUsageDataItem.setDomain(_ctx.stringValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].Domain"));
			wafUsageDataItem.setBlockCnt(_ctx.longValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].BlockCnt"));
			wafUsageDataItem.setAccessCnt(_ctx.longValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].AccessCnt"));
			wafUsageDataItem.setTimeStamp(_ctx.stringValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].TimeStamp"));
			wafUsageDataItem.setSecCu(_ctx.longValue("DescribeDcdnWafUsageDataResponse.WafUsageData["+ i +"].SecCu"));

			wafUsageData.add(wafUsageDataItem);
		}
		describeDcdnWafUsageDataResponse.setWafUsageData(wafUsageData);
	 
	 	return describeDcdnWafUsageDataResponse;
	}
}