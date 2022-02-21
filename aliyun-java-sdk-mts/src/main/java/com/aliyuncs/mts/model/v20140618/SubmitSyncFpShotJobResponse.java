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
import com.aliyuncs.mts.transform.v20140618.SubmitSyncFpShotJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitSyncFpShotJobResponse extends AcsResponse {

	private String requestId;

	private FpShotJob fpShotJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FpShotJob getFpShotJob() {
		return this.fpShotJob;
	}

	public void setFpShotJob(FpShotJob fpShotJob) {
		this.fpShotJob = fpShotJob;
	}

	public static class FpShotJob {

		private String creationTime;

		private String finishTime;

		private String state;

		private String userData;

		private String code;

		private String message;

		private String txHash;

		private String transactionId;

		private String pipelineId;

		private String id;

		private String fileId;

		private InputFile inputFile;

		private FpShotConfig fpShotConfig;

		private FpShotResult fpShotResult;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
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

		public String getTxHash() {
			return this.txHash;
		}

		public void setTxHash(String txHash) {
			this.txHash = txHash;
		}

		public String getTransactionId() {
			return this.transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
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

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public InputFile getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(InputFile inputFile) {
			this.inputFile = inputFile;
		}

		public FpShotConfig getFpShotConfig() {
			return this.fpShotConfig;
		}

		public void setFpShotConfig(FpShotConfig fpShotConfig) {
			this.fpShotConfig = fpShotConfig;
		}

		public FpShotResult getFpShotResult() {
			return this.fpShotResult;
		}

		public void setFpShotResult(FpShotResult fpShotResult) {
			this.fpShotResult = fpShotResult;
		}

		public static class InputFile {

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

		public static class FpShotConfig {

			private String notary;

			private String primaryKey;

			private String saveType;

			private String fpDBId;

			public String getNotary() {
				return this.notary;
			}

			public void setNotary(String notary) {
				this.notary = notary;
			}

			public String getPrimaryKey() {
				return this.primaryKey;
			}

			public void setPrimaryKey(String primaryKey) {
				this.primaryKey = primaryKey;
			}

			public String getSaveType() {
				return this.saveType;
			}

			public void setSaveType(String saveType) {
				this.saveType = saveType;
			}

			public String getFpDBId() {
				return this.fpDBId;
			}

			public void setFpDBId(String fpDBId) {
				this.fpDBId = fpDBId;
			}
		}

		public static class FpShotResult {

			private List<FpShot> fpShots;

			private List<FpShot> audioFpShots;

			private List<TextFpShot> textFpShots;

			public List<FpShot> getFpShots() {
				return this.fpShots;
			}

			public void setFpShots(List<FpShot> fpShots) {
				this.fpShots = fpShots;
			}

			public List<FpShot> getAudioFpShots() {
				return this.audioFpShots;
			}

			public void setAudioFpShots(List<FpShot> audioFpShots) {
				this.audioFpShots = audioFpShots;
			}

			public List<TextFpShot> getTextFpShots() {
				return this.textFpShots;
			}

			public void setTextFpShots(List<TextFpShot> textFpShots) {
				this.textFpShots = textFpShots;
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

					private String similarity;

					private Input input;

					private Duplication duplication;

					public String getSimilarity() {
						return this.similarity;
					}

					public void setSimilarity(String similarity) {
						this.similarity = similarity;
					}

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

						private String duration;

						private String start;

						public String getDuration() {
							return this.duration;
						}

						public void setDuration(String duration) {
							this.duration = duration;
						}

						public String getStart() {
							return this.start;
						}

						public void setStart(String start) {
							this.start = start;
						}
					}

					public static class Duplication {

						private String duration;

						private String start;

						public String getDuration() {
							return this.duration;
						}

						public void setDuration(String duration) {
							this.duration = duration;
						}

						public String getStart() {
							return this.start;
						}

						public void setStart(String start) {
							this.start = start;
						}
					}
				}
			}

			public static class TextFpShot {

				private String primaryKey;

				private String similarity;

				private List<TextFpShotSlice> textFpShotSlices;

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

				public List<TextFpShotSlice> getTextFpShotSlices() {
					return this.textFpShotSlices;
				}

				public void setTextFpShotSlices(List<TextFpShotSlice> textFpShotSlices) {
					this.textFpShotSlices = textFpShotSlices;
				}

				public static class TextFpShotSlice {

					private String inputText;

					private String similarity;

					private String duplicationText;

					private InputFragment inputFragment;

					public String getInputText() {
						return this.inputText;
					}

					public void setInputText(String inputText) {
						this.inputText = inputText;
					}

					public String getSimilarity() {
						return this.similarity;
					}

					public void setSimilarity(String similarity) {
						this.similarity = similarity;
					}

					public String getDuplicationText() {
						return this.duplicationText;
					}

					public void setDuplicationText(String duplicationText) {
						this.duplicationText = duplicationText;
					}

					public InputFragment getInputFragment() {
						return this.inputFragment;
					}

					public void setInputFragment(InputFragment inputFragment) {
						this.inputFragment = inputFragment;
					}

					public static class InputFragment {

						private String duration;

						private String start;

						public String getDuration() {
							return this.duration;
						}

						public void setDuration(String duration) {
							this.duration = duration;
						}

						public String getStart() {
							return this.start;
						}

						public void setStart(String start) {
							this.start = start;
						}
					}
				}
			}
		}
	}

	@Override
	public SubmitSyncFpShotJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitSyncFpShotJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
