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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.ApplyDataServiceApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyDataServiceApiResponseUnmarshaller {

	public static ApplyDataServiceApiResponse unmarshall(ApplyDataServiceApiResponse applyDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		applyDataServiceApiResponse.setRequestId(_ctx.stringValue("ApplyDataServiceApiResponse.RequestId"));
		applyDataServiceApiResponse.setSuccess(_ctx.booleanValue("ApplyDataServiceApiResponse.Success"));
		applyDataServiceApiResponse.setHttpStatusCode(_ctx.integerValue("ApplyDataServiceApiResponse.HttpStatusCode"));
		applyDataServiceApiResponse.setCode(_ctx.stringValue("ApplyDataServiceApiResponse.Code"));
		applyDataServiceApiResponse.setMessage(_ctx.stringValue("ApplyDataServiceApiResponse.Message"));
	 
	 	return applyDataServiceApiResponse;
	}
}