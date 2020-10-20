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

package com.aliyuncs.emap.transform.v20201010;

import com.aliyuncs.emap.model.v20201010.QueryMapInfoOpenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMapInfoOpenResponseUnmarshaller {

	public static QueryMapInfoOpenResponse unmarshall(QueryMapInfoOpenResponse queryMapInfoOpenResponse, UnmarshallerContext _ctx) {
		
		queryMapInfoOpenResponse.setRequestId(_ctx.stringValue("QueryMapInfoOpenResponse.RequestId"));
		queryMapInfoOpenResponse.setMessage(_ctx.stringValue("QueryMapInfoOpenResponse.Message"));
		queryMapInfoOpenResponse.setRenderData(_ctx.stringValue("QueryMapInfoOpenResponse.RenderData"));
		queryMapInfoOpenResponse.setErrorCode(_ctx.stringValue("QueryMapInfoOpenResponse.ErrorCode"));
		queryMapInfoOpenResponse.setErrorMessage(_ctx.stringValue("QueryMapInfoOpenResponse.ErrorMessage"));
		queryMapInfoOpenResponse.setDynamicMessage(_ctx.stringValue("QueryMapInfoOpenResponse.DynamicMessage"));
		queryMapInfoOpenResponse.setSuccess(_ctx.booleanValue("QueryMapInfoOpenResponse.Success"));
		queryMapInfoOpenResponse.setDynamicCode(_ctx.stringValue("QueryMapInfoOpenResponse.DynamicCode"));
		queryMapInfoOpenResponse.setCode(_ctx.stringValue("QueryMapInfoOpenResponse.Code"));
	 
	 	return queryMapInfoOpenResponse;
	}
}