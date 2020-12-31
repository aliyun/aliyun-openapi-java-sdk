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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDeductLogResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDeductLogResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDeductLogResponse.Data.SavingsPlansDeductDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySavingsPlansDeductLogResponseUnmarshaller {

	public static QuerySavingsPlansDeductLogResponse unmarshall(QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLogResponse, UnmarshallerContext _ctx) {
		
		querySavingsPlansDeductLogResponse.setRequestId(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.RequestId"));
		querySavingsPlansDeductLogResponse.setCode(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Code"));
		querySavingsPlansDeductLogResponse.setSuccess(_ctx.booleanValue("QuerySavingsPlansDeductLogResponse.Success"));
		querySavingsPlansDeductLogResponse.setMessage(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QuerySavingsPlansDeductLogResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QuerySavingsPlansDeductLogResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QuerySavingsPlansDeductLogResponse.Data.TotalCount"));

		List<SavingsPlansDeductDetailResponse> items = new ArrayList<SavingsPlansDeductDetailResponse>();
		for (int i = 0; i < _ctx.lengthValue("QuerySavingsPlansDeductLogResponse.Data.Items.Length"); i++) {
			SavingsPlansDeductDetailResponse savingsPlansDeductDetailResponse = new SavingsPlansDeductDetailResponse();
			savingsPlansDeductDetailResponse.setInstanceId(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].InstanceId"));
			savingsPlansDeductDetailResponse.setStartTime(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].StartTime"));
			savingsPlansDeductDetailResponse.setEndTime(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].EndTime"));
			savingsPlansDeductDetailResponse.setSavingsType(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].SavingsType"));
			savingsPlansDeductDetailResponse.setBillModule(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].BillModule"));
			savingsPlansDeductDetailResponse.setDeductFee(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].DeductFee"));
			savingsPlansDeductDetailResponse.setDeductRate(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].DeductRate"));
			savingsPlansDeductDetailResponse.setUserId(_ctx.longValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].UserId"));
			savingsPlansDeductDetailResponse.setDeductCommodity(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].DeductCommodity"));
			savingsPlansDeductDetailResponse.setDeductInstanceId(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].DeductInstanceId"));
			savingsPlansDeductDetailResponse.setDiscountRate(_ctx.stringValue("QuerySavingsPlansDeductLogResponse.Data.Items["+ i +"].DiscountRate"));

			items.add(savingsPlansDeductDetailResponse);
		}
		data.setItems(items);
		querySavingsPlansDeductLogResponse.setData(data);
	 
	 	return querySavingsPlansDeductLogResponse;
	}
}