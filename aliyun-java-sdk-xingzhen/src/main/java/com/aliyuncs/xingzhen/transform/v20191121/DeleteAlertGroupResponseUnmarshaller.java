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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.DeleteAlertGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAlertGroupResponseUnmarshaller {

	public static DeleteAlertGroupResponse unmarshall(DeleteAlertGroupResponse deleteAlertGroupResponse, UnmarshallerContext _ctx) {
		
		deleteAlertGroupResponse.setRequestId(_ctx.stringValue("DeleteAlertGroupResponse.RequestId"));
		deleteAlertGroupResponse.setSuccess(_ctx.booleanValue("DeleteAlertGroupResponse.Success"));
		deleteAlertGroupResponse.setCode(_ctx.stringValue("DeleteAlertGroupResponse.Code"));
		deleteAlertGroupResponse.setMessage(_ctx.stringValue("DeleteAlertGroupResponse.Message"));
		deleteAlertGroupResponse.setData(_ctx.booleanValue("DeleteAlertGroupResponse.Data"));
	 
	 	return deleteAlertGroupResponse;
	}
}