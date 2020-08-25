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

import com.aliyuncs.sofa.model.v20190815.ResolveLinkeLinktImportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResolveLinkeLinktImportResponseUnmarshaller {

	public static ResolveLinkeLinktImportResponse unmarshall(ResolveLinkeLinktImportResponse resolveLinkeLinktImportResponse, UnmarshallerContext _ctx) {
		
		resolveLinkeLinktImportResponse.setRequestId(_ctx.stringValue("ResolveLinkeLinktImportResponse.RequestId"));
		resolveLinkeLinktImportResponse.setResultCode(_ctx.stringValue("ResolveLinkeLinktImportResponse.ResultCode"));
		resolveLinkeLinktImportResponse.setResultMessage(_ctx.stringValue("ResolveLinkeLinktImportResponse.ResultMessage"));
		resolveLinkeLinktImportResponse.setData(_ctx.stringValue("ResolveLinkeLinktImportResponse.Data"));
		resolveLinkeLinktImportResponse.setErrorCode(_ctx.longValue("ResolveLinkeLinktImportResponse.ErrorCode"));
		resolveLinkeLinktImportResponse.setErrorMessage(_ctx.stringValue("ResolveLinkeLinktImportResponse.ErrorMessage"));
		resolveLinkeLinktImportResponse.setResponseStatusCode(_ctx.longValue("ResolveLinkeLinktImportResponse.ResponseStatusCode"));
		resolveLinkeLinktImportResponse.setSuccess(_ctx.booleanValue("ResolveLinkeLinktImportResponse.Success"));
	 
	 	return resolveLinkeLinktImportResponse;
	}
}