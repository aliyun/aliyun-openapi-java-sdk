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

package com.aliyuncs.linkcard.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkcard.transform.v20210520.ListCardInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCardInfoResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String localizedMessage;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getLocalizedMessage() {
		return this.localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer pageCount;

		private Integer total;

		private List<CardDTO> list;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<CardDTO> getList() {
			return this.list;
		}

		public void setList(List<CardDTO> list) {
			this.list = list;
		}

		public static class CardDTO {

			private String status;

			private String dataType;

			private String directionalGroupName;

			private String periodRestFlow;

			private String credentialType;

			private String periodAddFlow;

			private String periodSmsUse;

			private String dataLevel;

			private String osStatus;

			private String notifyId;

			private String aliFee;

			private String aliyunOrderId;

			private String activeType;

			private Boolean isAutoRecharge;

			private String credentialInstanceId;

			private String expireTime;

			private String apnName;

			private String activeTime;

			private String iccid;

			private String vendor;

			private String period;

			private String certifyType;

			private String privateNetworkSegment;

			private String openAccountTime;

			private String simType;

			private Long vsimInstanceId;

			private String credentialNo;

			private String remark;

			private Long directionalGroupId;

			private List<TagListItem> tagList;

			private List<String> imsi;

			private List<String> msisdn;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getDirectionalGroupName() {
				return this.directionalGroupName;
			}

			public void setDirectionalGroupName(String directionalGroupName) {
				this.directionalGroupName = directionalGroupName;
			}

			public String getPeriodRestFlow() {
				return this.periodRestFlow;
			}

			public void setPeriodRestFlow(String periodRestFlow) {
				this.periodRestFlow = periodRestFlow;
			}

			public String getCredentialType() {
				return this.credentialType;
			}

			public void setCredentialType(String credentialType) {
				this.credentialType = credentialType;
			}

			public String getPeriodAddFlow() {
				return this.periodAddFlow;
			}

			public void setPeriodAddFlow(String periodAddFlow) {
				this.periodAddFlow = periodAddFlow;
			}

			public String getPeriodSmsUse() {
				return this.periodSmsUse;
			}

			public void setPeriodSmsUse(String periodSmsUse) {
				this.periodSmsUse = periodSmsUse;
			}

			public String getDataLevel() {
				return this.dataLevel;
			}

			public void setDataLevel(String dataLevel) {
				this.dataLevel = dataLevel;
			}

			public String getOsStatus() {
				return this.osStatus;
			}

			public void setOsStatus(String osStatus) {
				this.osStatus = osStatus;
			}

			public String getNotifyId() {
				return this.notifyId;
			}

			public void setNotifyId(String notifyId) {
				this.notifyId = notifyId;
			}

			public String getAliFee() {
				return this.aliFee;
			}

			public void setAliFee(String aliFee) {
				this.aliFee = aliFee;
			}

			public String getAliyunOrderId() {
				return this.aliyunOrderId;
			}

			public void setAliyunOrderId(String aliyunOrderId) {
				this.aliyunOrderId = aliyunOrderId;
			}

			public String getActiveType() {
				return this.activeType;
			}

			public void setActiveType(String activeType) {
				this.activeType = activeType;
			}

			public Boolean getIsAutoRecharge() {
				return this.isAutoRecharge;
			}

			public void setIsAutoRecharge(Boolean isAutoRecharge) {
				this.isAutoRecharge = isAutoRecharge;
			}

			public String getCredentialInstanceId() {
				return this.credentialInstanceId;
			}

			public void setCredentialInstanceId(String credentialInstanceId) {
				this.credentialInstanceId = credentialInstanceId;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getApnName() {
				return this.apnName;
			}

			public void setApnName(String apnName) {
				this.apnName = apnName;
			}

			public String getActiveTime() {
				return this.activeTime;
			}

			public void setActiveTime(String activeTime) {
				this.activeTime = activeTime;
			}

			public String getIccid() {
				return this.iccid;
			}

			public void setIccid(String iccid) {
				this.iccid = iccid;
			}

			public String getVendor() {
				return this.vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

			public String getCertifyType() {
				return this.certifyType;
			}

			public void setCertifyType(String certifyType) {
				this.certifyType = certifyType;
			}

			public String getPrivateNetworkSegment() {
				return this.privateNetworkSegment;
			}

			public void setPrivateNetworkSegment(String privateNetworkSegment) {
				this.privateNetworkSegment = privateNetworkSegment;
			}

			public String getOpenAccountTime() {
				return this.openAccountTime;
			}

			public void setOpenAccountTime(String openAccountTime) {
				this.openAccountTime = openAccountTime;
			}

			public String getSimType() {
				return this.simType;
			}

			public void setSimType(String simType) {
				this.simType = simType;
			}

			public Long getVsimInstanceId() {
				return this.vsimInstanceId;
			}

			public void setVsimInstanceId(Long vsimInstanceId) {
				this.vsimInstanceId = vsimInstanceId;
			}

			public String getCredentialNo() {
				return this.credentialNo;
			}

			public void setCredentialNo(String credentialNo) {
				this.credentialNo = credentialNo;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public Long getDirectionalGroupId() {
				return this.directionalGroupId;
			}

			public void setDirectionalGroupId(Long directionalGroupId) {
				this.directionalGroupId = directionalGroupId;
			}

			public List<TagListItem> getTagList() {
				return this.tagList;
			}

			public void setTagList(List<TagListItem> tagList) {
				this.tagList = tagList;
			}

			public List<String> getImsi() {
				return this.imsi;
			}

			public void setImsi(List<String> imsi) {
				this.imsi = imsi;
			}

			public List<String> getMsisdn() {
				return this.msisdn;
			}

			public void setMsisdn(List<String> msisdn) {
				this.msisdn = msisdn;
			}

			public static class TagListItem {

				private String tagName;

				private Long id;

				public String getTagName() {
					return this.tagName;
				}

				public void setTagName(String tagName) {
					this.tagName = tagName;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public ListCardInfoResponse getInstance(UnmarshallerContext context) {
		return	ListCardInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
