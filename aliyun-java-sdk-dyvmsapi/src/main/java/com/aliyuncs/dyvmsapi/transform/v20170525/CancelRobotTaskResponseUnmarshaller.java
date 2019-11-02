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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.CancelRobotTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelRobotTaskResponseUnmarshaller {

	public static CancelRobotTaskResponse unmarshall(CancelRobotTaskResponse cancelRobotTaskResponse, UnmarshallerContext _ctx) {
		
		cancelRobotTaskResponse.setRequestId(_ctx.stringValue("CancelRobotTaskResponse.RequestId"));
		cancelRobotTaskResponse.setData(_ctx.stringValue("CancelRobotTaskResponse.Data"));
		cancelRobotTaskResponse.setCode(_ctx.stringValue("CancelRobotTaskResponse.Code"));
		cancelRobotTaskResponse.setMessage(_ctx.stringValue("CancelRobotTaskResponse.Message"));
	 
	 	return cancelRobotTaskResponse;
	}
}