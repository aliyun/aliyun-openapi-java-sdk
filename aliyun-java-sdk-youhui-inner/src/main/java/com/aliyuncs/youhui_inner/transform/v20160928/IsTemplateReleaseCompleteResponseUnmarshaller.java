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

import com.aliyuncs.youhui_inner.model.v20160928.IsTemplateReleaseCompleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IsTemplateReleaseCompleteResponseUnmarshaller {

	public static IsTemplateReleaseCompleteResponse unmarshall(IsTemplateReleaseCompleteResponse isTemplateReleaseCompleteResponse, UnmarshallerContext context) {
		
		isTemplateReleaseCompleteResponse.setRequestId(context.stringValue("IsTemplateReleaseCompleteResponse.RequestId"));
		isTemplateReleaseCompleteResponse.setYhRequestId(context.stringValue("IsTemplateReleaseCompleteResponse.YhRequestId"));
		isTemplateReleaseCompleteResponse.setSuccess(context.booleanValue("IsTemplateReleaseCompleteResponse.Success"));
		isTemplateReleaseCompleteResponse.setCode(context.stringValue("IsTemplateReleaseCompleteResponse.Code"));
		isTemplateReleaseCompleteResponse.setMessage(context.stringValue("IsTemplateReleaseCompleteResponse.Message"));
		isTemplateReleaseCompleteResponse.setResultJson(context.stringValue("IsTemplateReleaseCompleteResponse.ResultJson"));
	 
	 	return isTemplateReleaseCompleteResponse;
	}
}