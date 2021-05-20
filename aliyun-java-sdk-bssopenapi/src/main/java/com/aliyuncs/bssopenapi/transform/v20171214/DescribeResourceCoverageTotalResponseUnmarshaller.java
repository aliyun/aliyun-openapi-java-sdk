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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageTotalResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageTotalResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageTotalResponse.Data.Item;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageTotalResponse.Data.TotalCoverage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceCoverageTotalResponseUnmarshaller {

	public static DescribeResourceCoverageTotalResponse unmarshall(DescribeResourceCoverageTotalResponse describeResourceCoverageTotalResponse, UnmarshallerContext _ctx) {
		
		describeResourceCoverageTotalResponse.setRequestId(_ctx.stringValue("DescribeResourceCoverageTotalResponse.RequestId"));
		describeResourceCoverageTotalResponse.setSuccess(_ctx.booleanValue("DescribeResourceCoverageTotalResponse.Success"));
		describeResourceCoverageTotalResponse.setCode(_ctx.stringValue("DescribeResourceCoverageTotalResponse.Code"));
		describeResourceCoverageTotalResponse.setMessage(_ctx.stringValue("DescribeResourceCoverageTotalResponse.Message"));

		Data data = new Data();

		TotalCoverage totalCoverage = new TotalCoverage();
		totalCoverage.setCoveragePercentage(_ctx.floatValue("DescribeResourceCoverageTotalResponse.Data.TotalCoverage.CoveragePercentage"));
		totalCoverage.setDeductQuantity(_ctx.floatValue("DescribeResourceCoverageTotalResponse.Data.TotalCoverage.DeductQuantity"));
		totalCoverage.setTotalQuantity(_ctx.floatValue("DescribeResourceCoverageTotalResponse.Data.TotalCoverage.TotalQuantity"));
		totalCoverage.setCapacityUnit(_ctx.stringValue("DescribeResourceCoverageTotalResponse.Data.TotalCoverage.CapacityUnit"));
		data.setTotalCoverage(totalCoverage);

		List<Item> periodCoverage = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceCoverageTotalResponse.Data.PeriodCoverage.Length"); i++) {
			Item item = new Item();
			item.setPeriod(_ctx.stringValue("DescribeResourceCoverageTotalResponse.Data.PeriodCoverage["+ i +"].Period"));
			item.setCoveragePercentage(_ctx.floatValue("DescribeResourceCoverageTotalResponse.Data.PeriodCoverage["+ i +"].CoveragePercentage"));

			periodCoverage.add(item);
		}
		data.setPeriodCoverage(periodCoverage);
		describeResourceCoverageTotalResponse.setData(data);
	 
	 	return describeResourceCoverageTotalResponse;
	}
}