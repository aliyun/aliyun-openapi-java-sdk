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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedSessionsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedSessionsResponse.LmActivitySessionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnfinishedSessionsResponseUnmarshaller {

	public static QueryUnfinishedSessionsResponse unmarshall(QueryUnfinishedSessionsResponse queryUnfinishedSessionsResponse, UnmarshallerContext _ctx) {
		
		queryUnfinishedSessionsResponse.setRequestId(_ctx.stringValue("QueryUnfinishedSessionsResponse.RequestId"));
		queryUnfinishedSessionsResponse.setCode(_ctx.stringValue("QueryUnfinishedSessionsResponse.Code"));
		queryUnfinishedSessionsResponse.setMessage(_ctx.stringValue("QueryUnfinishedSessionsResponse.Message"));
		queryUnfinishedSessionsResponse.setTotalCount(_ctx.longValue("QueryUnfinishedSessionsResponse.TotalCount"));
		queryUnfinishedSessionsResponse.setPageNumber(_ctx.longValue("QueryUnfinishedSessionsResponse.PageNumber"));
		queryUnfinishedSessionsResponse.setPageSize(_ctx.longValue("QueryUnfinishedSessionsResponse.PageSize"));

		List<LmActivitySessionModel> lmActivitySessionModelList = new ArrayList<LmActivitySessionModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList.Length"); i++) {
			LmActivitySessionModel lmActivitySessionModel = new LmActivitySessionModel();
			lmActivitySessionModel.setStartDate(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].StartDate"));
			lmActivitySessionModel.setSubBizCode(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].SubBizCode"));
			lmActivitySessionModel.setName(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].Name"));
			lmActivitySessionModel.setLmActivityId(_ctx.longValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].LmActivityId"));
			lmActivitySessionModel.setLmSessionId(_ctx.longValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].LmSessionId"));
			lmActivitySessionModel.setEndDate(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].EndDate"));
			lmActivitySessionModel.setDisplayDate(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].DisplayDate"));
			lmActivitySessionModel.setDescription(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].Description"));
			lmActivitySessionModel.setBizId(_ctx.stringValue("QueryUnfinishedSessionsResponse.LmActivitySessionModelList["+ i +"].BizId"));

			lmActivitySessionModelList.add(lmActivitySessionModel);
		}
		queryUnfinishedSessionsResponse.setLmActivitySessionModelList(lmActivitySessionModelList);
	 
	 	return queryUnfinishedSessionsResponse;
	}
}