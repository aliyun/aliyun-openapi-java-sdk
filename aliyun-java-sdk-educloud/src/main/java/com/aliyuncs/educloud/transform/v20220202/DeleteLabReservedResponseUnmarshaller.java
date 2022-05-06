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

package com.aliyuncs.educloud.transform.v20220202;

import com.aliyuncs.educloud.model.v20220202.DeleteLabReservedResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLabReservedResponseUnmarshaller {

	public static DeleteLabReservedResponse unmarshall(DeleteLabReservedResponse deleteLabReservedResponse, UnmarshallerContext _ctx) {
		
		deleteLabReservedResponse.setRequestId(_ctx.stringValue("DeleteLabReservedResponse.RequestId"));
		deleteLabReservedResponse.setSuccess(_ctx.booleanValue("DeleteLabReservedResponse.Success"));
		deleteLabReservedResponse.setCode(_ctx.longValue("DeleteLabReservedResponse.Code"));
		deleteLabReservedResponse.setMessage(_ctx.stringValue("DeleteLabReservedResponse.Message"));
		deleteLabReservedResponse.setData(_ctx.booleanValue("DeleteLabReservedResponse.Data"));
	 
	 	return deleteLabReservedResponse;
	}
}