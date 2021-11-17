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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryTeleprompterDisplayStatusResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryTeleprompterDisplayStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTeleprompterDisplayStatusResponseUnmarshaller {

	public static QueryTeleprompterDisplayStatusResponse unmarshall(QueryTeleprompterDisplayStatusResponse queryTeleprompterDisplayStatusResponse, UnmarshallerContext _ctx) {
		
		queryTeleprompterDisplayStatusResponse.setRequestId(_ctx.stringValue("QueryTeleprompterDisplayStatusResponse.RequestId"));
		queryTeleprompterDisplayStatusResponse.setErrorMessage(_ctx.stringValue("QueryTeleprompterDisplayStatusResponse.ErrorMessage"));
		queryTeleprompterDisplayStatusResponse.setSuccess(_ctx.booleanValue("QueryTeleprompterDisplayStatusResponse.Success"));
		queryTeleprompterDisplayStatusResponse.setErrorCode(_ctx.stringValue("QueryTeleprompterDisplayStatusResponse.ErrorCode"));

		Data data = new Data();
		data.setDisplay(_ctx.booleanValue("QueryTeleprompterDisplayStatusResponse.Data.Display"));
		queryTeleprompterDisplayStatusResponse.setData(data);
	 
	 	return queryTeleprompterDisplayStatusResponse;
	}
}