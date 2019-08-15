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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppStatusResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.GetAppStatusResponse.AppStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppStatusResponseUnmarshaller {

	public static GetAppStatusResponse unmarshall(GetAppStatusResponse getAppStatusResponse, UnmarshallerContext _ctx) {
		
		getAppStatusResponse.setRequestId(_ctx.stringValue("GetAppStatusResponse.RequestId"));

		AppStatus appStatus = new AppStatus();
		appStatus.setCrashStatus(_ctx.booleanValue("GetAppStatusResponse.AppStatus.CrashStatus"));
		appStatus.setApmStatus(_ctx.booleanValue("GetAppStatusResponse.AppStatus.ApmStatus"));
		appStatus.setTlogStatus(_ctx.booleanValue("GetAppStatusResponse.AppStatus.TlogStatus"));
		getAppStatusResponse.setAppStatus(appStatus);
	 
	 	return getAppStatusResponse;
	}
}