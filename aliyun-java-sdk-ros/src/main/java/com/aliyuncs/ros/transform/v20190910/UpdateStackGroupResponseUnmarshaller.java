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

package com.aliyuncs.ros.transform.v20190910;

import com.aliyuncs.ros.model.v20190910.UpdateStackGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStackGroupResponseUnmarshaller {

	public static UpdateStackGroupResponse unmarshall(UpdateStackGroupResponse updateStackGroupResponse, UnmarshallerContext _ctx) {
		
		updateStackGroupResponse.setRequestId(_ctx.stringValue("UpdateStackGroupResponse.RequestId"));
		updateStackGroupResponse.setOperationId(_ctx.stringValue("UpdateStackGroupResponse.OperationId"));
	 
	 	return updateStackGroupResponse;
	}
}