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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.DeleteCommonGroupResponse;
import com.aliyuncs.devops_rdc.model.v20200303.DeleteCommonGroupResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCommonGroupResponseUnmarshaller {

	public static DeleteCommonGroupResponse unmarshall(DeleteCommonGroupResponse deleteCommonGroupResponse, UnmarshallerContext _ctx) {
		
		deleteCommonGroupResponse.setRequestId(_ctx.stringValue("DeleteCommonGroupResponse.RequestId"));
		deleteCommonGroupResponse.setErrorMsg(_ctx.stringValue("DeleteCommonGroupResponse.ErrorMsg"));
		deleteCommonGroupResponse.setSuccessful(_ctx.booleanValue("DeleteCommonGroupResponse.Successful"));
		deleteCommonGroupResponse.setErrorCode(_ctx.stringValue("DeleteCommonGroupResponse.ErrorCode"));

		Object object = new Object();
		object.setId(_ctx.stringValue("DeleteCommonGroupResponse.Object.Id"));
		deleteCommonGroupResponse.setObject(object);
	 
	 	return deleteCommonGroupResponse;
	}
}