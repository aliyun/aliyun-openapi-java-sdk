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
import com.aliyuncs.mts.transform.v20140618.QueryFpCompareJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFpCompareJobListResponse extends AcsResponse {

	private String requestId;

	private List<FpCompareJob> fpCompareJobList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FpCompareJob> getFpCompareJobList() {
		return this.fpCompareJobList;
	}

	public void setFpCompareJobList(List<FpCompareJob> fpCompareJobList) {
		this.fpCompareJobList = fpCompareJobList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class FpCompareJob {

		private String creationTime;

		private String finishTime;

		private String state;

		private String message;

		private String fpDBId;

		private String userData;

		private String code;

		private String pipelineId;

		private String id;

		private MasterFile masterFile;

		private QueryFile queryFile;

		private MatchFrameStorage matchFrameStorage;

		private FpCompareResult fpCompareResult;

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

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getFpDBId() {
			return this.fpDBId;
		}

		public void setFpDBId(String fpDBId) {
			this.fpDBId = fpDBId;
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

		public MasterFile getMasterFile() {
			return this.masterFile;
		}

		public void setMasterFile(MasterFile masterFile) {
			this.masterFile = masterFile;
		}

		public QueryFile getQueryFile() {
			return this.queryFile;
		}

		public void setQueryFile(QueryFile queryFile) {
			this.queryFile = queryFile;
		}

		public MatchFrameStorage getMatchFrameStorage() {
			return this.matchFrameStorage;
		}

		public void setMatchFrameStorage(MatchFrameStorage matchFrameStorage) {
			this.matchFrameStorage = matchFrameStorage;
		}

		public FpCompareResult getFpCompareResult() {
			return this.fpCompareResult;
		}

		public void setFpCompareResult(FpCompareResult fpCompareResult) {
			this.fpCompareResult = fpCompareResult;
		}

		public static class MasterFile {

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

		public static class QueryFile {

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

		public static class MatchFrameStorage {

			private MasterMediaFrames masterMediaFrames;

			private MatchedFramesDescFile matchedFramesDescFile;

			private QueryMediaFrames queryMediaFrames;

			public MasterMediaFrames getMasterMediaFrames() {
				return this.masterMediaFrames;
			}

			public void setMasterMediaFrames(MasterMediaFrames masterMediaFrames) {
				this.masterMediaFrames = masterMediaFrames;
			}

			public MatchedFramesDescFile getMatchedFramesDescFile() {
				return this.matchedFramesDescFile;
			}

			public void setMatchedFramesDescFile(MatchedFramesDescFile matchedFramesDescFile) {
				this.matchedFramesDescFile = matchedFramesDescFile;
			}

			public QueryMediaFrames getQueryMediaFrames() {
				return this.queryMediaFrames;
			}

			public void setQueryMediaFrames(QueryMediaFrames queryMediaFrames) {
				this.queryMediaFrames = queryMediaFrames;
			}

			public static class MasterMediaFrames {

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

			public static class MatchedFramesDescFile {

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

			public static class QueryMediaFrames {

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

		public static class FpCompareResult {

			private List<MediaMatchSegment> mediaMatchSegments;

			private QueryMediaInfo queryMediaInfo;

			private MasterMediaInfo masterMediaInfo;

			public List<MediaMatchSegment> getMediaMatchSegments() {
				return this.mediaMatchSegments;
			}

			public void setMediaMatchSegments(List<MediaMatchSegment> mediaMatchSegments) {
				this.mediaMatchSegments = mediaMatchSegments;
			}

			public QueryMediaInfo getQueryMediaInfo() {
				return this.queryMediaInfo;
			}

			public void setQueryMediaInfo(QueryMediaInfo queryMediaInfo) {
				this.queryMediaInfo = queryMediaInfo;
			}

			public MasterMediaInfo getMasterMediaInfo() {
				return this.masterMediaInfo;
			}

			public void setMasterMediaInfo(MasterMediaInfo masterMediaInfo) {
				this.masterMediaInfo = masterMediaInfo;
			}

			public static class MediaMatchSegment {

				private String queryStartTime;

				private String queryEndFrame;

				private String score;

				private String totalMatchFrameNum;

				private String masterEndTime;

				private String masterStartTime;

				private String queryStartFrame;

				private String masterEndFrame;

				private String masterStartFrame;

				private String queryEndTime;

				public String getQueryStartTime() {
					return this.queryStartTime;
				}

				public void setQueryStartTime(String queryStartTime) {
					this.queryStartTime = queryStartTime;
				}

				public String getQueryEndFrame() {
					return this.queryEndFrame;
				}

				public void setQueryEndFrame(String queryEndFrame) {
					this.queryEndFrame = queryEndFrame;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getTotalMatchFrameNum() {
					return this.totalMatchFrameNum;
				}

				public void setTotalMatchFrameNum(String totalMatchFrameNum) {
					this.totalMatchFrameNum = totalMatchFrameNum;
				}

				public String getMasterEndTime() {
					return this.masterEndTime;
				}

				public void setMasterEndTime(String masterEndTime) {
					this.masterEndTime = masterEndTime;
				}

				public String getMasterStartTime() {
					return this.masterStartTime;
				}

				public void setMasterStartTime(String masterStartTime) {
					this.masterStartTime = masterStartTime;
				}

				public String getQueryStartFrame() {
					return this.queryStartFrame;
				}

				public void setQueryStartFrame(String queryStartFrame) {
					this.queryStartFrame = queryStartFrame;
				}

				public String getMasterEndFrame() {
					return this.masterEndFrame;
				}

				public void setMasterEndFrame(String masterEndFrame) {
					this.masterEndFrame = masterEndFrame;
				}

				public String getMasterStartFrame() {
					return this.masterStartFrame;
				}

				public void setMasterStartFrame(String masterStartFrame) {
					this.masterStartFrame = masterStartFrame;
				}

				public String getQueryEndTime() {
					return this.queryEndTime;
				}

				public void setQueryEndTime(String queryEndTime) {
					this.queryEndTime = queryEndTime;
				}
			}

			public static class QueryMediaInfo {

				private String audioSampleRate;

				private String audioBitRate;

				private String fpNum;

				private String width;

				private String height;

				private String totalVideoFrame;

				private String fps;

				private String duration;

				private String audioChannels;

				public String getAudioSampleRate() {
					return this.audioSampleRate;
				}

				public void setAudioSampleRate(String audioSampleRate) {
					this.audioSampleRate = audioSampleRate;
				}

				public String getAudioBitRate() {
					return this.audioBitRate;
				}

				public void setAudioBitRate(String audioBitRate) {
					this.audioBitRate = audioBitRate;
				}

				public String getFpNum() {
					return this.fpNum;
				}

				public void setFpNum(String fpNum) {
					this.fpNum = fpNum;
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

				public String getTotalVideoFrame() {
					return this.totalVideoFrame;
				}

				public void setTotalVideoFrame(String totalVideoFrame) {
					this.totalVideoFrame = totalVideoFrame;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getAudioChannels() {
					return this.audioChannels;
				}

				public void setAudioChannels(String audioChannels) {
					this.audioChannels = audioChannels;
				}
			}

			public static class MasterMediaInfo {

				private String audioSampleRate;

				private String audioBitRate;

				private String fpNum;

				private String width;

				private String height;

				private String totalVideoFrame;

				private String fps;

				private String duration;

				private String audioChannels;

				public String getAudioSampleRate() {
					return this.audioSampleRate;
				}

				public void setAudioSampleRate(String audioSampleRate) {
					this.audioSampleRate = audioSampleRate;
				}

				public String getAudioBitRate() {
					return this.audioBitRate;
				}

				public void setAudioBitRate(String audioBitRate) {
					this.audioBitRate = audioBitRate;
				}

				public String getFpNum() {
					return this.fpNum;
				}

				public void setFpNum(String fpNum) {
					this.fpNum = fpNum;
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

				public String getTotalVideoFrame() {
					return this.totalVideoFrame;
				}

				public void setTotalVideoFrame(String totalVideoFrame) {
					this.totalVideoFrame = totalVideoFrame;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getAudioChannels() {
					return this.audioChannels;
				}

				public void setAudioChannels(String audioChannels) {
					this.audioChannels = audioChannels;
				}
			}
		}
	}

	@Override
	public QueryFpCompareJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryFpCompareJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
