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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.CreateGroupIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGroupIdResponseUnmarshaller {

	public static CreateGroupIdResponse unmarshall(CreateGroupIdResponse createGroupIdResponse, UnmarshallerContext _ctx) {
		
		createGroupIdResponse.setRequestId(_ctx.stringValue("CreateGroupIdResponse.RequestId"));
		createGroupIdResponse.setHelpUrl(_ctx.stringValue("CreateGroupIdResponse.HelpUrl"));
	 
	 	return createGroupIdResponse;
	}
}