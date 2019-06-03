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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.CreateResourcePackageResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CreateResourcePackageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResourcePackageResponseUnmarshaller {

	public static CreateResourcePackageResponse unmarshall(CreateResourcePackageResponse createResourcePackageResponse, UnmarshallerContext context) {
		
		createResourcePackageResponse.setRequestId(context.stringValue("CreateResourcePackageResponse.RequestId"));
		createResourcePackageResponse.setOrderId(context.longValue("CreateResourcePackageResponse.OrderId"));
		createResourcePackageResponse.setSuccess(context.booleanValue("CreateResourcePackageResponse.Success"));
		createResourcePackageResponse.setCode(context.stringValue("CreateResourcePackageResponse.Code"));
		createResourcePackageResponse.setMessage(context.stringValue("CreateResourcePackageResponse.Message"));

		Data data = new Data();
		data.setOrderId(context.longValue("CreateResourcePackageResponse.Data.OrderId"));
		data.setInstanceId(context.stringValue("CreateResourcePackageResponse.Data.InstanceId"));
		createResourcePackageResponse.setData(data);
	 
	 	return createResourcePackageResponse;
	}
}