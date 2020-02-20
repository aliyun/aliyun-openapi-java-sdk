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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.ListMaskDetectionResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMaskDetectionResultsResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private Integer pageNumber;

	private String message;

	private String code;

	private Long totalCount;

	private String dynamicCode;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<DetectionResult> maskDetectionResults;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<DetectionResult> getMaskDetectionResults() {
		return this.maskDetectionResults;
	}

	public void setMaskDetectionResults(List<DetectionResult> maskDetectionResults) {
		this.maskDetectionResults = maskDetectionResults;
	}

	public static class DetectionResult {

		private String pkId;

		private String score;

		private Long locationId;

		private String imageKey;

		private Long id;

		private String ipcId;

		private String maskResult;

		public String getPkId() {
			return this.pkId;
		}

		public void setPkId(String pkId) {
			this.pkId = pkId;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public String getImageKey() {
			return this.imageKey;
		}

		public void setImageKey(String imageKey) {
			this.imageKey = imageKey;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIpcId() {
			return this.ipcId;
		}

		public void setIpcId(String ipcId) {
			this.ipcId = ipcId;
		}

		public String getMaskResult() {
			return this.maskResult;
		}

		public void setMaskResult(String maskResult) {
			this.maskResult = maskResult;
		}
	}

	@Override
	public ListMaskDetectionResultsResponse getInstance(UnmarshallerContext context) {
		return	ListMaskDetectionResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
