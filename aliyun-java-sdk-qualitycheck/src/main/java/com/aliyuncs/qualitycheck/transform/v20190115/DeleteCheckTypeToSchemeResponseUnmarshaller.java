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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.DeleteCheckTypeToSchemeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCheckTypeToSchemeResponseUnmarshaller {

	public static DeleteCheckTypeToSchemeResponse unmarshall(DeleteCheckTypeToSchemeResponse deleteCheckTypeToSchemeResponse, UnmarshallerContext _ctx) {
		
		deleteCheckTypeToSchemeResponse.setRequestId(_ctx.stringValue("DeleteCheckTypeToSchemeResponse.RequestId"));
		deleteCheckTypeToSchemeResponse.setSuccess(_ctx.booleanValue("DeleteCheckTypeToSchemeResponse.Success"));
		deleteCheckTypeToSchemeResponse.setData(_ctx.stringValue("DeleteCheckTypeToSchemeResponse.Data"));
		deleteCheckTypeToSchemeResponse.setCode(_ctx.stringValue("DeleteCheckTypeToSchemeResponse.Code"));
		deleteCheckTypeToSchemeResponse.setMessage(_ctx.stringValue("DeleteCheckTypeToSchemeResponse.Message"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteCheckTypeToSchemeResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("DeleteCheckTypeToSchemeResponse.Messages["+ i +"]"));
		}
		deleteCheckTypeToSchemeResponse.setMessages(messages);
	 
	 	return deleteCheckTypeToSchemeResponse;
	}
}