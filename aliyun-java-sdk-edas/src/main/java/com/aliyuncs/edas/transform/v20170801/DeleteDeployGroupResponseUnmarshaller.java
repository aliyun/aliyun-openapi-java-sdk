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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.DeleteDeployGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDeployGroupResponseUnmarshaller {

	public static DeleteDeployGroupResponse unmarshall(DeleteDeployGroupResponse deleteDeployGroupResponse, UnmarshallerContext _ctx) {
		
		deleteDeployGroupResponse.setRequestId(_ctx.stringValue("DeleteDeployGroupResponse.RequestId"));
		deleteDeployGroupResponse.setCode(_ctx.integerValue("DeleteDeployGroupResponse.Code"));
		deleteDeployGroupResponse.setMessage(_ctx.stringValue("DeleteDeployGroupResponse.Message"));
		deleteDeployGroupResponse.setData(_ctx.stringValue("DeleteDeployGroupResponse.Data"));
	 
	 	return deleteDeployGroupResponse;
	}
}