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

import com.aliyuncs.qualitycheck.model.v20190115.UpdateCheckTypeToSchemeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCheckTypeToSchemeResponseUnmarshaller {

	public static UpdateCheckTypeToSchemeResponse unmarshall(UpdateCheckTypeToSchemeResponse updateCheckTypeToSchemeResponse, UnmarshallerContext _ctx) {
		
		updateCheckTypeToSchemeResponse.setRequestId(_ctx.stringValue("UpdateCheckTypeToSchemeResponse.RequestId"));
		updateCheckTypeToSchemeResponse.setData(_ctx.longValue("UpdateCheckTypeToSchemeResponse.Data"));
		updateCheckTypeToSchemeResponse.setSuccess(_ctx.booleanValue("UpdateCheckTypeToSchemeResponse.Success"));
		updateCheckTypeToSchemeResponse.setCode(_ctx.stringValue("UpdateCheckTypeToSchemeResponse.Code"));
		updateCheckTypeToSchemeResponse.setMessage(_ctx.stringValue("UpdateCheckTypeToSchemeResponse.Message"));
		updateCheckTypeToSchemeResponse.setHttpStatusCode(_ctx.integerValue("UpdateCheckTypeToSchemeResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCheckTypeToSchemeResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("UpdateCheckTypeToSchemeResponse.Messages["+ i +"]"));
		}
		updateCheckTypeToSchemeResponse.setMessages(messages);
	 
	 	return updateCheckTypeToSchemeResponse;
	}
}