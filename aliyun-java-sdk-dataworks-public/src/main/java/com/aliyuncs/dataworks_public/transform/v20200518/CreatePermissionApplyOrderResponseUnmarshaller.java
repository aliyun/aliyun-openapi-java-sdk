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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.CreatePermissionApplyOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePermissionApplyOrderResponseUnmarshaller {

	public static CreatePermissionApplyOrderResponse unmarshall(CreatePermissionApplyOrderResponse createPermissionApplyOrderResponse, UnmarshallerContext _ctx) {
		
		createPermissionApplyOrderResponse.setRequestId(_ctx.stringValue("CreatePermissionApplyOrderResponse.RequestId"));

		List<String> flowId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePermissionApplyOrderResponse.FlowId.Length"); i++) {
			flowId.add(_ctx.stringValue("CreatePermissionApplyOrderResponse.FlowId["+ i +"]"));
		}
		createPermissionApplyOrderResponse.setFlowId(flowId);
	 
	 	return createPermissionApplyOrderResponse;
	}
}