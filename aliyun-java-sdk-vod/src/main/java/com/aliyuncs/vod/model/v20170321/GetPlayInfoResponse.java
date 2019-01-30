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
import com.aliyuncs.vod.transform.v20170321.GetPlayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPlayInfoResponse extends AcsResponse {

	private String requestId;

	private List<PlayInfo> playInfoList;

	private VideoBase videoBase;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PlayInfo> getPlayInfoList() {
		return this.playInfoList;
	}

	public void setPlayInfoList(List<PlayInfo> playInfoList) {
		this.playInfoList = playInfoList;
	}

	public VideoBase getVideoBase() {
		return this.videoBase;
	}

	public void setVideoBase(VideoBase videoBase) {
		this.videoBase = videoBase;
	}

	public static class PlayInfo {

		private Long width;

		private Long height;

		private Long size;

		private String playURL;

		private String bitrate;

		private String definition;

		private String duration;

		private String format;

		private String fps;

		private Long encrypt;

		private String plaintext;

		private String complexity;

		private String streamType;

		private String rand;

		private String jobId;

		private String preprocessStatus;

		private String watermarkId;

		private String status;

		private String creationTime;

		private String modificationTime;

		private String encryptType;

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getPlayURL() {
			return this.playURL;
		}

		public void setPlayURL(String playURL) {
			this.playURL = playURL;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public Long getEncrypt() {
			return this.encrypt;
		}

		public void setEncrypt(Long encrypt) {
			this.encrypt = encrypt;
		}

		public String getPlaintext() {
			return this.plaintext;
		}

		public void setPlaintext(String plaintext) {
			this.plaintext = plaintext;
		}

		public String getComplexity() {
			return this.complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getStreamType() {
			return this.streamType;
		}

		public void setStreamType(String streamType) {
			this.streamType = streamType;
		}

		public String getRand() {
			return this.rand;
		}

		public void setRand(String rand) {
			this.rand = rand;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getPreprocessStatus() {
			return this.preprocessStatus;
		}

		public void setPreprocessStatus(String preprocessStatus) {
			this.preprocessStatus = preprocessStatus;
		}

		public String getWatermarkId() {
			return this.watermarkId;
		}

		public void setWatermarkId(String watermarkId) {
			this.watermarkId = watermarkId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(String encryptType) {
			this.encryptType = encryptType;
		}
	}

	public static class VideoBase {

		private String outputType;

		private String coverURL;

		private String duration;

		private String status;

		private String title;

		private String videoId;

		private String mediaType;

		private String creationTime;

		private String transcodeMode;

		private List<Thumbnail> thumbnailList;

		public String getOutputType() {
			return this.outputType;
		}

		public void setOutputType(String outputType) {
			this.outputType = outputType;
		}

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getTranscodeMode() {
			return this.transcodeMode;
		}

		public void setTranscodeMode(String transcodeMode) {
			this.transcodeMode = transcodeMode;
		}

		public List<Thumbnail> getThumbnailList() {
			return this.thumbnailList;
		}

		public void setThumbnailList(List<Thumbnail> thumbnailList) {
			this.thumbnailList = thumbnailList;
		}

		public static class Thumbnail {

			private String uRL;

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}
	}

	@Override
	public GetPlayInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPlayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
