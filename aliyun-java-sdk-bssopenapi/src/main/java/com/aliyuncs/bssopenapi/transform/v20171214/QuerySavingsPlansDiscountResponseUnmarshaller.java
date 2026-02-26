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

import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDiscountResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDiscountResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QuerySavingsPlansDiscountResponse.Data.SavingsPlansDiscountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySavingsPlansDiscountResponseUnmarshaller {

	public static QuerySavingsPlansDiscountResponse unmarshall(QuerySavingsPlansDiscountResponse querySavingsPlansDiscountResponse, UnmarshallerContext _ctx) {
		
		querySavingsPlansDiscountResponse.setRequestId(_ctx.stringValue("QuerySavingsPlansDiscountResponse.RequestId"));
		querySavingsPlansDiscountResponse.setMessage(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Message"));
		querySavingsPlansDiscountResponse.setCode(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Code"));
		querySavingsPlansDiscountResponse.setSuccess(_ctx.booleanValue("QuerySavingsPlansDiscountResponse.Success"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.HostId"));

		List<SavingsPlansDiscountResponse> items = new ArrayList<SavingsPlansDiscountResponse>();
		for (int i = 0; i < _ctx.lengthValue("QuerySavingsPlansDiscountResponse.Data.Items.Length"); i++) {
			SavingsPlansDiscountResponse savingsPlansDiscountResponse = new SavingsPlansDiscountResponse();
			savingsPlansDiscountResponse.setCommodityName(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].CommodityName"));
			savingsPlansDiscountResponse.setModuleName(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].ModuleName"));
			savingsPlansDiscountResponse.setSpnType(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].SpnType"));
			savingsPlansDiscountResponse.setPayMode(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].PayMode"));
			savingsPlansDiscountResponse.setCycle(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].Cycle"));
			savingsPlansDiscountResponse.setRegion(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].Region"));
			savingsPlansDiscountResponse.setRegionCode(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].RegionCode"));
			savingsPlansDiscountResponse.setSpec(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].Spec"));
			savingsPlansDiscountResponse.setDiscountRate(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].DiscountRate"));
			savingsPlansDiscountResponse.setContractDiscountRate(_ctx.stringValue("QuerySavingsPlansDiscountResponse.Data.Items["+ i +"].ContractDiscountRate"));

			items.add(savingsPlansDiscountResponse);
		}
		data.setItems(items);
		querySavingsPlansDiscountResponse.setData(data);
	 
	 	return querySavingsPlansDiscountResponse;
	}
}