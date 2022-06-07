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

package com.aliyuncs.appstream_center.transform.v20210901;

import com.aliyuncs.appstream_center.model.v20210901.ModifyAppInstanceGroupAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAppInstanceGroupAttributeResponseUnmarshaller {

	public static ModifyAppInstanceGroupAttributeResponse unmarshall(ModifyAppInstanceGroupAttributeResponse modifyAppInstanceGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyAppInstanceGroupAttributeResponse.setRequestId(_ctx.stringValue("ModifyAppInstanceGroupAttributeResponse.RequestId"));
		modifyAppInstanceGroupAttributeResponse.setCode(_ctx.stringValue("ModifyAppInstanceGroupAttributeResponse.Code"));
		modifyAppInstanceGroupAttributeResponse.setMessage(_ctx.stringValue("ModifyAppInstanceGroupAttributeResponse.Message"));
	 
	 	return modifyAppInstanceGroupAttributeResponse;
	}
}