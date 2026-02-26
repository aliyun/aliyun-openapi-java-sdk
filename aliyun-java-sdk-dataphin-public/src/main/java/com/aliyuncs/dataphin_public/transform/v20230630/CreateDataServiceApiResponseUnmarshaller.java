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

import com.aliyuncs.dataphin_public.model.v20230630.CreateDataServiceApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataServiceApiResponseUnmarshaller {

	public static CreateDataServiceApiResponse unmarshall(CreateDataServiceApiResponse createDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		createDataServiceApiResponse.setRequestId(_ctx.stringValue("CreateDataServiceApiResponse.RequestId"));
		createDataServiceApiResponse.setSuccess(_ctx.booleanValue("CreateDataServiceApiResponse.Success"));
		createDataServiceApiResponse.setHttpStatusCode(_ctx.integerValue("CreateDataServiceApiResponse.HttpStatusCode"));
		createDataServiceApiResponse.setCode(_ctx.stringValue("CreateDataServiceApiResponse.Code"));
		createDataServiceApiResponse.setMessage(_ctx.stringValue("CreateDataServiceApiResponse.Message"));
		createDataServiceApiResponse.setApiId(_ctx.longValue("CreateDataServiceApiResponse.ApiId"));
	 
	 	return createDataServiceApiResponse;
	}
}