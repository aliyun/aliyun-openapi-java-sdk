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
import com.aliyuncs.vcs.transform.v20200515.ListPersonTraceDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersonTraceDetailsResponse extends AcsResponse {

	private Long totalCount;

	private Long pageSize;

	private String message;

	private String requestId;

	private Long pageNumber;

	private String code;

	private List<Datas> data;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String picUrlPath;

		private String corpId;

		private String subId;

		private String personId;

		private String rightBottomX;

		private String rightBottomY;

		private String targetPicUrlPath;

		private String shotTime;

		private String leftTopY;

		private String leftTopX;

		private String dataSourceId;

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

		public String getSubId() {
			return this.subId;
		}

		public void setSubId(String subId) {
			this.subId = subId;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getRightBottomX() {
			return this.rightBottomX;
		}

		public void setRightBottomX(String rightBottomX) {
			this.rightBottomX = rightBottomX;
		}

		public String getRightBottomY() {
			return this.rightBottomY;
		}

		public void setRightBottomY(String rightBottomY) {
			this.rightBottomY = rightBottomY;
		}

		public String getTargetPicUrlPath() {
			return this.targetPicUrlPath;
		}

		public void setTargetPicUrlPath(String targetPicUrlPath) {
			this.targetPicUrlPath = targetPicUrlPath;
		}

		public String getShotTime() {
			return this.shotTime;
		}

		public void setShotTime(String shotTime) {
			this.shotTime = shotTime;
		}

		public String getLeftTopY() {
			return this.leftTopY;
		}

		public void setLeftTopY(String leftTopY) {
			this.leftTopY = leftTopY;
		}

		public String getLeftTopX() {
			return this.leftTopX;
		}

		public void setLeftTopX(String leftTopX) {
			this.leftTopX = leftTopX;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}
	}

	@Override
	public ListPersonTraceDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListPersonTraceDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
