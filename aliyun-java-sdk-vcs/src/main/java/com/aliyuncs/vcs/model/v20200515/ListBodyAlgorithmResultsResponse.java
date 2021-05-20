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
import com.aliyuncs.vcs.transform.v20200515.ListBodyAlgorithmResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBodyAlgorithmResultsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private Integer totalCount;

		private Integer pageSize;

		private Integer totalPage;

		private Integer pageNumber;

		private List<RecordsItem> records;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String genderCode;

			private String picUrlPath;

			private String corpId;

			private Float rightBottomX;

			private String targetPicUrlPath;

			private Float rightBottomY;

			private String sourceId;

			private String maxAge;

			private Float leftTopY;

			private String capStyle;

			private Float leftTopX;

			private String trousersStyle;

			private String coatStyle;

			private String minAge;

			private String trousersLength;

			private String personId;

			private String coatLength;

			private String shotTime;

			private String coatColor;

			private String trousersColor;

			private String dataSourceId;

			private String hairStyle;

			public String getGenderCode() {
				return this.genderCode;
			}

			public void setGenderCode(String genderCode) {
				this.genderCode = genderCode;
			}

			public String getPicUrlPath() {
				return this.picUrlPath;
			}

			public void setPicUrlPath(String picUrlPath) {
				this.picUrlPath = picUrlPath;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public Float getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Float rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getTargetPicUrlPath() {
				return this.targetPicUrlPath;
			}

			public void setTargetPicUrlPath(String targetPicUrlPath) {
				this.targetPicUrlPath = targetPicUrlPath;
			}

			public Float getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Float rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(String sourceId) {
				this.sourceId = sourceId;
			}

			public String getMaxAge() {
				return this.maxAge;
			}

			public void setMaxAge(String maxAge) {
				this.maxAge = maxAge;
			}

			public Float getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Float leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getCapStyle() {
				return this.capStyle;
			}

			public void setCapStyle(String capStyle) {
				this.capStyle = capStyle;
			}

			public Float getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Float leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getTrousersStyle() {
				return this.trousersStyle;
			}

			public void setTrousersStyle(String trousersStyle) {
				this.trousersStyle = trousersStyle;
			}

			public String getCoatStyle() {
				return this.coatStyle;
			}

			public void setCoatStyle(String coatStyle) {
				this.coatStyle = coatStyle;
			}

			public String getMinAge() {
				return this.minAge;
			}

			public void setMinAge(String minAge) {
				this.minAge = minAge;
			}

			public String getTrousersLength() {
				return this.trousersLength;
			}

			public void setTrousersLength(String trousersLength) {
				this.trousersLength = trousersLength;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getCoatLength() {
				return this.coatLength;
			}

			public void setCoatLength(String coatLength) {
				this.coatLength = coatLength;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getCoatColor() {
				return this.coatColor;
			}

			public void setCoatColor(String coatColor) {
				this.coatColor = coatColor;
			}

			public String getTrousersColor() {
				return this.trousersColor;
			}

			public void setTrousersColor(String trousersColor) {
				this.trousersColor = trousersColor;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public String getHairStyle() {
				return this.hairStyle;
			}

			public void setHairStyle(String hairStyle) {
				this.hairStyle = hairStyle;
			}
		}
	}

	@Override
	public ListBodyAlgorithmResultsResponse getInstance(UnmarshallerContext context) {
		return	ListBodyAlgorithmResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
