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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectSQLFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCorrectSQLFileResponseUnmarshaller {

	public static GetDataCorrectSQLFileResponse unmarshall(GetDataCorrectSQLFileResponse getDataCorrectSQLFileResponse, UnmarshallerContext _ctx) {
		
		getDataCorrectSQLFileResponse.setRequestId(_ctx.stringValue("GetDataCorrectSQLFileResponse.RequestId"));
		getDataCorrectSQLFileResponse.setFileUrl(_ctx.stringValue("GetDataCorrectSQLFileResponse.FileUrl"));
		getDataCorrectSQLFileResponse.setErrorCode(_ctx.stringValue("GetDataCorrectSQLFileResponse.ErrorCode"));
		getDataCorrectSQLFileResponse.setErrorMessage(_ctx.stringValue("GetDataCorrectSQLFileResponse.ErrorMessage"));
		getDataCorrectSQLFileResponse.setSuccess(_ctx.booleanValue("GetDataCorrectSQLFileResponse.Success"));
	 
	 	return getDataCorrectSQLFileResponse;
	}
}