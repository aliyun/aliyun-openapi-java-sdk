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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeAccountPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeAccountPageResponse extends AcsResponse {

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

		private Float angle;

		private String name;

		private String gender;

		private String relation;

		private String birthPlace;

		private String nationality;

		private String nativePlace;

		private String birthDate;

		private String iDNumber;

		private List<InvalidStampArea> invalidStampAreas;

		private List<UndertakeStampArea> undertakeStampAreas;

		private List<RegisterStampArea> registerStampAreas;

		private List<OtherStampArea> otherStampAreas;

		private TitleArea titleArea;

		public Float getAngle() {
			return this.angle;
		}

		public void setAngle(Float angle) {
			this.angle = angle;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getRelation() {
			return this.relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}

		public String getBirthPlace() {
			return this.birthPlace;
		}

		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}

		public String getNationality() {
			return this.nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getNativePlace() {
			return this.nativePlace;
		}

		public void setNativePlace(String nativePlace) {
			this.nativePlace = nativePlace;
		}

		public String getBirthDate() {
			return this.birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getIDNumber() {
			return this.iDNumber;
		}

		public void setIDNumber(String iDNumber) {
			this.iDNumber = iDNumber;
		}

		public List<InvalidStampArea> getInvalidStampAreas() {
			return this.invalidStampAreas;
		}

		public void setInvalidStampAreas(List<InvalidStampArea> invalidStampAreas) {
			this.invalidStampAreas = invalidStampAreas;
		}

		public List<UndertakeStampArea> getUndertakeStampAreas() {
			return this.undertakeStampAreas;
		}

		public void setUndertakeStampAreas(List<UndertakeStampArea> undertakeStampAreas) {
			this.undertakeStampAreas = undertakeStampAreas;
		}

		public List<RegisterStampArea> getRegisterStampAreas() {
			return this.registerStampAreas;
		}

		public void setRegisterStampAreas(List<RegisterStampArea> registerStampAreas) {
			this.registerStampAreas = registerStampAreas;
		}

		public List<OtherStampArea> getOtherStampAreas() {
			return this.otherStampAreas;
		}

		public void setOtherStampAreas(List<OtherStampArea> otherStampAreas) {
			this.otherStampAreas = otherStampAreas;
		}

		public TitleArea getTitleArea() {
			return this.titleArea;
		}

		public void setTitleArea(TitleArea titleArea) {
			this.titleArea = titleArea;
		}

		public static class InvalidStampArea {

			private Integer left;

			private Integer top;

			private Integer height;

			private Integer width;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}

		public static class UndertakeStampArea {

			private Integer left;

			private Integer top;

			private Integer height;

			private Integer width;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}

		public static class RegisterStampArea {

			private Integer left;

			private Integer top;

			private Integer height;

			private Integer width;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}

		public static class OtherStampArea {

			private Integer left;

			private Integer top;

			private Integer height;

			private Integer width;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}

		public static class TitleArea {

			private Integer left;

			private Integer top;

			private Integer height;

			private Integer width;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}
	}

	@Override
	public RecognizeAccountPageResponse getInstance(UnmarshallerContext context) {
		return	RecognizeAccountPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
