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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.DeleteVGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteVGroupResponseUnmarshaller {

	public static DeleteVGroupResponse unmarshall(DeleteVGroupResponse deleteVGroupResponse, UnmarshallerContext _ctx) {
		
		deleteVGroupResponse.setRequestId(_ctx.stringValue("DeleteVGroupResponse.RequestId"));
		deleteVGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteVGroupResponse.HttpStatusCode"));
		deleteVGroupResponse.setMessage(_ctx.stringValue("DeleteVGroupResponse.Message"));
		deleteVGroupResponse.setCode(_ctx.integerValue("DeleteVGroupResponse.Code"));
		deleteVGroupResponse.setSuccess(_ctx.booleanValue("DeleteVGroupResponse.Success"));
		deleteVGroupResponse.setData(_ctx.stringValue("DeleteVGroupResponse.Data"));
	 
	 	return deleteVGroupResponse;
	}
}