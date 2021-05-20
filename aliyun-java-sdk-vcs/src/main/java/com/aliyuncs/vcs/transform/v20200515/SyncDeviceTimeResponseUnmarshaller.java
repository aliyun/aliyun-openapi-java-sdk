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

import com.aliyuncs.vcs.model.v20200515.SyncDeviceTimeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDeviceTimeResponseUnmarshaller {

	public static SyncDeviceTimeResponse unmarshall(SyncDeviceTimeResponse syncDeviceTimeResponse, UnmarshallerContext _ctx) {
		
		syncDeviceTimeResponse.setRequestId(_ctx.stringValue("SyncDeviceTimeResponse.RequestId"));
		syncDeviceTimeResponse.setSyncInterval(_ctx.stringValue("SyncDeviceTimeResponse.SyncInterval"));
		syncDeviceTimeResponse.setMessage(_ctx.stringValue("SyncDeviceTimeResponse.Message"));
		syncDeviceTimeResponse.setNTPServer(_ctx.stringValue("SyncDeviceTimeResponse.NTPServer"));
		syncDeviceTimeResponse.setRetryInterval(_ctx.stringValue("SyncDeviceTimeResponse.RetryInterval"));
		syncDeviceTimeResponse.setCode(_ctx.stringValue("SyncDeviceTimeResponse.Code"));
		syncDeviceTimeResponse.setTimeStamp(_ctx.stringValue("SyncDeviceTimeResponse.TimeStamp"));
	 
	 	return syncDeviceTimeResponse;
	}
}