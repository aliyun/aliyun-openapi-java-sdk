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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryScriptResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryScriptResponseUnmarshaller {

	public static QueryScriptResponse unmarshall(QueryScriptResponse queryScriptResponse, UnmarshallerContext _ctx) {
		
		queryScriptResponse.setRequestId(_ctx.stringValue("QueryScriptResponse.RequestId"));
		queryScriptResponse.setData(_ctx.mapValue("QueryScriptResponse.Data"));
		queryScriptResponse.setErrorMessage(_ctx.stringValue("QueryScriptResponse.ErrorMessage"));
		queryScriptResponse.setSuccess(_ctx.booleanValue("QueryScriptResponse.Success"));
		queryScriptResponse.setErrorCode(_ctx.stringValue("QueryScriptResponse.ErrorCode"));
	 
	 	return queryScriptResponse;
	}
}