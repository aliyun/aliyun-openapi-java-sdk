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

import com.aliyuncs.itag.model.v20210517.DownloadIntPersonSummaryResponse;
import com.aliyuncs.itag.model.v20210517.DownloadIntPersonSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadIntPersonSummaryResponseUnmarshaller {

	public static DownloadIntPersonSummaryResponse unmarshall(DownloadIntPersonSummaryResponse downloadIntPersonSummaryResponse, UnmarshallerContext _ctx) {
		
		downloadIntPersonSummaryResponse.setRequestId(_ctx.stringValue("DownloadIntPersonSummaryResponse.RequestId"));
		downloadIntPersonSummaryResponse.setCode(_ctx.integerValue("DownloadIntPersonSummaryResponse.Code"));
		downloadIntPersonSummaryResponse.setMsg(_ctx.stringValue("DownloadIntPersonSummaryResponse.Msg"));
		downloadIntPersonSummaryResponse.setErrInfo(_ctx.stringValue("DownloadIntPersonSummaryResponse.ErrInfo"));
		downloadIntPersonSummaryResponse.setSucc(_ctx.booleanValue("DownloadIntPersonSummaryResponse.Succ"));
		downloadIntPersonSummaryResponse.setRt(_ctx.longValue("DownloadIntPersonSummaryResponse.Rt"));
		downloadIntPersonSummaryResponse.setHost(_ctx.stringValue("DownloadIntPersonSummaryResponse.Host"));
		downloadIntPersonSummaryResponse.setErrorCode(_ctx.stringValue("DownloadIntPersonSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setDownloadURL(_ctx.stringValue("DownloadIntPersonSummaryResponse.Result.DownloadURL"));
		downloadIntPersonSummaryResponse.setResult(result);
	 
	 	return downloadIntPersonSummaryResponse;
	}
}