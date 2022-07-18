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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.QueryLayoutDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLayoutDetailResponseUnmarshaller {

	public static QueryLayoutDetailResponse unmarshall(QueryLayoutDetailResponse queryLayoutDetailResponse, UnmarshallerContext _ctx) {
		
		queryLayoutDetailResponse.setRequestId(_ctx.stringValue("QueryLayoutDetailResponse.RequestId"));
		queryLayoutDetailResponse.setSuccess(_ctx.booleanValue("QueryLayoutDetailResponse.Success"));
		queryLayoutDetailResponse.setMessage(_ctx.stringValue("QueryLayoutDetailResponse.Message"));
		queryLayoutDetailResponse.setErrorCode(_ctx.stringValue("QueryLayoutDetailResponse.ErrorCode"));
		queryLayoutDetailResponse.setErrorMessage(_ctx.stringValue("QueryLayoutDetailResponse.ErrorMessage"));
		queryLayoutDetailResponse.setCode(_ctx.stringValue("QueryLayoutDetailResponse.Code"));
		queryLayoutDetailResponse.setDynamicCode(_ctx.stringValue("QueryLayoutDetailResponse.DynamicCode"));
		queryLayoutDetailResponse.setDynamicMessage(_ctx.stringValue("QueryLayoutDetailResponse.DynamicMessage"));
		queryLayoutDetailResponse.setLayoutId(_ctx.longValue("QueryLayoutDetailResponse.LayoutId"));
		queryLayoutDetailResponse.setLayoutName(_ctx.stringValue("QueryLayoutDetailResponse.LayoutName"));
		queryLayoutDetailResponse.setDescription(_ctx.stringValue("QueryLayoutDetailResponse.Description"));
		queryLayoutDetailResponse.setLayoutTemplateId(_ctx.longValue("QueryLayoutDetailResponse.LayoutTemplateId"));
		queryLayoutDetailResponse.setEslModelId(_ctx.stringValue("QueryLayoutDetailResponse.EslModelId"));
		queryLayoutDetailResponse.setTemplateVersion(_ctx.stringValue("QueryLayoutDetailResponse.TemplateVersion"));
		queryLayoutDetailResponse.setBrandId(_ctx.stringValue("QueryLayoutDetailResponse.BrandId"));
	 
	 	return queryLayoutDetailResponse;
	}
}