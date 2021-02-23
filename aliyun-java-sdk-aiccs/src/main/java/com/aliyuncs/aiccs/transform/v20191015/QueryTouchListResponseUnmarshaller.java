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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.QueryTouchListResponse;
import com.aliyuncs.aiccs.model.v20191015.QueryTouchListResponse.ResultData;
import com.aliyuncs.aiccs.model.v20191015.QueryTouchListResponse.ResultData.DataItem;
import com.aliyuncs.aiccs.model.v20191015.QueryTouchListResponse.ResultData.DataItem.ExtAttrs;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTouchListResponseUnmarshaller {

	public static QueryTouchListResponse unmarshall(QueryTouchListResponse queryTouchListResponse, UnmarshallerContext _ctx) {
		
		queryTouchListResponse.setRequestId(_ctx.stringValue("QueryTouchListResponse.RequestId"));
		queryTouchListResponse.setMessage(_ctx.stringValue("QueryTouchListResponse.Message"));
		queryTouchListResponse.setCode(_ctx.stringValue("QueryTouchListResponse.Code"));
		queryTouchListResponse.setSuccess(_ctx.booleanValue("QueryTouchListResponse.Success"));

		ResultData resultData = new ResultData();
		resultData.setEmpty(_ctx.booleanValue("QueryTouchListResponse.ResultData.Empty"));
		resultData.setOnePageSize(_ctx.integerValue("QueryTouchListResponse.ResultData.OnePageSize"));
		resultData.setTotalPage(_ctx.integerValue("QueryTouchListResponse.ResultData.TotalPage"));
		resultData.setCurrentPage(_ctx.integerValue("QueryTouchListResponse.ResultData.CurrentPage"));
		resultData.setPreviousPage(_ctx.integerValue("QueryTouchListResponse.ResultData.PreviousPage"));
		resultData.setTotalResults(_ctx.integerValue("QueryTouchListResponse.ResultData.TotalResults"));
		resultData.setNextPage(_ctx.integerValue("QueryTouchListResponse.ResultData.NextPage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTouchListResponse.ResultData.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDepId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].DepId"));
			dataItem.setParentTouchId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].ParentTouchId"));
			dataItem.setUserTouchId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].UserTouchId"));
			dataItem.setGmtModified(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].GmtModified"));
			dataItem.setChannelId(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].ChannelId"));
			dataItem.setCommonQueueName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].CommonQueueName"));
			dataItem.setTouchId(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchId"));
			dataItem.setMemberId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].MemberId"));
			dataItem.setServicerName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].ServicerName"));
			dataItem.setFeedback(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].Feedback"));
			dataItem.setTouchType(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchType"));
			dataItem.setSwitchUser(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].SwitchUser"));
			dataItem.setStatus(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].Status"));
			dataItem.setFirstTime(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].FirstTime"));
			dataItem.setFromId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].FromId"));
			dataItem.setQueueId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].QueueId"));
			dataItem.setTouchTime(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchTime"));
			dataItem.setBuId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].BuId"));
			dataItem.setToId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].ToId"));
			dataItem.setGmtCreate(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].GmtCreate"));
			dataItem.setCloseTime(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].CloseTime"));
			dataItem.setTouchEndReason(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchEndReason"));
			dataItem.setMemberName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].MemberName"));
			dataItem.setServicerId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].ServicerId"));
			dataItem.setChannelType(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ChannelType"));
			dataItem.setTouchContent(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchContent"));

			ExtAttrs extAttrs = new ExtAttrs();
			extAttrs.setEvaluationScore(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationScore"));
			extAttrs.setOnlineJoinRespInterval(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.OnlineJoinRespInterval"));
			extAttrs.setOnlineSessionSource(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.OnlineSessionSource"));
			extAttrs.setEvaluationStatus(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationStatus"));
			extAttrs.setEvaluationLevel(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationLevel"));
			extAttrs.setEvaluationSolution(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationSolution"));
			dataItem.setExtAttrs(extAttrs);

			data.add(dataItem);
		}
		resultData.setData(data);
		queryTouchListResponse.setResultData(resultData);
	 
	 	return queryTouchListResponse;
	}
}