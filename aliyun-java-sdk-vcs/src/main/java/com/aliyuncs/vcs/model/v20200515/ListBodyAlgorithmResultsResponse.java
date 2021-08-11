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

		private Integer totalPage;

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RecordsItem> records;

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

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private Float rightBottomY;

			private String dataSourceId;

			private String picUrlPath;

			private String trousersColor;

			private Float rightBottomX;

			private String coatColor;

			private String sourceId;

			private String maxAge;

			private String coatLength;

			private String targetPicUrlPath;

			private String hairStyle;

			private String coatStyle;

			private Float leftTopY;

			private String minAge;

			private String corpId;

			private String trousersLength;

			private String trousersStyle;

			private String shotTime;

			private Float leftTopX;

			private String genderCode;

			private String personId;

			private String capStyle;

			public Float getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Float rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public String getPicUrlPath() {
				return this.picUrlPath;
			}

			public void setPicUrlPath(String picUrlPath) {
				this.picUrlPath = picUrlPath;
			}

			public String getTrousersColor() {
				return this.trousersColor;
			}

			public void setTrousersColor(String trousersColor) {
				this.trousersColor = trousersColor;
			}

			public Float getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Float rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getCoatColor() {
				return this.coatColor;
			}

			public void setCoatColor(String coatColor) {
				this.coatColor = coatColor;
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

			public String getCoatLength() {
				return this.coatLength;
			}

			public void setCoatLength(String coatLength) {
				this.coatLength = coatLength;
			}

			public String getTargetPicUrlPath() {
				return this.targetPicUrlPath;
			}

			public void setTargetPicUrlPath(String targetPicUrlPath) {
				this.targetPicUrlPath = targetPicUrlPath;
			}

			public String getHairStyle() {
				return this.hairStyle;
			}

			public void setHairStyle(String hairStyle) {
				this.hairStyle = hairStyle;
			}

			public String getCoatStyle() {
				return this.coatStyle;
			}

			public void setCoatStyle(String coatStyle) {
				this.coatStyle = coatStyle;
			}

			public Float getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Float leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getMinAge() {
				return this.minAge;
			}

			public void setMinAge(String minAge) {
				this.minAge = minAge;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getTrousersLength() {
				return this.trousersLength;
			}

			public void setTrousersLength(String trousersLength) {
				this.trousersLength = trousersLength;
			}

			public String getTrousersStyle() {
				return this.trousersStyle;
			}

			public void setTrousersStyle(String trousersStyle) {
				this.trousersStyle = trousersStyle;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public Float getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Float leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getGenderCode() {
				return this.genderCode;
			}

			public void setGenderCode(String genderCode) {
				this.genderCode = genderCode;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getCapStyle() {
				return this.capStyle;
			}

			public void setCapStyle(String capStyle) {
				this.capStyle = capStyle;
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
