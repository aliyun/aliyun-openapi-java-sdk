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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DeleteAutomateResponseConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAutomateResponseConfigResponseUnmarshaller {

	public static DeleteAutomateResponseConfigResponse unmarshall(DeleteAutomateResponseConfigResponse deleteAutomateResponseConfigResponse, UnmarshallerContext _ctx) {
		
		deleteAutomateResponseConfigResponse.setRequestId(_ctx.stringValue("DeleteAutomateResponseConfigResponse.RequestId"));
		deleteAutomateResponseConfigResponse.setData(_ctx.stringValue("DeleteAutomateResponseConfigResponse.Data"));
		deleteAutomateResponseConfigResponse.setSuccess(_ctx.booleanValue("DeleteAutomateResponseConfigResponse.Success"));
		deleteAutomateResponseConfigResponse.setCode(_ctx.integerValue("DeleteAutomateResponseConfigResponse.Code"));
		deleteAutomateResponseConfigResponse.setMessage(_ctx.stringValue("DeleteAutomateResponseConfigResponse.Message"));
	 
	 	return deleteAutomateResponseConfigResponse;
	}
}