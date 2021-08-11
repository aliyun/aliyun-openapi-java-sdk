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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansCoverageDetailResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlansCoverageDetailResponseUnmarshaller {

	public static DescribeSavingsPlansCoverageDetailResponse unmarshall(DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetailResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlansCoverageDetailResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.RequestId"));
		describeSavingsPlansCoverageDetailResponse.setSuccess(_ctx.booleanValue("DescribeSavingsPlansCoverageDetailResponse.Success"));
		describeSavingsPlansCoverageDetailResponse.setCode(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Code"));
		describeSavingsPlansCoverageDetailResponse.setMessage(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("DescribeSavingsPlansCoverageDetailResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setUserId(_ctx.longValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].UserId"));
			item.setUserName(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].UserName"));
			item.setInstanceId(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].InstanceId"));
			item.setRegion(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].Region"));
			item.setInstanceSpec(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setCurrency(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].Currency"));
			item.setCoveragePercentage(_ctx.floatValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].CoveragePercentage"));
			item.setDeductAmount(_ctx.floatValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].DeductAmount"));
			item.setTotalAmount(_ctx.floatValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].TotalAmount"));
			item.setPostpaidCost(_ctx.floatValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].PostpaidCost"));
			item.setStartPeriod(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].StartPeriod"));
			item.setEndPeriod(_ctx.stringValue("DescribeSavingsPlansCoverageDetailResponse.Data.Items["+ i +"].EndPeriod"));

			items.add(item);
		}
		data.setItems(items);
		describeSavingsPlansCoverageDetailResponse.setData(data);
	 
	 	return describeSavingsPlansCoverageDetailResponse;
	}
}