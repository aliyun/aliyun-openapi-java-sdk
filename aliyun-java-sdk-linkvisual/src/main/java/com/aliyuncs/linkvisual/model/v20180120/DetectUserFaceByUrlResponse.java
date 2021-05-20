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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.DetectUserFaceByUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectUserFaceByUrlResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Float faceProbability;

		private Integer age;

		private Integer gender;

		private Float blurScore;

		private Float poseScore;

		private Float occlusionScore;

		private Boolean goodForLibrary;

		private Boolean goodForRecognition;

		private List<String> faceRects;

		private List<String> landmarks;

		public Float getFaceProbability() {
			return this.faceProbability;
		}

		public void setFaceProbability(Float faceProbability) {
			this.faceProbability = faceProbability;
		}

		public Integer getAge() {
			return this.age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Integer getGender() {
			return this.gender;
		}

		public void setGender(Integer gender) {
			this.gender = gender;
		}

		public Float getBlurScore() {
			return this.blurScore;
		}

		public void setBlurScore(Float blurScore) {
			this.blurScore = blurScore;
		}

		public Float getPoseScore() {
			return this.poseScore;
		}

		public void setPoseScore(Float poseScore) {
			this.poseScore = poseScore;
		}

		public Float getOcclusionScore() {
			return this.occlusionScore;
		}

		public void setOcclusionScore(Float occlusionScore) {
			this.occlusionScore = occlusionScore;
		}

		public Boolean getGoodForLibrary() {
			return this.goodForLibrary;
		}

		public void setGoodForLibrary(Boolean goodForLibrary) {
			this.goodForLibrary = goodForLibrary;
		}

		public Boolean getGoodForRecognition() {
			return this.goodForRecognition;
		}

		public void setGoodForRecognition(Boolean goodForRecognition) {
			this.goodForRecognition = goodForRecognition;
		}

		public List<String> getFaceRects() {
			return this.faceRects;
		}

		public void setFaceRects(List<String> faceRects) {
			this.faceRects = faceRects;
		}

		public List<String> getLandmarks() {
			return this.landmarks;
		}

		public void setLandmarks(List<String> landmarks) {
			this.landmarks = landmarks;
		}
	}

	@Override
	public DetectUserFaceByUrlResponse getInstance(UnmarshallerContext context) {
		return	DetectUserFaceByUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
