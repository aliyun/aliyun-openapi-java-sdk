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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.SaveSearchConditionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveSearchConditionResponseUnmarshaller {

	public static SaveSearchConditionResponse unmarshall(SaveSearchConditionResponse saveSearchConditionResponse, UnmarshallerContext _ctx) {
		
		saveSearchConditionResponse.setRequestId(_ctx.stringValue("SaveSearchConditionResponse.RequestId"));
		saveSearchConditionResponse.setType(_ctx.integerValue("SaveSearchConditionResponse.Type"));
		saveSearchConditionResponse.setUmid(_ctx.stringValue("SaveSearchConditionResponse.Umid"));
		saveSearchConditionResponse.setTagName(_ctx.stringValue("SaveSearchConditionResponse.TagName"));
		saveSearchConditionResponse.setConditionId(_ctx.longValue("SaveSearchConditionResponse.ConditionId"));
		saveSearchConditionResponse.setSuccess(_ctx.booleanValue("SaveSearchConditionResponse.Success"));
		saveSearchConditionResponse.setUserId(_ctx.longValue("SaveSearchConditionResponse.UserId"));
		saveSearchConditionResponse.setCode(_ctx.stringValue("SaveSearchConditionResponse.Code"));
		saveSearchConditionResponse.setMessage(_ctx.stringValue("SaveSearchConditionResponse.Message"));
		saveSearchConditionResponse.setConditionContent(_ctx.stringValue("SaveSearchConditionResponse.ConditionContent"));
		saveSearchConditionResponse.setSessionId(_ctx.stringValue("SaveSearchConditionResponse.SessionId"));
	 
	 	return saveSearchConditionResponse;
	}
}