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

import com.aliyuncs.itag.model.v20210517.DeleteOptionTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteOptionTemplateResponseUnmarshaller {

	public static DeleteOptionTemplateResponse unmarshall(DeleteOptionTemplateResponse deleteOptionTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteOptionTemplateResponse.setRequestId(_ctx.stringValue("DeleteOptionTemplateResponse.RequestId"));
		deleteOptionTemplateResponse.setCode(_ctx.integerValue("DeleteOptionTemplateResponse.Code"));
		deleteOptionTemplateResponse.setMsg(_ctx.stringValue("DeleteOptionTemplateResponse.Msg"));
		deleteOptionTemplateResponse.setErrInfo(_ctx.stringValue("DeleteOptionTemplateResponse.ErrInfo"));
		deleteOptionTemplateResponse.setSucc(_ctx.booleanValue("DeleteOptionTemplateResponse.Succ"));
		deleteOptionTemplateResponse.setResult(_ctx.booleanValue("DeleteOptionTemplateResponse.Result"));
		deleteOptionTemplateResponse.setErrorCode(_ctx.stringValue("DeleteOptionTemplateResponse.ErrorCode"));
	 
	 	return deleteOptionTemplateResponse;
	}
}