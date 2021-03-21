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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVideoResponse extends AcsResponse {

	private String modifyTime;

	private String processStatus;

	private Integer videoWidth;

	private String sourceUri;

	private String sourceType;

	private String videoInfo;

	private String remarksA;

	private String videoFrameTagsModifyTime;

	private String remarksB;

	private String videoFacesFailReason;

	private String videoFacesStatus;

	private String videoOCRModifyTime;

	private String remarksC;

	private String remarksD;

	private Integer videoHeight;

	private String sourcePosition;

	private String videoOCRFailReason;

	private String videoFrameTagsStatus;

	private String videoTagsFailReason;

	private String videoTagsModifyTime;

	private String videoOCRStatus;

	private Integer videoFrames;

	private String requestId;

	private String videoSTTModifyTime;

	private String processModifyTime;

	private String processFailReason;

	private String videoSTTFailReason;

	private String externalId;

	private String createTime;

	private String videoUri;

	private String videoFormat;

	private String videoFrameTagsFailReason;

	private String videoSTTStatus;

	private String videoFacesModifyTime;

	private String celebrityModifyTime;

	private Float videoDuration;

	private String celebrityFailReason;

	private String celebrityStatus;

	private String setId;

	private String videoTagsStatus;

	private Integer fileSize;

	private List<VideoTagsItem> videoTags;

	private List<PersonsItem> persons;

	private List<CelebrityItem> celebrity;

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public Integer getVideoWidth() {
		return this.videoWidth;
	}

	public void setVideoWidth(Integer videoWidth) {
		this.videoWidth = videoWidth;
	}

	public String getSourceUri() {
		return this.sourceUri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getVideoInfo() {
		return this.videoInfo;
	}

	public void setVideoInfo(String videoInfo) {
		this.videoInfo = videoInfo;
	}

	public String getRemarksA() {
		return this.remarksA;
	}

	public void setRemarksA(String remarksA) {
		this.remarksA = remarksA;
	}

	public String getVideoFrameTagsModifyTime() {
		return this.videoFrameTagsModifyTime;
	}

	public void setVideoFrameTagsModifyTime(String videoFrameTagsModifyTime) {
		this.videoFrameTagsModifyTime = videoFrameTagsModifyTime;
	}

	public String getRemarksB() {
		return this.remarksB;
	}

	public void setRemarksB(String remarksB) {
		this.remarksB = remarksB;
	}

	public String getVideoFacesFailReason() {
		return this.videoFacesFailReason;
	}

	public void setVideoFacesFailReason(String videoFacesFailReason) {
		this.videoFacesFailReason = videoFacesFailReason;
	}

	public String getVideoFacesStatus() {
		return this.videoFacesStatus;
	}

	public void setVideoFacesStatus(String videoFacesStatus) {
		this.videoFacesStatus = videoFacesStatus;
	}

	public String getVideoOCRModifyTime() {
		return this.videoOCRModifyTime;
	}

	public void setVideoOCRModifyTime(String videoOCRModifyTime) {
		this.videoOCRModifyTime = videoOCRModifyTime;
	}

	public String getRemarksC() {
		return this.remarksC;
	}

	public void setRemarksC(String remarksC) {
		this.remarksC = remarksC;
	}

	public String getRemarksD() {
		return this.remarksD;
	}

	public void setRemarksD(String remarksD) {
		this.remarksD = remarksD;
	}

	public Integer getVideoHeight() {
		return this.videoHeight;
	}

	public void setVideoHeight(Integer videoHeight) {
		this.videoHeight = videoHeight;
	}

	public String getSourcePosition() {
		return this.sourcePosition;
	}

	public void setSourcePosition(String sourcePosition) {
		this.sourcePosition = sourcePosition;
	}

	public String getVideoOCRFailReason() {
		return this.videoOCRFailReason;
	}

	public void setVideoOCRFailReason(String videoOCRFailReason) {
		this.videoOCRFailReason = videoOCRFailReason;
	}

	public String getVideoFrameTagsStatus() {
		return this.videoFrameTagsStatus;
	}

	public void setVideoFrameTagsStatus(String videoFrameTagsStatus) {
		this.videoFrameTagsStatus = videoFrameTagsStatus;
	}

	public String getVideoTagsFailReason() {
		return this.videoTagsFailReason;
	}

	public void setVideoTagsFailReason(String videoTagsFailReason) {
		this.videoTagsFailReason = videoTagsFailReason;
	}

	public String getVideoTagsModifyTime() {
		return this.videoTagsModifyTime;
	}

	public void setVideoTagsModifyTime(String videoTagsModifyTime) {
		this.videoTagsModifyTime = videoTagsModifyTime;
	}

	public String getVideoOCRStatus() {
		return this.videoOCRStatus;
	}

	public void setVideoOCRStatus(String videoOCRStatus) {
		this.videoOCRStatus = videoOCRStatus;
	}

	public Integer getVideoFrames() {
		return this.videoFrames;
	}

	public void setVideoFrames(Integer videoFrames) {
		this.videoFrames = videoFrames;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVideoSTTModifyTime() {
		return this.videoSTTModifyTime;
	}

	public void setVideoSTTModifyTime(String videoSTTModifyTime) {
		this.videoSTTModifyTime = videoSTTModifyTime;
	}

	public String getProcessModifyTime() {
		return this.processModifyTime;
	}

	public void setProcessModifyTime(String processModifyTime) {
		this.processModifyTime = processModifyTime;
	}

	public String getProcessFailReason() {
		return this.processFailReason;
	}

	public void setProcessFailReason(String processFailReason) {
		this.processFailReason = processFailReason;
	}

	public String getVideoSTTFailReason() {
		return this.videoSTTFailReason;
	}

	public void setVideoSTTFailReason(String videoSTTFailReason) {
		this.videoSTTFailReason = videoSTTFailReason;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

	public String getVideoFormat() {
		return this.videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}

	public String getVideoFrameTagsFailReason() {
		return this.videoFrameTagsFailReason;
	}

	public void setVideoFrameTagsFailReason(String videoFrameTagsFailReason) {
		this.videoFrameTagsFailReason = videoFrameTagsFailReason;
	}

	public String getVideoSTTStatus() {
		return this.videoSTTStatus;
	}

	public void setVideoSTTStatus(String videoSTTStatus) {
		this.videoSTTStatus = videoSTTStatus;
	}

	public String getVideoFacesModifyTime() {
		return this.videoFacesModifyTime;
	}

	public void setVideoFacesModifyTime(String videoFacesModifyTime) {
		this.videoFacesModifyTime = videoFacesModifyTime;
	}

	public String getCelebrityModifyTime() {
		return this.celebrityModifyTime;
	}

	public void setCelebrityModifyTime(String celebrityModifyTime) {
		this.celebrityModifyTime = celebrityModifyTime;
	}

	public Float getVideoDuration() {
		return this.videoDuration;
	}

	public void setVideoDuration(Float videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getCelebrityFailReason() {
		return this.celebrityFailReason;
	}

	public void setCelebrityFailReason(String celebrityFailReason) {
		this.celebrityFailReason = celebrityFailReason;
	}

	public String getCelebrityStatus() {
		return this.celebrityStatus;
	}

	public void setCelebrityStatus(String celebrityStatus) {
		this.celebrityStatus = celebrityStatus;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getVideoTagsStatus() {
		return this.videoTagsStatus;
	}

	public void setVideoTagsStatus(String videoTagsStatus) {
		this.videoTagsStatus = videoTagsStatus;
	}

	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public List<VideoTagsItem> getVideoTags() {
		return this.videoTags;
	}

	public void setVideoTags(List<VideoTagsItem> videoTags) {
		this.videoTags = videoTags;
	}

	public List<PersonsItem> getPersons() {
		return this.persons;
	}

	public void setPersons(List<PersonsItem> persons) {
		this.persons = persons;
	}

	public List<CelebrityItem> getCelebrity() {
		return this.celebrity;
	}

	public void setCelebrity(List<CelebrityItem> celebrity) {
		this.celebrity = celebrity;
	}

	public static class VideoTagsItem {

		private Float tagConfidence;

		private String tagName;

		private Integer tagLevel;

		private String parentTagName;

		public Float getTagConfidence() {
			return this.tagConfidence;
		}

		public void setTagConfidence(Float tagConfidence) {
			this.tagConfidence = tagConfidence;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public Integer getTagLevel() {
			return this.tagLevel;
		}

		public void setTagLevel(Integer tagLevel) {
			this.tagLevel = tagLevel;
		}

		public String getParentTagName() {
			return this.parentTagName;
		}

		public void setParentTagName(String parentTagName) {
			this.parentTagName = parentTagName;
		}
	}

	public static class PersonsItem {

		private String personId;

		private Float genderConfidence;

		private String gender;

		private Integer age;

		private Float ageConfidence;

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public Float getGenderConfidence() {
			return this.genderConfidence;
		}

		public void setGenderConfidence(Float genderConfidence) {
			this.genderConfidence = genderConfidence;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Integer getAge() {
			return this.age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Float getAgeConfidence() {
			return this.ageConfidence;
		}

		public void setAgeConfidence(Float ageConfidence) {
			this.ageConfidence = ageConfidence;
		}
	}

	public static class CelebrityItem {

		private String celebrityName;

		private Integer celebrityNum;

		private String celebrityLibraryName;

		public String getCelebrityName() {
			return this.celebrityName;
		}

		public void setCelebrityName(String celebrityName) {
			this.celebrityName = celebrityName;
		}

		public Integer getCelebrityNum() {
			return this.celebrityNum;
		}

		public void setCelebrityNum(Integer celebrityNum) {
			this.celebrityNum = celebrityNum;
		}

		public String getCelebrityLibraryName() {
			return this.celebrityLibraryName;
		}

		public void setCelebrityLibraryName(String celebrityLibraryName) {
			this.celebrityLibraryName = celebrityLibraryName;
		}
	}

	@Override
	public GetVideoResponse getInstance(UnmarshallerContext context) {
		return	GetVideoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
