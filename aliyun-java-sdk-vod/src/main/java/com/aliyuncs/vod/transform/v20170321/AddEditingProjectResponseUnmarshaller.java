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
package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.AddEditingProjectResponse;
import com.aliyuncs.vod.model.v20170321.AddEditingProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddEditingProjectResponseUnmarshaller {

	public static AddEditingProjectResponse unmarshall(AddEditingProjectResponse addEditingProjectResponse, UnmarshallerContext context) {
		
		addEditingProjectResponse.setRequestId(context.stringValue("AddEditingProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectId(context.stringValue("AddEditingProjectResponse.Project.ProjectId"));
		project.setCreationTime(context.stringValue("AddEditingProjectResponse.Project.CreationTime"));
		project.setModifiedTime(context.stringValue("AddEditingProjectResponse.Project.ModifiedTime"));
		project.setStatus(context.stringValue("AddEditingProjectResponse.Project.Status"));
		project.setDescription(context.stringValue("AddEditingProjectResponse.Project.Description"));
		project.setTitle(context.stringValue("AddEditingProjectResponse.Project.Title"));
		addEditingProjectResponse.setProject(project);
	 
	 	return addEditingProjectResponse;
	}
}