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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.GetApplicationResponse;
import com.aliyuncs.oos.model.v20190601.GetApplicationResponse.Application;
import com.aliyuncs.oos.model.v20190601.GetApplicationResponse.Application.AlarmConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));

		Application application = new Application();
		application.setDescription(_ctx.stringValue("GetApplicationResponse.Application.Description"));
		application.setUpdateDate(_ctx.stringValue("GetApplicationResponse.Application.UpdateDate"));
		application.setResourceGroupId(_ctx.stringValue("GetApplicationResponse.Application.ResourceGroupId"));
		application.setTags(_ctx.mapValue("GetApplicationResponse.Application.Tags"));
		application.setName(_ctx.stringValue("GetApplicationResponse.Application.Name"));
		application.setCreateDate(_ctx.stringValue("GetApplicationResponse.Application.CreateDate"));
		application.setApplicationType(_ctx.stringValue("GetApplicationResponse.Application.ApplicationType"));
		application.setServiceId(_ctx.stringValue("GetApplicationResponse.Application.ServiceId"));

		AlarmConfig alarmConfig = new AlarmConfig();
		alarmConfig.setHealthCheckUrl(_ctx.stringValue("GetApplicationResponse.Application.AlarmConfig.HealthCheckUrl"));

		List<String> contactGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Application.AlarmConfig.ContactGroups.Length"); i++) {
			contactGroups.add(_ctx.stringValue("GetApplicationResponse.Application.AlarmConfig.ContactGroups["+ i +"]"));
		}
		alarmConfig.setContactGroups(contactGroups);

		List<String> templateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Application.AlarmConfig.TemplateIds.Length"); i++) {
			templateIds.add(_ctx.stringValue("GetApplicationResponse.Application.AlarmConfig.TemplateIds["+ i +"]"));
		}
		alarmConfig.setTemplateIds(templateIds);
		application.setAlarmConfig(alarmConfig);
		getApplicationResponse.setApplication(application);
	 
	 	return getApplicationResponse;
	}
}