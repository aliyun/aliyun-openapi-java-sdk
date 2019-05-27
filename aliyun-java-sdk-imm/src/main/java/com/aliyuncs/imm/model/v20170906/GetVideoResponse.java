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

	private String requestId;

	private String setId;

	private String videoUri;

	private String remarksA;

	private String remarksB;

	private String createTime;

	private String modifyTime;

	private Integer videoWidth;

	private Integer videoHeight;

	private String videoFormat;

	private Float videoDuration;

	private Integer fileSize;

	private Integer videoFrames;

	private String sourceType;

	private String sourceUri;

	private String sourcePosition;

	private String processStatus;

	private String processModifyTime;

	private String videoTagsStatus;

	private String videoTagsModifyTime;

	private String celebrityStatus;

	private String celebrityModifyTime;

	private String processFailReason;

	private String videoTagsFailReason;

	private String celebrityFailReason;

	private String remarksC;

	private String remarksD;

	private String externalId;

	private List<CelebrityItem> celebrity;

	private List<VideoTagsItem> videoTags;

	private List<PersonsItem> persons;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

	public String getRemarksA() {
		return this.remarksA;
	}

	public void setRemarksA(String remarksA) {
		this.remarksA = remarksA;
	}

	public String getRemarksB() {
		return this.remarksB;
	}

	public void setRemarksB(String remarksB) {
		this.remarksB = remarksB;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getVideoWidth() {
		return this.videoWidth;
	}

	public void setVideoWidth(Integer videoWidth) {
		this.videoWidth = videoWidth;
	}

	public Integer getVideoHeight() {
		return this.videoHeight;
	}

	public void setVideoHeight(Integer videoHeight) {
		this.videoHeight = videoHeight;
	}

	public String getVideoFormat() {
		return this.videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}

	public Float getVideoDuration() {
		return this.videoDuration;
	}

	public void setVideoDuration(Float videoDuration) {
		this.videoDuration = videoDuration;
	}

	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Integer getVideoFrames() {
		return this.videoFrames;
	}

	public void setVideoFrames(Integer videoFrames) {
		this.videoFrames = videoFrames;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceUri() {
		return this.sourceUri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public String getSourcePosition() {
		return this.sourcePosition;
	}

	public void setSourcePosition(String sourcePosition) {
		this.sourcePosition = sourcePosition;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessModifyTime() {
		return this.processModifyTime;
	}

	public void setProcessModifyTime(String processModifyTime) {
		this.processModifyTime = processModifyTime;
	}

	public String getVideoTagsStatus() {
		return this.videoTagsStatus;
	}

	public void setVideoTagsStatus(String videoTagsStatus) {
		this.videoTagsStatus = videoTagsStatus;
	}

	public String getVideoTagsModifyTime() {
		return this.videoTagsModifyTime;
	}

	public void setVideoTagsModifyTime(String videoTagsModifyTime) {
		this.videoTagsModifyTime = videoTagsModifyTime;
	}

	public String getCelebrityStatus() {
		return this.celebrityStatus;
	}

	public void setCelebrityStatus(String celebrityStatus) {
		this.celebrityStatus = celebrityStatus;
	}

	public String getCelebrityModifyTime() {
		return this.celebrityModifyTime;
	}

	public void setCelebrityModifyTime(String celebrityModifyTime) {
		this.celebrityModifyTime = celebrityModifyTime;
	}

	public String getProcessFailReason() {
		return this.processFailReason;
	}

	public void setProcessFailReason(String processFailReason) {
		this.processFailReason = processFailReason;
	}

	public String getVideoTagsFailReason() {
		return this.videoTagsFailReason;
	}

	public void setVideoTagsFailReason(String videoTagsFailReason) {
		this.videoTagsFailReason = videoTagsFailReason;
	}

	public String getCelebrityFailReason() {
		return this.celebrityFailReason;
	}

	public void setCelebrityFailReason(String celebrityFailReason) {
		this.celebrityFailReason = celebrityFailReason;
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

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<CelebrityItem> getCelebrity() {
		return this.celebrity;
	}

	public void setCelebrity(List<CelebrityItem> celebrity) {
		this.celebrity = celebrity;
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

	public static class VideoTagsItem {

		private String videoTagName;

		private String videoTagEnName;

		private Float videoTagConfidence;

		public String getVideoTagName() {
			return this.videoTagName;
		}

		public void setVideoTagName(String videoTagName) {
			this.videoTagName = videoTagName;
		}

		public String getVideoTagEnName() {
			return this.videoTagEnName;
		}

		public void setVideoTagEnName(String videoTagEnName) {
			this.videoTagEnName = videoTagEnName;
		}

		public Float getVideoTagConfidence() {
			return this.videoTagConfidence;
		}

		public void setVideoTagConfidence(Float videoTagConfidence) {
			this.videoTagConfidence = videoTagConfidence;
		}
	}

	public static class PersonsItem {

		private String personId;

		private Integer age;

		private Float ageConfidence;

		private String gender;

		private Float genderConfidence;

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
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
