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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.DeleteStandardGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStandardGroupResponseUnmarshaller {

	public static DeleteStandardGroupResponse unmarshall(DeleteStandardGroupResponse deleteStandardGroupResponse, UnmarshallerContext _ctx) {
		
		deleteStandardGroupResponse.setRequestId(_ctx.stringValue("DeleteStandardGroupResponse.RequestId"));
		deleteStandardGroupResponse.setSuccess(_ctx.booleanValue("DeleteStandardGroupResponse.Success"));
		deleteStandardGroupResponse.setErrorMessage(_ctx.stringValue("DeleteStandardGroupResponse.ErrorMessage"));
		deleteStandardGroupResponse.setErrorCode(_ctx.stringValue("DeleteStandardGroupResponse.ErrorCode"));
	 
	 	return deleteStandardGroupResponse;
	}
}