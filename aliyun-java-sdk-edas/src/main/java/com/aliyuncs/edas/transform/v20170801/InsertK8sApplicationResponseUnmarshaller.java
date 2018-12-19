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

import com.aliyuncs.edas.model.v20170801.InsertK8sApplicationResponse;
import com.aliyuncs.edas.model.v20170801.InsertK8sApplicationResponse.ApplicationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertK8sApplicationResponseUnmarshaller {

	public static InsertK8sApplicationResponse unmarshall(InsertK8sApplicationResponse insertK8sApplicationResponse, UnmarshallerContext context) {
		
		insertK8sApplicationResponse.setRequestId(context.stringValue("InsertK8sApplicationResponse.RequestId"));
		insertK8sApplicationResponse.setCode(context.integerValue("InsertK8sApplicationResponse.Code"));
		insertK8sApplicationResponse.setMessage(context.stringValue("InsertK8sApplicationResponse.Message"));

		ApplicationInfo applicationInfo = new ApplicationInfo();
		applicationInfo.setAppName(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.AppName"));
		applicationInfo.setAppId(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.AppId"));
		applicationInfo.setUserId(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.UserId"));
		applicationInfo.setEdasId(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.EdasId"));
		applicationInfo.setOwner(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.Owner"));
		applicationInfo.setDockerize(context.booleanValue("InsertK8sApplicationResponse.ApplicationInfo.Dockerize"));
		applicationInfo.setClusterType(context.integerValue("InsertK8sApplicationResponse.ApplicationInfo.ClusterType"));
		applicationInfo.setRegionId(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.RegionId"));
		applicationInfo.setChangeOrderId(context.stringValue("InsertK8sApplicationResponse.ApplicationInfo.ChangeOrderId"));
		insertK8sApplicationResponse.setApplicationInfo(applicationInfo);
	 
	 	return insertK8sApplicationResponse;
	}
}