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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeBusinessLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeBusinessLicenseResponse extends AcsResponse {

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

		private String angle;

		private String registerNumber;

		private String name;

		private String type;

		private String legalPerson;

		private String establishDate;

		private String validPeriod;

		private String address;

		private String capital;

		private String business;

		private Emblem emblem;

		private Title title;

		private Stamp stamp;

		private QRCode qRCode;

		public String getAngle() {
			return this.angle;
		}

		public void setAngle(String angle) {
			this.angle = angle;
		}

		public String getRegisterNumber() {
			return this.registerNumber;
		}

		public void setRegisterNumber(String registerNumber) {
			this.registerNumber = registerNumber;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLegalPerson() {
			return this.legalPerson;
		}

		public void setLegalPerson(String legalPerson) {
			this.legalPerson = legalPerson;
		}

		public String getEstablishDate() {
			return this.establishDate;
		}

		public void setEstablishDate(String establishDate) {
			this.establishDate = establishDate;
		}

		public String getValidPeriod() {
			return this.validPeriod;
		}

		public void setValidPeriod(String validPeriod) {
			this.validPeriod = validPeriod;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCapital() {
			return this.capital;
		}

		public void setCapital(String capital) {
			this.capital = capital;
		}

		public String getBusiness() {
			return this.business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		public Emblem getEmblem() {
			return this.emblem;
		}

		public void setEmblem(Emblem emblem) {
			this.emblem = emblem;
		}

		public Title getTitle() {
			return this.title;
		}

		public void setTitle(Title title) {
			this.title = title;
		}

		public Stamp getStamp() {
			return this.stamp;
		}

		public void setStamp(Stamp stamp) {
			this.stamp = stamp;
		}

		public QRCode getQRCode() {
			return this.qRCode;
		}

		public void setQRCode(QRCode qRCode) {
			this.qRCode = qRCode;
		}

		public static class Emblem {

			private Integer top;

			private Integer left;

			private Integer height;

			private Integer width;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
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

		public static class Title {

			private Integer top;

			private Integer left;

			private Integer height;

			private Integer width;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
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

		public static class Stamp {

			private Integer top;

			private Integer left;

			private Integer height;

			private Integer width;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
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

		public static class QRCode {

			private Integer top;

			private Integer left;

			private Integer height;

			private Integer width;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
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
	public RecognizeBusinessLicenseResponse getInstance(UnmarshallerContext context) {
		return	RecognizeBusinessLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
