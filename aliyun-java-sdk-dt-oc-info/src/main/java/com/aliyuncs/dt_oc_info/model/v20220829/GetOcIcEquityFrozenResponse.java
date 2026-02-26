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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcEquityFrozenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcEquityFrozenResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String status;

		private String freezeExecPerson;

		private String freezeAmount;

		private String freezeCourt;

		private String freezeNoticeNum;

		private String freezePublishDate;

		private String freezeCardType;

		private String freezeCardNum;

		private String freezeExecItem;

		private String freezeStartDate;

		private String freezeEndDate;

		private String unfreezeCourt;

		private String unfreezeAdjustNum;

		private String unfreezeReason;

		private String unfreezeDate;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFreezeExecPerson() {
			return this.freezeExecPerson;
		}

		public void setFreezeExecPerson(String freezeExecPerson) {
			this.freezeExecPerson = freezeExecPerson;
		}

		public String getFreezeAmount() {
			return this.freezeAmount;
		}

		public void setFreezeAmount(String freezeAmount) {
			this.freezeAmount = freezeAmount;
		}

		public String getFreezeCourt() {
			return this.freezeCourt;
		}

		public void setFreezeCourt(String freezeCourt) {
			this.freezeCourt = freezeCourt;
		}

		public String getFreezeNoticeNum() {
			return this.freezeNoticeNum;
		}

		public void setFreezeNoticeNum(String freezeNoticeNum) {
			this.freezeNoticeNum = freezeNoticeNum;
		}

		public String getFreezePublishDate() {
			return this.freezePublishDate;
		}

		public void setFreezePublishDate(String freezePublishDate) {
			this.freezePublishDate = freezePublishDate;
		}

		public String getFreezeCardType() {
			return this.freezeCardType;
		}

		public void setFreezeCardType(String freezeCardType) {
			this.freezeCardType = freezeCardType;
		}

		public String getFreezeCardNum() {
			return this.freezeCardNum;
		}

		public void setFreezeCardNum(String freezeCardNum) {
			this.freezeCardNum = freezeCardNum;
		}

		public String getFreezeExecItem() {
			return this.freezeExecItem;
		}

		public void setFreezeExecItem(String freezeExecItem) {
			this.freezeExecItem = freezeExecItem;
		}

		public String getFreezeStartDate() {
			return this.freezeStartDate;
		}

		public void setFreezeStartDate(String freezeStartDate) {
			this.freezeStartDate = freezeStartDate;
		}

		public String getFreezeEndDate() {
			return this.freezeEndDate;
		}

		public void setFreezeEndDate(String freezeEndDate) {
			this.freezeEndDate = freezeEndDate;
		}

		public String getUnfreezeCourt() {
			return this.unfreezeCourt;
		}

		public void setUnfreezeCourt(String unfreezeCourt) {
			this.unfreezeCourt = unfreezeCourt;
		}

		public String getUnfreezeAdjustNum() {
			return this.unfreezeAdjustNum;
		}

		public void setUnfreezeAdjustNum(String unfreezeAdjustNum) {
			this.unfreezeAdjustNum = unfreezeAdjustNum;
		}

		public String getUnfreezeReason() {
			return this.unfreezeReason;
		}

		public void setUnfreezeReason(String unfreezeReason) {
			this.unfreezeReason = unfreezeReason;
		}

		public String getUnfreezeDate() {
			return this.unfreezeDate;
		}

		public void setUnfreezeDate(String unfreezeDate) {
			this.unfreezeDate = unfreezeDate;
		}
	}

	@Override
	public GetOcIcEquityFrozenResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcEquityFrozenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
