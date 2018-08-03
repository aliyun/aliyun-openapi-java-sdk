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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GetProjectResponse;
import com.aliyuncs.imm.model.v20170906.GetProjectResponse.EnginesItem;
import com.aliyuncs.imm.model.v20170906.GetProjectResponse.IndexersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext context) {
		
		getProjectResponse.setRequestId(context.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setProject(context.stringValue("GetProjectResponse.Project"));
		getProjectResponse.setServiceRole(context.stringValue("GetProjectResponse.ServiceRole"));
		getProjectResponse.setEndpoint(context.stringValue("GetProjectResponse.Endpoint"));
		getProjectResponse.setCreateTime(context.stringValue("GetProjectResponse.CreateTime"));
		getProjectResponse.setModifyTime(context.stringValue("GetProjectResponse.ModifyTime"));
		getProjectResponse.setType(context.stringValue("GetProjectResponse.Type"));
		getProjectResponse.setCU(context.integerValue("GetProjectResponse.CU"));

		List<IndexersItem> indexers = new ArrayList<IndexersItem>();
		for (int i = 0; i < context.lengthValue("GetProjectResponse.Indexers.Length"); i++) {
			IndexersItem indexersItem = new IndexersItem();
			indexersItem.setName(context.stringValue("GetProjectResponse.Indexers["+ i +"].Name"));
			indexersItem.setStatus(context.stringValue("GetProjectResponse.Indexers["+ i +"].Status"));

			indexers.add(indexersItem);
		}
		getProjectResponse.setIndexers(indexers);

		List<EnginesItem> engines = new ArrayList<EnginesItem>();
		for (int i = 0; i < context.lengthValue("GetProjectResponse.Engines.Length"); i++) {
			EnginesItem enginesItem = new EnginesItem();
			enginesItem.setName(context.stringValue("GetProjectResponse.Engines["+ i +"].Name"));
			enginesItem.setJobTtl(context.longValue("GetProjectResponse.Engines["+ i +"].JobTtl"));

			engines.add(enginesItem);
		}
		getProjectResponse.setEngines(engines);
	 
	 	return getProjectResponse;
	}
}