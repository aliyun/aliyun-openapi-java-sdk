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

package com.aliyuncs.eds_aic.transform.v20230930;

import com.aliyuncs.eds_aic.model.v20230930.ModifyAndroidInstanceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAndroidInstanceGroupResponseUnmarshaller {

	public static ModifyAndroidInstanceGroupResponse unmarshall(ModifyAndroidInstanceGroupResponse modifyAndroidInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		modifyAndroidInstanceGroupResponse.setRequestId(_ctx.stringValue("ModifyAndroidInstanceGroupResponse.RequestId"));
		modifyAndroidInstanceGroupResponse.setCode(_ctx.stringValue("ModifyAndroidInstanceGroupResponse.Code"));
		modifyAndroidInstanceGroupResponse.setMessage(_ctx.stringValue("ModifyAndroidInstanceGroupResponse.Message"));
	 
	 	return modifyAndroidInstanceGroupResponse;
	}
}