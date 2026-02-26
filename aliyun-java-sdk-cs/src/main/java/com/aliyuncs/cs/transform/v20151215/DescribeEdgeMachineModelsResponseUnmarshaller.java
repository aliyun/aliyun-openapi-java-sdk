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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachineModelsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachineModelsResponse.Models_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdgeMachineModelsResponseUnmarshaller {

	public static DescribeEdgeMachineModelsResponse unmarshall(DescribeEdgeMachineModelsResponse describeEdgeMachineModelsResponse, UnmarshallerContext _ctx) {
		

		List<Models_info> models = new ArrayList<Models_info>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEdgeMachineModelsResponse.models.Length"); i++) {
			Models_info models_info = new Models_info();
			models_info.setManage_runtime(_ctx.integerValue("DescribeEdgeMachineModelsResponse.models["+ i +"].manage_runtime"));
			models_info.setCpu_arch(_ctx.stringValue("DescribeEdgeMachineModelsResponse.models["+ i +"].cpu_arch"));
			models_info.setCpu(_ctx.integerValue("DescribeEdgeMachineModelsResponse.models["+ i +"].cpu"));
			models_info.setMemory(_ctx.integerValue("DescribeEdgeMachineModelsResponse.models["+ i +"].memory"));
			models_info.setModel_id(_ctx.stringValue("DescribeEdgeMachineModelsResponse.models["+ i +"].model_id"));
			models_info.setCreated(_ctx.stringValue("DescribeEdgeMachineModelsResponse.models["+ i +"].created"));
			models_info.setDescription(_ctx.stringValue("DescribeEdgeMachineModelsResponse.models["+ i +"].description"));
			models_info.setModel(_ctx.stringValue("DescribeEdgeMachineModelsResponse.models["+ i +"].model"));

			models.add(models_info);
		}
		describeEdgeMachineModelsResponse.setModels(models);
	 
	 	return describeEdgeMachineModelsResponse;
	}
}