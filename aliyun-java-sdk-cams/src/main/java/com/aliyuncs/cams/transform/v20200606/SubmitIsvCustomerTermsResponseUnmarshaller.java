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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.SubmitIsvCustomerTermsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitIsvCustomerTermsResponseUnmarshaller {

	public static SubmitIsvCustomerTermsResponse unmarshall(SubmitIsvCustomerTermsResponse submitIsvCustomerTermsResponse, UnmarshallerContext _ctx) {
		
		submitIsvCustomerTermsResponse.setRequestId(_ctx.stringValue("SubmitIsvCustomerTermsResponse.RequestId"));
		submitIsvCustomerTermsResponse.setCode(_ctx.stringValue("SubmitIsvCustomerTermsResponse.Code"));
		submitIsvCustomerTermsResponse.setMessage(_ctx.stringValue("SubmitIsvCustomerTermsResponse.Message"));
		submitIsvCustomerTermsResponse.setAccessDeniedDetail(_ctx.stringValue("SubmitIsvCustomerTermsResponse.AccessDeniedDetail"));
	 
	 	return submitIsvCustomerTermsResponse;
	}
}