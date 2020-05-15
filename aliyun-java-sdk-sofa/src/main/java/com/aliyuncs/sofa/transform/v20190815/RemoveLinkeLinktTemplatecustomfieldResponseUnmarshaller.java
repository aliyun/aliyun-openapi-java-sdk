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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeLinktTemplatecustomfieldResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeLinktTemplatecustomfieldResponseUnmarshaller {

	public static RemoveLinkeLinktTemplatecustomfieldResponse unmarshall(RemoveLinkeLinktTemplatecustomfieldResponse removeLinkeLinktTemplatecustomfieldResponse, UnmarshallerContext _ctx) {
		
		removeLinkeLinktTemplatecustomfieldResponse.setRequestId(_ctx.stringValue("RemoveLinkeLinktTemplatecustomfieldResponse.RequestId"));
		removeLinkeLinktTemplatecustomfieldResponse.setResultCode(_ctx.stringValue("RemoveLinkeLinktTemplatecustomfieldResponse.ResultCode"));
		removeLinkeLinktTemplatecustomfieldResponse.setResultMessage(_ctx.stringValue("RemoveLinkeLinktTemplatecustomfieldResponse.ResultMessage"));
		removeLinkeLinktTemplatecustomfieldResponse.setData(_ctx.booleanValue("RemoveLinkeLinktTemplatecustomfieldResponse.Data"));
		removeLinkeLinktTemplatecustomfieldResponse.setErrorCode(_ctx.longValue("RemoveLinkeLinktTemplatecustomfieldResponse.ErrorCode"));
		removeLinkeLinktTemplatecustomfieldResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeLinktTemplatecustomfieldResponse.ErrorMessage"));
		removeLinkeLinktTemplatecustomfieldResponse.setSuccess(_ctx.booleanValue("RemoveLinkeLinktTemplatecustomfieldResponse.Success"));
	 
	 	return removeLinkeLinktTemplatecustomfieldResponse;
	}
}