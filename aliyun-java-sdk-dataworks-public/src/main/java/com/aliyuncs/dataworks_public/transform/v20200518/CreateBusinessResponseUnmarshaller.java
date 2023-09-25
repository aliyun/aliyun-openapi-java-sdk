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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateBusinessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBusinessResponseUnmarshaller {

	public static CreateBusinessResponse unmarshall(CreateBusinessResponse createBusinessResponse, UnmarshallerContext _ctx) {
		
		createBusinessResponse.setRequestId(_ctx.stringValue("CreateBusinessResponse.RequestId"));
		createBusinessResponse.setHttpStatusCode(_ctx.integerValue("CreateBusinessResponse.HttpStatusCode"));
		createBusinessResponse.setErrorMessage(_ctx.stringValue("CreateBusinessResponse.ErrorMessage"));
		createBusinessResponse.setSuccess(_ctx.booleanValue("CreateBusinessResponse.Success"));
		createBusinessResponse.setErrorCode(_ctx.stringValue("CreateBusinessResponse.ErrorCode"));
		createBusinessResponse.setBusinessId(_ctx.longValue("CreateBusinessResponse.BusinessId"));
	 
	 	return createBusinessResponse;
	}
}