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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.ExtractPedestrianFeatureAttrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExtractPedestrianFeatureAttrResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float qualityScore;

		private String objType;

		private String feature;

		private String gender;

		private Float lowerColorScore;

		private Float objTypeScore;

		private String age;

		private Float ageScore;

		private Float upperTypeScore;

		private Float lowerTypeScore;

		private String lowerColor;

		private String hair;

		private String upperColor;

		private Float genderScore;

		private String upperType;

		private Float hairScore;

		private String lowerType;

		private Float upperColorScore;

		private String orientation;

		private Float orientationScore;

		public Float getQualityScore() {
			return this.qualityScore;
		}

		public void setQualityScore(Float qualityScore) {
			this.qualityScore = qualityScore;
		}

		public String getObjType() {
			return this.objType;
		}

		public void setObjType(String objType) {
			this.objType = objType;
		}

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Float getLowerColorScore() {
			return this.lowerColorScore;
		}

		public void setLowerColorScore(Float lowerColorScore) {
			this.lowerColorScore = lowerColorScore;
		}

		public Float getObjTypeScore() {
			return this.objTypeScore;
		}

		public void setObjTypeScore(Float objTypeScore) {
			this.objTypeScore = objTypeScore;
		}

		public String getAge() {
			return this.age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public Float getAgeScore() {
			return this.ageScore;
		}

		public void setAgeScore(Float ageScore) {
			this.ageScore = ageScore;
		}

		public Float getUpperTypeScore() {
			return this.upperTypeScore;
		}

		public void setUpperTypeScore(Float upperTypeScore) {
			this.upperTypeScore = upperTypeScore;
		}

		public Float getLowerTypeScore() {
			return this.lowerTypeScore;
		}

		public void setLowerTypeScore(Float lowerTypeScore) {
			this.lowerTypeScore = lowerTypeScore;
		}

		public String getLowerColor() {
			return this.lowerColor;
		}

		public void setLowerColor(String lowerColor) {
			this.lowerColor = lowerColor;
		}

		public String getHair() {
			return this.hair;
		}

		public void setHair(String hair) {
			this.hair = hair;
		}

		public String getUpperColor() {
			return this.upperColor;
		}

		public void setUpperColor(String upperColor) {
			this.upperColor = upperColor;
		}

		public Float getGenderScore() {
			return this.genderScore;
		}

		public void setGenderScore(Float genderScore) {
			this.genderScore = genderScore;
		}

		public String getUpperType() {
			return this.upperType;
		}

		public void setUpperType(String upperType) {
			this.upperType = upperType;
		}

		public Float getHairScore() {
			return this.hairScore;
		}

		public void setHairScore(Float hairScore) {
			this.hairScore = hairScore;
		}

		public String getLowerType() {
			return this.lowerType;
		}

		public void setLowerType(String lowerType) {
			this.lowerType = lowerType;
		}

		public Float getUpperColorScore() {
			return this.upperColorScore;
		}

		public void setUpperColorScore(Float upperColorScore) {
			this.upperColorScore = upperColorScore;
		}

		public String getOrientation() {
			return this.orientation;
		}

		public void setOrientation(String orientation) {
			this.orientation = orientation;
		}

		public Float getOrientationScore() {
			return this.orientationScore;
		}

		public void setOrientationScore(Float orientationScore) {
			this.orientationScore = orientationScore;
		}
	}

	@Override
	public ExtractPedestrianFeatureAttrResponse getInstance(UnmarshallerContext context) {
		return	ExtractPedestrianFeatureAttrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
