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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.InsertApplicationResponse;
import com.aliyuncs.edas.model.v20170801.InsertApplicationResponse.ApplicationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertApplicationResponseUnmarshaller {

	public static InsertApplicationResponse unmarshall(InsertApplicationResponse insertApplicationResponse, UnmarshallerContext context) {
		
		insertApplicationResponse.setRequestId(context.stringValue("InsertApplicationResponse.RequestId"));
		insertApplicationResponse.setCode(context.integerValue("InsertApplicationResponse.Code"));
		insertApplicationResponse.setMessage(context.stringValue("InsertApplicationResponse.Message"));

		ApplicationInfo applicationInfo = new ApplicationInfo();
		applicationInfo.setAppName(context.stringValue("InsertApplicationResponse.ApplicationInfo.AppName"));
		applicationInfo.setAppId(context.stringValue("InsertApplicationResponse.ApplicationInfo.AppId"));
		applicationInfo.setUserId(context.stringValue("InsertApplicationResponse.ApplicationInfo.UserId"));
		applicationInfo.setOwner(context.stringValue("InsertApplicationResponse.ApplicationInfo.Owner"));
		applicationInfo.setDockerize(context.booleanValue("InsertApplicationResponse.ApplicationInfo.Dockerize"));
		applicationInfo.setPort(context.integerValue("InsertApplicationResponse.ApplicationInfo.Port"));
		applicationInfo.setRegionName(context.stringValue("InsertApplicationResponse.ApplicationInfo.RegionName"));
		applicationInfo.setChangeOrderId(context.stringValue("InsertApplicationResponse.ApplicationInfo.ChangeOrderId"));
		insertApplicationResponse.setApplicationInfo(applicationInfo);
	 
	 	return insertApplicationResponse;
	}
}