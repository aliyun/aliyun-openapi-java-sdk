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
import com.aliyuncs.vcs.transform.v20200515.SearchObjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchObjectResponse extends AcsResponse {

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

			private String deviceID;

			private String compareResult;

			private Integer rightBtmX;

			private Float score;

			private String sourceImageUrl;

			private String sourceID;

			private Integer rightBtmY;

			private String targetImageUrl;

			private Integer leftTopY;

			private String targetImagePath;

			private Long shotTime;

			private Integer leftTopX;

			private String sourceImagePath;

			public String getDeviceID() {
				return this.deviceID;
			}

			public void setDeviceID(String deviceID) {
				this.deviceID = deviceID;
			}

			public String getCompareResult() {
				return this.compareResult;
			}

			public void setCompareResult(String compareResult) {
				this.compareResult = compareResult;
			}

			public Integer getRightBtmX() {
				return this.rightBtmX;
			}

			public void setRightBtmX(Integer rightBtmX) {
				this.rightBtmX = rightBtmX;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public String getSourceID() {
				return this.sourceID;
			}

			public void setSourceID(String sourceID) {
				this.sourceID = sourceID;
			}

			public Integer getRightBtmY() {
				return this.rightBtmY;
			}

			public void setRightBtmY(Integer rightBtmY) {
				this.rightBtmY = rightBtmY;
			}

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getTargetImagePath() {
				return this.targetImagePath;
			}

			public void setTargetImagePath(String targetImagePath) {
				this.targetImagePath = targetImagePath;
			}

			public Long getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(Long shotTime) {
				this.shotTime = shotTime;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getSourceImagePath() {
				return this.sourceImagePath;
			}

			public void setSourceImagePath(String sourceImagePath) {
				this.sourceImagePath = sourceImagePath;
			}
		}
	}

	@Override
	public SearchObjectResponse getInstance(UnmarshallerContext context) {
		return	SearchObjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
