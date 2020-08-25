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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktImporttemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktImporttemplateResponseUnmarshaller {

	public static CreateLinkeLinktImporttemplateResponse unmarshall(CreateLinkeLinktImporttemplateResponse createLinkeLinktImporttemplateResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktImporttemplateResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktImporttemplateResponse.RequestId"));
		createLinkeLinktImporttemplateResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktImporttemplateResponse.ResultCode"));
		createLinkeLinktImporttemplateResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktImporttemplateResponse.ResultMessage"));
		createLinkeLinktImporttemplateResponse.setData(_ctx.stringValue("CreateLinkeLinktImporttemplateResponse.Data"));
		createLinkeLinktImporttemplateResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktImporttemplateResponse.ErrorCode"));
		createLinkeLinktImporttemplateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktImporttemplateResponse.ErrorMessage"));
		createLinkeLinktImporttemplateResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktImporttemplateResponse.ResponseStatusCode"));
		createLinkeLinktImporttemplateResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktImporttemplateResponse.Success"));
	 
	 	return createLinkeLinktImporttemplateResponse;
	}
}