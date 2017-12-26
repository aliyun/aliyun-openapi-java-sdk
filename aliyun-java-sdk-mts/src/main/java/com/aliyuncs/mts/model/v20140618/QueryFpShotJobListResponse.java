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
package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryFpShotJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFpShotJobListResponse extends AcsResponse {

	private String requestId;

	private List<FpShotJob> fpShotJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FpShotJob> getFpShotJobList() {
		return this.fpShotJobList;
	}

	public void setFpShotJobList(List<FpShotJob> fpShotJobList) {
		this.fpShotJobList = fpShotJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class FpShotJob {

		private String id;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String message;

		private String creationTime;

		private InputFile inputFile;

		private FpShotResult fpShotResult;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public InputFile getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(InputFile inputFile) {
			this.inputFile = inputFile;
		}

		public FpShotResult getFpShotResult() {
			return this.fpShotResult;
		}

		public void setFpShotResult(FpShotResult fpShotResult) {
			this.fpShotResult = fpShotResult;
		}

		public static class InputFile {

			private String bucket;

			private String location;

			private String object;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}
		}

		public static class FpShotResult {

			private List<FpShot> fpShots;

			public List<FpShot> getFpShots() {
				return this.fpShots;
			}

			public void setFpShots(List<FpShot> fpShots) {
				this.fpShots = fpShots;
			}

			public static class FpShot {

				private String primaryKey;

				private String similarity;

				private List<FpShotSlice> fpShotSlices;

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

				public List<FpShotSlice> getFpShotSlices() {
					return this.fpShotSlices;
				}

				public void setFpShotSlices(List<FpShotSlice> fpShotSlices) {
					this.fpShotSlices = fpShotSlices;
				}

				public static class FpShotSlice {

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
	}

	@Override
	public QueryFpShotJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryFpShotJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
