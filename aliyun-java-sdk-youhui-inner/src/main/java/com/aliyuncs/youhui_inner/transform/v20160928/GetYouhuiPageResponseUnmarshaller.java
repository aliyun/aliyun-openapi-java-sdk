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

import com.aliyuncs.youhui_inner.model.v20160928.GetYouhuiPageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetYouhuiPageResponseUnmarshaller {

	public static GetYouhuiPageResponse unmarshall(GetYouhuiPageResponse getYouhuiPageResponse, UnmarshallerContext context) {
		
		getYouhuiPageResponse.setRequestId(context.stringValue("GetYouhuiPageResponse.RequestId"));
		getYouhuiPageResponse.setSuccess(context.booleanValue("GetYouhuiPageResponse.Success"));
		getYouhuiPageResponse.setCode(context.stringValue("GetYouhuiPageResponse.Code"));
		getYouhuiPageResponse.setMessage(context.stringValue("GetYouhuiPageResponse.Message"));
		getYouhuiPageResponse.setIsIdempotentResp(context.booleanValue("GetYouhuiPageResponse.IsIdempotentResp"));
		getYouhuiPageResponse.setData(context.stringValue("GetYouhuiPageResponse.Data"));
		getYouhuiPageResponse.setCurrentPage(context.integerValue("GetYouhuiPageResponse.CurrentPage"));
		getYouhuiPageResponse.setPageSize(context.integerValue("GetYouhuiPageResponse.PageSize"));
		getYouhuiPageResponse.setTotalCount(context.integerValue("GetYouhuiPageResponse.TotalCount"));
	 
	 	return getYouhuiPageResponse;
	}
}