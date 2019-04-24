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

import com.aliyuncs.youhui_inner.model.v20160928.GetYouhuiTemplatePageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetYouhuiTemplatePageResponseUnmarshaller {

	public static GetYouhuiTemplatePageResponse unmarshall(GetYouhuiTemplatePageResponse getYouhuiTemplatePageResponse, UnmarshallerContext context) {
		
		getYouhuiTemplatePageResponse.setRequestId(context.stringValue("GetYouhuiTemplatePageResponse.RequestId"));
		getYouhuiTemplatePageResponse.setSuccess(context.booleanValue("GetYouhuiTemplatePageResponse.Success"));
		getYouhuiTemplatePageResponse.setCode(context.stringValue("GetYouhuiTemplatePageResponse.Code"));
		getYouhuiTemplatePageResponse.setMessage(context.stringValue("GetYouhuiTemplatePageResponse.Message"));
		getYouhuiTemplatePageResponse.setIsIdempotentResp(context.booleanValue("GetYouhuiTemplatePageResponse.IsIdempotentResp"));
		getYouhuiTemplatePageResponse.setData(context.stringValue("GetYouhuiTemplatePageResponse.Data"));
		getYouhuiTemplatePageResponse.setCurrentPage(context.integerValue("GetYouhuiTemplatePageResponse.CurrentPage"));
		getYouhuiTemplatePageResponse.setPageSize(context.integerValue("GetYouhuiTemplatePageResponse.PageSize"));
		getYouhuiTemplatePageResponse.setTotalCount(context.integerValue("GetYouhuiTemplatePageResponse.TotalCount"));
	 
	 	return getYouhuiTemplatePageResponse;
	}
}