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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktImportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktImportResponseUnmarshaller {

	public static ExecLinkeLinktImportResponse unmarshall(ExecLinkeLinktImportResponse execLinkeLinktImportResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktImportResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktImportResponse.RequestId"));
		execLinkeLinktImportResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktImportResponse.ResultCode"));
		execLinkeLinktImportResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktImportResponse.ResultMessage"));
		execLinkeLinktImportResponse.setData(_ctx.stringValue("ExecLinkeLinktImportResponse.Data"));
		execLinkeLinktImportResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktImportResponse.ErrorCode"));
		execLinkeLinktImportResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktImportResponse.ErrorMessage"));
		execLinkeLinktImportResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktImportResponse.ResponseStatusCode"));
		execLinkeLinktImportResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktImportResponse.Success"));
	 
	 	return execLinkeLinktImportResponse;
	}
}