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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListWorkflowResponse;
import com.aliyuncs.xrengine.model.v20221111.ListWorkflowResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.ListWorkflowResponse.Data.Workflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkflowResponseUnmarshaller {

	public static ListWorkflowResponse unmarshall(ListWorkflowResponse listWorkflowResponse, UnmarshallerContext _ctx) {
		
		listWorkflowResponse.setRequestId(_ctx.stringValue("ListWorkflowResponse.RequestId"));
		listWorkflowResponse.setSuccess(_ctx.booleanValue("ListWorkflowResponse.Success"));
		listWorkflowResponse.setMessage(_ctx.stringValue("ListWorkflowResponse.Message"));
		listWorkflowResponse.setHttpCode(_ctx.longValue("ListWorkflowResponse.HttpCode"));

		Data data = new Data();

		List<Workflow> object = new ArrayList<Workflow>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowResponse.Data.Object.Length"); i++) {
			Workflow workflow = new Workflow();
			workflow.setBizUsage(_ctx.stringValue("ListWorkflowResponse.Data.Object["+ i +"].BizUsage"));
			workflow.setId(_ctx.longValue("ListWorkflowResponse.Data.Object["+ i +"].Id"));
			workflow.setObjectType(_ctx.stringValue("ListWorkflowResponse.Data.Object["+ i +"].ObjectType"));
			workflow.setStatus(_ctx.longValue("ListWorkflowResponse.Data.Object["+ i +"].Status"));
			workflow.setName(_ctx.stringValue("ListWorkflowResponse.Data.Object["+ i +"].Name"));

			object.add(workflow);
		}
		data.setObject(object);

		List<Workflow> objectGeneration = new ArrayList<Workflow>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowResponse.Data.ObjectGeneration.Length"); i++) {
			Workflow workflow1 = new Workflow();
			workflow1.setBizUsage(_ctx.stringValue("ListWorkflowResponse.Data.ObjectGeneration["+ i +"].BizUsage"));
			workflow1.setId(_ctx.longValue("ListWorkflowResponse.Data.ObjectGeneration["+ i +"].Id"));
			workflow1.setObjectType(_ctx.stringValue("ListWorkflowResponse.Data.ObjectGeneration["+ i +"].ObjectType"));
			workflow1.setStatus(_ctx.longValue("ListWorkflowResponse.Data.ObjectGeneration["+ i +"].Status"));
			workflow1.setName(_ctx.stringValue("ListWorkflowResponse.Data.ObjectGeneration["+ i +"].Name"));

			objectGeneration.add(workflow1);
		}
		data.setObjectGeneration(objectGeneration);

		List<Workflow> mannequins = new ArrayList<Workflow>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowResponse.Data.Mannequins.Length"); i++) {
			Workflow workflow2 = new Workflow();
			workflow2.setBizUsage(_ctx.stringValue("ListWorkflowResponse.Data.Mannequins["+ i +"].BizUsage"));
			workflow2.setId(_ctx.longValue("ListWorkflowResponse.Data.Mannequins["+ i +"].Id"));
			workflow2.setObjectType(_ctx.stringValue("ListWorkflowResponse.Data.Mannequins["+ i +"].ObjectType"));
			workflow2.setStatus(_ctx.longValue("ListWorkflowResponse.Data.Mannequins["+ i +"].Status"));
			workflow2.setName(_ctx.stringValue("ListWorkflowResponse.Data.Mannequins["+ i +"].Name"));

			mannequins.add(workflow2);
		}
		data.setMannequins(mannequins);

		List<Workflow> scene = new ArrayList<Workflow>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowResponse.Data.Scene.Length"); i++) {
			Workflow workflow3 = new Workflow();
			workflow3.setBizUsage(_ctx.stringValue("ListWorkflowResponse.Data.Scene["+ i +"].BizUsage"));
			workflow3.setId(_ctx.longValue("ListWorkflowResponse.Data.Scene["+ i +"].Id"));
			workflow3.setObjectType(_ctx.stringValue("ListWorkflowResponse.Data.Scene["+ i +"].ObjectType"));
			workflow3.setStatus(_ctx.longValue("ListWorkflowResponse.Data.Scene["+ i +"].Status"));
			workflow3.setName(_ctx.stringValue("ListWorkflowResponse.Data.Scene["+ i +"].Name"));

			scene.add(workflow3);
		}
		data.setScene(scene);

		List<Workflow> humanPose = new ArrayList<Workflow>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkflowResponse.Data.HumanPose.Length"); i++) {
			Workflow workflow4 = new Workflow();
			workflow4.setBizUsage(_ctx.stringValue("ListWorkflowResponse.Data.HumanPose["+ i +"].BizUsage"));
			workflow4.setId(_ctx.longValue("ListWorkflowResponse.Data.HumanPose["+ i +"].Id"));
			workflow4.setObjectType(_ctx.stringValue("ListWorkflowResponse.Data.HumanPose["+ i +"].ObjectType"));
			workflow4.setStatus(_ctx.longValue("ListWorkflowResponse.Data.HumanPose["+ i +"].Status"));
			workflow4.setName(_ctx.stringValue("ListWorkflowResponse.Data.HumanPose["+ i +"].Name"));

			humanPose.add(workflow4);
		}
		data.setHumanPose(humanPose);
		listWorkflowResponse.setData(data);
	 
	 	return listWorkflowResponse;
	}
}