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
		resultData.setTotalResults(_ctx.integerValue("QueryTouchListResponse.ResultData.TotalResults"));
		resultData.setPreviousPage(_ctx.integerValue("QueryTouchListResponse.ResultData.PreviousPage"));
		resultData.setTotalPage(_ctx.integerValue("QueryTouchListResponse.ResultData.TotalPage"));
		resultData.setNextPage(_ctx.integerValue("QueryTouchListResponse.ResultData.NextPage"));
		resultData.setOnePageSize(_ctx.integerValue("QueryTouchListResponse.ResultData.OnePageSize"));
		resultData.setCurrentPage(_ctx.integerValue("QueryTouchListResponse.ResultData.CurrentPage"));
		resultData.setEmpty(_ctx.booleanValue("QueryTouchListResponse.ResultData.Empty"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTouchListResponse.ResultData.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setToId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ToId"));
			dataItem.setQueueId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].QueueId"));
			dataItem.setGmtModified(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].GmtModified"));
			dataItem.setTouchTime(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchTime"));
			dataItem.setParentTouchId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ParentTouchId"));
			dataItem.setMemberName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].MemberName"));
			dataItem.setChannelType(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ChannelType"));
			dataItem.setFeedback(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].Feedback"));
			dataItem.setSwitchUser(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].SwitchUser"));
			dataItem.setTouchEndReason(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchEndReason"));
			dataItem.setCloseTime(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].CloseTime"));
			dataItem.setChannelId(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].ChannelId"));
			dataItem.setMemberId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].MemberId"));
			dataItem.setBuId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].BuId"));
			dataItem.setTouchContent(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchContent"));
			dataItem.setTouchId(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchId"));
			dataItem.setServicerId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ServicerId"));
			dataItem.setGmtCreate(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].GmtCreate"));
			dataItem.setFromId(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].FromId"));
			dataItem.setFirstTime(_ctx.longValue("QueryTouchListResponse.ResultData.Data["+ i +"].FirstTime"));
			dataItem.setUserTouchId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].UserTouchId"));
			dataItem.setTouchType(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].TouchType"));
			dataItem.setServicerName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].ServicerName"));
			dataItem.setDepId(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].DepId"));
			dataItem.setCommonQueueName(_ctx.stringValue("QueryTouchListResponse.ResultData.Data["+ i +"].CommonQueueName"));
			dataItem.setStatus(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].Status"));

			ExtAttrs extAttrs = new ExtAttrs();
			extAttrs.setEvaluationSolution(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationSolution"));
			extAttrs.setEvaluationScore(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationScore"));
			extAttrs.setOnlineSessionSource(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.OnlineSessionSource"));
			extAttrs.setEvaluationLevel(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationLevel"));
			extAttrs.setEvaluationStatus(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.EvaluationStatus"));
			extAttrs.setOnlineJoinRespInterval(_ctx.integerValue("QueryTouchListResponse.ResultData.Data["+ i +"].ExtAttrs.OnlineJoinRespInterval"));
			dataItem.setExtAttrs(extAttrs);

			data.add(dataItem);
		}
		resultData.setData(data);
		queryTouchListResponse.setResultData(resultData);
	 
	 	return queryTouchListResponse;
	}
}