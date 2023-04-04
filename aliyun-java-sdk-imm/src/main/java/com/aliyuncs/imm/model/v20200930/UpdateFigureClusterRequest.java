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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateFigureClusterRequest extends RpcAcsRequest<UpdateFigureClusterResponse> {
	   

	private String datasetName;

	private String projectName;

	@SerializedName("figureCluster")
	private FigureCluster figureCluster;
	public UpdateFigureClusterRequest() {
		super("imm", "2020-09-30", "UpdateFigureCluster", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public FigureCluster getFigureCluster() {
		return this.figureCluster;
	}

	public void setFigureCluster(FigureCluster figureCluster) {
		this.figureCluster = figureCluster;	
		if (figureCluster != null) {
			putQueryParameter("FigureCluster" , new Gson().toJson(figureCluster));
		}	
	}

	public static class FigureCluster {

		@SerializedName("Cover")
		private Cover cover;

		@SerializedName("MetaLockVersion")
		private Long metaLockVersion;

		@SerializedName("CustomLabels")
		private Map<String,String> customLabels;

		@SerializedName("Name")
		private String name;

		@SerializedName("CustomId")
		private String customId;

		@SerializedName("ObjectId")
		private String objectId;

		public Cover getCover() {
			return this.cover;
		}

		public void setCover(Cover cover) {
			this.cover = cover;
		}

		public Long getMetaLockVersion() {
			return this.metaLockVersion;
		}

		public void setMetaLockVersion(Long metaLockVersion) {
			this.metaLockVersion = metaLockVersion;
		}

		public Map<String,String> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<String,String> customLabels) {
			this.customLabels = customLabels;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public static class Cover {

			@SerializedName("Figures")
			private List<FiguresItem> figures;

			public List<FiguresItem> getFigures() {
				return this.figures;
			}

			public void setFigures(List<FiguresItem> figures) {
				this.figures = figures;
			}

			public static class FiguresItem {

				@SerializedName("FigureId")
				private String figureId;

				public String getFigureId() {
					return this.figureId;
				}

				public void setFigureId(String figureId) {
					this.figureId = figureId;
				}
			}
		}
	}

	@Override
	public Class<UpdateFigureClusterResponse> getResponseClass() {
		return UpdateFigureClusterResponse.class;
	}

}
