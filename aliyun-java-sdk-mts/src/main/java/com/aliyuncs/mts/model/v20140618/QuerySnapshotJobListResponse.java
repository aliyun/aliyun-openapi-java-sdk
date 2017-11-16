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
import com.aliyuncs.mts.transform.v20140618.QuerySnapshotJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySnapshotJobListResponse extends AcsResponse {

	private String requestId;

	private List<SnapshotJob> snapshotJobList;

	private List<String> nonExistSnapshotJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SnapshotJob> getSnapshotJobList() {
		return this.snapshotJobList;
	}

	public void setSnapshotJobList(List<SnapshotJob> snapshotJobList) {
		this.snapshotJobList = snapshotJobList;
	}

	public List<String> getNonExistSnapshotJobIds() {
		return this.nonExistSnapshotJobIds;
	}

	public void setNonExistSnapshotJobIds(List<String> nonExistSnapshotJobIds) {
		this.nonExistSnapshotJobIds = nonExistSnapshotJobIds;
	}

	public static class SnapshotJob {

		private String id;

		private String userData;

		private String pipelineId;

		private String state;

		private String code;

		private String count;

		private String tileCount;

		private String message;

		private String creationTime;

		private Input input;

		private SnapshotConfig snapshotConfig;

		private MNSMessageResult mNSMessageResult;

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

		public String getCount() {
			return this.count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public String getTileCount() {
			return this.tileCount;
		}

		public void setTileCount(String tileCount) {
			this.tileCount = tileCount;
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

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public SnapshotConfig getSnapshotConfig() {
			return this.snapshotConfig;
		}

		public void setSnapshotConfig(SnapshotConfig snapshotConfig) {
			this.snapshotConfig = snapshotConfig;
		}

		public MNSMessageResult getMNSMessageResult() {
			return this.mNSMessageResult;
		}

		public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
			this.mNSMessageResult = mNSMessageResult;
		}

		public static class Input {

			private String bucket;

			private String location;

			private String object;

			private String roleArn;

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

			public String getRoleArn() {
				return this.roleArn;
			}

			public void setRoleArn(String roleArn) {
				this.roleArn = roleArn;
			}
		}

		public static class SnapshotConfig {

			private String time;

			private String interval;

			private String num;

			private String width;

			private String height;

			private String frameType;

			private OutputFile outputFile;

			private TileOutputFile tileOutputFile;

			private TileOut tileOut;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}

			public String getNum() {
				return this.num;
			}

			public void setNum(String num) {
				this.num = num;
			}

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public String getFrameType() {
				return this.frameType;
			}

			public void setFrameType(String frameType) {
				this.frameType = frameType;
			}

			public OutputFile getOutputFile() {
				return this.outputFile;
			}

			public void setOutputFile(OutputFile outputFile) {
				this.outputFile = outputFile;
			}

			public TileOutputFile getTileOutputFile() {
				return this.tileOutputFile;
			}

			public void setTileOutputFile(TileOutputFile tileOutputFile) {
				this.tileOutputFile = tileOutputFile;
			}

			public TileOut getTileOut() {
				return this.tileOut;
			}

			public void setTileOut(TileOut tileOut) {
				this.tileOut = tileOut;
			}

			public static class OutputFile {

				private String bucket;

				private String location;

				private String object;

				private String roleArn;

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

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}
			}

			public static class TileOutputFile {

				private String bucket;

				private String location;

				private String object;

				private String roleArn;

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

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}
			}

			public static class TileOut {

				private String lines;

				private String columns;

				private String cellWidth;

				private String cellHeight;

				private String margin;

				private String padding;

				private String color;

				private String isKeepCellPic;

				public String getLines() {
					return this.lines;
				}

				public void setLines(String lines) {
					this.lines = lines;
				}

				public String getColumns() {
					return this.columns;
				}

				public void setColumns(String columns) {
					this.columns = columns;
				}

				public String getCellWidth() {
					return this.cellWidth;
				}

				public void setCellWidth(String cellWidth) {
					this.cellWidth = cellWidth;
				}

				public String getCellHeight() {
					return this.cellHeight;
				}

				public void setCellHeight(String cellHeight) {
					this.cellHeight = cellHeight;
				}

				public String getMargin() {
					return this.margin;
				}

				public void setMargin(String margin) {
					this.margin = margin;
				}

				public String getPadding() {
					return this.padding;
				}

				public void setPadding(String padding) {
					this.padding = padding;
				}

				public String getColor() {
					return this.color;
				}

				public void setColor(String color) {
					this.color = color;
				}

				public String getIsKeepCellPic() {
					return this.isKeepCellPic;
				}

				public void setIsKeepCellPic(String isKeepCellPic) {
					this.isKeepCellPic = isKeepCellPic;
				}
			}
		}

		public static class MNSMessageResult {

			private String messageId;

			private String errorMessage;

			private String errorCode;

			public String getMessageId() {
				return this.messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}
	}

	@Override
	public QuerySnapshotJobListResponse getInstance(UnmarshallerContext context) {
		return	QuerySnapshotJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
