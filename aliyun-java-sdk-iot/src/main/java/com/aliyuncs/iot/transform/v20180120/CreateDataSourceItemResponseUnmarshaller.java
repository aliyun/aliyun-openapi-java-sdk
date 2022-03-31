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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateDataSourceItemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataSourceItemResponseUnmarshaller {

	public static CreateDataSourceItemResponse unmarshall(CreateDataSourceItemResponse createDataSourceItemResponse, UnmarshallerContext _ctx) {
		
		createDataSourceItemResponse.setRequestId(_ctx.stringValue("CreateDataSourceItemResponse.RequestId"));
		createDataSourceItemResponse.setSuccess(_ctx.booleanValue("CreateDataSourceItemResponse.Success"));
		createDataSourceItemResponse.setCode(_ctx.stringValue("CreateDataSourceItemResponse.Code"));
		createDataSourceItemResponse.setErrorMessage(_ctx.stringValue("CreateDataSourceItemResponse.ErrorMessage"));
	 
	 	return createDataSourceItemResponse;
	}
}