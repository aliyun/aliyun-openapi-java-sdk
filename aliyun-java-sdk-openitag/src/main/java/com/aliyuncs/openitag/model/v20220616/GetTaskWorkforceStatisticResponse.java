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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTaskWorkforceStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskWorkforceStatisticResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalPage;

	private Integer totalCount;

	private String errorCode;

	private List<UsersStatisticItem> usersStatistic;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<UsersStatisticItem> getUsersStatistic() {
		return this.usersStatistic;
	}

	public void setUsersStatistic(List<UsersStatisticItem> usersStatistic) {
		this.usersStatistic = usersStatistic;
	}

	public static class UsersStatisticItem {

		private String userId;

		private Float totalMarkItemsCount;

		private Float acceptedMarkItemsCount;

		private Float markTime;

		private Float markEfficiency;

		private Float checkCount;

		private Float checkedAcceptedCount;

		private Float checkedAccuracy;

		private Float samplingAccuracy;

		private Float samplingCount;

		private Float samplingErrorCount;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Float getTotalMarkItemsCount() {
			return this.totalMarkItemsCount;
		}

		public void setTotalMarkItemsCount(Float totalMarkItemsCount) {
			this.totalMarkItemsCount = totalMarkItemsCount;
		}

		public Float getAcceptedMarkItemsCount() {
			return this.acceptedMarkItemsCount;
		}

		public void setAcceptedMarkItemsCount(Float acceptedMarkItemsCount) {
			this.acceptedMarkItemsCount = acceptedMarkItemsCount;
		}

		public Float getMarkTime() {
			return this.markTime;
		}

		public void setMarkTime(Float markTime) {
			this.markTime = markTime;
		}

		public Float getMarkEfficiency() {
			return this.markEfficiency;
		}

		public void setMarkEfficiency(Float markEfficiency) {
			this.markEfficiency = markEfficiency;
		}

		public Float getCheckCount() {
			return this.checkCount;
		}

		public void setCheckCount(Float checkCount) {
			this.checkCount = checkCount;
		}

		public Float getCheckedAcceptedCount() {
			return this.checkedAcceptedCount;
		}

		public void setCheckedAcceptedCount(Float checkedAcceptedCount) {
			this.checkedAcceptedCount = checkedAcceptedCount;
		}

		public Float getCheckedAccuracy() {
			return this.checkedAccuracy;
		}

		public void setCheckedAccuracy(Float checkedAccuracy) {
			this.checkedAccuracy = checkedAccuracy;
		}

		public Float getSamplingAccuracy() {
			return this.samplingAccuracy;
		}

		public void setSamplingAccuracy(Float samplingAccuracy) {
			this.samplingAccuracy = samplingAccuracy;
		}

		public Float getSamplingCount() {
			return this.samplingCount;
		}

		public void setSamplingCount(Float samplingCount) {
			this.samplingCount = samplingCount;
		}

		public Float getSamplingErrorCount() {
			return this.samplingErrorCount;
		}

		public void setSamplingErrorCount(Float samplingErrorCount) {
			this.samplingErrorCount = samplingErrorCount;
		}
	}

	@Override
	public GetTaskWorkforceStatisticResponse getInstance(UnmarshallerContext context) {
		return	GetTaskWorkforceStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
