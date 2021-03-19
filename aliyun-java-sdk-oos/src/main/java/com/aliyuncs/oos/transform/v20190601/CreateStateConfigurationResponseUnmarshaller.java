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

import com.aliyuncs.oos.model.v20190601.CreateStateConfigurationResponse;
import com.aliyuncs.oos.model.v20190601.CreateStateConfigurationResponse.StateConfiguration;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStateConfigurationResponseUnmarshaller {

	public static CreateStateConfigurationResponse unmarshall(CreateStateConfigurationResponse createStateConfigurationResponse, UnmarshallerContext _ctx) {
		
		createStateConfigurationResponse.setRequestId(_ctx.stringValue("CreateStateConfigurationResponse.RequestId"));

		StateConfiguration stateConfiguration = new StateConfiguration();
		stateConfiguration.setCreateTime(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.CreateTime"));
		stateConfiguration.setDescription(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.Description"));
		stateConfiguration.setStateConfigurationId(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.StateConfigurationId"));
		stateConfiguration.setTemplateId(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.TemplateId"));
		stateConfiguration.setTemplateName(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.TemplateName"));
		stateConfiguration.setTemplateVersion(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.TemplateVersion"));
		stateConfiguration.setParameters(_ctx.mapValue("CreateStateConfigurationResponse.StateConfiguration.Parameters"));
		stateConfiguration.setConfigureMode(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.ConfigureMode"));
		stateConfiguration.setScheduleType(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.ScheduleType"));
		stateConfiguration.setScheduleExpression(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.ScheduleExpression"));
		stateConfiguration.setTargets(_ctx.stringValue("CreateStateConfigurationResponse.StateConfiguration.Targets"));
		stateConfiguration.setTags(_ctx.mapValue("CreateStateConfigurationResponse.StateConfiguration.Tags"));
		createStateConfigurationResponse.setStateConfiguration(stateConfiguration);
	 
	 	return createStateConfigurationResponse;
	}
}