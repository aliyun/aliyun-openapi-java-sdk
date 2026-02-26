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

import com.aliyuncs.itag.model.v20210517.UpdateMarkResultResponse;
import com.aliyuncs.itag.model.v20210517.UpdateMarkResultResponse.Result;
import com.aliyuncs.itag.model.v20210517.UpdateMarkResultResponse.Result.FailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMarkResultResponseUnmarshaller {

	public static UpdateMarkResultResponse unmarshall(UpdateMarkResultResponse updateMarkResultResponse, UnmarshallerContext _ctx) {
		
		updateMarkResultResponse.setRequestId(_ctx.stringValue("UpdateMarkResultResponse.RequestId"));
		updateMarkResultResponse.setCode(_ctx.stringValue("UpdateMarkResultResponse.Code"));
		updateMarkResultResponse.setErrInfo(_ctx.stringValue("UpdateMarkResultResponse.ErrInfo"));
		updateMarkResultResponse.setMsg(_ctx.stringValue("UpdateMarkResultResponse.Msg"));
		updateMarkResultResponse.setSucc(_ctx.booleanValue("UpdateMarkResultResponse.Succ"));
		updateMarkResultResponse.setErrorCode(_ctx.stringValue("UpdateMarkResultResponse.ErrorCode"));

		Result result = new Result();
		result.setCanCommit(_ctx.booleanValue("UpdateMarkResultResponse.Result.CanCommit"));
		result.setCommitMsg(_ctx.stringValue("UpdateMarkResultResponse.Result.CommitMsg"));
		result.setAllUpdateSucc(_ctx.booleanValue("UpdateMarkResultResponse.Result.AllUpdateSucc"));

		List<FailListItem> failList = new ArrayList<FailListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMarkResultResponse.Result.FailList.Length"); i++) {
			FailListItem failListItem = new FailListItem();
			failListItem.setMarkResultId(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].MarkResultId"));
			failListItem.setQuestionId(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].QuestionId"));
			failListItem.setMarkResult(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].MarkResult"));
			failListItem.setQuestionTitle(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].QuestionTitle"));
			failListItem.setQuestionType(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].QuestionType"));
			failListItem.setVersion(_ctx.stringValue("UpdateMarkResultResponse.Result.FailList["+ i +"].Version"));

			failList.add(failListItem);
		}
		result.setFailList(failList);
		updateMarkResultResponse.setResult(result);
	 
	 	return updateMarkResultResponse;
	}
}