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

import com.aliyuncs.qualitycheck.model.v20190115.DeleteSchemeTaskConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSchemeTaskConfigResponseUnmarshaller {

	public static DeleteSchemeTaskConfigResponse unmarshall(DeleteSchemeTaskConfigResponse deleteSchemeTaskConfigResponse, UnmarshallerContext _ctx) {
		
		deleteSchemeTaskConfigResponse.setRequestId(_ctx.stringValue("DeleteSchemeTaskConfigResponse.RequestId"));
		deleteSchemeTaskConfigResponse.setSuccess(_ctx.booleanValue("DeleteSchemeTaskConfigResponse.Success"));
		deleteSchemeTaskConfigResponse.setCode(_ctx.stringValue("DeleteSchemeTaskConfigResponse.Code"));
		deleteSchemeTaskConfigResponse.setMessage(_ctx.stringValue("DeleteSchemeTaskConfigResponse.Message"));
		deleteSchemeTaskConfigResponse.setHttpStatusCode(_ctx.integerValue("DeleteSchemeTaskConfigResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSchemeTaskConfigResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("DeleteSchemeTaskConfigResponse.Messages["+ i +"]"));
		}
		deleteSchemeTaskConfigResponse.setMessages(messages);
	 
	 	return deleteSchemeTaskConfigResponse;
	}
}