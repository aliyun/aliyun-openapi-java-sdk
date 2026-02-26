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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateCheckRunRequest extends RoaAcsRequest<UpdateCheckRunResponse> {
	   

	private String organizationId;

	private String repositoryIdentity;

	private String accessToken;

	private Long checkRunId;

	@SerializedName("body")
	private Body body;
	public UpdateCheckRunRequest() {
		super("devops", "2021-06-25", "UpdateCheckRun");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/check_runs/update_check_run");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public String getRepositoryIdentity() {
		return this.repositoryIdentity;
	}

	public void setRepositoryIdentity(String repositoryIdentity) {
		this.repositoryIdentity = repositoryIdentity;
		if(repositoryIdentity != null){
			putQueryParameter("repositoryIdentity", repositoryIdentity);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
	}

	public Long getCheckRunId() {
		return this.checkRunId;
	}

	public void setCheckRunId(Long checkRunId) {
		this.checkRunId = checkRunId;
		if(checkRunId != null){
			putQueryParameter("checkRunId", checkRunId.toString());
		}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("conclusion")
		private String conclusion;

		@SerializedName("output")
		private Output output;

		@SerializedName("completedAt")
		private String completedAt;

		@SerializedName("detailsUrl")
		private String detailsUrl;

		@SerializedName("name")
		private String name;

		@SerializedName("startedAt")
		private String startedAt;

		@SerializedName("externalId")
		private String externalId;

		@SerializedName("annotations")
		private List<AnnotationsItem> annotations;

		@SerializedName("status")
		private String status;

		public String getConclusion() {
			return this.conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public Output getOutput() {
			return this.output;
		}

		public void setOutput(Output output) {
			this.output = output;
		}

		public String getCompletedAt() {
			return this.completedAt;
		}

		public void setCompletedAt(String completedAt) {
			this.completedAt = completedAt;
		}

		public String getDetailsUrl() {
			return this.detailsUrl;
		}

		public void setDetailsUrl(String detailsUrl) {
			this.detailsUrl = detailsUrl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStartedAt() {
			return this.startedAt;
		}

		public void setStartedAt(String startedAt) {
			this.startedAt = startedAt;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public List<AnnotationsItem> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(List<AnnotationsItem> annotations) {
			this.annotations = annotations;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class Output {

			@SerializedName("summary")
			private String summary;

			@SerializedName("images")
			private List<ImagesItem> images;

			@SerializedName("text")
			private String text;

			@SerializedName("title")
			private String title;

			public String getSummary() {
				return this.summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
			}

			public List<ImagesItem> getImages() {
				return this.images;
			}

			public void setImages(List<ImagesItem> images) {
				this.images = images;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public static class ImagesItem {

				@SerializedName("imageUrl")
				private String imageUrl;

				@SerializedName("alt")
				private String alt;

				@SerializedName("caption")
				private String caption;

				public String getImageUrl() {
					return this.imageUrl;
				}

				public void setImageUrl(String imageUrl) {
					this.imageUrl = imageUrl;
				}

				public String getAlt() {
					return this.alt;
				}

				public void setAlt(String alt) {
					this.alt = alt;
				}

				public String getCaption() {
					return this.caption;
				}

				public void setCaption(String caption) {
					this.caption = caption;
				}
			}
		}

		public static class AnnotationsItem {

			@SerializedName("path")
			private String path;

			@SerializedName("endLine")
			private Long endLine;

			@SerializedName("startColumn")
			private Long startColumn;

			@SerializedName("annotationLevel")
			private String annotationLevel;

			@SerializedName("startLine")
			private Long startLine;

			@SerializedName("message")
			private String message;

			@SerializedName("title")
			private String title;

			@SerializedName("rawDetails")
			private String rawDetails;

			@SerializedName("endColumn")
			private Long endColumn;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Long getEndLine() {
				return this.endLine;
			}

			public void setEndLine(Long endLine) {
				this.endLine = endLine;
			}

			public Long getStartColumn() {
				return this.startColumn;
			}

			public void setStartColumn(Long startColumn) {
				this.startColumn = startColumn;
			}

			public String getAnnotationLevel() {
				return this.annotationLevel;
			}

			public void setAnnotationLevel(String annotationLevel) {
				this.annotationLevel = annotationLevel;
			}

			public Long getStartLine() {
				return this.startLine;
			}

			public void setStartLine(Long startLine) {
				this.startLine = startLine;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getRawDetails() {
				return this.rawDetails;
			}

			public void setRawDetails(String rawDetails) {
				this.rawDetails = rawDetails;
			}

			public Long getEndColumn() {
				return this.endColumn;
			}

			public void setEndColumn(Long endColumn) {
				this.endColumn = endColumn;
			}
		}
	}

	@Override
	public Class<UpdateCheckRunResponse> getResponseClass() {
		return UpdateCheckRunResponse.class;
	}

}
