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

package com.aliyuncs.reid_cloud.model.v20201029;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid_cloud.transform.v20201029.DescribePredictGroupResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePredictGroupResultResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String cursorTime;

	private String dynamicCode;

	private String errorCode;

	private String dynamicMessage;

	private String errorMessage;

	private String code;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private Boolean success;

	private List<PredictGroupResultDTO> predictGroupList;

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

	public String getCursorTime() {
		return this.cursorTime;
	}

	public void setCursorTime(String cursorTime) {
		this.cursorTime = cursorTime;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<PredictGroupResultDTO> getPredictGroupList() {
		return this.predictGroupList;
	}

	public void setPredictGroupList(List<PredictGroupResultDTO> predictGroupList) {
		this.predictGroupList = predictGroupList;
	}

	public static class PredictGroupResultDTO {

		private Integer bboxCount;

		private Long timestamp;

		private String imageUrl;

		private Long trackletId;

		private Long ipcId;

		public Integer getBboxCount() {
			return this.bboxCount;
		}

		public void setBboxCount(Integer bboxCount) {
			this.bboxCount = bboxCount;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Long getTrackletId() {
			return this.trackletId;
		}

		public void setTrackletId(Long trackletId) {
			this.trackletId = trackletId;
		}

		public Long getIpcId() {
			return this.ipcId;
		}

		public void setIpcId(Long ipcId) {
			this.ipcId = ipcId;
		}
	}

	@Override
	public DescribePredictGroupResultResponse getInstance(UnmarshallerContext context) {
		return	DescribePredictGroupResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
