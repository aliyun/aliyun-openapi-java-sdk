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

package com.aliyuncs.eds_user.transform.v20210308;

import com.aliyuncs.eds_user.model.v20210308.RemoveGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveGroupResponseUnmarshaller {

	public static RemoveGroupResponse unmarshall(RemoveGroupResponse removeGroupResponse, UnmarshallerContext _ctx) {
		
		removeGroupResponse.setRequestId(_ctx.stringValue("RemoveGroupResponse.RequestId"));
	 
	 	return removeGroupResponse;
	}
}