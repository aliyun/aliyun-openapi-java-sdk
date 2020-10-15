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

package com.aliyuncs.quickbi_public.transform.v20200802;

import com.aliyuncs.quickbi_public.model.v20200802.DeleteUserTagMetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserTagMetaResponseUnmarshaller {

	public static DeleteUserTagMetaResponse unmarshall(DeleteUserTagMetaResponse deleteUserTagMetaResponse, UnmarshallerContext _ctx) {
		
		deleteUserTagMetaResponse.setRequestId(_ctx.stringValue("DeleteUserTagMetaResponse.RequestId"));
		deleteUserTagMetaResponse.setResult(_ctx.booleanValue("DeleteUserTagMetaResponse.Result"));
		deleteUserTagMetaResponse.setSuccess(_ctx.booleanValue("DeleteUserTagMetaResponse.Success"));
	 
	 	return deleteUserTagMetaResponse;
	}
}