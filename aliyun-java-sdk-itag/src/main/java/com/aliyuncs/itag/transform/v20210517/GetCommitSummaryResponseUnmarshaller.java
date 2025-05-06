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

import com.aliyuncs.itag.model.v20210517.GetCommitSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetCommitSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCommitSummaryResponseUnmarshaller {

	public static GetCommitSummaryResponse unmarshall(GetCommitSummaryResponse getCommitSummaryResponse, UnmarshallerContext _ctx) {
		
		getCommitSummaryResponse.setRequestId(_ctx.stringValue("GetCommitSummaryResponse.RequestId"));
		getCommitSummaryResponse.setCode(_ctx.integerValue("GetCommitSummaryResponse.Code"));
		getCommitSummaryResponse.setMsg(_ctx.stringValue("GetCommitSummaryResponse.Msg"));
		getCommitSummaryResponse.setErrInfo(_ctx.stringValue("GetCommitSummaryResponse.ErrInfo"));
		getCommitSummaryResponse.setSucc(_ctx.booleanValue("GetCommitSummaryResponse.Succ"));
		getCommitSummaryResponse.setRt(_ctx.longValue("GetCommitSummaryResponse.Rt"));
		getCommitSummaryResponse.setHost(_ctx.stringValue("GetCommitSummaryResponse.Host"));
		getCommitSummaryResponse.setErrorCode(_ctx.stringValue("GetCommitSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setCommitItem(_ctx.integerValue("GetCommitSummaryResponse.Result.CommitItem"));
		result.setCommitSubTask(_ctx.integerValue("GetCommitSummaryResponse.Result.CommitSubTask"));
		result.setRejectItem(_ctx.integerValue("GetCommitSummaryResponse.Result.RejectItem"));
		result.setRejectSubTask(_ctx.integerValue("GetCommitSummaryResponse.Result.RejectSubTask"));
		getCommitSummaryResponse.setResult(result);
	 
	 	return getCommitSummaryResponse;
	}
}