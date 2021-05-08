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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageTotalResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageTotalResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageTotalResponse.Data.Item;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageTotalResponse.Data.TotalUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceUsageTotalResponseUnmarshaller {

	public static DescribeResourceUsageTotalResponse unmarshall(DescribeResourceUsageTotalResponse describeResourceUsageTotalResponse, UnmarshallerContext _ctx) {
		
		describeResourceUsageTotalResponse.setRequestId(_ctx.stringValue("DescribeResourceUsageTotalResponse.RequestId"));
		describeResourceUsageTotalResponse.setSuccess(_ctx.booleanValue("DescribeResourceUsageTotalResponse.Success"));
		describeResourceUsageTotalResponse.setCode(_ctx.stringValue("DescribeResourceUsageTotalResponse.Code"));
		describeResourceUsageTotalResponse.setMessage(_ctx.stringValue("DescribeResourceUsageTotalResponse.Message"));

		Data data = new Data();

		TotalUsage totalUsage = new TotalUsage();
		totalUsage.setUsagePercentage(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.TotalUsage.UsagePercentage"));
		totalUsage.setPostpaidCost(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.TotalUsage.PostpaidCost"));
		totalUsage.setReservationCost(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.TotalUsage.ReservationCost"));
		totalUsage.setSavedCost(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.TotalUsage.SavedCost"));
		totalUsage.setPotentialSavedCost(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.TotalUsage.PotentialSavedCost"));
		data.setTotalUsage(totalUsage);

		List<Item> periodCoverage = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceUsageTotalResponse.Data.PeriodCoverage.Length"); i++) {
			Item item = new Item();
			item.setPeriod(_ctx.stringValue("DescribeResourceUsageTotalResponse.Data.PeriodCoverage["+ i +"].Period"));
			item.setUsagePercentage(_ctx.floatValue("DescribeResourceUsageTotalResponse.Data.PeriodCoverage["+ i +"].UsagePercentage"));

			periodCoverage.add(item);
		}
		data.setPeriodCoverage(periodCoverage);
		describeResourceUsageTotalResponse.setData(data);
	 
	 	return describeResourceUsageTotalResponse;
	}
}