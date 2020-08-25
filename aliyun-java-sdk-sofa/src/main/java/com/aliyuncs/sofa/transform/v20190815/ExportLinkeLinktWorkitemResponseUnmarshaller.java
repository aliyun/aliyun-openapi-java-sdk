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

import com.aliyuncs.sofa.model.v20190815.ExportLinkeLinktWorkitemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportLinkeLinktWorkitemResponseUnmarshaller {

	public static ExportLinkeLinktWorkitemResponse unmarshall(ExportLinkeLinktWorkitemResponse exportLinkeLinktWorkitemResponse, UnmarshallerContext _ctx) {
		
		exportLinkeLinktWorkitemResponse.setRequestId(_ctx.stringValue("ExportLinkeLinktWorkitemResponse.RequestId"));
		exportLinkeLinktWorkitemResponse.setResultCode(_ctx.stringValue("ExportLinkeLinktWorkitemResponse.ResultCode"));
		exportLinkeLinktWorkitemResponse.setResultMessage(_ctx.stringValue("ExportLinkeLinktWorkitemResponse.ResultMessage"));
		exportLinkeLinktWorkitemResponse.setData(_ctx.stringValue("ExportLinkeLinktWorkitemResponse.Data"));
		exportLinkeLinktWorkitemResponse.setErrorCode(_ctx.longValue("ExportLinkeLinktWorkitemResponse.ErrorCode"));
		exportLinkeLinktWorkitemResponse.setErrorMessage(_ctx.stringValue("ExportLinkeLinktWorkitemResponse.ErrorMessage"));
		exportLinkeLinktWorkitemResponse.setResponseStatusCode(_ctx.longValue("ExportLinkeLinktWorkitemResponse.ResponseStatusCode"));
		exportLinkeLinktWorkitemResponse.setSuccess(_ctx.booleanValue("ExportLinkeLinktWorkitemResponse.Success"));
	 
	 	return exportLinkeLinktWorkitemResponse;
	}
}