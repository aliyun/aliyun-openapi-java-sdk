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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.GetStoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStoryResponse extends AcsResponse {

	private String requestId;

	private Story story;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Story getStory() {
		return this.story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public static class Story {

		private String ownerId;

		private String projectName;

		private String datasetName;

		private String objectId;

		private String objectType;

		private String updateTime;

		private String createTime;

		private String storyName;

		private String storyType;

		private String storySubType;

		private String storyStartTime;

		private String storyEndTime;

		private String customId;

		private Map<Object,Object> customLabels;

		private List<FilesItem> files;

		private List<AddressesItem11> addresses;

		private List<String> figureClusterIds;

		private Cover cover;

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDatasetName() {
			return this.datasetName;
		}

		public void setDatasetName(String datasetName) {
			this.datasetName = datasetName;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStoryName() {
			return this.storyName;
		}

		public void setStoryName(String storyName) {
			this.storyName = storyName;
		}

		public String getStoryType() {
			return this.storyType;
		}

		public void setStoryType(String storyType) {
			this.storyType = storyType;
		}

		public String getStorySubType() {
			return this.storySubType;
		}

		public void setStorySubType(String storySubType) {
			this.storySubType = storySubType;
		}

		public String getStoryStartTime() {
			return this.storyStartTime;
		}

		public void setStoryStartTime(String storyStartTime) {
			this.storyStartTime = storyStartTime;
		}

		public String getStoryEndTime() {
			return this.storyEndTime;
		}

		public void setStoryEndTime(String storyEndTime) {
			this.storyEndTime = storyEndTime;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public Map<Object,Object> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<Object,Object> customLabels) {
			this.customLabels = customLabels;
		}

		public List<FilesItem> getFiles() {
			return this.files;
		}

		public void setFiles(List<FilesItem> files) {
			this.files = files;
		}

		public List<AddressesItem11> getAddresses() {
			return this.addresses;
		}

		public void setAddresses(List<AddressesItem11> addresses) {
			this.addresses = addresses;
		}

		public List<String> getFigureClusterIds() {
			return this.figureClusterIds;
		}

		public void setFigureClusterIds(List<String> figureClusterIds) {
			this.figureClusterIds = figureClusterIds;
		}

		public Cover getCover() {
			return this.cover;
		}

		public void setCover(Cover cover) {
			this.cover = cover;
		}

		public static class FilesItem {

			private String ownerId;

			private String projectName;

			private String datasetName;

			private String objectType;

			private String objectId;

			private String updateTime;

			private String createTime;

			private String uRI;

			private String oSSURI;

			private String filename;

			private String mediaType;

			private String contentType;

			private Long size;

			private String fileHash;

			private String fileModifiedTime;

			private String fileCreateTime;

			private String fileAccessTime;

			private String produceTime;

			private String latLong;

			private String timezone;

			private String travelClusterId;

			private Long orientation;

			private Long figureCount;

			private String title;

			private Long imageWidth;

			private Long imageHeight;

			private String eXIF;

			private Long videoWidth;

			private Long videoHeight;

			private String artist;

			private String albumArtist;

			private String composer;

			private String performer;

			private String language;

			private String album;

			private Long pageCount;

			private String documentText;

			private String eTag;

			private String cacheControl;

			private String contentDisposition;

			private String contentEncoding;

			private String contentLanguage;

			private String accessControlAllowOrigin;

			private String accessControlRequestMethod;

			private String serverSideEncryptionCustomerAlgorithm;

			private String serverSideEncryption;

			private String serverSideDataEncryption;

			private String serverSideEncryptionKeyId;

			private String oSSStorageClass;

			private String oSSCRC64;

			private String objectACL;

			private String contentMd5;

			private Map<Object,Object> oSSUserMeta;

			private Long oSSTaggingCount;

			private Map<Object,Object> oSSTagging;

			private String oSSExpiration;

			private String oSSVersionId;

			private String oSSDeleteMarker;

			private String oSSObjectType;

			private String customId;

			private Map<Object,Object> customLabels;

			private Long streamCount;

			private Long programCount;

			private String formatName;

			private String formatLongName;

			private Double startTime;

			private Long bitrate;

			private Double duration;

			private List<AddressesItem> addresses1;

			private List<FiguresItem> figures;

			private List<LabelsItem> labels;

			private List<CroppingSuggestionsItem> croppingSuggestions;

			private List<OCRContentsItem> oCRContents;

			private List<VideoStreamsItem> videoStreams;

			private List<SubtitlesItem> subtitles;

			private List<AudioStreamsItem> audioStreams;

			private List<AudioCoversItem> audioCovers;

			private ImageScore imageScore;

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getDatasetName() {
				return this.datasetName;
			}

			public void setDatasetName(String datasetName) {
				this.datasetName = datasetName;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getObjectId() {
				return this.objectId;
			}

			public void setObjectId(String objectId) {
				this.objectId = objectId;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getURI() {
				return this.uRI;
			}

			public void setURI(String uRI) {
				this.uRI = uRI;
			}

			public String getOSSURI() {
				return this.oSSURI;
			}

			public void setOSSURI(String oSSURI) {
				this.oSSURI = oSSURI;
			}

			public String getFilename() {
				return this.filename;
			}

			public void setFilename(String filename) {
				this.filename = filename;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public String getContentType() {
				return this.contentType;
			}

			public void setContentType(String contentType) {
				this.contentType = contentType;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getFileHash() {
				return this.fileHash;
			}

			public void setFileHash(String fileHash) {
				this.fileHash = fileHash;
			}

			public String getFileModifiedTime() {
				return this.fileModifiedTime;
			}

			public void setFileModifiedTime(String fileModifiedTime) {
				this.fileModifiedTime = fileModifiedTime;
			}

			public String getFileCreateTime() {
				return this.fileCreateTime;
			}

			public void setFileCreateTime(String fileCreateTime) {
				this.fileCreateTime = fileCreateTime;
			}

			public String getFileAccessTime() {
				return this.fileAccessTime;
			}

			public void setFileAccessTime(String fileAccessTime) {
				this.fileAccessTime = fileAccessTime;
			}

			public String getProduceTime() {
				return this.produceTime;
			}

			public void setProduceTime(String produceTime) {
				this.produceTime = produceTime;
			}

			public String getLatLong() {
				return this.latLong;
			}

			public void setLatLong(String latLong) {
				this.latLong = latLong;
			}

			public String getTimezone() {
				return this.timezone;
			}

			public void setTimezone(String timezone) {
				this.timezone = timezone;
			}

			public String getTravelClusterId() {
				return this.travelClusterId;
			}

			public void setTravelClusterId(String travelClusterId) {
				this.travelClusterId = travelClusterId;
			}

			public Long getOrientation() {
				return this.orientation;
			}

			public void setOrientation(Long orientation) {
				this.orientation = orientation;
			}

			public Long getFigureCount() {
				return this.figureCount;
			}

			public void setFigureCount(Long figureCount) {
				this.figureCount = figureCount;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getImageWidth() {
				return this.imageWidth;
			}

			public void setImageWidth(Long imageWidth) {
				this.imageWidth = imageWidth;
			}

			public Long getImageHeight() {
				return this.imageHeight;
			}

			public void setImageHeight(Long imageHeight) {
				this.imageHeight = imageHeight;
			}

			public String getEXIF() {
				return this.eXIF;
			}

			public void setEXIF(String eXIF) {
				this.eXIF = eXIF;
			}

			public Long getVideoWidth() {
				return this.videoWidth;
			}

			public void setVideoWidth(Long videoWidth) {
				this.videoWidth = videoWidth;
			}

			public Long getVideoHeight() {
				return this.videoHeight;
			}

			public void setVideoHeight(Long videoHeight) {
				this.videoHeight = videoHeight;
			}

			public String getArtist() {
				return this.artist;
			}

			public void setArtist(String artist) {
				this.artist = artist;
			}

			public String getAlbumArtist() {
				return this.albumArtist;
			}

			public void setAlbumArtist(String albumArtist) {
				this.albumArtist = albumArtist;
			}

			public String getComposer() {
				return this.composer;
			}

			public void setComposer(String composer) {
				this.composer = composer;
			}

			public String getPerformer() {
				return this.performer;
			}

			public void setPerformer(String performer) {
				this.performer = performer;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getAlbum() {
				return this.album;
			}

			public void setAlbum(String album) {
				this.album = album;
			}

			public Long getPageCount() {
				return this.pageCount;
			}

			public void setPageCount(Long pageCount) {
				this.pageCount = pageCount;
			}

			public String getDocumentText() {
				return this.documentText;
			}

			public void setDocumentText(String documentText) {
				this.documentText = documentText;
			}

			public String getETag() {
				return this.eTag;
			}

			public void setETag(String eTag) {
				this.eTag = eTag;
			}

			public String getCacheControl() {
				return this.cacheControl;
			}

			public void setCacheControl(String cacheControl) {
				this.cacheControl = cacheControl;
			}

			public String getContentDisposition() {
				return this.contentDisposition;
			}

			public void setContentDisposition(String contentDisposition) {
				this.contentDisposition = contentDisposition;
			}

			public String getContentEncoding() {
				return this.contentEncoding;
			}

			public void setContentEncoding(String contentEncoding) {
				this.contentEncoding = contentEncoding;
			}

			public String getContentLanguage() {
				return this.contentLanguage;
			}

			public void setContentLanguage(String contentLanguage) {
				this.contentLanguage = contentLanguage;
			}

			public String getAccessControlAllowOrigin() {
				return this.accessControlAllowOrigin;
			}

			public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
				this.accessControlAllowOrigin = accessControlAllowOrigin;
			}

			public String getAccessControlRequestMethod() {
				return this.accessControlRequestMethod;
			}

			public void setAccessControlRequestMethod(String accessControlRequestMethod) {
				this.accessControlRequestMethod = accessControlRequestMethod;
			}

			public String getServerSideEncryptionCustomerAlgorithm() {
				return this.serverSideEncryptionCustomerAlgorithm;
			}

			public void setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
				this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
			}

			public String getServerSideEncryption() {
				return this.serverSideEncryption;
			}

			public void setServerSideEncryption(String serverSideEncryption) {
				this.serverSideEncryption = serverSideEncryption;
			}

			public String getServerSideDataEncryption() {
				return this.serverSideDataEncryption;
			}

			public void setServerSideDataEncryption(String serverSideDataEncryption) {
				this.serverSideDataEncryption = serverSideDataEncryption;
			}

			public String getServerSideEncryptionKeyId() {
				return this.serverSideEncryptionKeyId;
			}

			public void setServerSideEncryptionKeyId(String serverSideEncryptionKeyId) {
				this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
			}

			public String getOSSStorageClass() {
				return this.oSSStorageClass;
			}

			public void setOSSStorageClass(String oSSStorageClass) {
				this.oSSStorageClass = oSSStorageClass;
			}

			public String getOSSCRC64() {
				return this.oSSCRC64;
			}

			public void setOSSCRC64(String oSSCRC64) {
				this.oSSCRC64 = oSSCRC64;
			}

			public String getObjectACL() {
				return this.objectACL;
			}

			public void setObjectACL(String objectACL) {
				this.objectACL = objectACL;
			}

			public String getContentMd5() {
				return this.contentMd5;
			}

			public void setContentMd5(String contentMd5) {
				this.contentMd5 = contentMd5;
			}

			public Map<Object,Object> getOSSUserMeta() {
				return this.oSSUserMeta;
			}

			public void setOSSUserMeta(Map<Object,Object> oSSUserMeta) {
				this.oSSUserMeta = oSSUserMeta;
			}

			public Long getOSSTaggingCount() {
				return this.oSSTaggingCount;
			}

			public void setOSSTaggingCount(Long oSSTaggingCount) {
				this.oSSTaggingCount = oSSTaggingCount;
			}

			public Map<Object,Object> getOSSTagging() {
				return this.oSSTagging;
			}

			public void setOSSTagging(Map<Object,Object> oSSTagging) {
				this.oSSTagging = oSSTagging;
			}

			public String getOSSExpiration() {
				return this.oSSExpiration;
			}

			public void setOSSExpiration(String oSSExpiration) {
				this.oSSExpiration = oSSExpiration;
			}

			public String getOSSVersionId() {
				return this.oSSVersionId;
			}

			public void setOSSVersionId(String oSSVersionId) {
				this.oSSVersionId = oSSVersionId;
			}

			public String getOSSDeleteMarker() {
				return this.oSSDeleteMarker;
			}

			public void setOSSDeleteMarker(String oSSDeleteMarker) {
				this.oSSDeleteMarker = oSSDeleteMarker;
			}

			public String getOSSObjectType() {
				return this.oSSObjectType;
			}

			public void setOSSObjectType(String oSSObjectType) {
				this.oSSObjectType = oSSObjectType;
			}

			public String getCustomId() {
				return this.customId;
			}

			public void setCustomId(String customId) {
				this.customId = customId;
			}

			public Map<Object,Object> getCustomLabels() {
				return this.customLabels;
			}

			public void setCustomLabels(Map<Object,Object> customLabels) {
				this.customLabels = customLabels;
			}

			public Long getStreamCount() {
				return this.streamCount;
			}

			public void setStreamCount(Long streamCount) {
				this.streamCount = streamCount;
			}

			public Long getProgramCount() {
				return this.programCount;
			}

			public void setProgramCount(Long programCount) {
				this.programCount = programCount;
			}

			public String getFormatName() {
				return this.formatName;
			}

			public void setFormatName(String formatName) {
				this.formatName = formatName;
			}

			public String getFormatLongName() {
				return this.formatLongName;
			}

			public void setFormatLongName(String formatLongName) {
				this.formatLongName = formatLongName;
			}

			public Double getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Double startTime) {
				this.startTime = startTime;
			}

			public Long getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(Long bitrate) {
				this.bitrate = bitrate;
			}

			public Double getDuration() {
				return this.duration;
			}

			public void setDuration(Double duration) {
				this.duration = duration;
			}

			public List<AddressesItem> getAddresses1() {
				return this.addresses1;
			}

			public void setAddresses1(List<AddressesItem> addresses1) {
				this.addresses1 = addresses1;
			}

			public List<FiguresItem> getFigures() {
				return this.figures;
			}

			public void setFigures(List<FiguresItem> figures) {
				this.figures = figures;
			}

			public List<LabelsItem> getLabels() {
				return this.labels;
			}

			public void setLabels(List<LabelsItem> labels) {
				this.labels = labels;
			}

			public List<CroppingSuggestionsItem> getCroppingSuggestions() {
				return this.croppingSuggestions;
			}

			public void setCroppingSuggestions(List<CroppingSuggestionsItem> croppingSuggestions) {
				this.croppingSuggestions = croppingSuggestions;
			}

			public List<OCRContentsItem> getOCRContents() {
				return this.oCRContents;
			}

			public void setOCRContents(List<OCRContentsItem> oCRContents) {
				this.oCRContents = oCRContents;
			}

			public List<VideoStreamsItem> getVideoStreams() {
				return this.videoStreams;
			}

			public void setVideoStreams(List<VideoStreamsItem> videoStreams) {
				this.videoStreams = videoStreams;
			}

			public List<SubtitlesItem> getSubtitles() {
				return this.subtitles;
			}

			public void setSubtitles(List<SubtitlesItem> subtitles) {
				this.subtitles = subtitles;
			}

			public List<AudioStreamsItem> getAudioStreams() {
				return this.audioStreams;
			}

			public void setAudioStreams(List<AudioStreamsItem> audioStreams) {
				this.audioStreams = audioStreams;
			}

			public List<AudioCoversItem> getAudioCovers() {
				return this.audioCovers;
			}

			public void setAudioCovers(List<AudioCoversItem> audioCovers) {
				this.audioCovers = audioCovers;
			}

			public ImageScore getImageScore() {
				return this.imageScore;
			}

			public void setImageScore(ImageScore imageScore) {
				this.imageScore = imageScore;
			}

			public static class AddressesItem {

				private String language;

				private String addressLine;

				private String country;

				private String province;

				private String city;

				private String district;

				private String township;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getAddressLine() {
					return this.addressLine;
				}

				public void setAddressLine(String addressLine) {
					this.addressLine = addressLine;
				}

				public String getCountry() {
					return this.country;
				}

				public void setCountry(String country) {
					this.country = country;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public String getDistrict() {
					return this.district;
				}

				public void setDistrict(String district) {
					this.district = district;
				}

				public String getTownship() {
					return this.township;
				}

				public void setTownship(String township) {
					this.township = township;
				}
			}

			public static class FiguresItem {

				private String figureId;

				private Float figureConfidence;

				private String figureClusterId;

				private Float figureClusterConfidence;

				private String figureType;

				private Long age;

				private Float ageSD;

				private String gender;

				private Float genderConfidence;

				private String emotion;

				private Float emotionConfidence;

				private Float faceQuality;

				private String mouth;

				private Float mouthConfidence;

				private String beard;

				private Float beardConfidence;

				private String hat;

				private Float hatConfidence;

				private String mask;

				private Float maskConfidence;

				private String glasses;

				private Float glassesConfidence;

				private Float sharpness;

				private Float attractive;

				private Boundary boundary;

				private HeadPose headPose;

				public String getFigureId() {
					return this.figureId;
				}

				public void setFigureId(String figureId) {
					this.figureId = figureId;
				}

				public Float getFigureConfidence() {
					return this.figureConfidence;
				}

				public void setFigureConfidence(Float figureConfidence) {
					this.figureConfidence = figureConfidence;
				}

				public String getFigureClusterId() {
					return this.figureClusterId;
				}

				public void setFigureClusterId(String figureClusterId) {
					this.figureClusterId = figureClusterId;
				}

				public Float getFigureClusterConfidence() {
					return this.figureClusterConfidence;
				}

				public void setFigureClusterConfidence(Float figureClusterConfidence) {
					this.figureClusterConfidence = figureClusterConfidence;
				}

				public String getFigureType() {
					return this.figureType;
				}

				public void setFigureType(String figureType) {
					this.figureType = figureType;
				}

				public Long getAge() {
					return this.age;
				}

				public void setAge(Long age) {
					this.age = age;
				}

				public Float getAgeSD() {
					return this.ageSD;
				}

				public void setAgeSD(Float ageSD) {
					this.ageSD = ageSD;
				}

				public String getGender() {
					return this.gender;
				}

				public void setGender(String gender) {
					this.gender = gender;
				}

				public Float getGenderConfidence() {
					return this.genderConfidence;
				}

				public void setGenderConfidence(Float genderConfidence) {
					this.genderConfidence = genderConfidence;
				}

				public String getEmotion() {
					return this.emotion;
				}

				public void setEmotion(String emotion) {
					this.emotion = emotion;
				}

				public Float getEmotionConfidence() {
					return this.emotionConfidence;
				}

				public void setEmotionConfidence(Float emotionConfidence) {
					this.emotionConfidence = emotionConfidence;
				}

				public Float getFaceQuality() {
					return this.faceQuality;
				}

				public void setFaceQuality(Float faceQuality) {
					this.faceQuality = faceQuality;
				}

				public String getMouth() {
					return this.mouth;
				}

				public void setMouth(String mouth) {
					this.mouth = mouth;
				}

				public Float getMouthConfidence() {
					return this.mouthConfidence;
				}

				public void setMouthConfidence(Float mouthConfidence) {
					this.mouthConfidence = mouthConfidence;
				}

				public String getBeard() {
					return this.beard;
				}

				public void setBeard(String beard) {
					this.beard = beard;
				}

				public Float getBeardConfidence() {
					return this.beardConfidence;
				}

				public void setBeardConfidence(Float beardConfidence) {
					this.beardConfidence = beardConfidence;
				}

				public String getHat() {
					return this.hat;
				}

				public void setHat(String hat) {
					this.hat = hat;
				}

				public Float getHatConfidence() {
					return this.hatConfidence;
				}

				public void setHatConfidence(Float hatConfidence) {
					this.hatConfidence = hatConfidence;
				}

				public String getMask() {
					return this.mask;
				}

				public void setMask(String mask) {
					this.mask = mask;
				}

				public Float getMaskConfidence() {
					return this.maskConfidence;
				}

				public void setMaskConfidence(Float maskConfidence) {
					this.maskConfidence = maskConfidence;
				}

				public String getGlasses() {
					return this.glasses;
				}

				public void setGlasses(String glasses) {
					this.glasses = glasses;
				}

				public Float getGlassesConfidence() {
					return this.glassesConfidence;
				}

				public void setGlassesConfidence(Float glassesConfidence) {
					this.glassesConfidence = glassesConfidence;
				}

				public Float getSharpness() {
					return this.sharpness;
				}

				public void setSharpness(Float sharpness) {
					this.sharpness = sharpness;
				}

				public Float getAttractive() {
					return this.attractive;
				}

				public void setAttractive(Float attractive) {
					this.attractive = attractive;
				}

				public Boundary getBoundary() {
					return this.boundary;
				}

				public void setBoundary(Boundary boundary) {
					this.boundary = boundary;
				}

				public HeadPose getHeadPose() {
					return this.headPose;
				}

				public void setHeadPose(HeadPose headPose) {
					this.headPose = headPose;
				}

				public static class Boundary {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}

				public static class HeadPose {

					private Float pitch;

					private Float roll;

					private Float yaw;

					public Float getPitch() {
						return this.pitch;
					}

					public void setPitch(Float pitch) {
						this.pitch = pitch;
					}

					public Float getRoll() {
						return this.roll;
					}

					public void setRoll(Float roll) {
						this.roll = roll;
					}

					public Float getYaw() {
						return this.yaw;
					}

					public void setYaw(Float yaw) {
						this.yaw = yaw;
					}
				}
			}

			public static class LabelsItem {

				private String language;

				private String labelName;

				private Long labelLevel;

				private Float labelConfidence;

				private String parentLabelName;

				private Float centricScore;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getLabelName() {
					return this.labelName;
				}

				public void setLabelName(String labelName) {
					this.labelName = labelName;
				}

				public Long getLabelLevel() {
					return this.labelLevel;
				}

				public void setLabelLevel(Long labelLevel) {
					this.labelLevel = labelLevel;
				}

				public Float getLabelConfidence() {
					return this.labelConfidence;
				}

				public void setLabelConfidence(Float labelConfidence) {
					this.labelConfidence = labelConfidence;
				}

				public String getParentLabelName() {
					return this.parentLabelName;
				}

				public void setParentLabelName(String parentLabelName) {
					this.parentLabelName = parentLabelName;
				}

				public Float getCentricScore() {
					return this.centricScore;
				}

				public void setCentricScore(Float centricScore) {
					this.centricScore = centricScore;
				}
			}

			public static class CroppingSuggestionsItem {

				private String aspectRatio;

				private Float confidence;

				private Boundary2 boundary2;

				public String getAspectRatio() {
					return this.aspectRatio;
				}

				public void setAspectRatio(String aspectRatio) {
					this.aspectRatio = aspectRatio;
				}

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public Boundary2 getBoundary2() {
					return this.boundary2;
				}

				public void setBoundary2(Boundary2 boundary2) {
					this.boundary2 = boundary2;
				}

				public static class Boundary2 {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}
			}

			public static class OCRContentsItem {

				private String language;

				private String contents;

				private Float confidence;

				private Boundary3 boundary3;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getContents() {
					return this.contents;
				}

				public void setContents(String contents) {
					this.contents = contents;
				}

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public Boundary3 getBoundary3() {
					return this.boundary3;
				}

				public void setBoundary3(Boundary3 boundary3) {
					this.boundary3 = boundary3;
				}

				public static class Boundary3 {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}
			}

			public static class VideoStreamsItem {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String profile;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private Long width;

				private Long height;

				private Long hasBFrames;

				private String sampleAspectRatio;

				private String displayAspectRatio;

				private String pixelFormat;

				private Long level;

				private String frameRate;

				private String averageFrameRate;

				private String timeBase;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private Long frameCount;

				private String rotate;

				private Long bitDepth;

				private String colorSpace;

				private String colorRange;

				private String colorTransfer;

				private String colorPrimaries;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

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

				public Long getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(Long hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getSampleAspectRatio() {
					return this.sampleAspectRatio;
				}

				public void setSampleAspectRatio(String sampleAspectRatio) {
					this.sampleAspectRatio = sampleAspectRatio;
				}

				public String getDisplayAspectRatio() {
					return this.displayAspectRatio;
				}

				public void setDisplayAspectRatio(String displayAspectRatio) {
					this.displayAspectRatio = displayAspectRatio;
				}

				public String getPixelFormat() {
					return this.pixelFormat;
				}

				public void setPixelFormat(String pixelFormat) {
					this.pixelFormat = pixelFormat;
				}

				public Long getLevel() {
					return this.level;
				}

				public void setLevel(Long level) {
					this.level = level;
				}

				public String getFrameRate() {
					return this.frameRate;
				}

				public void setFrameRate(String frameRate) {
					this.frameRate = frameRate;
				}

				public String getAverageFrameRate() {
					return this.averageFrameRate;
				}

				public void setAverageFrameRate(String averageFrameRate) {
					this.averageFrameRate = averageFrameRate;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public Long getFrameCount() {
					return this.frameCount;
				}

				public void setFrameCount(Long frameCount) {
					this.frameCount = frameCount;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public Long getBitDepth() {
					return this.bitDepth;
				}

				public void setBitDepth(Long bitDepth) {
					this.bitDepth = bitDepth;
				}

				public String getColorSpace() {
					return this.colorSpace;
				}

				public void setColorSpace(String colorSpace) {
					this.colorSpace = colorSpace;
				}

				public String getColorRange() {
					return this.colorRange;
				}

				public void setColorRange(String colorRange) {
					this.colorRange = colorRange;
				}

				public String getColorTransfer() {
					return this.colorTransfer;
				}

				public void setColorTransfer(String colorTransfer) {
					this.colorTransfer = colorTransfer;
				}

				public String getColorPrimaries() {
					return this.colorPrimaries;
				}

				public void setColorPrimaries(String colorPrimaries) {
					this.colorPrimaries = colorPrimaries;
				}
			}

			public static class SubtitlesItem {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String codecTagString;

				private String codecTag;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private String content;

				private Long width;

				private Long height;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

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
			}

			public static class AudioStreamsItem {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private String timeBase;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private Long frameCount;

				private String lyric;

				private String sampleFormat;

				private Long sampleRate;

				private Long channels;

				private String channelLayout;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public Long getFrameCount() {
					return this.frameCount;
				}

				public void setFrameCount(Long frameCount) {
					this.frameCount = frameCount;
				}

				public String getLyric() {
					return this.lyric;
				}

				public void setLyric(String lyric) {
					this.lyric = lyric;
				}

				public String getSampleFormat() {
					return this.sampleFormat;
				}

				public void setSampleFormat(String sampleFormat) {
					this.sampleFormat = sampleFormat;
				}

				public Long getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(Long sampleRate) {
					this.sampleRate = sampleRate;
				}

				public Long getChannels() {
					return this.channels;
				}

				public void setChannels(Long channels) {
					this.channels = channels;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
				}
			}

			public static class AudioCoversItem {

				private Long imageWidth;

				private Long imageHeight;

				private String eXIF;

				private List<CroppingSuggestionsItem7> croppingSuggestions5;

				private List<OCRContentsItem9> oCRContents6;

				private ImageScore4 imageScore4;

				public Long getImageWidth() {
					return this.imageWidth;
				}

				public void setImageWidth(Long imageWidth) {
					this.imageWidth = imageWidth;
				}

				public Long getImageHeight() {
					return this.imageHeight;
				}

				public void setImageHeight(Long imageHeight) {
					this.imageHeight = imageHeight;
				}

				public String getEXIF() {
					return this.eXIF;
				}

				public void setEXIF(String eXIF) {
					this.eXIF = eXIF;
				}

				public List<CroppingSuggestionsItem7> getCroppingSuggestions5() {
					return this.croppingSuggestions5;
				}

				public void setCroppingSuggestions5(List<CroppingSuggestionsItem7> croppingSuggestions5) {
					this.croppingSuggestions5 = croppingSuggestions5;
				}

				public List<OCRContentsItem9> getOCRContents6() {
					return this.oCRContents6;
				}

				public void setOCRContents6(List<OCRContentsItem9> oCRContents6) {
					this.oCRContents6 = oCRContents6;
				}

				public ImageScore4 getImageScore4() {
					return this.imageScore4;
				}

				public void setImageScore4(ImageScore4 imageScore4) {
					this.imageScore4 = imageScore4;
				}

				public static class CroppingSuggestionsItem7 {

					private String aspectRatio;

					private Float confidence;

					private Boundary8 boundary8;

					public String getAspectRatio() {
						return this.aspectRatio;
					}

					public void setAspectRatio(String aspectRatio) {
						this.aspectRatio = aspectRatio;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public Boundary8 getBoundary8() {
						return this.boundary8;
					}

					public void setBoundary8(Boundary8 boundary8) {
						this.boundary8 = boundary8;
					}

					public static class Boundary8 {

						private Long width;

						private Long height;

						private Long left;

						private Long top;

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

						public Long getLeft() {
							return this.left;
						}

						public void setLeft(Long left) {
							this.left = left;
						}

						public Long getTop() {
							return this.top;
						}

						public void setTop(Long top) {
							this.top = top;
						}
					}
				}

				public static class OCRContentsItem9 {

					private String language;

					private String contents;

					private Float confidence;

					private Boundary10 boundary10;

					public String getLanguage() {
						return this.language;
					}

					public void setLanguage(String language) {
						this.language = language;
					}

					public String getContents() {
						return this.contents;
					}

					public void setContents(String contents) {
						this.contents = contents;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public Boundary10 getBoundary10() {
						return this.boundary10;
					}

					public void setBoundary10(Boundary10 boundary10) {
						this.boundary10 = boundary10;
					}

					public static class Boundary10 {

						private Long width;

						private Long height;

						private Long left;

						private Long top;

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

						public Long getLeft() {
							return this.left;
						}

						public void setLeft(Long left) {
							this.left = left;
						}

						public Long getTop() {
							return this.top;
						}

						public void setTop(Long top) {
							this.top = top;
						}
					}
				}

				public static class ImageScore4 {

					private Float overallQualityScore;

					public Float getOverallQualityScore() {
						return this.overallQualityScore;
					}

					public void setOverallQualityScore(Float overallQualityScore) {
						this.overallQualityScore = overallQualityScore;
					}
				}
			}

			public static class ImageScore {

				private Float overallQualityScore;

				public Float getOverallQualityScore() {
					return this.overallQualityScore;
				}

				public void setOverallQualityScore(Float overallQualityScore) {
					this.overallQualityScore = overallQualityScore;
				}
			}
		}

		public static class AddressesItem11 {

			private String language;

			private String addressLine;

			private String country;

			private String province;

			private String city;

			private String district;

			private String township;

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getAddressLine() {
				return this.addressLine;
			}

			public void setAddressLine(String addressLine) {
				this.addressLine = addressLine;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getDistrict() {
				return this.district;
			}

			public void setDistrict(String district) {
				this.district = district;
			}

			public String getTownship() {
				return this.township;
			}

			public void setTownship(String township) {
				this.township = township;
			}
		}

		public static class Cover {

			private String ownerId;

			private String projectName;

			private String datasetName;

			private String objectType;

			private String objectId;

			private String updateTime;

			private String createTime;

			private String uRI;

			private String oSSURI;

			private String filename;

			private String mediaType;

			private String contentType;

			private Long size;

			private String fileHash;

			private String fileModifiedTime;

			private String fileCreateTime;

			private String fileAccessTime;

			private String produceTime;

			private String latLong;

			private String timezone;

			private String travelClusterId;

			private Long orientation;

			private Long figureCount;

			private String title;

			private Long imageWidth;

			private Long imageHeight;

			private String eXIF;

			private Long videoWidth;

			private Long videoHeight;

			private String artist;

			private String albumArtist;

			private String composer;

			private String performer;

			private String language;

			private String album;

			private Long pageCount;

			private String documentText;

			private String eTag;

			private String cacheControl;

			private String contentDisposition;

			private String contentEncoding;

			private String contentLanguage;

			private String accessControlAllowOrigin;

			private String accessControlRequestMethod;

			private String serverSideEncryptionCustomerAlgorithm;

			private String serverSideEncryption;

			private String serverSideDataEncryption;

			private String serverSideEncryptionKeyId;

			private String oSSStorageClass;

			private String oSSCRC64;

			private String objectACL;

			private String contentMd5;

			private Map<Object,Object> oSSUserMeta;

			private Long oSSTaggingCount;

			private Map<Object,Object> oSSTagging;

			private String oSSExpiration;

			private String oSSVersionId;

			private String oSSDeleteMarker;

			private String oSSObjectType;

			private String customId;

			private Map<Object,Object> customLabels;

			private Long streamCount;

			private Long programCount;

			private String formatName;

			private String formatLongName;

			private Double startTime;

			private Long bitrate;

			private Double duration;

			private List<AddressesItem22> addresses13;

			private List<FiguresItem23> figures14;

			private List<LabelsItem26> labels15;

			private List<CroppingSuggestionsItem27> croppingSuggestions16;

			private List<OCRContentsItem29> oCRContents17;

			private List<VideoStreamsItem31> videoStreams18;

			private List<SubtitlesItem32> subtitles19;

			private List<AudioStreamsItem33> audioStreams20;

			private List<AudioCoversItem34> audioCovers21;

			private ImageScore12 imageScore12;

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getDatasetName() {
				return this.datasetName;
			}

			public void setDatasetName(String datasetName) {
				this.datasetName = datasetName;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getObjectId() {
				return this.objectId;
			}

			public void setObjectId(String objectId) {
				this.objectId = objectId;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getURI() {
				return this.uRI;
			}

			public void setURI(String uRI) {
				this.uRI = uRI;
			}

			public String getOSSURI() {
				return this.oSSURI;
			}

			public void setOSSURI(String oSSURI) {
				this.oSSURI = oSSURI;
			}

			public String getFilename() {
				return this.filename;
			}

			public void setFilename(String filename) {
				this.filename = filename;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public String getContentType() {
				return this.contentType;
			}

			public void setContentType(String contentType) {
				this.contentType = contentType;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getFileHash() {
				return this.fileHash;
			}

			public void setFileHash(String fileHash) {
				this.fileHash = fileHash;
			}

			public String getFileModifiedTime() {
				return this.fileModifiedTime;
			}

			public void setFileModifiedTime(String fileModifiedTime) {
				this.fileModifiedTime = fileModifiedTime;
			}

			public String getFileCreateTime() {
				return this.fileCreateTime;
			}

			public void setFileCreateTime(String fileCreateTime) {
				this.fileCreateTime = fileCreateTime;
			}

			public String getFileAccessTime() {
				return this.fileAccessTime;
			}

			public void setFileAccessTime(String fileAccessTime) {
				this.fileAccessTime = fileAccessTime;
			}

			public String getProduceTime() {
				return this.produceTime;
			}

			public void setProduceTime(String produceTime) {
				this.produceTime = produceTime;
			}

			public String getLatLong() {
				return this.latLong;
			}

			public void setLatLong(String latLong) {
				this.latLong = latLong;
			}

			public String getTimezone() {
				return this.timezone;
			}

			public void setTimezone(String timezone) {
				this.timezone = timezone;
			}

			public String getTravelClusterId() {
				return this.travelClusterId;
			}

			public void setTravelClusterId(String travelClusterId) {
				this.travelClusterId = travelClusterId;
			}

			public Long getOrientation() {
				return this.orientation;
			}

			public void setOrientation(Long orientation) {
				this.orientation = orientation;
			}

			public Long getFigureCount() {
				return this.figureCount;
			}

			public void setFigureCount(Long figureCount) {
				this.figureCount = figureCount;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getImageWidth() {
				return this.imageWidth;
			}

			public void setImageWidth(Long imageWidth) {
				this.imageWidth = imageWidth;
			}

			public Long getImageHeight() {
				return this.imageHeight;
			}

			public void setImageHeight(Long imageHeight) {
				this.imageHeight = imageHeight;
			}

			public String getEXIF() {
				return this.eXIF;
			}

			public void setEXIF(String eXIF) {
				this.eXIF = eXIF;
			}

			public Long getVideoWidth() {
				return this.videoWidth;
			}

			public void setVideoWidth(Long videoWidth) {
				this.videoWidth = videoWidth;
			}

			public Long getVideoHeight() {
				return this.videoHeight;
			}

			public void setVideoHeight(Long videoHeight) {
				this.videoHeight = videoHeight;
			}

			public String getArtist() {
				return this.artist;
			}

			public void setArtist(String artist) {
				this.artist = artist;
			}

			public String getAlbumArtist() {
				return this.albumArtist;
			}

			public void setAlbumArtist(String albumArtist) {
				this.albumArtist = albumArtist;
			}

			public String getComposer() {
				return this.composer;
			}

			public void setComposer(String composer) {
				this.composer = composer;
			}

			public String getPerformer() {
				return this.performer;
			}

			public void setPerformer(String performer) {
				this.performer = performer;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getAlbum() {
				return this.album;
			}

			public void setAlbum(String album) {
				this.album = album;
			}

			public Long getPageCount() {
				return this.pageCount;
			}

			public void setPageCount(Long pageCount) {
				this.pageCount = pageCount;
			}

			public String getDocumentText() {
				return this.documentText;
			}

			public void setDocumentText(String documentText) {
				this.documentText = documentText;
			}

			public String getETag() {
				return this.eTag;
			}

			public void setETag(String eTag) {
				this.eTag = eTag;
			}

			public String getCacheControl() {
				return this.cacheControl;
			}

			public void setCacheControl(String cacheControl) {
				this.cacheControl = cacheControl;
			}

			public String getContentDisposition() {
				return this.contentDisposition;
			}

			public void setContentDisposition(String contentDisposition) {
				this.contentDisposition = contentDisposition;
			}

			public String getContentEncoding() {
				return this.contentEncoding;
			}

			public void setContentEncoding(String contentEncoding) {
				this.contentEncoding = contentEncoding;
			}

			public String getContentLanguage() {
				return this.contentLanguage;
			}

			public void setContentLanguage(String contentLanguage) {
				this.contentLanguage = contentLanguage;
			}

			public String getAccessControlAllowOrigin() {
				return this.accessControlAllowOrigin;
			}

			public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
				this.accessControlAllowOrigin = accessControlAllowOrigin;
			}

			public String getAccessControlRequestMethod() {
				return this.accessControlRequestMethod;
			}

			public void setAccessControlRequestMethod(String accessControlRequestMethod) {
				this.accessControlRequestMethod = accessControlRequestMethod;
			}

			public String getServerSideEncryptionCustomerAlgorithm() {
				return this.serverSideEncryptionCustomerAlgorithm;
			}

			public void setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
				this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
			}

			public String getServerSideEncryption() {
				return this.serverSideEncryption;
			}

			public void setServerSideEncryption(String serverSideEncryption) {
				this.serverSideEncryption = serverSideEncryption;
			}

			public String getServerSideDataEncryption() {
				return this.serverSideDataEncryption;
			}

			public void setServerSideDataEncryption(String serverSideDataEncryption) {
				this.serverSideDataEncryption = serverSideDataEncryption;
			}

			public String getServerSideEncryptionKeyId() {
				return this.serverSideEncryptionKeyId;
			}

			public void setServerSideEncryptionKeyId(String serverSideEncryptionKeyId) {
				this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
			}

			public String getOSSStorageClass() {
				return this.oSSStorageClass;
			}

			public void setOSSStorageClass(String oSSStorageClass) {
				this.oSSStorageClass = oSSStorageClass;
			}

			public String getOSSCRC64() {
				return this.oSSCRC64;
			}

			public void setOSSCRC64(String oSSCRC64) {
				this.oSSCRC64 = oSSCRC64;
			}

			public String getObjectACL() {
				return this.objectACL;
			}

			public void setObjectACL(String objectACL) {
				this.objectACL = objectACL;
			}

			public String getContentMd5() {
				return this.contentMd5;
			}

			public void setContentMd5(String contentMd5) {
				this.contentMd5 = contentMd5;
			}

			public Map<Object,Object> getOSSUserMeta() {
				return this.oSSUserMeta;
			}

			public void setOSSUserMeta(Map<Object,Object> oSSUserMeta) {
				this.oSSUserMeta = oSSUserMeta;
			}

			public Long getOSSTaggingCount() {
				return this.oSSTaggingCount;
			}

			public void setOSSTaggingCount(Long oSSTaggingCount) {
				this.oSSTaggingCount = oSSTaggingCount;
			}

			public Map<Object,Object> getOSSTagging() {
				return this.oSSTagging;
			}

			public void setOSSTagging(Map<Object,Object> oSSTagging) {
				this.oSSTagging = oSSTagging;
			}

			public String getOSSExpiration() {
				return this.oSSExpiration;
			}

			public void setOSSExpiration(String oSSExpiration) {
				this.oSSExpiration = oSSExpiration;
			}

			public String getOSSVersionId() {
				return this.oSSVersionId;
			}

			public void setOSSVersionId(String oSSVersionId) {
				this.oSSVersionId = oSSVersionId;
			}

			public String getOSSDeleteMarker() {
				return this.oSSDeleteMarker;
			}

			public void setOSSDeleteMarker(String oSSDeleteMarker) {
				this.oSSDeleteMarker = oSSDeleteMarker;
			}

			public String getOSSObjectType() {
				return this.oSSObjectType;
			}

			public void setOSSObjectType(String oSSObjectType) {
				this.oSSObjectType = oSSObjectType;
			}

			public String getCustomId() {
				return this.customId;
			}

			public void setCustomId(String customId) {
				this.customId = customId;
			}

			public Map<Object,Object> getCustomLabels() {
				return this.customLabels;
			}

			public void setCustomLabels(Map<Object,Object> customLabels) {
				this.customLabels = customLabels;
			}

			public Long getStreamCount() {
				return this.streamCount;
			}

			public void setStreamCount(Long streamCount) {
				this.streamCount = streamCount;
			}

			public Long getProgramCount() {
				return this.programCount;
			}

			public void setProgramCount(Long programCount) {
				this.programCount = programCount;
			}

			public String getFormatName() {
				return this.formatName;
			}

			public void setFormatName(String formatName) {
				this.formatName = formatName;
			}

			public String getFormatLongName() {
				return this.formatLongName;
			}

			public void setFormatLongName(String formatLongName) {
				this.formatLongName = formatLongName;
			}

			public Double getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Double startTime) {
				this.startTime = startTime;
			}

			public Long getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(Long bitrate) {
				this.bitrate = bitrate;
			}

			public Double getDuration() {
				return this.duration;
			}

			public void setDuration(Double duration) {
				this.duration = duration;
			}

			public List<AddressesItem22> getAddresses13() {
				return this.addresses13;
			}

			public void setAddresses13(List<AddressesItem22> addresses13) {
				this.addresses13 = addresses13;
			}

			public List<FiguresItem23> getFigures14() {
				return this.figures14;
			}

			public void setFigures14(List<FiguresItem23> figures14) {
				this.figures14 = figures14;
			}

			public List<LabelsItem26> getLabels15() {
				return this.labels15;
			}

			public void setLabels15(List<LabelsItem26> labels15) {
				this.labels15 = labels15;
			}

			public List<CroppingSuggestionsItem27> getCroppingSuggestions16() {
				return this.croppingSuggestions16;
			}

			public void setCroppingSuggestions16(List<CroppingSuggestionsItem27> croppingSuggestions16) {
				this.croppingSuggestions16 = croppingSuggestions16;
			}

			public List<OCRContentsItem29> getOCRContents17() {
				return this.oCRContents17;
			}

			public void setOCRContents17(List<OCRContentsItem29> oCRContents17) {
				this.oCRContents17 = oCRContents17;
			}

			public List<VideoStreamsItem31> getVideoStreams18() {
				return this.videoStreams18;
			}

			public void setVideoStreams18(List<VideoStreamsItem31> videoStreams18) {
				this.videoStreams18 = videoStreams18;
			}

			public List<SubtitlesItem32> getSubtitles19() {
				return this.subtitles19;
			}

			public void setSubtitles19(List<SubtitlesItem32> subtitles19) {
				this.subtitles19 = subtitles19;
			}

			public List<AudioStreamsItem33> getAudioStreams20() {
				return this.audioStreams20;
			}

			public void setAudioStreams20(List<AudioStreamsItem33> audioStreams20) {
				this.audioStreams20 = audioStreams20;
			}

			public List<AudioCoversItem34> getAudioCovers21() {
				return this.audioCovers21;
			}

			public void setAudioCovers21(List<AudioCoversItem34> audioCovers21) {
				this.audioCovers21 = audioCovers21;
			}

			public ImageScore12 getImageScore12() {
				return this.imageScore12;
			}

			public void setImageScore12(ImageScore12 imageScore12) {
				this.imageScore12 = imageScore12;
			}

			public static class AddressesItem22 {

				private String language;

				private String addressLine;

				private String country;

				private String province;

				private String city;

				private String district;

				private String township;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getAddressLine() {
					return this.addressLine;
				}

				public void setAddressLine(String addressLine) {
					this.addressLine = addressLine;
				}

				public String getCountry() {
					return this.country;
				}

				public void setCountry(String country) {
					this.country = country;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public String getDistrict() {
					return this.district;
				}

				public void setDistrict(String district) {
					this.district = district;
				}

				public String getTownship() {
					return this.township;
				}

				public void setTownship(String township) {
					this.township = township;
				}
			}

			public static class FiguresItem23 {

				private String figureId;

				private Float figureConfidence;

				private String figureClusterId;

				private Float figureClusterConfidence;

				private String figureType;

				private Long age;

				private Float ageSD;

				private String gender;

				private Float genderConfidence;

				private String emotion;

				private Float emotionConfidence;

				private Float faceQuality;

				private String mouth;

				private Float mouthConfidence;

				private String beard;

				private Float beardConfidence;

				private String hat;

				private Float hatConfidence;

				private String mask;

				private Float maskConfidence;

				private String glasses;

				private Float glassesConfidence;

				private Float sharpness;

				private Float attractive;

				private Boundary24 boundary24;

				private HeadPose25 headPose25;

				public String getFigureId() {
					return this.figureId;
				}

				public void setFigureId(String figureId) {
					this.figureId = figureId;
				}

				public Float getFigureConfidence() {
					return this.figureConfidence;
				}

				public void setFigureConfidence(Float figureConfidence) {
					this.figureConfidence = figureConfidence;
				}

				public String getFigureClusterId() {
					return this.figureClusterId;
				}

				public void setFigureClusterId(String figureClusterId) {
					this.figureClusterId = figureClusterId;
				}

				public Float getFigureClusterConfidence() {
					return this.figureClusterConfidence;
				}

				public void setFigureClusterConfidence(Float figureClusterConfidence) {
					this.figureClusterConfidence = figureClusterConfidence;
				}

				public String getFigureType() {
					return this.figureType;
				}

				public void setFigureType(String figureType) {
					this.figureType = figureType;
				}

				public Long getAge() {
					return this.age;
				}

				public void setAge(Long age) {
					this.age = age;
				}

				public Float getAgeSD() {
					return this.ageSD;
				}

				public void setAgeSD(Float ageSD) {
					this.ageSD = ageSD;
				}

				public String getGender() {
					return this.gender;
				}

				public void setGender(String gender) {
					this.gender = gender;
				}

				public Float getGenderConfidence() {
					return this.genderConfidence;
				}

				public void setGenderConfidence(Float genderConfidence) {
					this.genderConfidence = genderConfidence;
				}

				public String getEmotion() {
					return this.emotion;
				}

				public void setEmotion(String emotion) {
					this.emotion = emotion;
				}

				public Float getEmotionConfidence() {
					return this.emotionConfidence;
				}

				public void setEmotionConfidence(Float emotionConfidence) {
					this.emotionConfidence = emotionConfidence;
				}

				public Float getFaceQuality() {
					return this.faceQuality;
				}

				public void setFaceQuality(Float faceQuality) {
					this.faceQuality = faceQuality;
				}

				public String getMouth() {
					return this.mouth;
				}

				public void setMouth(String mouth) {
					this.mouth = mouth;
				}

				public Float getMouthConfidence() {
					return this.mouthConfidence;
				}

				public void setMouthConfidence(Float mouthConfidence) {
					this.mouthConfidence = mouthConfidence;
				}

				public String getBeard() {
					return this.beard;
				}

				public void setBeard(String beard) {
					this.beard = beard;
				}

				public Float getBeardConfidence() {
					return this.beardConfidence;
				}

				public void setBeardConfidence(Float beardConfidence) {
					this.beardConfidence = beardConfidence;
				}

				public String getHat() {
					return this.hat;
				}

				public void setHat(String hat) {
					this.hat = hat;
				}

				public Float getHatConfidence() {
					return this.hatConfidence;
				}

				public void setHatConfidence(Float hatConfidence) {
					this.hatConfidence = hatConfidence;
				}

				public String getMask() {
					return this.mask;
				}

				public void setMask(String mask) {
					this.mask = mask;
				}

				public Float getMaskConfidence() {
					return this.maskConfidence;
				}

				public void setMaskConfidence(Float maskConfidence) {
					this.maskConfidence = maskConfidence;
				}

				public String getGlasses() {
					return this.glasses;
				}

				public void setGlasses(String glasses) {
					this.glasses = glasses;
				}

				public Float getGlassesConfidence() {
					return this.glassesConfidence;
				}

				public void setGlassesConfidence(Float glassesConfidence) {
					this.glassesConfidence = glassesConfidence;
				}

				public Float getSharpness() {
					return this.sharpness;
				}

				public void setSharpness(Float sharpness) {
					this.sharpness = sharpness;
				}

				public Float getAttractive() {
					return this.attractive;
				}

				public void setAttractive(Float attractive) {
					this.attractive = attractive;
				}

				public Boundary24 getBoundary24() {
					return this.boundary24;
				}

				public void setBoundary24(Boundary24 boundary24) {
					this.boundary24 = boundary24;
				}

				public HeadPose25 getHeadPose25() {
					return this.headPose25;
				}

				public void setHeadPose25(HeadPose25 headPose25) {
					this.headPose25 = headPose25;
				}

				public static class Boundary24 {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}

				public static class HeadPose25 {

					private Float pitch;

					private Float roll;

					private Float yaw;

					public Float getPitch() {
						return this.pitch;
					}

					public void setPitch(Float pitch) {
						this.pitch = pitch;
					}

					public Float getRoll() {
						return this.roll;
					}

					public void setRoll(Float roll) {
						this.roll = roll;
					}

					public Float getYaw() {
						return this.yaw;
					}

					public void setYaw(Float yaw) {
						this.yaw = yaw;
					}
				}
			}

			public static class LabelsItem26 {

				private String language;

				private String labelName;

				private Long labelLevel;

				private Float labelConfidence;

				private String parentLabelName;

				private Float centricScore;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getLabelName() {
					return this.labelName;
				}

				public void setLabelName(String labelName) {
					this.labelName = labelName;
				}

				public Long getLabelLevel() {
					return this.labelLevel;
				}

				public void setLabelLevel(Long labelLevel) {
					this.labelLevel = labelLevel;
				}

				public Float getLabelConfidence() {
					return this.labelConfidence;
				}

				public void setLabelConfidence(Float labelConfidence) {
					this.labelConfidence = labelConfidence;
				}

				public String getParentLabelName() {
					return this.parentLabelName;
				}

				public void setParentLabelName(String parentLabelName) {
					this.parentLabelName = parentLabelName;
				}

				public Float getCentricScore() {
					return this.centricScore;
				}

				public void setCentricScore(Float centricScore) {
					this.centricScore = centricScore;
				}
			}

			public static class CroppingSuggestionsItem27 {

				private String aspectRatio;

				private Float confidence;

				private Boundary28 boundary28;

				public String getAspectRatio() {
					return this.aspectRatio;
				}

				public void setAspectRatio(String aspectRatio) {
					this.aspectRatio = aspectRatio;
				}

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public Boundary28 getBoundary28() {
					return this.boundary28;
				}

				public void setBoundary28(Boundary28 boundary28) {
					this.boundary28 = boundary28;
				}

				public static class Boundary28 {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}
			}

			public static class OCRContentsItem29 {

				private String language;

				private String contents;

				private Float confidence;

				private Boundary30 boundary30;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getContents() {
					return this.contents;
				}

				public void setContents(String contents) {
					this.contents = contents;
				}

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public Boundary30 getBoundary30() {
					return this.boundary30;
				}

				public void setBoundary30(Boundary30 boundary30) {
					this.boundary30 = boundary30;
				}

				public static class Boundary30 {

					private Long width;

					private Long height;

					private Long left;

					private Long top;

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

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}
				}
			}

			public static class VideoStreamsItem31 {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String profile;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private Long width;

				private Long height;

				private Long hasBFrames;

				private String sampleAspectRatio;

				private String displayAspectRatio;

				private String pixelFormat;

				private Long level;

				private String frameRate;

				private String averageFrameRate;

				private String timeBase;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private Long frameCount;

				private String rotate;

				private Long bitDepth;

				private String colorSpace;

				private String colorRange;

				private String colorTransfer;

				private String colorPrimaries;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

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

				public Long getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(Long hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getSampleAspectRatio() {
					return this.sampleAspectRatio;
				}

				public void setSampleAspectRatio(String sampleAspectRatio) {
					this.sampleAspectRatio = sampleAspectRatio;
				}

				public String getDisplayAspectRatio() {
					return this.displayAspectRatio;
				}

				public void setDisplayAspectRatio(String displayAspectRatio) {
					this.displayAspectRatio = displayAspectRatio;
				}

				public String getPixelFormat() {
					return this.pixelFormat;
				}

				public void setPixelFormat(String pixelFormat) {
					this.pixelFormat = pixelFormat;
				}

				public Long getLevel() {
					return this.level;
				}

				public void setLevel(Long level) {
					this.level = level;
				}

				public String getFrameRate() {
					return this.frameRate;
				}

				public void setFrameRate(String frameRate) {
					this.frameRate = frameRate;
				}

				public String getAverageFrameRate() {
					return this.averageFrameRate;
				}

				public void setAverageFrameRate(String averageFrameRate) {
					this.averageFrameRate = averageFrameRate;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public Long getFrameCount() {
					return this.frameCount;
				}

				public void setFrameCount(Long frameCount) {
					this.frameCount = frameCount;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public Long getBitDepth() {
					return this.bitDepth;
				}

				public void setBitDepth(Long bitDepth) {
					this.bitDepth = bitDepth;
				}

				public String getColorSpace() {
					return this.colorSpace;
				}

				public void setColorSpace(String colorSpace) {
					this.colorSpace = colorSpace;
				}

				public String getColorRange() {
					return this.colorRange;
				}

				public void setColorRange(String colorRange) {
					this.colorRange = colorRange;
				}

				public String getColorTransfer() {
					return this.colorTransfer;
				}

				public void setColorTransfer(String colorTransfer) {
					this.colorTransfer = colorTransfer;
				}

				public String getColorPrimaries() {
					return this.colorPrimaries;
				}

				public void setColorPrimaries(String colorPrimaries) {
					this.colorPrimaries = colorPrimaries;
				}
			}

			public static class SubtitlesItem32 {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String codecTagString;

				private String codecTag;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private String content;

				private Long width;

				private Long height;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

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
			}

			public static class AudioStreamsItem33 {

				private Long index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private String timeBase;

				private Double startTime;

				private Double duration;

				private Long bitrate;

				private Long frameCount;

				private String lyric;

				private String sampleFormat;

				private Long sampleRate;

				private Long channels;

				private String channelLayout;

				public Long getIndex() {
					return this.index;
				}

				public void setIndex(Long index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public Double getDuration() {
					return this.duration;
				}

				public void setDuration(Double duration) {
					this.duration = duration;
				}

				public Long getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Long bitrate) {
					this.bitrate = bitrate;
				}

				public Long getFrameCount() {
					return this.frameCount;
				}

				public void setFrameCount(Long frameCount) {
					this.frameCount = frameCount;
				}

				public String getLyric() {
					return this.lyric;
				}

				public void setLyric(String lyric) {
					this.lyric = lyric;
				}

				public String getSampleFormat() {
					return this.sampleFormat;
				}

				public void setSampleFormat(String sampleFormat) {
					this.sampleFormat = sampleFormat;
				}

				public Long getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(Long sampleRate) {
					this.sampleRate = sampleRate;
				}

				public Long getChannels() {
					return this.channels;
				}

				public void setChannels(Long channels) {
					this.channels = channels;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
				}
			}

			public static class AudioCoversItem34 {

				private Long imageWidth;

				private Long imageHeight;

				private String eXIF;

				private List<CroppingSuggestionsItem38> croppingSuggestions36;

				private List<OCRContentsItem40> oCRContents37;

				private ImageScore35 imageScore35;

				public Long getImageWidth() {
					return this.imageWidth;
				}

				public void setImageWidth(Long imageWidth) {
					this.imageWidth = imageWidth;
				}

				public Long getImageHeight() {
					return this.imageHeight;
				}

				public void setImageHeight(Long imageHeight) {
					this.imageHeight = imageHeight;
				}

				public String getEXIF() {
					return this.eXIF;
				}

				public void setEXIF(String eXIF) {
					this.eXIF = eXIF;
				}

				public List<CroppingSuggestionsItem38> getCroppingSuggestions36() {
					return this.croppingSuggestions36;
				}

				public void setCroppingSuggestions36(List<CroppingSuggestionsItem38> croppingSuggestions36) {
					this.croppingSuggestions36 = croppingSuggestions36;
				}

				public List<OCRContentsItem40> getOCRContents37() {
					return this.oCRContents37;
				}

				public void setOCRContents37(List<OCRContentsItem40> oCRContents37) {
					this.oCRContents37 = oCRContents37;
				}

				public ImageScore35 getImageScore35() {
					return this.imageScore35;
				}

				public void setImageScore35(ImageScore35 imageScore35) {
					this.imageScore35 = imageScore35;
				}

				public static class CroppingSuggestionsItem38 {

					private String aspectRatio;

					private Float confidence;

					private Boundary39 boundary39;

					public String getAspectRatio() {
						return this.aspectRatio;
					}

					public void setAspectRatio(String aspectRatio) {
						this.aspectRatio = aspectRatio;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public Boundary39 getBoundary39() {
						return this.boundary39;
					}

					public void setBoundary39(Boundary39 boundary39) {
						this.boundary39 = boundary39;
					}

					public static class Boundary39 {

						private Long width;

						private Long height;

						private Long left;

						private Long top;

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

						public Long getLeft() {
							return this.left;
						}

						public void setLeft(Long left) {
							this.left = left;
						}

						public Long getTop() {
							return this.top;
						}

						public void setTop(Long top) {
							this.top = top;
						}
					}
				}

				public static class OCRContentsItem40 {

					private String language;

					private String contents;

					private Float confidence;

					private Boundary41 boundary41;

					public String getLanguage() {
						return this.language;
					}

					public void setLanguage(String language) {
						this.language = language;
					}

					public String getContents() {
						return this.contents;
					}

					public void setContents(String contents) {
						this.contents = contents;
					}

					public Float getConfidence() {
						return this.confidence;
					}

					public void setConfidence(Float confidence) {
						this.confidence = confidence;
					}

					public Boundary41 getBoundary41() {
						return this.boundary41;
					}

					public void setBoundary41(Boundary41 boundary41) {
						this.boundary41 = boundary41;
					}

					public static class Boundary41 {

						private Long width;

						private Long height;

						private Long left;

						private Long top;

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

						public Long getLeft() {
							return this.left;
						}

						public void setLeft(Long left) {
							this.left = left;
						}

						public Long getTop() {
							return this.top;
						}

						public void setTop(Long top) {
							this.top = top;
						}
					}
				}

				public static class ImageScore35 {

					private Float overallQualityScore;

					public Float getOverallQualityScore() {
						return this.overallQualityScore;
					}

					public void setOverallQualityScore(Float overallQualityScore) {
						this.overallQualityScore = overallQualityScore;
					}
				}
			}

			public static class ImageScore12 {

				private Float overallQualityScore;

				public Float getOverallQualityScore() {
					return this.overallQualityScore;
				}

				public void setOverallQualityScore(Float overallQualityScore) {
					this.overallQualityScore = overallQualityScore;
				}
			}
		}
	}

	@Override
	public GetStoryResponse getInstance(UnmarshallerContext context) {
		return	GetStoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
