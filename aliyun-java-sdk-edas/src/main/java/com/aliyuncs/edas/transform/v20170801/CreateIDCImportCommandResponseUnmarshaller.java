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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.CreateIDCImportCommandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIDCImportCommandResponseUnmarshaller {

	public static CreateIDCImportCommandResponse unmarshall(CreateIDCImportCommandResponse createIDCImportCommandResponse, UnmarshallerContext _ctx) {
		
		createIDCImportCommandResponse.setRequestId(_ctx.stringValue("CreateIDCImportCommandResponse.RequestId"));
		createIDCImportCommandResponse.setCode(_ctx.stringValue("CreateIDCImportCommandResponse.Code"));
		createIDCImportCommandResponse.setMessage(_ctx.stringValue("CreateIDCImportCommandResponse.Message"));
		createIDCImportCommandResponse.setData(_ctx.stringValue("CreateIDCImportCommandResponse.Data"));
	 
	 	return createIDCImportCommandResponse;
	}
}