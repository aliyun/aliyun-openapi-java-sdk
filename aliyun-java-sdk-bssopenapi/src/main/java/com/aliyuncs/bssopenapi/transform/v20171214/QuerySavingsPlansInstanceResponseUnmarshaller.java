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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansInstanceResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansInstanceResponse.Data.SavingsPlansDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansInstanceResponse.Data.SavingsPlansDetailResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySavingsPlansInstanceResponseUnmarshaller {

	public static QuerySavingsPlansInstanceResponse unmarshall(QuerySavingsPlansInstanceResponse querySavingsPlansInstanceResponse, UnmarshallerContext _ctx) {
		
		querySavingsPlansInstanceResponse.setRequestId(_ctx.stringValue("QuerySavingsPlansInstanceResponse.RequestId"));
		querySavingsPlansInstanceResponse.setCode(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Code"));
		querySavingsPlansInstanceResponse.setMessage(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Message"));
		querySavingsPlansInstanceResponse.setSuccess(_ctx.booleanValue("QuerySavingsPlansInstanceResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QuerySavingsPlansInstanceResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QuerySavingsPlansInstanceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QuerySavingsPlansInstanceResponse.Data.TotalCount"));

		List<SavingsPlansDetailResponse> items = new ArrayList<SavingsPlansDetailResponse>();
		for (int i = 0; i < _ctx.lengthValue("QuerySavingsPlansInstanceResponse.Data.Items.Length"); i++) {
			SavingsPlansDetailResponse savingsPlansDetailResponse = new SavingsPlansDetailResponse();
			savingsPlansDetailResponse.setStatus(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Status"));
			savingsPlansDetailResponse.setCycle(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Cycle"));
			savingsPlansDetailResponse.setStartTimestamp(_ctx.longValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].StartTimestamp"));
			savingsPlansDetailResponse.setSavingsType(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].SavingsType"));
			savingsPlansDetailResponse.setUtilization(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Utilization"));
			savingsPlansDetailResponse.setPrepayFee(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].PrepayFee"));
			savingsPlansDetailResponse.setInstanceId(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].InstanceId"));
			savingsPlansDetailResponse.setCurrency(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Currency"));
			savingsPlansDetailResponse.setEndTimestamp(_ctx.longValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].EndTimestamp"));
			savingsPlansDetailResponse.setEndTime(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].EndTime"));
			savingsPlansDetailResponse.setStartTime(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].StartTime"));
			savingsPlansDetailResponse.setAllocationStatus(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].AllocationStatus"));
			savingsPlansDetailResponse.setInstanceFamily(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].InstanceFamily"));
			savingsPlansDetailResponse.setRegion(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Region"));
			savingsPlansDetailResponse.setLastBillTotalUsage(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].LastBillTotalUsage"));
			savingsPlansDetailResponse.setLastBillUtilization(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].LastBillUtilization"));
			savingsPlansDetailResponse.setTotalSave(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].TotalSave"));
			savingsPlansDetailResponse.setPoolValue(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].PoolValue"));
			savingsPlansDetailResponse.setPayMode(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].PayMode"));
			savingsPlansDetailResponse.setDeductCycleType(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].DeductCycleType"));
			savingsPlansDetailResponse.setRestPoolValue(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].RestPoolValue"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("QuerySavingsPlansInstanceResponse.Data.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			savingsPlansDetailResponse.setTags(tags);

			items.add(savingsPlansDetailResponse);
		}
		data.setItems(items);
		querySavingsPlansInstanceResponse.setData(data);
	 
	 	return querySavingsPlansInstanceResponse;
	}
}