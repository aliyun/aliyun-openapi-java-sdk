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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationResponseUnmarshaller {

	public static ListApplicationResponse unmarshall(ListApplicationResponse listApplicationResponse, UnmarshallerContext _ctx) {
		
		listApplicationResponse.setRequestId(_ctx.stringValue("ListApplicationResponse.RequestId"));
		listApplicationResponse.setCode(_ctx.integerValue("ListApplicationResponse.Code"));
		listApplicationResponse.setMessage(_ctx.stringValue("ListApplicationResponse.Message"));

		List<Application> applicationList = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationResponse.ApplicationList.Length"); i++) {
			Application application = new Application();
			application.setAppId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].AppId"));
			application.setName(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Name"));
			application.setRegionId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].RegionId"));
			application.setDescription(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Description"));
			application.setOwner(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Owner"));
			application.setInstanceCount(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].InstanceCount"));
			application.setRunningInstanceCount(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].RunningInstanceCount"));
			application.setPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Port"));
			application.setUserId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].UserId"));
			application.setSlbId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].SlbId"));
			application.setSlbIp(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].SlbIp"));
			application.setSlbPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].SlbPort"));
			application.setExtSlbId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbId"));
			application.setExtSlbIp(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbIp"));
			application.setApplicationType(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ApplicationType"));
			application.setClusterType(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterType"));
			application.setClusterId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterId"));
			application.setDockerize(_ctx.booleanValue("ListApplicationResponse.ApplicationList["+ i +"].Dockerize"));
			application.setCpu(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Cpu"));
			application.setMemory(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Memory"));
			application.setHealthCheckUrl(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].HealthCheckUrl"));
			application.setBuildPackageId(_ctx.longValue("ListApplicationResponse.ApplicationList["+ i +"].BuildPackageId"));
			application.setCreateTime(_ctx.longValue("ListApplicationResponse.ApplicationList["+ i +"].CreateTime"));

			applicationList.add(application);
		}
		listApplicationResponse.setApplicationList(applicationList);
	 
	 	return listApplicationResponse;
	}
}