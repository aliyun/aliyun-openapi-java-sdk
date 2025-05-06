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

import com.aliyuncs.itag.model.v20210517.GetHistoryMarkResultResponse;
import com.aliyuncs.itag.model.v20210517.GetHistoryMarkResultResponse.ResultItem;
import com.aliyuncs.itag.model.v20210517.GetHistoryMarkResultResponse.ResultItem.UserMarkResult;
import com.aliyuncs.itag.model.v20210517.GetHistoryMarkResultResponse.ResultItem.UserMarkResult.Progress;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoryMarkResultResponseUnmarshaller {

	public static GetHistoryMarkResultResponse unmarshall(GetHistoryMarkResultResponse getHistoryMarkResultResponse, UnmarshallerContext _ctx) {
		
		getHistoryMarkResultResponse.setRequestId(_ctx.stringValue("GetHistoryMarkResultResponse.RequestId"));
		getHistoryMarkResultResponse.setCode(_ctx.integerValue("GetHistoryMarkResultResponse.Code"));
		getHistoryMarkResultResponse.setMsg(_ctx.stringValue("GetHistoryMarkResultResponse.Msg"));
		getHistoryMarkResultResponse.setErrInfo(_ctx.stringValue("GetHistoryMarkResultResponse.ErrInfo"));
		getHistoryMarkResultResponse.setSucc(_ctx.booleanValue("GetHistoryMarkResultResponse.Succ"));
		getHistoryMarkResultResponse.setRt(_ctx.longValue("GetHistoryMarkResultResponse.Rt"));
		getHistoryMarkResultResponse.setHost(_ctx.stringValue("GetHistoryMarkResultResponse.Host"));
		getHistoryMarkResultResponse.setErrorCode(_ctx.stringValue("GetHistoryMarkResultResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHistoryMarkResultResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setWorkNode(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].WorkNode"));
			resultItem.setAccountNo(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].AccountNo"));
			resultItem.setName(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].Name"));

			List<UserMarkResult> userMarkResults = new ArrayList<UserMarkResult>();
			for (int j = 0; j < _ctx.lengthValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults.Length"); j++) {
				UserMarkResult userMarkResult = new UserMarkResult();
				userMarkResult.setMarkResultId(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].MarkResultId"));
				userMarkResult.setMarkTitle(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].MarkTitle"));
				userMarkResult.setMarkResult(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].MarkResult"));
				userMarkResult.setQuestionId(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].QuestionId"));
				userMarkResult.setResultType(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].ResultType"));
				userMarkResult.setVersion(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].Version"));
				userMarkResult.setMarkTime(_ctx.stringValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].MarkTime"));

				Progress progress = new Progress();
				progress.setTotal(_ctx.integerValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].Progress.Total"));
				progress.setFinished(_ctx.integerValue("GetHistoryMarkResultResponse.Result["+ i +"].UserMarkResults["+ j +"].Progress.Finished"));
				userMarkResult.setProgress(progress);

				userMarkResults.add(userMarkResult);
			}
			resultItem.setUserMarkResults(userMarkResults);

			result.add(resultItem);
		}
		getHistoryMarkResultResponse.setResult(result);
	 
	 	return getHistoryMarkResultResponse;
	}
}