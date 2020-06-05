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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DeleteGatewayBlockVolumesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayBlockVolumesResponseUnmarshaller {

	public static DeleteGatewayBlockVolumesResponse unmarshall(DeleteGatewayBlockVolumesResponse deleteGatewayBlockVolumesResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayBlockVolumesResponse.setRequestId(_ctx.stringValue("DeleteGatewayBlockVolumesResponse.RequestId"));
		deleteGatewayBlockVolumesResponse.setSuccess(_ctx.booleanValue("DeleteGatewayBlockVolumesResponse.Success"));
		deleteGatewayBlockVolumesResponse.setCode(_ctx.stringValue("DeleteGatewayBlockVolumesResponse.Code"));
		deleteGatewayBlockVolumesResponse.setMessage(_ctx.stringValue("DeleteGatewayBlockVolumesResponse.Message"));
		deleteGatewayBlockVolumesResponse.setTaskId(_ctx.stringValue("DeleteGatewayBlockVolumesResponse.TaskId"));
	 
	 	return deleteGatewayBlockVolumesResponse;
	}
}