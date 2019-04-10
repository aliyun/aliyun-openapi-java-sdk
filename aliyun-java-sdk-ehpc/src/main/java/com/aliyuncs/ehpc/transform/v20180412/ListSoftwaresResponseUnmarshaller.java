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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse;
import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse.SoftwareInfo;
import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse.SoftwareInfo.ApplicationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSoftwaresResponseUnmarshaller {

	public static ListSoftwaresResponse unmarshall(ListSoftwaresResponse listSoftwaresResponse, UnmarshallerContext context) {
		
		listSoftwaresResponse.setRequestId(context.stringValue("ListSoftwaresResponse.RequestId"));

		List<SoftwareInfo> softwares = new ArrayList<SoftwareInfo>();
		for (int i = 0; i < context.lengthValue("ListSoftwaresResponse.Softwares.Length"); i++) {
			SoftwareInfo softwareInfo = new SoftwareInfo();
			softwareInfo.setEhpcVersion(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].EhpcVersion"));
			softwareInfo.setOsTag(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].OsTag"));
			softwareInfo.setSchedulerType(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].SchedulerType"));
			softwareInfo.setSchedulerVersion(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].SchedulerVersion"));
			softwareInfo.setAccountType(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].AccountType"));
			softwareInfo.setAccountVersion(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].AccountVersion"));

			List<ApplicationInfo> applications = new ArrayList<ApplicationInfo>();
			for (int j = 0; j < context.lengthValue("ListSoftwaresResponse.Softwares["+ i +"].Applications.Length"); j++) {
				ApplicationInfo applicationInfo = new ApplicationInfo();
				applicationInfo.setTag(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Tag"));
				applicationInfo.setName(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Name"));
				applicationInfo.setVersion(context.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Version"));
				applicationInfo.setRequired(context.booleanValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Required"));

				applications.add(applicationInfo);
			}
			softwareInfo.setApplications(applications);

			softwares.add(softwareInfo);
		}
		listSoftwaresResponse.setSoftwares(softwares);
	 
	 	return listSoftwaresResponse;
	}
}