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

import com.aliyuncs.qualitycheck.model.v20190115.CreateSchemeTaskConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSchemeTaskConfigResponseUnmarshaller {

	public static CreateSchemeTaskConfigResponse unmarshall(CreateSchemeTaskConfigResponse createSchemeTaskConfigResponse, UnmarshallerContext _ctx) {
		
		createSchemeTaskConfigResponse.setRequestId(_ctx.stringValue("CreateSchemeTaskConfigResponse.RequestId"));
		createSchemeTaskConfigResponse.setData(_ctx.longValue("CreateSchemeTaskConfigResponse.Data"));
		createSchemeTaskConfigResponse.setSuccess(_ctx.booleanValue("CreateSchemeTaskConfigResponse.Success"));
		createSchemeTaskConfigResponse.setCode(_ctx.stringValue("CreateSchemeTaskConfigResponse.Code"));
		createSchemeTaskConfigResponse.setMessage(_ctx.stringValue("CreateSchemeTaskConfigResponse.Message"));
		createSchemeTaskConfigResponse.setHttpStatusCode(_ctx.integerValue("CreateSchemeTaskConfigResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateSchemeTaskConfigResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("CreateSchemeTaskConfigResponse.Messages["+ i +"]"));
		}
		createSchemeTaskConfigResponse.setMessages(messages);
	 
	 	return createSchemeTaskConfigResponse;
	}
}