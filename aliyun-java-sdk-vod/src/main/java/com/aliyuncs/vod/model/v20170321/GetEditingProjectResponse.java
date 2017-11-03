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
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetEditingProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEditingProjectResponse extends AcsResponse {

	private String requestId;

	private Project project;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public static class Project {

		private String projectId;

		private String creationTime;

		private String modifiedTime;

		private String status;

		private String description;

		private String title;

		private String timeline;

		private String coverURL;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTimeline() {
			return this.timeline;
		}

		public void setTimeline(String timeline) {
			this.timeline = timeline;
		}

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}
	}

	@Override
	public GetEditingProjectResponse getInstance(UnmarshallerContext context) {
		return	GetEditingProjectResponseUnmarshaller.unmarshall(this, context);
	}
}
