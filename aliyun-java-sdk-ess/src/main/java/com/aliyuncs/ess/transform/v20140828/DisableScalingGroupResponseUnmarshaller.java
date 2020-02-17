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

import com.aliyuncs.ess.model.v20140828.DisableScalingGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableScalingGroupResponseUnmarshaller {

	public static DisableScalingGroupResponse unmarshall(DisableScalingGroupResponse disableScalingGroupResponse, UnmarshallerContext _ctx) {
		
		disableScalingGroupResponse.setRequestId(_ctx.stringValue("DisableScalingGroupResponse.RequestId"));
	 
	 	return disableScalingGroupResponse;
	}
}