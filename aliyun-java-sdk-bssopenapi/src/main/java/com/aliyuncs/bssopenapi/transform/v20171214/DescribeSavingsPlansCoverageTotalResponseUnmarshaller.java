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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageTotalResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageTotalResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageTotalResponse.Data.Item;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageTotalResponse.Data.TotalCoverage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlansCoverageTotalResponseUnmarshaller {

	public static DescribeSavingsPlansCoverageTotalResponse unmarshall(DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotalResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlansCoverageTotalResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlansCoverageTotalResponse.RequestId"));
		describeSavingsPlansCoverageTotalResponse.setSuccess(_ctx.booleanValue("DescribeSavingsPlansCoverageTotalResponse.Success"));
		describeSavingsPlansCoverageTotalResponse.setCode(_ctx.stringValue("DescribeSavingsPlansCoverageTotalResponse.Code"));
		describeSavingsPlansCoverageTotalResponse.setMessage(_ctx.stringValue("DescribeSavingsPlansCoverageTotalResponse.Message"));

		Data data = new Data();

		TotalCoverage totalCoverage = new TotalCoverage();
		totalCoverage.setCoveragePercentage(_ctx.floatValue("DescribeSavingsPlansCoverageTotalResponse.Data.TotalCoverage.CoveragePercentage"));
		totalCoverage.setDeductAmount(_ctx.floatValue("DescribeSavingsPlansCoverageTotalResponse.Data.TotalCoverage.DeductAmount"));
		data.setTotalCoverage(totalCoverage);

		List<Item> periodCoverage = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSavingsPlansCoverageTotalResponse.Data.PeriodCoverage.Length"); i++) {
			Item item = new Item();
			item.setPeriod(_ctx.stringValue("DescribeSavingsPlansCoverageTotalResponse.Data.PeriodCoverage["+ i +"].Period"));
			item.setPercentage(_ctx.floatValue("DescribeSavingsPlansCoverageTotalResponse.Data.PeriodCoverage["+ i +"].Percentage"));

			periodCoverage.add(item);
		}
		data.setPeriodCoverage(periodCoverage);
		describeSavingsPlansCoverageTotalResponse.setData(data);
	 
	 	return describeSavingsPlansCoverageTotalResponse;
	}
}