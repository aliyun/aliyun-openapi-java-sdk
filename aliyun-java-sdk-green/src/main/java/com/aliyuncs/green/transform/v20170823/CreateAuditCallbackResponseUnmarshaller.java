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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.CreateAuditCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAuditCallbackResponseUnmarshaller {

	public static CreateAuditCallbackResponse unmarshall(CreateAuditCallbackResponse createAuditCallbackResponse, UnmarshallerContext _ctx) {
		
		createAuditCallbackResponse.setRequestId(_ctx.stringValue("CreateAuditCallbackResponse.RequestId"));
		createAuditCallbackResponse.setId(_ctx.longValue("CreateAuditCallbackResponse.Id"));
		createAuditCallbackResponse.setName(_ctx.stringValue("CreateAuditCallbackResponse.Name"));
		createAuditCallbackResponse.setUrl(_ctx.stringValue("CreateAuditCallbackResponse.Url"));
		createAuditCallbackResponse.setSeed(_ctx.stringValue("CreateAuditCallbackResponse.Seed"));
		createAuditCallbackResponse.setCryptType(_ctx.stringValue("CreateAuditCallbackResponse.CryptType"));
		createAuditCallbackResponse.setCreateTime(_ctx.stringValue("CreateAuditCallbackResponse.CreateTime"));
		createAuditCallbackResponse.setModifiedTime(_ctx.stringValue("CreateAuditCallbackResponse.ModifiedTime"));

		List<String> callbackTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAuditCallbackResponse.CallbackTypes.Length"); i++) {
			callbackTypes.add(_ctx.stringValue("CreateAuditCallbackResponse.CallbackTypes["+ i +"]"));
		}
		createAuditCallbackResponse.setCallbackTypes(callbackTypes);

		List<String> callbackSuggestions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAuditCallbackResponse.CallbackSuggestions.Length"); i++) {
			callbackSuggestions.add(_ctx.stringValue("CreateAuditCallbackResponse.CallbackSuggestions["+ i +"]"));
		}
		createAuditCallbackResponse.setCallbackSuggestions(callbackSuggestions);
	 
	 	return createAuditCallbackResponse;
	}
}