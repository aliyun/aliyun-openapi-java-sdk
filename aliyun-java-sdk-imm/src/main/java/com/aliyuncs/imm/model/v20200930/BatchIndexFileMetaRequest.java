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
public class BatchIndexFileMetaRequest extends RpcAcsRequest<BatchIndexFileMetaResponse> {
	   

	@SerializedName("notification")
	private Notification notification;

	private String datasetName;

	private String projectName;

	@SerializedName("files")
	private List<Files> files;
	public BatchIndexFileMetaRequest() {
		super("imm", "2020-09-30", "BatchIndexFileMeta", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
		}	
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

	public List<Files> getFiles() {
		return this.files;
	}

	public void setFiles(List<Files> files) {
		this.files = files;	
		if (files != null) {
			putQueryParameter("Files" , new Gson().toJson(files));
		}	
	}

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}
	}

	public static class Files {

		@SerializedName("CustomLabels")
		private Map<String,String> customLabels;

		@SerializedName("Figures")
		private List<FiguresItem> figures;

		@SerializedName("OSSURI")
		private String oSSURI;

		@SerializedName("FileHash")
		private String fileHash;

		@SerializedName("URI")
		private String uRI;

		@SerializedName("CustomId")
		private String customId;

		@SerializedName("MediaType")
		private String mediaType;

		@SerializedName("ContentType")
		private String contentType;

		public Map<String,String> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<String,String> customLabels) {
			this.customLabels = customLabels;
		}

		public List<FiguresItem> getFigures() {
			return this.figures;
		}

		public void setFigures(List<FiguresItem> figures) {
			this.figures = figures;
		}

		public String getOSSURI() {
			return this.oSSURI;
		}

		public void setOSSURI(String oSSURI) {
			this.oSSURI = oSSURI;
		}

		public String getFileHash() {
			return this.fileHash;
		}

		public void setFileHash(String fileHash) {
			this.fileHash = fileHash;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public static class FiguresItem {

			@SerializedName("FigureId")
			private String figureId;

			@SerializedName("FigureClusterId")
			private String figureClusterId;

			@SerializedName("FigureType")
			private String figureType;

			public String getFigureId() {
				return this.figureId;
			}

			public void setFigureId(String figureId) {
				this.figureId = figureId;
			}

			public String getFigureClusterId() {
				return this.figureClusterId;
			}

			public void setFigureClusterId(String figureClusterId) {
				this.figureClusterId = figureClusterId;
			}

			public String getFigureType() {
				return this.figureType;
			}

			public void setFigureType(String figureType) {
				this.figureType = figureType;
			}
		}
	}

	@Override
	public Class<BatchIndexFileMetaResponse> getResponseClass() {
		return BatchIndexFileMetaResponse.class;
	}

}
