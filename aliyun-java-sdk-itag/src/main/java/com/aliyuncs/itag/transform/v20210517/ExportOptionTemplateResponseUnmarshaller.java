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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.ExportOptionTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportOptionTemplateResponseUnmarshaller {

	public static ExportOptionTemplateResponse unmarshall(ExportOptionTemplateResponse exportOptionTemplateResponse, UnmarshallerContext _ctx) {
		
		exportOptionTemplateResponse.setRequestId(_ctx.stringValue("ExportOptionTemplateResponse.RequestId"));
		exportOptionTemplateResponse.setCode(_ctx.integerValue("ExportOptionTemplateResponse.Code"));
		exportOptionTemplateResponse.setMsg(_ctx.stringValue("ExportOptionTemplateResponse.Msg"));
		exportOptionTemplateResponse.setErrInfo(_ctx.stringValue("ExportOptionTemplateResponse.ErrInfo"));
		exportOptionTemplateResponse.setSucc(_ctx.booleanValue("ExportOptionTemplateResponse.Succ"));
		exportOptionTemplateResponse.setResult(_ctx.stringValue("ExportOptionTemplateResponse.Result"));
		exportOptionTemplateResponse.setErrorCode(_ctx.stringValue("ExportOptionTemplateResponse.ErrorCode"));
	 
	 	return exportOptionTemplateResponse;
	}
}