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

import com.aliyuncs.itag.model.v20210517.UpdateMarkResultByAdminResponse;
import com.aliyuncs.itag.model.v20210517.UpdateMarkResultByAdminResponse.Result;
import com.aliyuncs.itag.model.v20210517.UpdateMarkResultByAdminResponse.Result.FailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMarkResultByAdminResponseUnmarshaller {

	public static UpdateMarkResultByAdminResponse unmarshall(UpdateMarkResultByAdminResponse updateMarkResultByAdminResponse, UnmarshallerContext _ctx) {
		
		updateMarkResultByAdminResponse.setRequestId(_ctx.stringValue("UpdateMarkResultByAdminResponse.RequestId"));
		updateMarkResultByAdminResponse.setCode(_ctx.stringValue("UpdateMarkResultByAdminResponse.Code"));
		updateMarkResultByAdminResponse.setErrInfo(_ctx.stringValue("UpdateMarkResultByAdminResponse.ErrInfo"));
		updateMarkResultByAdminResponse.setMsg(_ctx.stringValue("UpdateMarkResultByAdminResponse.Msg"));
		updateMarkResultByAdminResponse.setSucc(_ctx.booleanValue("UpdateMarkResultByAdminResponse.Succ"));
		updateMarkResultByAdminResponse.setErrorCode(_ctx.stringValue("UpdateMarkResultByAdminResponse.ErrorCode"));

		Result result = new Result();
		result.setCanCommit(_ctx.booleanValue("UpdateMarkResultByAdminResponse.Result.CanCommit"));
		result.setCommitMsg(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.CommitMsg"));
		result.setAllUpdateSucc(_ctx.booleanValue("UpdateMarkResultByAdminResponse.Result.AllUpdateSucc"));

		List<FailListItem> failList = new ArrayList<FailListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMarkResultByAdminResponse.Result.FailList.Length"); i++) {
			FailListItem failListItem = new FailListItem();
			failListItem.setMarkResultId(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].MarkResultId"));
			failListItem.setQuestionId(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].QuestionId"));
			failListItem.setMarkResult(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].MarkResult"));
			failListItem.setQuestionTitle(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].QuestionTitle"));
			failListItem.setQuestionType(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].QuestionType"));
			failListItem.setVersion(_ctx.stringValue("UpdateMarkResultByAdminResponse.Result.FailList["+ i +"].Version"));

			failList.add(failListItem);
		}
		result.setFailList(failList);
		updateMarkResultByAdminResponse.setResult(result);
	 
	 	return updateMarkResultByAdminResponse;
	}
}