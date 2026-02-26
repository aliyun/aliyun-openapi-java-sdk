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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.AddDirectionalGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDirectionalGroupResponseUnmarshaller {

	public static AddDirectionalGroupResponse unmarshall(AddDirectionalGroupResponse addDirectionalGroupResponse, UnmarshallerContext _ctx) {
		
		addDirectionalGroupResponse.setRequestId(_ctx.stringValue("AddDirectionalGroupResponse.RequestId"));
		addDirectionalGroupResponse.setData(_ctx.longValue("AddDirectionalGroupResponse.Data"));
		addDirectionalGroupResponse.setErrorMessage(_ctx.stringValue("AddDirectionalGroupResponse.ErrorMessage"));
		addDirectionalGroupResponse.setSuccess(_ctx.booleanValue("AddDirectionalGroupResponse.Success"));
		addDirectionalGroupResponse.setLocalizedMessage(_ctx.stringValue("AddDirectionalGroupResponse.LocalizedMessage"));
		addDirectionalGroupResponse.setCode(_ctx.stringValue("AddDirectionalGroupResponse.Code"));
	 
	 	return addDirectionalGroupResponse;
	}
}