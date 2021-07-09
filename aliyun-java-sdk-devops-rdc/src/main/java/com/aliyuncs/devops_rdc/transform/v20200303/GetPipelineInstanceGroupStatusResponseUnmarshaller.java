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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceGroupStatusResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceGroupStatusResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceGroupStatusResponse.Object.Group;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceGroupStatusResponse.Object.Group.Stage;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceGroupStatusResponse.Object.Group.Stage.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineInstanceGroupStatusResponseUnmarshaller {

	public static GetPipelineInstanceGroupStatusResponse unmarshall(GetPipelineInstanceGroupStatusResponse getPipelineInstanceGroupStatusResponse, UnmarshallerContext _ctx) {
		
		getPipelineInstanceGroupStatusResponse.setRequestId(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.RequestId"));
		getPipelineInstanceGroupStatusResponse.setErrorMessage(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.ErrorMessage"));
		getPipelineInstanceGroupStatusResponse.setSuccess(_ctx.booleanValue("GetPipelineInstanceGroupStatusResponse.Success"));
		getPipelineInstanceGroupStatusResponse.setErrorCode(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.ErrorCode"));

		Object object = new Object();
		object.setStatus(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Status"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineInstanceGroupStatusResponse.Object.Groups.Length"); i++) {
			Group group = new Group();
			group.setStatus(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Status"));
			group.setName(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Name"));

			List<Stage> stages = new ArrayList<Stage>();
			for (int j = 0; j < _ctx.lengthValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages.Length"); j++) {
				Stage stage = new Stage();
				stage.setStatus(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Status"));
				stage.setSign(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Sign"));

				List<Component> components = new ArrayList<Component>();
				for (int k = 0; k < _ctx.lengthValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Components.Length"); k++) {
					Component component = new Component();
					component.setStatus(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Components["+ k +"].Status"));
					component.setName(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Components["+ k +"].Name"));
					component.setJobId(_ctx.stringValue("GetPipelineInstanceGroupStatusResponse.Object.Groups["+ i +"].Stages["+ j +"].Components["+ k +"].JobId"));

					components.add(component);
				}
				stage.setComponents(components);

				stages.add(stage);
			}
			group.setStages(stages);

			groups.add(group);
		}
		object.setGroups(groups);
		getPipelineInstanceGroupStatusResponse.setObject(object);
	 
	 	return getPipelineInstanceGroupStatusResponse;
	}
}