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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.MsgInfo;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result.MarkResultListItem;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result.MarkResultListItem.Progress;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result.VoteInfoListItem;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result.VoteInfoListItem.MarkResultListItem2;
import com.aliyuncs.itag.model.v20210517.GetUserMarkItemInfoResponse.Result.VoteInfoListItem.MarkResultListItem2.Progress3;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserMarkItemInfoResponseUnmarshaller {

	public static GetUserMarkItemInfoResponse unmarshall(GetUserMarkItemInfoResponse getUserMarkItemInfoResponse, UnmarshallerContext _ctx) {
		
		getUserMarkItemInfoResponse.setRequestId(_ctx.stringValue("GetUserMarkItemInfoResponse.RequestId"));
		getUserMarkItemInfoResponse.setCode(_ctx.integerValue("GetUserMarkItemInfoResponse.Code"));
		getUserMarkItemInfoResponse.setMsg(_ctx.stringValue("GetUserMarkItemInfoResponse.Msg"));
		getUserMarkItemInfoResponse.setSucc(_ctx.booleanValue("GetUserMarkItemInfoResponse.Succ"));
		getUserMarkItemInfoResponse.setRt(_ctx.longValue("GetUserMarkItemInfoResponse.Rt"));
		getUserMarkItemInfoResponse.setHost(_ctx.stringValue("GetUserMarkItemInfoResponse.Host"));
		getUserMarkItemInfoResponse.setTraceId(_ctx.stringValue("GetUserMarkItemInfoResponse.TraceId"));
		getUserMarkItemInfoResponse.setErrorCode(_ctx.stringValue("GetUserMarkItemInfoResponse.ErrorCode"));

		MsgInfo msgInfo = new MsgInfo();
		msgInfo.setMsg(_ctx.stringValue("GetUserMarkItemInfoResponse.MsgInfo.Msg"));
		msgInfo.setMsgCn(_ctx.stringValue("GetUserMarkItemInfoResponse.MsgInfo.MsgCn"));
		getUserMarkItemInfoResponse.setMsgInfo(msgInfo);

		Result result = new Result();
		result.setUserMarkItemId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.UserMarkItemId"));
		result.setConfirmRange(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.ConfirmRange"));
		result.setIsConfirmed(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.IsConfirmed"));
		result.setNeedConfirm(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.NeedConfirm"));
		result.setFeedbackRemark(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.FeedbackRemark"));
		result.setFeedbackFlag(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.FeedbackFlag"));
		result.setOperator(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.Operator"));
		result.setIsVoteEqual(_ctx.booleanValue("GetUserMarkItemInfoResponse.Result.IsVoteEqual"));
		result.setMarkItemId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkItemId"));
		result.setDataId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.DataId"));
		result.setDatasetId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.DatasetId"));
		result.setState(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.State"));
		result.setMine(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.Mine"));
		result.setSubTaskId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.SubTaskId"));
		result.setRejectFlag(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.RejectFlag"));
		result.setFixedFlag(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.FixedFlag"));
		result.setAbandonFlag(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.AbandonFlag"));
		result.setAbandonRemark(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.AbandonRemark"));
		result.setWeight(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.Weight"));
		result.setDataMeta(_ctx.mapValue("GetUserMarkItemInfoResponse.Result.DataMeta"));

		List<MarkResultListItem> markResultList = new ArrayList<MarkResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserMarkItemInfoResponse.Result.MarkResultList.Length"); i++) {
			MarkResultListItem markResultListItem = new MarkResultListItem();
			markResultListItem.setUserMarkResultId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].UserMarkResultId"));
			markResultListItem.setIsNeedVoteJudge(_ctx.booleanValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].IsNeedVoteJudge"));
			markResultListItem.setMarkResultId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].MarkResultId"));
			markResultListItem.setMarkTitle(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].MarkTitle"));
			markResultListItem.setMarkResult(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].MarkResult"));
			markResultListItem.setQuestionId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].QuestionId"));
			markResultListItem.setResultType(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].ResultType"));
			markResultListItem.setVersion(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].Version"));
			markResultListItem.setMarkTime(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].MarkTime"));

			Progress progress = new Progress();
			progress.setTotal(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].Progress.Total"));
			progress.setFinished(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.MarkResultList["+ i +"].Progress.Finished"));
			markResultListItem.setProgress(progress);

			markResultList.add(markResultListItem);
		}
		result.setMarkResultList(markResultList);

		List<VoteInfoListItem> voteInfoList = new ArrayList<VoteInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserMarkItemInfoResponse.Result.VoteInfoList.Length"); i++) {
			VoteInfoListItem voteInfoListItem = new VoteInfoListItem();
			voteInfoListItem.setUserId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].UserId"));
			voteInfoListItem.setUserName(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].UserName"));
			voteInfoListItem.setWorkFlow(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].WorkFlow"));
			voteInfoListItem.setUserMarkItemId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].UserMarkItemId"));
			voteInfoListItem.setIsAccept(_ctx.booleanValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].IsAccept"));

			List<MarkResultListItem2> markResultList1 = new ArrayList<MarkResultListItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList.Length"); j++) {
				MarkResultListItem2 markResultListItem2 = new MarkResultListItem2();
				markResultListItem2.setUserMarkResultId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].UserMarkResultId"));
				markResultListItem2.setIsNeedVoteJudge(_ctx.booleanValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].IsNeedVoteJudge"));
				markResultListItem2.setMarkResultId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].MarkResultId"));
				markResultListItem2.setMarkTitle(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].MarkTitle"));
				markResultListItem2.setMarkResult(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].MarkResult"));
				markResultListItem2.setQuestionId(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].QuestionId"));
				markResultListItem2.setResultType(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].ResultType"));
				markResultListItem2.setVersion(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].Version"));
				markResultListItem2.setMarkTime(_ctx.stringValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].MarkTime"));

				Progress3 progress3 = new Progress3();
				progress3.setTotal(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].Progress.Total"));
				progress3.setFinished(_ctx.integerValue("GetUserMarkItemInfoResponse.Result.VoteInfoList["+ i +"].MarkResultList["+ j +"].Progress.Finished"));
				markResultListItem2.setProgress3(progress3);

				markResultList1.add(markResultListItem2);
			}
			voteInfoListItem.setMarkResultList1(markResultList1);

			voteInfoList.add(voteInfoListItem);
		}
		result.setVoteInfoList(voteInfoList);
		getUserMarkItemInfoResponse.setResult(result);
	 
	 	return getUserMarkItemInfoResponse;
	}
}