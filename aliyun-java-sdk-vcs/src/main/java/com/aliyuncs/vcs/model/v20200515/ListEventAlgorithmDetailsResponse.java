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
import com.aliyuncs.vcs.transform.v20200515.ListEventAlgorithmDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventAlgorithmDetailsResponse extends AcsResponse {

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private String success;

	private Integer totalCount;

	private List<Datas> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String corpId;

		private String dataSourceId;

		private String eventType;

		private String eventValue;

		private String extendValue;

		private String extraExtendValue;

		private String faceCount;

		private String leftTopX;

		private String leftTopY;

		private String picUrlPath;

		private String pointX;

		private String pointY;

		private String recordId;

		private String rightBottomX;

		private String rightBottomY;

		private String shotTime;

		private String sourceId;

		private String targetPicUrlPath;

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getEventValue() {
			return this.eventValue;
		}

		public void setEventValue(String eventValue) {
			this.eventValue = eventValue;
		}

		public String getExtendValue() {
			return this.extendValue;
		}

		public void setExtendValue(String extendValue) {
			this.extendValue = extendValue;
		}

		public String getExtraExtendValue() {
			return this.extraExtendValue;
		}

		public void setExtraExtendValue(String extraExtendValue) {
			this.extraExtendValue = extraExtendValue;
		}

		public String getFaceCount() {
			return this.faceCount;
		}

		public void setFaceCount(String faceCount) {
			this.faceCount = faceCount;
		}

		public String getLeftTopX() {
			return this.leftTopX;
		}

		public void setLeftTopX(String leftTopX) {
			this.leftTopX = leftTopX;
		}

		public String getLeftTopY() {
			return this.leftTopY;
		}

		public void setLeftTopY(String leftTopY) {
			this.leftTopY = leftTopY;
		}

		public String getPicUrlPath() {
			return this.picUrlPath;
		}

		public void setPicUrlPath(String picUrlPath) {
			this.picUrlPath = picUrlPath;
		}

		public String getPointX() {
			return this.pointX;
		}

		public void setPointX(String pointX) {
			this.pointX = pointX;
		}

		public String getPointY() {
			return this.pointY;
		}

		public void setPointY(String pointY) {
			this.pointY = pointY;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
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

		public String getShotTime() {
			return this.shotTime;
		}

		public void setShotTime(String shotTime) {
			this.shotTime = shotTime;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getTargetPicUrlPath() {
			return this.targetPicUrlPath;
		}

		public void setTargetPicUrlPath(String targetPicUrlPath) {
			this.targetPicUrlPath = targetPicUrlPath;
		}
	}

	@Override
	public ListEventAlgorithmDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListEventAlgorithmDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
