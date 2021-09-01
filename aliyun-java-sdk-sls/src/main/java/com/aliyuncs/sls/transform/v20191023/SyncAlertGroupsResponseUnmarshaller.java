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

package com.aliyuncs.sls.transform.v20191023;

import com.aliyuncs.sls.model.v20191023.SyncAlertGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncAlertGroupsResponseUnmarshaller {

	public static SyncAlertGroupsResponse unmarshall(SyncAlertGroupsResponse syncAlertGroupsResponse, UnmarshallerContext _ctx) {
		
		syncAlertGroupsResponse.setRequestId(_ctx.stringValue("SyncAlertGroupsResponse.RequestId"));
		syncAlertGroupsResponse.setSuccess(_ctx.booleanValue("SyncAlertGroupsResponse.Success"));
		syncAlertGroupsResponse.setCode(_ctx.stringValue("SyncAlertGroupsResponse.Code"));
		syncAlertGroupsResponse.setMessage(_ctx.stringValue("SyncAlertGroupsResponse.Message"));
		syncAlertGroupsResponse.setData(_ctx.stringValue("SyncAlertGroupsResponse.Data"));
	 
	 	return syncAlertGroupsResponse;
	}
}