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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.ExtractPedestrianFeatureAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExtractPedestrianFeatureAttributeResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String hair;

		private String upperType;

		private Float upperTypeScore;

		private String lowerColor;

		private Float qualityScore;

		private String gender;

		private String feature;

		private Float upperColorScore;

		private Float genderScore;

		private Float lowerColorScore;

		private String objType;

		private Float lowerTypeScore;

		private Float hairScore;

		private String upperColor;

		private String lowerType;

		private Float ageScore;

		private Float objTypeScore;

		private String age;

		private List<Element> elements;

		public String getHair() {
			return this.hair;
		}

		public void setHair(String hair) {
			this.hair = hair;
		}

		public String getUpperType() {
			return this.upperType;
		}

		public void setUpperType(String upperType) {
			this.upperType = upperType;
		}

		public Float getUpperTypeScore() {
			return this.upperTypeScore;
		}

		public void setUpperTypeScore(Float upperTypeScore) {
			this.upperTypeScore = upperTypeScore;
		}

		public String getLowerColor() {
			return this.lowerColor;
		}

		public void setLowerColor(String lowerColor) {
			this.lowerColor = lowerColor;
		}

		public Float getQualityScore() {
			return this.qualityScore;
		}

		public void setQualityScore(Float qualityScore) {
			this.qualityScore = qualityScore;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public Float getUpperColorScore() {
			return this.upperColorScore;
		}

		public void setUpperColorScore(Float upperColorScore) {
			this.upperColorScore = upperColorScore;
		}

		public Float getGenderScore() {
			return this.genderScore;
		}

		public void setGenderScore(Float genderScore) {
			this.genderScore = genderScore;
		}

		public Float getLowerColorScore() {
			return this.lowerColorScore;
		}

		public void setLowerColorScore(Float lowerColorScore) {
			this.lowerColorScore = lowerColorScore;
		}

		public String getObjType() {
			return this.objType;
		}

		public void setObjType(String objType) {
			this.objType = objType;
		}

		public Float getLowerTypeScore() {
			return this.lowerTypeScore;
		}

		public void setLowerTypeScore(Float lowerTypeScore) {
			this.lowerTypeScore = lowerTypeScore;
		}

		public Float getHairScore() {
			return this.hairScore;
		}

		public void setHairScore(Float hairScore) {
			this.hairScore = hairScore;
		}

		public String getUpperColor() {
			return this.upperColor;
		}

		public void setUpperColor(String upperColor) {
			this.upperColor = upperColor;
		}

		public String getLowerType() {
			return this.lowerType;
		}

		public void setLowerType(String lowerType) {
			this.lowerType = lowerType;
		}

		public Float getAgeScore() {
			return this.ageScore;
		}

		public void setAgeScore(Float ageScore) {
			this.ageScore = ageScore;
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

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class Element {

			private String hair;

			private String upperType;

			private Float upperTypeScore;

			private String lowerColor;

			private Float qualityScore;

			private String gender;

			private String feature;

			private Float upperColorScore;

			private Float genderScore;

			private Float lowerColorScore;

			private String objType;

			private Float lowerTypeScore;

			private Float hairScore;

			private String upperColor;

			private String lowerType;

			private Float ageScore;

			private Float objTypeScore;

			private String age;

			public String getHair() {
				return this.hair;
			}

			public void setHair(String hair) {
				this.hair = hair;
			}

			public String getUpperType() {
				return this.upperType;
			}

			public void setUpperType(String upperType) {
				this.upperType = upperType;
			}

			public Float getUpperTypeScore() {
				return this.upperTypeScore;
			}

			public void setUpperTypeScore(Float upperTypeScore) {
				this.upperTypeScore = upperTypeScore;
			}

			public String getLowerColor() {
				return this.lowerColor;
			}

			public void setLowerColor(String lowerColor) {
				this.lowerColor = lowerColor;
			}

			public Float getQualityScore() {
				return this.qualityScore;
			}

			public void setQualityScore(Float qualityScore) {
				this.qualityScore = qualityScore;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}

			public Float getUpperColorScore() {
				return this.upperColorScore;
			}

			public void setUpperColorScore(Float upperColorScore) {
				this.upperColorScore = upperColorScore;
			}

			public Float getGenderScore() {
				return this.genderScore;
			}

			public void setGenderScore(Float genderScore) {
				this.genderScore = genderScore;
			}

			public Float getLowerColorScore() {
				return this.lowerColorScore;
			}

			public void setLowerColorScore(Float lowerColorScore) {
				this.lowerColorScore = lowerColorScore;
			}

			public String getObjType() {
				return this.objType;
			}

			public void setObjType(String objType) {
				this.objType = objType;
			}

			public Float getLowerTypeScore() {
				return this.lowerTypeScore;
			}

			public void setLowerTypeScore(Float lowerTypeScore) {
				this.lowerTypeScore = lowerTypeScore;
			}

			public Float getHairScore() {
				return this.hairScore;
			}

			public void setHairScore(Float hairScore) {
				this.hairScore = hairScore;
			}

			public String getUpperColor() {
				return this.upperColor;
			}

			public void setUpperColor(String upperColor) {
				this.upperColor = upperColor;
			}

			public String getLowerType() {
				return this.lowerType;
			}

			public void setLowerType(String lowerType) {
				this.lowerType = lowerType;
			}

			public Float getAgeScore() {
				return this.ageScore;
			}

			public void setAgeScore(Float ageScore) {
				this.ageScore = ageScore;
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
		}
	}

	@Override
	public ExtractPedestrianFeatureAttributeResponse getInstance(UnmarshallerContext context) {
		return	ExtractPedestrianFeatureAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
