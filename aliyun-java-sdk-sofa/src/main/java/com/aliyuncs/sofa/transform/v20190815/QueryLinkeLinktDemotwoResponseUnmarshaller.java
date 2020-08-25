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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktDemotwoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktDemotwoResponseUnmarshaller {

	public static QueryLinkeLinktDemotwoResponse unmarshall(QueryLinkeLinktDemotwoResponse queryLinkeLinktDemotwoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktDemotwoResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktDemotwoResponse.RequestId"));
		queryLinkeLinktDemotwoResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktDemotwoResponse.ResultCode"));
		queryLinkeLinktDemotwoResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktDemotwoResponse.ResultMessage"));
		queryLinkeLinktDemotwoResponse.setData(_ctx.stringValue("QueryLinkeLinktDemotwoResponse.Data"));
		queryLinkeLinktDemotwoResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktDemotwoResponse.ErrorCode"));
		queryLinkeLinktDemotwoResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktDemotwoResponse.ErrorMessage"));
		queryLinkeLinktDemotwoResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktDemotwoResponse.Success"));
	 
	 	return queryLinkeLinktDemotwoResponse;
	}
}