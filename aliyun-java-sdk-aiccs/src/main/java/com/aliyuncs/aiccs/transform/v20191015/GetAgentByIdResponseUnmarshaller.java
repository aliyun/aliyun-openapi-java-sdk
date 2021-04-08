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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetAgentByIdResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAgentByIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentByIdResponseUnmarshaller {

	public static GetAgentByIdResponse unmarshall(GetAgentByIdResponse getAgentByIdResponse, UnmarshallerContext _ctx) {
		
		getAgentByIdResponse.setRequestId(_ctx.stringValue("GetAgentByIdResponse.RequestId"));
		getAgentByIdResponse.setMessage(_ctx.stringValue("GetAgentByIdResponse.Message"));
		getAgentByIdResponse.setCode(_ctx.stringValue("GetAgentByIdResponse.Code"));
		getAgentByIdResponse.setSuccess(_ctx.booleanValue("GetAgentByIdResponse.Success"));

		Data data = new Data();
		data.setForeignNick(_ctx.stringValue("GetAgentByIdResponse.Data.ForeignNick"));
		data.setServicerType(_ctx.integerValue("GetAgentByIdResponse.Data.ServicerType"));
		data.setAgentId(_ctx.integerValue("GetAgentByIdResponse.Data.AgentId"));
		data.setRealName(_ctx.stringValue("GetAgentByIdResponse.Data.RealName"));
		data.setForeignKey(_ctx.stringValue("GetAgentByIdResponse.Data.ForeignKey"));
		data.setCreateUserName(_ctx.stringValue("GetAgentByIdResponse.Data.CreateUserName"));
		data.setShowName(_ctx.stringValue("GetAgentByIdResponse.Data.ShowName"));
		getAgentByIdResponse.setData(data);
	 
	 	return getAgentByIdResponse;
	}
}