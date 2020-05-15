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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.CountMonitorGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountMonitorGroupResponseUnmarshaller {

	public static CountMonitorGroupResponse unmarshall(CountMonitorGroupResponse countMonitorGroupResponse, UnmarshallerContext _ctx) {
		
		countMonitorGroupResponse.setRequestId(_ctx.stringValue("CountMonitorGroupResponse.RequestId"));
		countMonitorGroupResponse.setCode(_ctx.stringValue("CountMonitorGroupResponse.Code"));
		countMonitorGroupResponse.setMessage(_ctx.stringValue("CountMonitorGroupResponse.Message"));
		countMonitorGroupResponse.setSuccess(_ctx.booleanValue("CountMonitorGroupResponse.Success"));
		countMonitorGroupResponse.setHttpStatusCode(_ctx.integerValue("CountMonitorGroupResponse.HttpStatusCode"));
		countMonitorGroupResponse.setResultMap(_ctx.stringValue("CountMonitorGroupResponse.ResultMap"));
	 
	 	return countMonitorGroupResponse;
	}
}