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

		private String gender;

		private Float angle;

		private String nationality;

		private String birthPlace;

		private String birthDate;

		private String relation;

		private String nativePlace;

		private String name;

		private String iDNumber;

		private List<RegisterStampArea> registerStampAreas;

		private List<OtherStampArea> otherStampAreas;

		private List<UndertakeStampArea> undertakeStampAreas;

		private List<InvalidStampArea> invalidStampAreas;

		private TitleArea titleArea;

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Float getAngle() {
			return this.angle;
		}

		public void setAngle(Float angle) {
			this.angle = angle;
		}

		public String getNationality() {
			return this.nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getBirthPlace() {
			return this.birthPlace;
		}

		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}

		public String getBirthDate() {
			return this.birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getRelation() {
			return this.relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}

		public String getNativePlace() {
			return this.nativePlace;
		}

		public void setNativePlace(String nativePlace) {
			this.nativePlace = nativePlace;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIDNumber() {
			return this.iDNumber;
		}

		public void setIDNumber(String iDNumber) {
			this.iDNumber = iDNumber;
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

		public List<UndertakeStampArea> getUndertakeStampAreas() {
			return this.undertakeStampAreas;
		}

		public void setUndertakeStampAreas(List<UndertakeStampArea> undertakeStampAreas) {
			this.undertakeStampAreas = undertakeStampAreas;
		}

		public List<InvalidStampArea> getInvalidStampAreas() {
			return this.invalidStampAreas;
		}

		public void setInvalidStampAreas(List<InvalidStampArea> invalidStampAreas) {
			this.invalidStampAreas = invalidStampAreas;
		}

		public TitleArea getTitleArea() {
			return this.titleArea;
		}

		public void setTitleArea(TitleArea titleArea) {
			this.titleArea = titleArea;
		}

		public static class RegisterStampArea {

			private Integer top;

			private Integer width;

			private Integer height;

			private Integer left;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}
		}

		public static class OtherStampArea {

			private Integer top;

			private Integer width;

			private Integer height;

			private Integer left;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}
		}

		public static class UndertakeStampArea {

			private Integer top;

			private Integer width;

			private Integer height;

			private Integer left;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}
		}

		public static class InvalidStampArea {

			private Integer top;

			private Integer width;

			private Integer height;

			private Integer left;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}
		}

		public static class TitleArea {

			private Integer top;

			private Integer width;

			private Integer height;

			private Integer left;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
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
