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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.ImportSpecialPersonnelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportSpecialPersonnelResponseUnmarshaller {

	public static ImportSpecialPersonnelResponse unmarshall(ImportSpecialPersonnelResponse importSpecialPersonnelResponse, UnmarshallerContext _ctx) {
		
		importSpecialPersonnelResponse.setRequestId(_ctx.stringValue("ImportSpecialPersonnelResponse.RequestId"));
		importSpecialPersonnelResponse.setErrorCode(_ctx.stringValue("ImportSpecialPersonnelResponse.ErrorCode"));
		importSpecialPersonnelResponse.setErrorMessage(_ctx.stringValue("ImportSpecialPersonnelResponse.ErrorMessage"));
		importSpecialPersonnelResponse.setPageNumber(_ctx.integerValue("ImportSpecialPersonnelResponse.PageNumber"));
		importSpecialPersonnelResponse.setMessage(_ctx.stringValue("ImportSpecialPersonnelResponse.Message"));
		importSpecialPersonnelResponse.setCode(_ctx.stringValue("ImportSpecialPersonnelResponse.Code"));
		importSpecialPersonnelResponse.setTotalCount(_ctx.longValue("ImportSpecialPersonnelResponse.TotalCount"));
		importSpecialPersonnelResponse.setDynamicCode(_ctx.stringValue("ImportSpecialPersonnelResponse.DynamicCode"));
		importSpecialPersonnelResponse.setPageSize(_ctx.integerValue("ImportSpecialPersonnelResponse.PageSize"));
		importSpecialPersonnelResponse.setSuccess(_ctx.booleanValue("ImportSpecialPersonnelResponse.Success"));
		importSpecialPersonnelResponse.setDynamicMessage(_ctx.stringValue("ImportSpecialPersonnelResponse.DynamicMessage"));
	 
	 	return importSpecialPersonnelResponse;
	}
}