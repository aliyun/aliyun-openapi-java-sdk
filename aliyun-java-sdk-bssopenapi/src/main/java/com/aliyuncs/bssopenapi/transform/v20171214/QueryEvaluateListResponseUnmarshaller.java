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

	public static QueryEvaluateListResponse unmarshall(QueryEvaluateListResponse queryEvaluateListResponse, UnmarshallerContext context) {
		
		queryEvaluateListResponse.setRequestId(context.stringValue("QueryEvaluateListResponse.RequestId"));
		queryEvaluateListResponse.setSuccess(context.booleanValue("QueryEvaluateListResponse.Success"));
		queryEvaluateListResponse.setCode(context.stringValue("QueryEvaluateListResponse.Code"));
		queryEvaluateListResponse.setMessage(context.stringValue("QueryEvaluateListResponse.Message"));

		Data data = new Data();
		data.setHostId(context.stringValue("QueryEvaluateListResponse.Data.HostId"));
		data.setPageNum(context.integerValue("QueryEvaluateListResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryEvaluateListResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryEvaluateListResponse.Data.TotalCount"));

		List<Evaluate> evaluateList = new ArrayList<Evaluate>();
		for (int i = 0; i < context.lengthValue("QueryEvaluateListResponse.Data.EvaluateList.Length"); i++) {
			Evaluate evaluate = new Evaluate();
			evaluate.setId(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Id"));
			evaluate.setGmtCreate(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].GmtCreate"));
			evaluate.setGmtModified(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].GmtModified"));
			evaluate.setUserId(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].UserId"));
			evaluate.setUserNick(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].UserNick"));
			evaluate.setOutBizId(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OutBizId"));
			evaluate.setBillId(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BillId"));
			evaluate.setItemId(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].ItemId"));
			evaluate.setBillCycle(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BillCycle"));
			evaluate.setBizType(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BizType"));
			evaluate.setOriginalAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OriginalAmount"));
			evaluate.setPresentAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].PresentAmount"));
			evaluate.setCanInvoiceAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].CanInvoiceAmount"));
			evaluate.setInvoicedAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].InvoicedAmount"));
			evaluate.setOffsetCostAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OffsetCostAmount"));
			evaluate.setOffsetAcceptAmount(context.longValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OffsetAcceptAmount"));
			evaluate.setStatus(context.integerValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Status"));
			evaluate.setOpId(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].OpId"));
			evaluate.setName(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Name"));
			evaluate.setBizTime(context.stringValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].BizTime"));
			evaluate.setType(context.integerValue("QueryEvaluateListResponse.Data.EvaluateList["+ i +"].Type"));

			evaluateList.add(evaluate);
		}
		data.setEvaluateList(evaluateList);
		queryEvaluateListResponse.setData(data);
	 
	 	return queryEvaluateListResponse;
	}
}