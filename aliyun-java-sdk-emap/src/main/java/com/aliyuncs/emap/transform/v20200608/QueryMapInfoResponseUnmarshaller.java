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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.QueryMapInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMapInfoResponseUnmarshaller {

	public static QueryMapInfoResponse unmarshall(QueryMapInfoResponse queryMapInfoResponse, UnmarshallerContext _ctx) {
		
		queryMapInfoResponse.setRequestId(_ctx.stringValue("QueryMapInfoResponse.RequestId"));
		queryMapInfoResponse.setMessage(_ctx.stringValue("QueryMapInfoResponse.Message"));
		queryMapInfoResponse.setRenderData(_ctx.stringValue("QueryMapInfoResponse.RenderData"));
		queryMapInfoResponse.setErrorCode(_ctx.stringValue("QueryMapInfoResponse.ErrorCode"));
		queryMapInfoResponse.setErrorMessage(_ctx.stringValue("QueryMapInfoResponse.ErrorMessage"));
		queryMapInfoResponse.setDynamicMessage(_ctx.stringValue("QueryMapInfoResponse.DynamicMessage"));
		queryMapInfoResponse.setSuccess(_ctx.booleanValue("QueryMapInfoResponse.Success"));
		queryMapInfoResponse.setDynamicCode(_ctx.stringValue("QueryMapInfoResponse.DynamicCode"));
		queryMapInfoResponse.setCode(_ctx.stringValue("QueryMapInfoResponse.Code"));
	 
	 	return queryMapInfoResponse;
	}
}