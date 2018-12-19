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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListApplicationResponse;
import com.aliyuncs.edas.model.v20170801.ListApplicationResponse.Application;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationResponseUnmarshaller {

	public static ListApplicationResponse unmarshall(ListApplicationResponse listApplicationResponse, UnmarshallerContext context) {
		
		listApplicationResponse.setRequestId(context.stringValue("ListApplicationResponse.RequestId"));
		listApplicationResponse.setCode(context.integerValue("ListApplicationResponse.Code"));
		listApplicationResponse.setMessage(context.stringValue("ListApplicationResponse.Message"));

		List<Application> applicationList = new ArrayList<Application>();
		for (int i = 0; i < context.lengthValue("ListApplicationResponse.ApplicationList.Length"); i++) {
			Application application = new Application();
			application.setAppId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].AppId"));
			application.setName(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Name"));
			application.setRegionId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].RegionId"));
			application.setDescription(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Description"));
			application.setOwner(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Owner"));
			application.setInstanceCount(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].InstanceCount"));
			application.setRunningInstanceCount(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].RunningInstanceCount"));
			application.setPort(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Port"));
			application.setUserId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].UserId"));
			application.setSlbId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].SlbId"));
			application.setSlbIp(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].SlbIp"));
			application.setSlbPort(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].SlbPort"));
			application.setExtSlbId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbId"));
			application.setExtSlbIp(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbIp"));
			application.setApplicationType(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ApplicationType"));
			application.setClusterType(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterType"));
			application.setClusterId(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterId"));
			application.setDockerize(context.booleanValue("ListApplicationResponse.ApplicationList["+ i +"].Dockerize"));
			application.setCpu(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Cpu"));
			application.setMemory(context.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Memory"));
			application.setHealthCheckUrl(context.stringValue("ListApplicationResponse.ApplicationList["+ i +"].HealthCheckUrl"));
			application.setBuildPackageId(context.longValue("ListApplicationResponse.ApplicationList["+ i +"].BuildPackageId"));
			application.setCreateTime(context.longValue("ListApplicationResponse.ApplicationList["+ i +"].CreateTime"));

			applicationList.add(application);
		}
		listApplicationResponse.setApplicationList(applicationList);
	 
	 	return listApplicationResponse;
	}
}