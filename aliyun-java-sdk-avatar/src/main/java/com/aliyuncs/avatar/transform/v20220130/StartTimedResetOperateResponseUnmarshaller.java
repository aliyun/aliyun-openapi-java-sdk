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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.StartTimedResetOperateResponse;
import com.aliyuncs.avatar.model.v20220130.StartTimedResetOperateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTimedResetOperateResponseUnmarshaller {

	public static StartTimedResetOperateResponse unmarshall(StartTimedResetOperateResponse startTimedResetOperateResponse, UnmarshallerContext _ctx) {
		
		startTimedResetOperateResponse.setRequestId(_ctx.stringValue("StartTimedResetOperateResponse.RequestId"));
		startTimedResetOperateResponse.setCode(_ctx.stringValue("StartTimedResetOperateResponse.Code"));
		startTimedResetOperateResponse.setMessage(_ctx.stringValue("StartTimedResetOperateResponse.Message"));
		startTimedResetOperateResponse.setSuccess(_ctx.booleanValue("StartTimedResetOperateResponse.Success"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("StartTimedResetOperateResponse.Data.InstanceId"));
		data.setTenantId(_ctx.longValue("StartTimedResetOperateResponse.Data.TenantId"));
		startTimedResetOperateResponse.setData(data);
	 
	 	return startTimedResetOperateResponse;
	}
}