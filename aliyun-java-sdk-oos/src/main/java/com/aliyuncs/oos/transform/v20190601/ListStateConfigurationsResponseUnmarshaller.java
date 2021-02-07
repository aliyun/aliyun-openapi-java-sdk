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

import com.aliyuncs.oos.model.v20190601.ListStateConfigurationsResponse;
import com.aliyuncs.oos.model.v20190601.ListStateConfigurationsResponse.StateConfiguration;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStateConfigurationsResponseUnmarshaller {

	public static ListStateConfigurationsResponse unmarshall(ListStateConfigurationsResponse listStateConfigurationsResponse, UnmarshallerContext _ctx) {
		
		listStateConfigurationsResponse.setRequestId(_ctx.stringValue("ListStateConfigurationsResponse.RequestId"));

		List<StateConfiguration> stateConfigurations = new ArrayList<StateConfiguration>();
		for (int i = 0; i < _ctx.lengthValue("ListStateConfigurationsResponse.StateConfigurations.Length"); i++) {
			StateConfiguration stateConfiguration = new StateConfiguration();
			stateConfiguration.setCreateTime(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].CreateTime"));
			stateConfiguration.setDescription(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].Description"));
			stateConfiguration.setStateConfigurationId(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].StateConfigurationId"));
			stateConfiguration.setTemplateId(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].TemplateId"));
			stateConfiguration.setTemplateName(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].TemplateName"));
			stateConfiguration.setTemplateVersion(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].TemplateVersion"));
			stateConfiguration.setParameters(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].Parameters"));
			stateConfiguration.setConfigureMode(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].ConfigureMode"));
			stateConfiguration.setScheduleType(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].ScheduleType"));
			stateConfiguration.setScheduleExpression(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].ScheduleExpression"));
			stateConfiguration.setTargets(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].Targets"));
			stateConfiguration.setUpdateTime(_ctx.stringValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].UpdateTime"));
			stateConfiguration.setTags(_ctx.mapValue("ListStateConfigurationsResponse.StateConfigurations["+ i +"].Tags"));

			stateConfigurations.add(stateConfiguration);
		}
		listStateConfigurationsResponse.setStateConfigurations(stateConfigurations);
	 
	 	return listStateConfigurationsResponse;
	}
}