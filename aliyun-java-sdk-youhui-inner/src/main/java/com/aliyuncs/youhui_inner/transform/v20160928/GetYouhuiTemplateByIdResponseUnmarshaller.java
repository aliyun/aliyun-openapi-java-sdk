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

import com.aliyuncs.youhui_inner.model.v20160928.GetYouhuiTemplateByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetYouhuiTemplateByIdResponseUnmarshaller {

	public static GetYouhuiTemplateByIdResponse unmarshall(GetYouhuiTemplateByIdResponse getYouhuiTemplateByIdResponse, UnmarshallerContext context) {
		
		getYouhuiTemplateByIdResponse.setRequestId(context.stringValue("GetYouhuiTemplateByIdResponse.RequestId"));
		getYouhuiTemplateByIdResponse.setYhRequestId(context.stringValue("GetYouhuiTemplateByIdResponse.YhRequestId"));
		getYouhuiTemplateByIdResponse.setSuccess(context.booleanValue("GetYouhuiTemplateByIdResponse.Success"));
		getYouhuiTemplateByIdResponse.setCode(context.stringValue("GetYouhuiTemplateByIdResponse.Code"));
		getYouhuiTemplateByIdResponse.setMessage(context.stringValue("GetYouhuiTemplateByIdResponse.Message"));
		getYouhuiTemplateByIdResponse.setResult(context.stringValue("GetYouhuiTemplateByIdResponse.Result"));
	 
	 	return getYouhuiTemplateByIdResponse;
	}
}