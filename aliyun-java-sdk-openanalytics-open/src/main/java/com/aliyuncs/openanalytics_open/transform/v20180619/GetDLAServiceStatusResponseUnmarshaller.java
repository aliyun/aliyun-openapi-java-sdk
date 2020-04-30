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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetDLAServiceStatusResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.GetDLAServiceStatusResponse.UserDLAServiceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDLAServiceStatusResponseUnmarshaller {

	public static GetDLAServiceStatusResponse unmarshall(GetDLAServiceStatusResponse getDLAServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getDLAServiceStatusResponse.setRequestId(_ctx.stringValue("GetDLAServiceStatusResponse.RequestId"));
		getDLAServiceStatusResponse.setRegionId(_ctx.stringValue("GetDLAServiceStatusResponse.RegionId"));

		UserDLAServiceStatus userDLAServiceStatus = new UserDLAServiceStatus();
		userDLAServiceStatus.setIsServiceReady(_ctx.booleanValue("GetDLAServiceStatusResponse.UserDLAServiceStatus.IsServiceReady"));
		userDLAServiceStatus.setIsOSSOpen(_ctx.booleanValue("GetDLAServiceStatusResponse.UserDLAServiceStatus.IsOSSOpen"));
		userDLAServiceStatus.setIsDLAAccountReady(_ctx.booleanValue("GetDLAServiceStatusResponse.UserDLAServiceStatus.IsDLAAccountReady"));
		getDLAServiceStatusResponse.setUserDLAServiceStatus(userDLAServiceStatus);
	 
	 	return getDLAServiceStatusResponse;
	}
}