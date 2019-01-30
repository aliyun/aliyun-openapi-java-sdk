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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetMediaDNAResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaDNAResultResponse extends AcsResponse {

	private String requestId;

	private DNAResult dNAResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DNAResult getDNAResult() {
		return this.dNAResult;
	}

	public void setDNAResult(DNAResult dNAResult) {
		this.dNAResult = dNAResult;
	}

	public static class DNAResult {

		private List<VideoDNAItem> videoDNA;

		public List<VideoDNAItem> getVideoDNA() {
			return this.videoDNA;
		}

		public void setVideoDNA(List<VideoDNAItem> videoDNA) {
			this.videoDNA = videoDNA;
		}

		public static class VideoDNAItem {

			private String primaryKey;

			private String similarity;

			private List<DetailItem> detail;

			public String getPrimaryKey() {
				return this.primaryKey;
			}

			public void setPrimaryKey(String primaryKey) {
				this.primaryKey = primaryKey;
			}

			public String getSimilarity() {
				return this.similarity;
			}

			public void setSimilarity(String similarity) {
				this.similarity = similarity;
			}

			public List<DetailItem> getDetail() {
				return this.detail;
			}

			public void setDetail(List<DetailItem> detail) {
				this.detail = detail;
			}

			public static class DetailItem {

				private Input input;

				private Duplication duplication;

				public Input getInput() {
					return this.input;
				}

				public void setInput(Input input) {
					this.input = input;
				}

				public Duplication getDuplication() {
					return this.duplication;
				}

				public void setDuplication(Duplication duplication) {
					this.duplication = duplication;
				}

				public static class Input {

					private String start;

					private String duration;

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}
				}

				public static class Duplication {

					private String start;

					private String duration;

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}
				}
			}
		}
	}

	@Override
	public GetMediaDNAResultResponse getInstance(UnmarshallerContext context) {
		return	GetMediaDNAResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
