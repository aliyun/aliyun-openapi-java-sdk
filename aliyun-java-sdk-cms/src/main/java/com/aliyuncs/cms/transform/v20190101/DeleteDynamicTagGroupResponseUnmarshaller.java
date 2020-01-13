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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DeleteDynamicTagGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDynamicTagGroupResponseUnmarshaller {

	public static DeleteDynamicTagGroupResponse unmarshall(DeleteDynamicTagGroupResponse deleteDynamicTagGroupResponse, UnmarshallerContext _ctx) {
		
		deleteDynamicTagGroupResponse.setRequestId(_ctx.stringValue("DeleteDynamicTagGroupResponse.RequestId"));
		deleteDynamicTagGroupResponse.setCode(_ctx.stringValue("DeleteDynamicTagGroupResponse.Code"));
		deleteDynamicTagGroupResponse.setMessage(_ctx.stringValue("DeleteDynamicTagGroupResponse.Message"));
		deleteDynamicTagGroupResponse.setSuccess(_ctx.booleanValue("DeleteDynamicTagGroupResponse.Success"));
	 
	 	return deleteDynamicTagGroupResponse;
	}
}