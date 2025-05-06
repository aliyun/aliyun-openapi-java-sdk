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

import com.aliyuncs.itag.model.v20210517.AbandonItemByAdminResponse;
import com.aliyuncs.itag.model.v20210517.AbandonItemByAdminResponse.Result;
import com.aliyuncs.itag.model.v20210517.AbandonItemByAdminResponse.Result.FailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbandonItemByAdminResponseUnmarshaller {

	public static AbandonItemByAdminResponse unmarshall(AbandonItemByAdminResponse abandonItemByAdminResponse, UnmarshallerContext _ctx) {
		
		abandonItemByAdminResponse.setRequestId(_ctx.stringValue("AbandonItemByAdminResponse.RequestId"));
		abandonItemByAdminResponse.setCode(_ctx.stringValue("AbandonItemByAdminResponse.Code"));
		abandonItemByAdminResponse.setErrInfo(_ctx.stringValue("AbandonItemByAdminResponse.ErrInfo"));
		abandonItemByAdminResponse.setMsg(_ctx.stringValue("AbandonItemByAdminResponse.Msg"));
		abandonItemByAdminResponse.setSucc(_ctx.booleanValue("AbandonItemByAdminResponse.Succ"));
		abandonItemByAdminResponse.setErrorCode(_ctx.stringValue("AbandonItemByAdminResponse.ErrorCode"));

		Result result = new Result();
		result.setCanCommit(_ctx.booleanValue("AbandonItemByAdminResponse.Result.CanCommit"));
		result.setCommitMsg(_ctx.stringValue("AbandonItemByAdminResponse.Result.CommitMsg"));
		result.setAllUpdateSucc(_ctx.booleanValue("AbandonItemByAdminResponse.Result.AllUpdateSucc"));

		List<FailListItem> failList = new ArrayList<FailListItem>();
		for (int i = 0; i < _ctx.lengthValue("AbandonItemByAdminResponse.Result.FailList.Length"); i++) {
			FailListItem failListItem = new FailListItem();
			failListItem.setMarkResultId(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].MarkResultId"));
			failListItem.setQuestionId(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].QuestionId"));
			failListItem.setMarkResult(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].MarkResult"));
			failListItem.setQuestionTitle(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].QuestionTitle"));
			failListItem.setQuestionType(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].QuestionType"));
			failListItem.setVersion(_ctx.stringValue("AbandonItemByAdminResponse.Result.FailList["+ i +"].Version"));

			failList.add(failListItem);
		}
		result.setFailList(failList);
		abandonItemByAdminResponse.setResult(result);
	 
	 	return abandonItemByAdminResponse;
	}
}