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

import com.aliyuncs.hbr.model.v20170908.DeleteClientResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteClientResponseUnmarshaller {

	public static DeleteClientResponse unmarshall(DeleteClientResponse deleteClientResponse, UnmarshallerContext _ctx) {
		
		deleteClientResponse.setRequestId(_ctx.stringValue("DeleteClientResponse.RequestId"));
		deleteClientResponse.setSuccess(_ctx.booleanValue("DeleteClientResponse.Success"));
		deleteClientResponse.setCode(_ctx.stringValue("DeleteClientResponse.Code"));
		deleteClientResponse.setMessage(_ctx.stringValue("DeleteClientResponse.Message"));
	 
	 	return deleteClientResponse;
	}
}