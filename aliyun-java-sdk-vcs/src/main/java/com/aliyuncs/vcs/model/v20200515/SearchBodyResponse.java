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
import com.aliyuncs.vcs.transform.v20200515.SearchBodyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchBodyResponse extends AcsResponse {

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

		private Integer pageNo;

		private List<Record> records;

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

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String targetImageUrl;

			private Float score;

			private Float rightBottomX;

			private Float rightBottomY;

			private String gbId;

			private String imageUrl;

			private Float leftTopY;

			private Float leftTopX;

			public String getTargetImageUrl() {
				return this.targetImageUrl;
			}

			public void setTargetImageUrl(String targetImageUrl) {
				this.targetImageUrl = targetImageUrl;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public Float getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Float rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public Float getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Float rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getGbId() {
				return this.gbId;
			}

			public void setGbId(String gbId) {
				this.gbId = gbId;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public Float getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Float leftTopY) {
				this.leftTopY = leftTopY;
			}

			public Float getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Float leftTopX) {
				this.leftTopX = leftTopX;
			}
		}
	}

	@Override
	public SearchBodyResponse getInstance(UnmarshallerContext context) {
		return	SearchBodyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
