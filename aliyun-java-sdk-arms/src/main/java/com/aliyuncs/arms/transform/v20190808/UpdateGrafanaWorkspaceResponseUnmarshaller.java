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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.UpdateGrafanaWorkspaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGrafanaWorkspaceResponseUnmarshaller {

	public static UpdateGrafanaWorkspaceResponse unmarshall(UpdateGrafanaWorkspaceResponse updateGrafanaWorkspaceResponse, UnmarshallerContext _ctx) {
		
		updateGrafanaWorkspaceResponse.setRequestId(_ctx.stringValue("UpdateGrafanaWorkspaceResponse.RequestId"));
		updateGrafanaWorkspaceResponse.setMessage(_ctx.stringValue("UpdateGrafanaWorkspaceResponse.Message"));
		updateGrafanaWorkspaceResponse.setCode(_ctx.integerValue("UpdateGrafanaWorkspaceResponse.Code"));
		updateGrafanaWorkspaceResponse.setSuccess(_ctx.booleanValue("UpdateGrafanaWorkspaceResponse.Success"));
		updateGrafanaWorkspaceResponse.setTraceId(_ctx.stringValue("UpdateGrafanaWorkspaceResponse.TraceId"));
		updateGrafanaWorkspaceResponse.setData(_ctx.booleanValue("UpdateGrafanaWorkspaceResponse.Data"));
	 
	 	return updateGrafanaWorkspaceResponse;
	}
}