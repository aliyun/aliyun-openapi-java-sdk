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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryAdvertisementSettleInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAdvertisementSettleInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private Long totalCount;

	private Model model;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Integer pageSize;

		private Integer pageNumber;

		private Integer totalCount;

		private List<AdvertiseSettleInfoListItem> advertiseSettleInfoList;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AdvertiseSettleInfoListItem> getAdvertiseSettleInfoList() {
			return this.advertiseSettleInfoList;
		}

		public void setAdvertiseSettleInfoList(List<AdvertiseSettleInfoListItem> advertiseSettleInfoList) {
			this.advertiseSettleInfoList = advertiseSettleInfoList;
		}

		public static class AdvertiseSettleInfoListItem {

			private String createDate;

			private String modifiedDate;

			private String advertiseSettleDetailId;

			private String advertiseName;

			private String settleNo;

			private String startTime;

			private String endTime;

			private String settleStatus;

			private String advertiseSettleAmount;

			private String channelId;

			private String extInfo;

			private String mediaSettleDetailId;

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getModifiedDate() {
				return this.modifiedDate;
			}

			public void setModifiedDate(String modifiedDate) {
				this.modifiedDate = modifiedDate;
			}

			public String getAdvertiseSettleDetailId() {
				return this.advertiseSettleDetailId;
			}

			public void setAdvertiseSettleDetailId(String advertiseSettleDetailId) {
				this.advertiseSettleDetailId = advertiseSettleDetailId;
			}

			public String getAdvertiseName() {
				return this.advertiseName;
			}

			public void setAdvertiseName(String advertiseName) {
				this.advertiseName = advertiseName;
			}

			public String getSettleNo() {
				return this.settleNo;
			}

			public void setSettleNo(String settleNo) {
				this.settleNo = settleNo;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getSettleStatus() {
				return this.settleStatus;
			}

			public void setSettleStatus(String settleStatus) {
				this.settleStatus = settleStatus;
			}

			public String getAdvertiseSettleAmount() {
				return this.advertiseSettleAmount;
			}

			public void setAdvertiseSettleAmount(String advertiseSettleAmount) {
				this.advertiseSettleAmount = advertiseSettleAmount;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(String extInfo) {
				this.extInfo = extInfo;
			}

			public String getMediaSettleDetailId() {
				return this.mediaSettleDetailId;
			}

			public void setMediaSettleDetailId(String mediaSettleDetailId) {
				this.mediaSettleDetailId = mediaSettleDetailId;
			}
		}
	}

	@Override
	public QueryAdvertisementSettleInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAdvertisementSettleInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
