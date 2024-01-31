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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetCheckRunResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCheckRunResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String createdAt;

		private String updatedAt;

		private String startedAt;

		private String completedAt;

		private String externalId;

		private String name;

		private String headSha;

		private String status;

		private String conclusion;

		private String detailsUrl;

		private List<Check_run_annotations> annotations;

		private CheckSuite checkSuite;

		private Writer writer;

		private Output output;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getStartedAt() {
			return this.startedAt;
		}

		public void setStartedAt(String startedAt) {
			this.startedAt = startedAt;
		}

		public String getCompletedAt() {
			return this.completedAt;
		}

		public void setCompletedAt(String completedAt) {
			this.completedAt = completedAt;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHeadSha() {
			return this.headSha;
		}

		public void setHeadSha(String headSha) {
			this.headSha = headSha;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConclusion() {
			return this.conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public String getDetailsUrl() {
			return this.detailsUrl;
		}

		public void setDetailsUrl(String detailsUrl) {
			this.detailsUrl = detailsUrl;
		}

		public List<Check_run_annotations> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(List<Check_run_annotations> annotations) {
			this.annotations = annotations;
		}

		public CheckSuite getCheckSuite() {
			return this.checkSuite;
		}

		public void setCheckSuite(CheckSuite checkSuite) {
			this.checkSuite = checkSuite;
		}

		public Writer getWriter() {
			return this.writer;
		}

		public void setWriter(Writer writer) {
			this.writer = writer;
		}

		public Output getOutput() {
			return this.output;
		}

		public void setOutput(Output output) {
			this.output = output;
		}

		public static class Check_run_annotations {

			private Long id;

			private String path;

			private Long startLine;

			private Long endLine;

			private Long startColumn;

			private Long endColumn;

			private String annotationLevel;

			private String message;

			private String title;

			private String rawDetails;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Long getStartLine() {
				return this.startLine;
			}

			public void setStartLine(Long startLine) {
				this.startLine = startLine;
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

			public Long getEndColumn() {
				return this.endColumn;
			}

			public void setEndColumn(Long endColumn) {
				this.endColumn = endColumn;
			}

			public String getAnnotationLevel() {
				return this.annotationLevel;
			}

			public void setAnnotationLevel(String annotationLevel) {
				this.annotationLevel = annotationLevel;
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
		}

		public static class CheckSuite {

			private Long id;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class Writer {

			private String id;

			private String type;

			private String name;

			private String slug;

			private String logoUrl;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSlug() {
				return this.slug;
			}

			public void setSlug(String slug) {
				this.slug = slug;
			}

			public String getLogoUrl() {
				return this.logoUrl;
			}

			public void setLogoUrl(String logoUrl) {
				this.logoUrl = logoUrl;
			}
		}

		public static class Output {

			private String title;

			private String summary;

			private String text;

			private List<Output_images> images;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getSummary() {
				return this.summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public List<Output_images> getImages() {
				return this.images;
			}

			public void setImages(List<Output_images> images) {
				this.images = images;
			}

			public static class Output_images {

				private String alt;

				private String imageUrl;

				private String caption;

				public String getAlt() {
					return this.alt;
				}

				public void setAlt(String alt) {
					this.alt = alt;
				}

				public String getImageUrl() {
					return this.imageUrl;
				}

				public void setImageUrl(String imageUrl) {
					this.imageUrl = imageUrl;
				}

				public String getCaption() {
					return this.caption;
				}

				public void setCaption(String caption) {
					this.caption = caption;
				}
			}
		}
	}

	@Override
	public GetCheckRunResponse getInstance(UnmarshallerContext context) {
		return	GetCheckRunResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
