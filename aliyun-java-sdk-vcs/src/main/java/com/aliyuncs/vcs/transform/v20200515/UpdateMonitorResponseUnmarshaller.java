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

import com.aliyuncs.vcs.model.v20200515.UpdateMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMonitorResponseUnmarshaller {

	public static UpdateMonitorResponse unmarshall(UpdateMonitorResponse updateMonitorResponse, UnmarshallerContext _ctx) {
		
		updateMonitorResponse.setRequestId(_ctx.stringValue("UpdateMonitorResponse.RequestId"));
		updateMonitorResponse.setMessage(_ctx.stringValue("UpdateMonitorResponse.Message"));
		updateMonitorResponse.setData(_ctx.stringValue("UpdateMonitorResponse.Data"));
		updateMonitorResponse.setCode(_ctx.stringValue("UpdateMonitorResponse.Code"));
	 
	 	return updateMonitorResponse;
	}
}