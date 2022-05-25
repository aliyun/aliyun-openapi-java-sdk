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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DeleteHybridMonitorSLSGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteHybridMonitorSLSGroupResponseUnmarshaller {

	public static DeleteHybridMonitorSLSGroupResponse unmarshall(DeleteHybridMonitorSLSGroupResponse deleteHybridMonitorSLSGroupResponse, UnmarshallerContext _ctx) {
		
		deleteHybridMonitorSLSGroupResponse.setRequestId(_ctx.stringValue("DeleteHybridMonitorSLSGroupResponse.RequestId"));
		deleteHybridMonitorSLSGroupResponse.setCode(_ctx.stringValue("DeleteHybridMonitorSLSGroupResponse.Code"));
		deleteHybridMonitorSLSGroupResponse.setMessage(_ctx.stringValue("DeleteHybridMonitorSLSGroupResponse.Message"));
		deleteHybridMonitorSLSGroupResponse.setSuccess(_ctx.stringValue("DeleteHybridMonitorSLSGroupResponse.Success"));
	 
	 	return deleteHybridMonitorSLSGroupResponse;
	}
}