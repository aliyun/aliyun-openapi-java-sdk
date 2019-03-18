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

	public static QueryTrademarkMonitorResultsResponse unmarshall(QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResultsResponse, UnmarshallerContext context) {
		
		queryTrademarkMonitorResultsResponse.setRequestId(context.stringValue("QueryTrademarkMonitorResultsResponse.RequestId"));
		queryTrademarkMonitorResultsResponse.setTotalItemNum(context.integerValue("QueryTrademarkMonitorResultsResponse.TotalItemNum"));
		queryTrademarkMonitorResultsResponse.setCurrentPageNum(context.integerValue("QueryTrademarkMonitorResultsResponse.CurrentPageNum"));
		queryTrademarkMonitorResultsResponse.setPageSize(context.integerValue("QueryTrademarkMonitorResultsResponse.PageSize"));
		queryTrademarkMonitorResultsResponse.setTotalPageNum(context.integerValue("QueryTrademarkMonitorResultsResponse.TotalPageNum"));
		queryTrademarkMonitorResultsResponse.setPrePage(context.booleanValue("QueryTrademarkMonitorResultsResponse.PrePage"));
		queryTrademarkMonitorResultsResponse.setNextPage(context.booleanValue("QueryTrademarkMonitorResultsResponse.NextPage"));

		List<TmMonitorResult> data = new ArrayList<TmMonitorResult>();
		for (int i = 0; i < context.lengthValue("QueryTrademarkMonitorResultsResponse.Data.Length"); i++) {
			TmMonitorResult tmMonitorResult = new TmMonitorResult();
			tmMonitorResult.setUserId(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].UserId"));
			tmMonitorResult.setRuleId(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].RuleId"));
			tmMonitorResult.setTmUid(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmUid"));
			tmMonitorResult.setDataCreateTime(context.longValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].DataCreateTime"));
			tmMonitorResult.setDataUpdateTime(context.longValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].DataUpdateTime"));
			tmMonitorResult.setTmName(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmName"));
			tmMonitorResult.setTmImage(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmImage"));
			tmMonitorResult.setClassification(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].Classification"));
			tmMonitorResult.setRegistrationNumber(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].RegistrationNumber"));
			tmMonitorResult.setTmProcedureStatusDesc(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].TmProcedureStatusDesc"));
			tmMonitorResult.setOwnerName(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].OwnerName"));
			tmMonitorResult.setOwnerEnName(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].OwnerEnName"));
			tmMonitorResult.setApplyDate(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].ApplyDate"));
			tmMonitorResult.setXuzhanEndDate(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].XuzhanEndDate"));
			tmMonitorResult.setChesanEndDate(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].ChesanEndDate"));
			tmMonitorResult.setWuxiaoEndDate(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].WuxiaoEndDate"));
			tmMonitorResult.setYiyiEndDate(context.stringValue("QueryTrademarkMonitorResultsResponse.Data["+ i +"].YiyiEndDate"));

			data.add(tmMonitorResult);
		}
		queryTrademarkMonitorResultsResponse.setData(data);
	 
	 	return queryTrademarkMonitorResultsResponse;
	}
}