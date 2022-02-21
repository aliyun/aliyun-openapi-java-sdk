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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetCaseFileUploadUrlResponse;
import com.aliyuncs.ccc.model.v20200701.GetCaseFileUploadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCaseFileUploadUrlResponseUnmarshaller {

	public static GetCaseFileUploadUrlResponse unmarshall(GetCaseFileUploadUrlResponse getCaseFileUploadUrlResponse, UnmarshallerContext _ctx) {
		
		getCaseFileUploadUrlResponse.setRequestId(_ctx.stringValue("GetCaseFileUploadUrlResponse.RequestId"));
		getCaseFileUploadUrlResponse.setHttpStatusCode(_ctx.integerValue("GetCaseFileUploadUrlResponse.HttpStatusCode"));
		getCaseFileUploadUrlResponse.setCode(_ctx.stringValue("GetCaseFileUploadUrlResponse.Code"));
		getCaseFileUploadUrlResponse.setMessage(_ctx.stringValue("GetCaseFileUploadUrlResponse.Message"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetCaseFileUploadUrlResponse.Data.Url"));
		data.setCaseFileKey(_ctx.stringValue("GetCaseFileUploadUrlResponse.Data.CaseFileKey"));
		getCaseFileUploadUrlResponse.setData(data);
	 
	 	return getCaseFileUploadUrlResponse;
	}
}