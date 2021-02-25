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

package com.aliyuncs.subscription.transform.v20210115;

import com.aliyuncs.subscription.model.v20210115.DeleteContactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteContactResponseUnmarshaller {

	public static DeleteContactResponse unmarshall(DeleteContactResponse deleteContactResponse, UnmarshallerContext _ctx) {
		
		deleteContactResponse.setRequestId(_ctx.stringValue("DeleteContactResponse.RequestId"));
		deleteContactResponse.setMessage(_ctx.stringValue("DeleteContactResponse.Message"));
		deleteContactResponse.setCode(_ctx.stringValue("DeleteContactResponse.Code"));
		deleteContactResponse.setSuccess(_ctx.booleanValue("DeleteContactResponse.Success"));
		deleteContactResponse.setResult(_ctx.booleanValue("DeleteContactResponse.Result"));
	 
	 	return deleteContactResponse;
	}
}