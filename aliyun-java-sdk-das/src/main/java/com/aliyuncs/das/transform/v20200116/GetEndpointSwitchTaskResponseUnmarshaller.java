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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetEndpointSwitchTaskResponse;
import com.aliyuncs.das.model.v20200116.GetEndpointSwitchTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndpointSwitchTaskResponseUnmarshaller {

	public static GetEndpointSwitchTaskResponse unmarshall(GetEndpointSwitchTaskResponse getEndpointSwitchTaskResponse, UnmarshallerContext _ctx) {
		
		getEndpointSwitchTaskResponse.setRequestId(_ctx.stringValue("GetEndpointSwitchTaskResponse.RequestId"));
		getEndpointSwitchTaskResponse.setMessage(_ctx.stringValue("GetEndpointSwitchTaskResponse.Message"));
		getEndpointSwitchTaskResponse.setSynchro(_ctx.stringValue("GetEndpointSwitchTaskResponse.Synchro"));
		getEndpointSwitchTaskResponse.setCode(_ctx.stringValue("GetEndpointSwitchTaskResponse.Code"));
		getEndpointSwitchTaskResponse.setSuccess(_ctx.stringValue("GetEndpointSwitchTaskResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.Status"));
		data.setUuid(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.Uuid"));
		data.setOriUuid(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.OriUuid"));
		data.setAccountId(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.AccountId"));
		data.setErrMsg(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.ErrMsg"));
		data.setTaskId(_ctx.stringValue("GetEndpointSwitchTaskResponse.Data.TaskId"));
		data.setDbLinkId(_ctx.longValue("GetEndpointSwitchTaskResponse.Data.DbLinkId"));
		getEndpointSwitchTaskResponse.setData(data);
	 
	 	return getEndpointSwitchTaskResponse;
	}
}