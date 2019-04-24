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

package com.aliyuncs.youhui_inner.transform.v20160928;

import com.aliyuncs.youhui_inner.model.v20160928.ModifyYouhuiTemplateStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyYouhuiTemplateStatusResponseUnmarshaller {

	public static ModifyYouhuiTemplateStatusResponse unmarshall(ModifyYouhuiTemplateStatusResponse modifyYouhuiTemplateStatusResponse, UnmarshallerContext context) {
		
		modifyYouhuiTemplateStatusResponse.setRequestId(context.stringValue("ModifyYouhuiTemplateStatusResponse.RequestId"));
		modifyYouhuiTemplateStatusResponse.setYhRequestId(context.stringValue("ModifyYouhuiTemplateStatusResponse.YhRequestId"));
		modifyYouhuiTemplateStatusResponse.setSuccess(context.booleanValue("ModifyYouhuiTemplateStatusResponse.Success"));
		modifyYouhuiTemplateStatusResponse.setCode(context.stringValue("ModifyYouhuiTemplateStatusResponse.Code"));
		modifyYouhuiTemplateStatusResponse.setMessage(context.stringValue("ModifyYouhuiTemplateStatusResponse.Message"));
		modifyYouhuiTemplateStatusResponse.setResult(context.booleanValue("ModifyYouhuiTemplateStatusResponse.Result"));
	 
	 	return modifyYouhuiTemplateStatusResponse;
	}
}