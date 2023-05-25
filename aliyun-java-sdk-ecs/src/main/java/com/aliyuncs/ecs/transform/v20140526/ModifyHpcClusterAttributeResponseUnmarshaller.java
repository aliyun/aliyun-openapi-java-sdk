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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyHpcClusterAttributeResponseUnmarshaller {

	public static ModifyHpcClusterAttributeResponse unmarshall(ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyHpcClusterAttributeResponse.setRequestId(_ctx.stringValue("ModifyHpcClusterAttributeResponse.RequestId"));
	 
	 	return modifyHpcClusterAttributeResponse;
	}
}