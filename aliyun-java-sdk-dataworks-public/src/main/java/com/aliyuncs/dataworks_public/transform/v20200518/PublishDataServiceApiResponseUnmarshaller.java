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

import com.aliyuncs.dataworks_public.model.v20200518.PublishDataServiceApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishDataServiceApiResponseUnmarshaller {

	public static PublishDataServiceApiResponse unmarshall(PublishDataServiceApiResponse publishDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		publishDataServiceApiResponse.setRequestId(_ctx.stringValue("PublishDataServiceApiResponse.RequestId"));
		publishDataServiceApiResponse.setData(_ctx.booleanValue("PublishDataServiceApiResponse.Data"));
		publishDataServiceApiResponse.setErrorCode(_ctx.stringValue("PublishDataServiceApiResponse.ErrorCode"));
		publishDataServiceApiResponse.setErrorMessage(_ctx.stringValue("PublishDataServiceApiResponse.ErrorMessage"));
		publishDataServiceApiResponse.setHttpStatusCode(_ctx.integerValue("PublishDataServiceApiResponse.HttpStatusCode"));
		publishDataServiceApiResponse.setSuccess(_ctx.booleanValue("PublishDataServiceApiResponse.Success"));
	 
	 	return publishDataServiceApiResponse;
	}
}