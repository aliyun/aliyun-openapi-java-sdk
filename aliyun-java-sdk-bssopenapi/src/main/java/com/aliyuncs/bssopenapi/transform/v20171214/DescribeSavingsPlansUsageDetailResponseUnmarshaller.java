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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeSavingsPlansUsageDetailResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlansUsageDetailResponseUnmarshaller {

	public static DescribeSavingsPlansUsageDetailResponse unmarshall(DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetailResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlansUsageDetailResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.RequestId"));
		describeSavingsPlansUsageDetailResponse.setSuccess(_ctx.booleanValue("DescribeSavingsPlansUsageDetailResponse.Success"));
		describeSavingsPlansUsageDetailResponse.setCode(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Code"));
		describeSavingsPlansUsageDetailResponse.setMessage(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("DescribeSavingsPlansUsageDetailResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSavingsPlansUsageDetailResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setUserId(_ctx.longValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].UserId"));
			item.setUserName(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].UserName"));
			item.setInstanceId(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].InstanceId"));
			item.setStartPeriod(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].StartPeriod"));
			item.setEndPeriod(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].EndPeriod"));
			item.setStatus(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].Status"));
			item.setType(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].Type"));
			item.setUsagePercentage(_ctx.floatValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].UsagePercentage"));
			item.setPoolValue(_ctx.floatValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].PoolValue"));
			item.setDeductValue(_ctx.floatValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].DeductValue"));
			item.setPostpaidCost(_ctx.floatValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].PostpaidCost"));
			item.setSavedCost(_ctx.floatValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].SavedCost"));
			item.setCurrency(_ctx.stringValue("DescribeSavingsPlansUsageDetailResponse.Data.Items["+ i +"].Currency"));

			items.add(item);
		}
		data.setItems(items);
		describeSavingsPlansUsageDetailResponse.setData(data);
	 
	 	return describeSavingsPlansUsageDetailResponse;
	}
}