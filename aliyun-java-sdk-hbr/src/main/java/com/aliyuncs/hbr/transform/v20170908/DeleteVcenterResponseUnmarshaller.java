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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.DeleteVcenterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteVcenterResponseUnmarshaller {

	public static DeleteVcenterResponse unmarshall(DeleteVcenterResponse deleteVcenterResponse, UnmarshallerContext _ctx) {
		
		deleteVcenterResponse.setRequestId(_ctx.stringValue("DeleteVcenterResponse.RequestId"));
		deleteVcenterResponse.setSuccess(_ctx.booleanValue("DeleteVcenterResponse.Success"));
		deleteVcenterResponse.setCode(_ctx.stringValue("DeleteVcenterResponse.Code"));
		deleteVcenterResponse.setMessage(_ctx.stringValue("DeleteVcenterResponse.Message"));
		deleteVcenterResponse.setTaskId(_ctx.stringValue("DeleteVcenterResponse.TaskId"));
	 
	 	return deleteVcenterResponse;
	}
}