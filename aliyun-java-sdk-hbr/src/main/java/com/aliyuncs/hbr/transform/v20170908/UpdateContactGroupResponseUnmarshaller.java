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

import com.aliyuncs.hbr.model.v20170908.UpdateContactGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateContactGroupResponseUnmarshaller {

	public static UpdateContactGroupResponse unmarshall(UpdateContactGroupResponse updateContactGroupResponse, UnmarshallerContext _ctx) {
		
		updateContactGroupResponse.setRequestId(_ctx.stringValue("UpdateContactGroupResponse.RequestId"));
		updateContactGroupResponse.setSuccess(_ctx.booleanValue("UpdateContactGroupResponse.Success"));
		updateContactGroupResponse.setCode(_ctx.stringValue("UpdateContactGroupResponse.Code"));
		updateContactGroupResponse.setMessage(_ctx.stringValue("UpdateContactGroupResponse.Message"));
	 
	 	return updateContactGroupResponse;
	}
}