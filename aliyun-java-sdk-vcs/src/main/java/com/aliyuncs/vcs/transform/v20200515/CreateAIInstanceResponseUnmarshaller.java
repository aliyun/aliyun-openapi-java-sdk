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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateAIInstanceResponse;
import com.aliyuncs.vcs.model.v20200515.CreateAIInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAIInstanceResponseUnmarshaller {

	public static CreateAIInstanceResponse unmarshall(CreateAIInstanceResponse createAIInstanceResponse, UnmarshallerContext _ctx) {
		
		createAIInstanceResponse.setRequestId(_ctx.stringValue("CreateAIInstanceResponse.RequestId"));
		createAIInstanceResponse.setMessage(_ctx.stringValue("CreateAIInstanceResponse.Message"));
		createAIInstanceResponse.setCode(_ctx.stringValue("CreateAIInstanceResponse.Code"));

		Data data = new Data();
		data.setAcuUsed(_ctx.longValue("CreateAIInstanceResponse.Data.AcuUsed"));
		data.setInstanceId(_ctx.stringValue("CreateAIInstanceResponse.Data.InstanceId"));
		createAIInstanceResponse.setData(data);
	 
	 	return createAIInstanceResponse;
	}
}