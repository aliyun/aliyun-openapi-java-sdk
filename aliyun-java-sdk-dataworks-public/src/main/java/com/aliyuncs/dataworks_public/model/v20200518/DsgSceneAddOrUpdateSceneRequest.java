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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgSceneAddOrUpdateSceneRequest extends RpcAcsRequest<DsgSceneAddOrUpdateSceneResponse> {
	   

	@SerializedName("scenes")
	private List<Scenes> scenes;
	public DsgSceneAddOrUpdateSceneRequest() {
		super("dataworks-public", "2020-05-18", "DsgSceneAddOrUpdateScene");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Scenes> getScenes() {
		return this.scenes;
	}

	public void setScenes(List<Scenes> scenes) {
		this.scenes = scenes;	
		if (scenes != null) {
			putQueryParameter("scenes" , new Gson().toJson(scenes));
		}	
	}

	public static class Scenes {

		@SerializedName("sceneCode")
		private String sceneCode;

		@SerializedName("projects")
		private List<ProjectsItem> projects;

		@SerializedName("sceneName")
		private String sceneName;

		@SerializedName("userGroupIds")
		private List<Long> userGroupIds;

		@SerializedName("id")
		private String id;

		@SerializedName("desc")
		private String desc;

		public String getSceneCode() {
			return this.sceneCode;
		}

		public void setSceneCode(String sceneCode) {
			this.sceneCode = sceneCode;
		}

		public List<ProjectsItem> getProjects() {
			return this.projects;
		}

		public void setProjects(List<ProjectsItem> projects) {
			this.projects = projects;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public List<Long> getUserGroupIds() {
			return this.userGroupIds;
		}

		public void setUserGroupIds(List<Long> userGroupIds) {
			this.userGroupIds = userGroupIds;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public static class ProjectsItem {

			@SerializedName("projectName")
			private String projectName;

			@SerializedName("dbType")
			private String dbType;

			@SerializedName("clusterId")
			private String clusterId;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}
		}
	}

	@Override
	public Class<DsgSceneAddOrUpdateSceneResponse> getResponseClass() {
		return DsgSceneAddOrUpdateSceneResponse.class;
	}

}
