/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListProjectsResponse;
import com.aliyuncs.imm.model.v20170906.ListProjectsResponse.ProjectsItem;
import com.aliyuncs.imm.model.v20170906.ListProjectsResponse.ProjectsItem.EnginesItem;
import com.aliyuncs.imm.model.v20170906.ListProjectsResponse.ProjectsItem.IndexersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext context) {
		
		listProjectsResponse.setRequestId(context.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setNextMarker(context.stringValue("ListProjectsResponse.NextMarker"));

		List<ProjectsItem> projects = new ArrayList<ProjectsItem>();
		for (int i = 0; i < context.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			ProjectsItem projectsItem = new ProjectsItem();
			projectsItem.setProject(context.stringValue("ListProjectsResponse.Projects["+ i +"].Project"));
			projectsItem.setEndpoint(context.stringValue("ListProjectsResponse.Projects["+ i +"].Endpoint"));
			projectsItem.setServiceRole(context.stringValue("ListProjectsResponse.Projects["+ i +"].ServiceRole"));
			projectsItem.setCreateTime(context.stringValue("ListProjectsResponse.Projects["+ i +"].CreateTime"));
			projectsItem.setModifyTime(context.stringValue("ListProjectsResponse.Projects["+ i +"].ModifyTime"));

			List<EnginesItem> engines = new ArrayList<EnginesItem>();
			for (int j = 0; j < context.lengthValue("ListProjectsResponse.Projects["+ i +"].Engines.Length"); j++) {
				EnginesItem enginesItem = new EnginesItem();
				enginesItem.setName(context.stringValue("ListProjectsResponse.Projects["+ i +"].Engines["+ j +"].Name"));
				enginesItem.setJobTtl(context.longValue("ListProjectsResponse.Projects["+ i +"].Engines["+ j +"].JobTtl"));

				engines.add(enginesItem);
			}
			projectsItem.setEngines(engines);

			List<IndexersItem> indexers = new ArrayList<IndexersItem>();
			for (int j = 0; j < context.lengthValue("ListProjectsResponse.Projects["+ i +"].Indexers.Length"); j++) {
				IndexersItem indexersItem = new IndexersItem();
				indexersItem.setName(context.stringValue("ListProjectsResponse.Projects["+ i +"].Indexers["+ j +"].Name"));
				indexersItem.setStatus(context.stringValue("ListProjectsResponse.Projects["+ i +"].Indexers["+ j +"].Status"));

				indexers.add(indexersItem);
			}
			projectsItem.setIndexers(indexers);

			projects.add(projectsItem);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}