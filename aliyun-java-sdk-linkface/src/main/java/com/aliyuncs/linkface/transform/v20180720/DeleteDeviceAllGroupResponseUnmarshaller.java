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

package com.aliyuncs.linkface.transform.v20180720;

import com.aliyuncs.linkface.model.v20180720.DeleteDeviceAllGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDeviceAllGroupResponseUnmarshaller {

	public static DeleteDeviceAllGroupResponse unmarshall(DeleteDeviceAllGroupResponse deleteDeviceAllGroupResponse, UnmarshallerContext context) {
		
		deleteDeviceAllGroupResponse.setRequestId(context.stringValue("DeleteDeviceAllGroupResponse.RequestId"));
		deleteDeviceAllGroupResponse.setCode(context.integerValue("DeleteDeviceAllGroupResponse.Code"));
		deleteDeviceAllGroupResponse.setMessage(context.stringValue("DeleteDeviceAllGroupResponse.Message"));
		deleteDeviceAllGroupResponse.setSuccess(context.booleanValue("DeleteDeviceAllGroupResponse.Success"));
	 
	 	return deleteDeviceAllGroupResponse;
	}
}