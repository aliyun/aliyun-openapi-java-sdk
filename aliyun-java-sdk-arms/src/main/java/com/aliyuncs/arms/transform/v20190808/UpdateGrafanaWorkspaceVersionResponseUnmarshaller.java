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

import com.aliyuncs.arms.model.v20190808.UpdateGrafanaWorkspaceVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGrafanaWorkspaceVersionResponseUnmarshaller {

	public static UpdateGrafanaWorkspaceVersionResponse unmarshall(UpdateGrafanaWorkspaceVersionResponse updateGrafanaWorkspaceVersionResponse, UnmarshallerContext _ctx) {
		
		updateGrafanaWorkspaceVersionResponse.setRequestId(_ctx.stringValue("UpdateGrafanaWorkspaceVersionResponse.RequestId"));
		updateGrafanaWorkspaceVersionResponse.setMessage(_ctx.stringValue("UpdateGrafanaWorkspaceVersionResponse.Message"));
		updateGrafanaWorkspaceVersionResponse.setCode(_ctx.integerValue("UpdateGrafanaWorkspaceVersionResponse.Code"));
		updateGrafanaWorkspaceVersionResponse.setSuccess(_ctx.booleanValue("UpdateGrafanaWorkspaceVersionResponse.Success"));
		updateGrafanaWorkspaceVersionResponse.setTraceId(_ctx.stringValue("UpdateGrafanaWorkspaceVersionResponse.TraceId"));
		updateGrafanaWorkspaceVersionResponse.setData(_ctx.booleanValue("UpdateGrafanaWorkspaceVersionResponse.Data"));
	 
	 	return updateGrafanaWorkspaceVersionResponse;
	}
}