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

		private String creationTime;

		private String status;

		private String specification;

		private String complexity;

		private String narrowBandType;

		private Long height;

		private String bitrate;

		private String modificationTime;

		private String watermarkId;

		private Long encrypt;

		private String definition;

		private String rand;

		private String encryptType;

		private String preprocessStatus;

		private String streamType;

		private String jobId;

		private String plaintext;

		private Long size;

		private Long width;

		private String fps;

		private String duration;

		private String playURL;

		private String format;

		private String hDRType;

		private Integer bitDepth;

		private Integer jobType;

		private String jobExt;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSpecification() {
			return this.specification;
		}

		public void setSpecification(String specification) {
			this.specification = specification;
		}

		public String getComplexity() {
			return this.complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getNarrowBandType() {
			return this.narrowBandType;
		}

		public void setNarrowBandType(String narrowBandType) {
			this.narrowBandType = narrowBandType;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getWatermarkId() {
			return this.watermarkId;
		}

		public void setWatermarkId(String watermarkId) {
			this.watermarkId = watermarkId;
		}

		public Long getEncrypt() {
			return this.encrypt;
		}

		public void setEncrypt(Long encrypt) {
			this.encrypt = encrypt;
		}

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getRand() {
			return this.rand;
		}

		public void setRand(String rand) {
			this.rand = rand;
		}

		public String getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(String encryptType) {
			this.encryptType = encryptType;
		}

		public String getPreprocessStatus() {
			return this.preprocessStatus;
		}

		public void setPreprocessStatus(String preprocessStatus) {
			this.preprocessStatus = preprocessStatus;
		}

		public String getStreamType() {
			return this.streamType;
		}

		public void setStreamType(String streamType) {
			this.streamType = streamType;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getPlaintext() {
			return this.plaintext;
		}

		public void setPlaintext(String plaintext) {
			this.plaintext = plaintext;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
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

		public String getPlayURL() {
			return this.playURL;
		}

		public void setPlayURL(String playURL) {
			this.playURL = playURL;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getHDRType() {
			return this.hDRType;
		}

		public void setHDRType(String hDRType) {
			this.hDRType = hDRType;
		}

		public Integer getBitDepth() {
			return this.bitDepth;
		}

		public void setBitDepth(Integer bitDepth) {
			this.bitDepth = bitDepth;
		}

		public Integer getJobType() {
			return this.jobType;
		}

		public void setJobType(Integer jobType) {
			this.jobType = jobType;
		}

		public String getJobExt() {
			return this.jobExt;
		}

		public void setJobExt(String jobExt) {
			this.jobExt = jobExt;
		}
	}

	public static class VideoBase {

		private String creationTime;

		private String status;

		private String transcodeMode;

		private String outputType;

		private String videoId;

		private String coverURL;

		private String duration;

		private String title;

		private String mediaType;

		private String danMuURL;

		private String storageClass;

		private List<Thumbnail> thumbnailList;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTranscodeMode() {
			return this.transcodeMode;
		}

		public void setTranscodeMode(String transcodeMode) {
			this.transcodeMode = transcodeMode;
		}

		public String getOutputType() {
			return this.outputType;
		}

		public void setOutputType(String outputType) {
			this.outputType = outputType;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
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

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getDanMuURL() {
			return this.danMuURL;
		}

		public void setDanMuURL(String danMuURL) {
			this.danMuURL = danMuURL;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
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
