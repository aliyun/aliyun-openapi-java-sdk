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

import com.aliyuncs.oos.model.v20190601.UpdateStateConfigurationResponse;
import com.aliyuncs.oos.model.v20190601.UpdateStateConfigurationResponse.StateConfigurationItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStateConfigurationResponseUnmarshaller {

	public static UpdateStateConfigurationResponse unmarshall(UpdateStateConfigurationResponse updateStateConfigurationResponse, UnmarshallerContext _ctx) {
		
		updateStateConfigurationResponse.setRequestId(_ctx.stringValue("UpdateStateConfigurationResponse.RequestId"));

		List<StateConfigurationItem> stateConfiguration = new ArrayList<StateConfigurationItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStateConfigurationResponse.StateConfiguration.Length"); i++) {
			StateConfigurationItem stateConfigurationItem = new StateConfigurationItem();
			stateConfigurationItem.setCreateTime(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].CreateTime"));
			stateConfigurationItem.setDescription(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].Description"));
			stateConfigurationItem.setStateConfigurationId(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].StateConfigurationId"));
			stateConfigurationItem.setTemplateId(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].TemplateId"));
			stateConfigurationItem.setTemplateName(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].TemplateName"));
			stateConfigurationItem.setTemplateVersion(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].TemplateVersion"));
			stateConfigurationItem.setParameters(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].Parameters"));
			stateConfigurationItem.setConfigureMode(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].ConfigureMode"));
			stateConfigurationItem.setScheduleType(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].ScheduleType"));
			stateConfigurationItem.setScheduleExpression(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].ScheduleExpression"));
			stateConfigurationItem.setTargets(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].Targets"));
			stateConfigurationItem.setUpdateTime(_ctx.stringValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].UpdateTime"));
			stateConfigurationItem.setTags(_ctx.mapValue("UpdateStateConfigurationResponse.StateConfiguration["+ i +"].Tags"));

			stateConfiguration.add(stateConfigurationItem);
		}
		updateStateConfigurationResponse.setStateConfiguration(stateConfiguration);
	 
	 	return updateStateConfigurationResponse;
	}
}