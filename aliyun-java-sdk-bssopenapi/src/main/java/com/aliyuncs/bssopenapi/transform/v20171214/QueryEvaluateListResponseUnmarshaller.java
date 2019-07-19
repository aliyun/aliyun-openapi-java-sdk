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

import com.aliyuncs.bssopenapi.model.v20171214.QueryEvaluateListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryEvaluateListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryEvaluateListResponse.Data.Evaluate;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEvaluateListResponseUnmarshaller {

	public static QueryEvaluateListResponse unmarshall(QueryEvaluateListResponse queryEvaluateListResponse, UnmarshallerContext _ctx) {
		
		queryEvaluateListResponse.setRequestId(_ctx.stringValue("QueryEvaluateListResponse.RequestId"));
		queryEvaluateListResponse.setSuccess(_ctx.booleanValue("QueryEvaluateListResponse.Success"));
		queryEvaluateListResponse.setCode(_ctx.stringValue("QueryEvaluateListResponse.Code"));
		queryEvaluateListResponse.setMessage(_ctx.stringValue("QueryEvaluateListResponse.Message"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("QueryEvaluateListResponse.Data.HostId"));
		data.setPageNum(_ctx.integerValue("QueryEvaluateListResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryEvaluateListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryEvaluateListResponse.Data.TotalCount"));
		data.setTotalInvoiceAmount(_ctx.longValue("QueryEvaluateListResponse.Data.TotalInvoiceAmount"));
		data.setTotalUnAppliedInvoiceAmount(_ctx.longValue("QueryEvaluateListResponse.Data.TotalUnAppliedInvoiceAmount"));

		List<Evaluate> evaluateList = new ArrayList<Evaluate>();
		for (int i = 0; i < _ctx.lengthValue("QueryEvaluateListResponse.Data.EvaluateList.Length"); i++) {
			Evaluate evaluate = new Evaluate();
			evaluate.setId(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Id"));
			evaluate.setGmtCreate(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].GmtCreate"));
			evaluate.setGmtModified(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].GmtModified"));
			evaluate.setUserId(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].UserId"));
			evaluate.setUserNick(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].UserNick"));
			evaluate.setOutBizId(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OutBizId"));
			evaluate.setBillId(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BillId"));
			evaluate.setItemId(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].ItemId"));
			evaluate.setBillCycle(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BillCycle"));
			evaluate.setBizType(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BizType"));
			evaluate.setOriginalAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OriginalAmount"));
			evaluate.setPresentAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].PresentAmount"));
			evaluate.setCanInvoiceAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].CanInvoiceAmount"));
			evaluate.setInvoicedAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].InvoicedAmount"));
			evaluate.setOffsetCostAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OffsetCostAmount"));
			evaluate.setOffsetAcceptAmount(_ctx.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OffsetAcceptAmount"));
			evaluate.setStatus(_ctx.integerValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Status"));
			evaluate.setOpId(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OpId"));
			evaluate.setName(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Name"));
			evaluate.setBizTime(_ctx.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BizTime"));
			evaluate.setType(_ctx.integerValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Type"));

			evaluateList.add(evaluate);
		}
		data.setEvaluateList(evaluateList);
		queryEvaluateListResponse.setData(data);
	 
	 	return queryEvaluateListResponse;
	}
}