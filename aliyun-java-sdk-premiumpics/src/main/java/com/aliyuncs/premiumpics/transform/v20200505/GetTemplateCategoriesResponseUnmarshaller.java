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

package com.aliyuncs.premiumpics.transform.v20200505;

import com.aliyuncs.premiumpics.model.v20200505.GetTemplateCategoriesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateCategoriesResponseUnmarshaller {

	public static GetTemplateCategoriesResponse unmarshall(GetTemplateCategoriesResponse getTemplateCategoriesResponse, UnmarshallerContext _ctx) {
		
		getTemplateCategoriesResponse.setRequestId(_ctx.stringValue("GetTemplateCategoriesResponse.RequestId"));
		getTemplateCategoriesResponse.setAllowRetry(_ctx.booleanValue("GetTemplateCategoriesResponse.AllowRetry"));
		getTemplateCategoriesResponse.setErrorMsg(_ctx.stringValue("GetTemplateCategoriesResponse.ErrorMsg"));
		getTemplateCategoriesResponse.setErrorCode(_ctx.stringValue("GetTemplateCategoriesResponse.ErrorCode"));
		getTemplateCategoriesResponse.setModule(_ctx.mapValue("GetTemplateCategoriesResponse.Module"));
		getTemplateCategoriesResponse.setSuccess(_ctx.booleanValue("GetTemplateCategoriesResponse.Success"));
		getTemplateCategoriesResponse.setAppName(_ctx.stringValue("GetTemplateCategoriesResponse.AppName"));
	 
	 	return getTemplateCategoriesResponse;
	}
}