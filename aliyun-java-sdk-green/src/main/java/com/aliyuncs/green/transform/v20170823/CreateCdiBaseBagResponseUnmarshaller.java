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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.CreateCdiBaseBagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCdiBaseBagResponseUnmarshaller {

	public static CreateCdiBaseBagResponse unmarshall(CreateCdiBaseBagResponse createCdiBaseBagResponse, UnmarshallerContext _ctx) {
		
		createCdiBaseBagResponse.setRequestId(_ctx.stringValue("CreateCdiBaseBagResponse.RequestId"));
		createCdiBaseBagResponse.setCode(_ctx.stringValue("CreateCdiBaseBagResponse.Code"));
		createCdiBaseBagResponse.setMessage(_ctx.stringValue("CreateCdiBaseBagResponse.Message"));
		createCdiBaseBagResponse.setOrderId(_ctx.stringValue("CreateCdiBaseBagResponse.OrderId"));
		createCdiBaseBagResponse.setInstanceId(_ctx.stringValue("CreateCdiBaseBagResponse.InstanceId"));
	 
	 	return createCdiBaseBagResponse;
	}
}