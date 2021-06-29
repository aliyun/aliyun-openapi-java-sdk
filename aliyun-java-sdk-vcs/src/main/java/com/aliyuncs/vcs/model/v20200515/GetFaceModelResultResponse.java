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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetFaceModelResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFaceModelResultResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<RecordsItem> records;

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private Float rightBottomY;

			private String hairColorReliability;

			private Integer hairColor;

			private String faceStyle;

			private String glassStyleReliability;

			private String mustacheStyleReliability;

			private String respiratorColorReliability;

			private Float rightBottomX;

			private Integer ageUpLimit;

			private String ageUpLimitReliability;

			private Integer hairStyle;

			private Integer ageLowerLimit;

			private Float leftTopY;

			private String skinColorReliability;

			private Integer capColor;

			private String faceStyleReliability;

			private String capStyleReliability;

			private String genderCodeReliability;

			private String hairStyleReliability;

			private String glassColorReliability;

			private Integer ethicCode;

			private Integer respiratorColor;

			private String mustacheStyle;

			private Integer glassColor;

			private Integer glassStyle;

			private Integer skinColor;

			private String capColorReliability;

			private Integer capStyle;

			private Integer genderCode;

			private Float leftTopX;

			private String ageLowerLimitReliability;

			private String ethicCodeReliability;

			private List<Float> featureData;

			public Float getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Float rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getHairColorReliability() {
				return this.hairColorReliability;
			}

			public void setHairColorReliability(String hairColorReliability) {
				this.hairColorReliability = hairColorReliability;
			}

			public Integer getHairColor() {
				return this.hairColor;
			}

			public void setHairColor(Integer hairColor) {
				this.hairColor = hairColor;
			}

			public String getFaceStyle() {
				return this.faceStyle;
			}

			public void setFaceStyle(String faceStyle) {
				this.faceStyle = faceStyle;
			}

			public String getGlassStyleReliability() {
				return this.glassStyleReliability;
			}

			public void setGlassStyleReliability(String glassStyleReliability) {
				this.glassStyleReliability = glassStyleReliability;
			}

			public String getMustacheStyleReliability() {
				return this.mustacheStyleReliability;
			}

			public void setMustacheStyleReliability(String mustacheStyleReliability) {
				this.mustacheStyleReliability = mustacheStyleReliability;
			}

			public String getRespiratorColorReliability() {
				return this.respiratorColorReliability;
			}

			public void setRespiratorColorReliability(String respiratorColorReliability) {
				this.respiratorColorReliability = respiratorColorReliability;
			}

			public Float getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Float rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Integer getAgeUpLimit() {
				return this.ageUpLimit;
			}

			public void setAgeUpLimit(Integer ageUpLimit) {
				this.ageUpLimit = ageUpLimit;
			}

			public String getAgeUpLimitReliability() {
				return this.ageUpLimitReliability;
			}

			public void setAgeUpLimitReliability(String ageUpLimitReliability) {
				this.ageUpLimitReliability = ageUpLimitReliability;
			}

			public Integer getHairStyle() {
				return this.hairStyle;
			}

			public void setHairStyle(Integer hairStyle) {
				this.hairStyle = hairStyle;
			}

			public Integer getAgeLowerLimit() {
				return this.ageLowerLimit;
			}

			public void setAgeLowerLimit(Integer ageLowerLimit) {
				this.ageLowerLimit = ageLowerLimit;
			}

			public Float getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Float leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getSkinColorReliability() {
				return this.skinColorReliability;
			}

			public void setSkinColorReliability(String skinColorReliability) {
				this.skinColorReliability = skinColorReliability;
			}

			public Integer getCapColor() {
				return this.capColor;
			}

			public void setCapColor(Integer capColor) {
				this.capColor = capColor;
			}

			public String getFaceStyleReliability() {
				return this.faceStyleReliability;
			}

			public void setFaceStyleReliability(String faceStyleReliability) {
				this.faceStyleReliability = faceStyleReliability;
			}

			public String getCapStyleReliability() {
				return this.capStyleReliability;
			}

			public void setCapStyleReliability(String capStyleReliability) {
				this.capStyleReliability = capStyleReliability;
			}

			public String getGenderCodeReliability() {
				return this.genderCodeReliability;
			}

			public void setGenderCodeReliability(String genderCodeReliability) {
				this.genderCodeReliability = genderCodeReliability;
			}

			public String getHairStyleReliability() {
				return this.hairStyleReliability;
			}

			public void setHairStyleReliability(String hairStyleReliability) {
				this.hairStyleReliability = hairStyleReliability;
			}

			public String getGlassColorReliability() {
				return this.glassColorReliability;
			}

			public void setGlassColorReliability(String glassColorReliability) {
				this.glassColorReliability = glassColorReliability;
			}

			public Integer getEthicCode() {
				return this.ethicCode;
			}

			public void setEthicCode(Integer ethicCode) {
				this.ethicCode = ethicCode;
			}

			public Integer getRespiratorColor() {
				return this.respiratorColor;
			}

			public void setRespiratorColor(Integer respiratorColor) {
				this.respiratorColor = respiratorColor;
			}

			public String getMustacheStyle() {
				return this.mustacheStyle;
			}

			public void setMustacheStyle(String mustacheStyle) {
				this.mustacheStyle = mustacheStyle;
			}

			public Integer getGlassColor() {
				return this.glassColor;
			}

			public void setGlassColor(Integer glassColor) {
				this.glassColor = glassColor;
			}

			public Integer getGlassStyle() {
				return this.glassStyle;
			}

			public void setGlassStyle(Integer glassStyle) {
				this.glassStyle = glassStyle;
			}

			public Integer getSkinColor() {
				return this.skinColor;
			}

			public void setSkinColor(Integer skinColor) {
				this.skinColor = skinColor;
			}

			public String getCapColorReliability() {
				return this.capColorReliability;
			}

			public void setCapColorReliability(String capColorReliability) {
				this.capColorReliability = capColorReliability;
			}

			public Integer getCapStyle() {
				return this.capStyle;
			}

			public void setCapStyle(Integer capStyle) {
				this.capStyle = capStyle;
			}

			public Integer getGenderCode() {
				return this.genderCode;
			}

			public void setGenderCode(Integer genderCode) {
				this.genderCode = genderCode;
			}

			public Float getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Float leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getAgeLowerLimitReliability() {
				return this.ageLowerLimitReliability;
			}

			public void setAgeLowerLimitReliability(String ageLowerLimitReliability) {
				this.ageLowerLimitReliability = ageLowerLimitReliability;
			}

			public String getEthicCodeReliability() {
				return this.ethicCodeReliability;
			}

			public void setEthicCodeReliability(String ethicCodeReliability) {
				this.ethicCodeReliability = ethicCodeReliability;
			}

			public List<Float> getFeatureData() {
				return this.featureData;
			}

			public void setFeatureData(List<Float> featureData) {
				this.featureData = featureData;
			}
		}
	}

	@Override
	public GetFaceModelResultResponse getInstance(UnmarshallerContext context) {
		return	GetFaceModelResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
