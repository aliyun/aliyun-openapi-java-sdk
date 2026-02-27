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

import com.aliyuncs.dataphin_public.model.v20230630.CreateDataServiceAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataServiceAppResponseUnmarshaller {

	public static CreateDataServiceAppResponse unmarshall(CreateDataServiceAppResponse createDataServiceAppResponse, UnmarshallerContext _ctx) {
		
		createDataServiceAppResponse.setRequestId(_ctx.stringValue("CreateDataServiceAppResponse.RequestId"));
		createDataServiceAppResponse.setMessage(_ctx.stringValue("CreateDataServiceAppResponse.Message"));
		createDataServiceAppResponse.setHttpStatusCode(_ctx.integerValue("CreateDataServiceAppResponse.HttpStatusCode"));
		createDataServiceAppResponse.setData(_ctx.integerValue("CreateDataServiceAppResponse.Data"));
		createDataServiceAppResponse.setCode(_ctx.stringValue("CreateDataServiceAppResponse.Code"));
		createDataServiceAppResponse.setSuccess(_ctx.booleanValue("CreateDataServiceAppResponse.Success"));
	 
	 	return createDataServiceAppResponse;
	}
}