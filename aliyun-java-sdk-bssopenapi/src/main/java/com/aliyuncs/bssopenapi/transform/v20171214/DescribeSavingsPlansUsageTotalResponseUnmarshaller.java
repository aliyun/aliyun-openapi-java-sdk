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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageTotalResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageTotalResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageTotalResponse.Data.Item;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageTotalResponse.Data.TotalUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlansUsageTotalResponseUnmarshaller {

	public static DescribeSavingsPlansUsageTotalResponse unmarshall(DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotalResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlansUsageTotalResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlansUsageTotalResponse.RequestId"));
		describeSavingsPlansUsageTotalResponse.setSuccess(_ctx.booleanValue("DescribeSavingsPlansUsageTotalResponse.Success"));
		describeSavingsPlansUsageTotalResponse.setCode(_ctx.stringValue("DescribeSavingsPlansUsageTotalResponse.Code"));
		describeSavingsPlansUsageTotalResponse.setMessage(_ctx.stringValue("DescribeSavingsPlansUsageTotalResponse.Message"));

		Data data = new Data();

		TotalUsage totalUsage = new TotalUsage();
		totalUsage.setUsagePercentage(_ctx.floatValue("DescribeSavingsPlansUsageTotalResponse.Data.TotalUsage.UsagePercentage"));
		totalUsage.setPostpaidCost(_ctx.floatValue("DescribeSavingsPlansUsageTotalResponse.Data.TotalUsage.PostpaidCost"));
		totalUsage.setPoolValue(_ctx.floatValue("DescribeSavingsPlansUsageTotalResponse.Data.TotalUsage.PoolValue"));
		totalUsage.setSavedCost(_ctx.floatValue("DescribeSavingsPlansUsageTotalResponse.Data.TotalUsage.SavedCost"));
		data.setTotalUsage(totalUsage);

		List<Item> periodCoverage = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSavingsPlansUsageTotalResponse.Data.PeriodCoverage.Length"); i++) {
			Item item = new Item();
			item.setPeriod(_ctx.stringValue("DescribeSavingsPlansUsageTotalResponse.Data.PeriodCoverage["+ i +"].Period"));
			item.setPercentage(_ctx.floatValue("DescribeSavingsPlansUsageTotalResponse.Data.PeriodCoverage["+ i +"].Percentage"));

			periodCoverage.add(item);
		}
		data.setPeriodCoverage(periodCoverage);
		describeSavingsPlansUsageTotalResponse.setData(data);
	 
	 	return describeSavingsPlansUsageTotalResponse;
	}
}