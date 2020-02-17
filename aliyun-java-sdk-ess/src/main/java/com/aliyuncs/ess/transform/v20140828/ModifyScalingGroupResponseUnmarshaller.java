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

package com.aliyuncs.ess.transform.v20140828;

import com.aliyuncs.ess.model.v20140828.ModifyScalingGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyScalingGroupResponseUnmarshaller {

	public static ModifyScalingGroupResponse unmarshall(ModifyScalingGroupResponse modifyScalingGroupResponse, UnmarshallerContext _ctx) {
		
		modifyScalingGroupResponse.setRequestId(_ctx.stringValue("ModifyScalingGroupResponse.RequestId"));
	 
	 	return modifyScalingGroupResponse;
	}
}