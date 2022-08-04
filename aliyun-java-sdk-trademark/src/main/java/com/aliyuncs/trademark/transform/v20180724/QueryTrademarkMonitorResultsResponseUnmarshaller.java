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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkMonitorResultsResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkMonitorResultsResponse.TmMonitorResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkMonitorResultsResponseUnmarshaller {

	public static QueryTrademarkMonitorResultsResponse unmarshall(QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResultsResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkMonitorResultsResponse.setRequestId(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.RequestId"));
		queryTrademarkMonitorResultsResponse.setNextPage(_ctx.booleanValue("QueryTrademarkMonitorResultsResponse.NextPage"));
		queryTrademarkMonitorResultsResponse.setPrePage(_ctx.booleanValue("QueryTrademarkMonitorResultsResponse.PrePage"));
		queryTrademarkMonitorResultsResponse.setTotalItemNum(_ctx.integerValue("QueryTrademarkMonitorResultsResponse.TotalItemNum"));
		queryTrademarkMonitorResultsResponse.setCurrentPageNum(_ctx.integerValue("QueryTrademarkMonitorResultsResponse.CurrentPageNum"));
		queryTrademarkMonitorResultsResponse.setTotalPageNum(_ctx.integerValue("QueryTrademarkMonitorResultsResponse.TotalPageNum"));
		queryTrademarkMonitorResultsResponse.setPageSize(_ctx.integerValue("QueryTrademarkMonitorResultsResponse.PageSize"));

		List<TmMonitorResult> data = new ArrayList<TmMonitorResult>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkMonitorResultsResponse.Data.Length"); i++) {
			TmMonitorResult tmMonitorResult = new TmMonitorResult();
			tmMonitorResult.setTmProcedureStatusDesc(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmProcedureStatusDesc"));
			tmMonitorResult.setWuxiaoEndDate(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].WuxiaoEndDate"));
			tmMonitorResult.setUserId(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].UserId"));
			tmMonitorResult.setOwnerEnName(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].OwnerEnName"));
			tmMonitorResult.setTmUid(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmUid"));
			tmMonitorResult.setOwnerName(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].OwnerName"));
			tmMonitorResult.setDataUpdateTime(_ctx.longValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].DataUpdateTime"));
			tmMonitorResult.setChesanEndDate(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].ChesanEndDate"));
			tmMonitorResult.setXuzhanEndDate(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].XuzhanEndDate"));
			tmMonitorResult.setRuleId(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].RuleId"));
			tmMonitorResult.setRegistrationNumber(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].RegistrationNumber"));
			tmMonitorResult.setTmName(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmName"));
			tmMonitorResult.setTmImage(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmImage"));
			tmMonitorResult.setDataCreateTime(_ctx.longValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].DataCreateTime"));
			tmMonitorResult.setYiyiEndDate(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].YiyiEndDate"));
			tmMonitorResult.setClassification(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].Classification"));
			tmMonitorResult.setApplyDate(_ctx.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].ApplyDate"));

			data.add(tmMonitorResult);
		}
		queryTrademarkMonitorResultsResponse.setData(data);
	 
	 	return queryTrademarkMonitorResultsResponse;
	}
}