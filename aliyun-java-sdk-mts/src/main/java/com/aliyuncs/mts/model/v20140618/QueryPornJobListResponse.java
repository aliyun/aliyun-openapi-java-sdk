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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryPornJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPornJobListResponse extends AcsResponse {

	private String requestId;

	private List<PornJob> pornJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PornJob> getPornJobList() {
		return this.pornJobList;
	}

	public void setPornJobList(List<PornJob> pornJobList) {
		this.pornJobList = pornJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class PornJob {

		private String creationTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String pipelineId;

		private String id;

		private PornConfig pornConfig;

		private CensorPornResult censorPornResult;

		private Input input;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public PornConfig getPornConfig() {
			return this.pornConfig;
		}

		public void setPornConfig(PornConfig pornConfig) {
			this.pornConfig = pornConfig;
		}

		public CensorPornResult getCensorPornResult() {
			return this.censorPornResult;
		}

		public void setCensorPornResult(CensorPornResult censorPornResult) {
			this.censorPornResult = censorPornResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public static class PornConfig {

			private String interval;

			private String bizType;

			private OutputFile outputFile;

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public OutputFile getOutputFile() {
				return this.outputFile;
			}

			public void setOutputFile(OutputFile outputFile) {
				this.outputFile = outputFile;
			}

			public static class OutputFile {

				private String object;

				private String location;

				private String bucket;

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}
			}
		}

		public static class CensorPornResult {

			private String suggestion;

			private String averageScore;

			private String label;

			private String maxScore;

			private List<Counter> pornCounterList;

			private List<Top> pornTopList;

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getAverageScore() {
				return this.averageScore;
			}

			public void setAverageScore(String averageScore) {
				this.averageScore = averageScore;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getMaxScore() {
				return this.maxScore;
			}

			public void setMaxScore(String maxScore) {
				this.maxScore = maxScore;
			}

			public List<Counter> getPornCounterList() {
				return this.pornCounterList;
			}

			public void setPornCounterList(List<Counter> pornCounterList) {
				this.pornCounterList = pornCounterList;
			}

			public List<Top> getPornTopList() {
				return this.pornTopList;
			}

			public void setPornTopList(List<Top> pornTopList) {
				this.pornTopList = pornTopList;
			}

			public static class Counter {

				private String label;

				private Integer count;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class Top {

				private String index;

				private String score;

				private String timestamp;

				private String object;

				private String label;

				public String getIndex() {
					return this.index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}
			}
		}

		public static class Input {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}
	}

	@Override
	public QueryPornJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryPornJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
