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
import com.aliyuncs.linkcard.transform.v20210520.GetCardDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCardDetailResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String localizedMessage;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

		private List<CardInfo> listPsimCards;

		private VsimCardInfo vsimCardInfo;

		public List<CardInfo> getListPsimCards() {
			return this.listPsimCards;
		}

		public void setListPsimCards(List<CardInfo> listPsimCards) {
			this.listPsimCards = listPsimCards;
		}

		public VsimCardInfo getVsimCardInfo() {
			return this.vsimCardInfo;
		}

		public void setVsimCardInfo(VsimCardInfo vsimCardInfo) {
			this.vsimCardInfo = vsimCardInfo;
		}

		public static class CardInfo {

			private String status;

			private String privateNetworkSegment;

			private String osStatus;

			private String certifyStatus;

			private String apnName;

			private String periodAddFlow;

			private String iccid;

			private String vendor;

			private String periodSmsUse;

			private Boolean openSms;

			private List<String> imsi;

			private List<String> msisdn;

			private List<String> ip;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrivateNetworkSegment() {
				return this.privateNetworkSegment;
			}

			public void setPrivateNetworkSegment(String privateNetworkSegment) {
				this.privateNetworkSegment = privateNetworkSegment;
			}

			public String getOsStatus() {
				return this.osStatus;
			}

			public void setOsStatus(String osStatus) {
				this.osStatus = osStatus;
			}

			public String getCertifyStatus() {
				return this.certifyStatus;
			}

			public void setCertifyStatus(String certifyStatus) {
				this.certifyStatus = certifyStatus;
			}

			public String getApnName() {
				return this.apnName;
			}

			public void setApnName(String apnName) {
				this.apnName = apnName;
			}

			public String getPeriodAddFlow() {
				return this.periodAddFlow;
			}

			public void setPeriodAddFlow(String periodAddFlow) {
				this.periodAddFlow = periodAddFlow;
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

			public String getPeriodSmsUse() {
				return this.periodSmsUse;
			}

			public void setPeriodSmsUse(String periodSmsUse) {
				this.periodSmsUse = periodSmsUse;
			}

			public Boolean getOpenSms() {
				return this.openSms;
			}

			public void setOpenSms(Boolean openSms) {
				this.openSms = openSms;
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

			public List<String> getIp() {
				return this.ip;
			}

			public void setIp(List<String> ip) {
				this.ip = ip;
			}
		}

		public static class VsimCardInfo {

			private String status;

			private String dataType;

			private Integer cardLimitSpeedThreshold;

			private String periodRestFlow;

			private String directionalGroupName;

			private String credentialType;

			private String periodAddFlow;

			private String directionalGroupId;

			private String periodSmsUse;

			private String osStatus;

			private String notifyId;

			private String dataLevel;

			private String aliyunOrderId;

			private String aliFee;

			private String activeType;

			private Boolean isAutoRecharge;

			private Boolean autoLimitResume;

			private String credentialInstanceId;

			private Integer credentialLimitSpeedThreshold;

			private String expireTime;

			private String flowThresholdUnit;

			private String apnName;

			private String activeTime;

			private Integer cardLimitStopThreshold;

			private String iccid;

			private String vendor;

			private String period;

			private String privateNetworkSegment;

			private String openAccountTime;

			private String certifyType;

			private String simType;

			private String certifyStatus;

			private String deviceImei;

			private Integer vsimInstanceId;

			private Boolean autoRebindReuse;

			private String credentialNo;

			private Integer credentialLimitStopThreshold;

			private Boolean openSms;

			private List<TagDto> tagList;

			private List<String> imsi1;

			private List<String> msisdn2;

			private List<String> ip3;

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

			public Integer getCardLimitSpeedThreshold() {
				return this.cardLimitSpeedThreshold;
			}

			public void setCardLimitSpeedThreshold(Integer cardLimitSpeedThreshold) {
				this.cardLimitSpeedThreshold = cardLimitSpeedThreshold;
			}

			public String getPeriodRestFlow() {
				return this.periodRestFlow;
			}

			public void setPeriodRestFlow(String periodRestFlow) {
				this.periodRestFlow = periodRestFlow;
			}

			public String getDirectionalGroupName() {
				return this.directionalGroupName;
			}

			public void setDirectionalGroupName(String directionalGroupName) {
				this.directionalGroupName = directionalGroupName;
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

			public String getDirectionalGroupId() {
				return this.directionalGroupId;
			}

			public void setDirectionalGroupId(String directionalGroupId) {
				this.directionalGroupId = directionalGroupId;
			}

			public String getPeriodSmsUse() {
				return this.periodSmsUse;
			}

			public void setPeriodSmsUse(String periodSmsUse) {
				this.periodSmsUse = periodSmsUse;
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

			public String getDataLevel() {
				return this.dataLevel;
			}

			public void setDataLevel(String dataLevel) {
				this.dataLevel = dataLevel;
			}

			public String getAliyunOrderId() {
				return this.aliyunOrderId;
			}

			public void setAliyunOrderId(String aliyunOrderId) {
				this.aliyunOrderId = aliyunOrderId;
			}

			public String getAliFee() {
				return this.aliFee;
			}

			public void setAliFee(String aliFee) {
				this.aliFee = aliFee;
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

			public Boolean getAutoLimitResume() {
				return this.autoLimitResume;
			}

			public void setAutoLimitResume(Boolean autoLimitResume) {
				this.autoLimitResume = autoLimitResume;
			}

			public String getCredentialInstanceId() {
				return this.credentialInstanceId;
			}

			public void setCredentialInstanceId(String credentialInstanceId) {
				this.credentialInstanceId = credentialInstanceId;
			}

			public Integer getCredentialLimitSpeedThreshold() {
				return this.credentialLimitSpeedThreshold;
			}

			public void setCredentialLimitSpeedThreshold(Integer credentialLimitSpeedThreshold) {
				this.credentialLimitSpeedThreshold = credentialLimitSpeedThreshold;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getFlowThresholdUnit() {
				return this.flowThresholdUnit;
			}

			public void setFlowThresholdUnit(String flowThresholdUnit) {
				this.flowThresholdUnit = flowThresholdUnit;
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

			public Integer getCardLimitStopThreshold() {
				return this.cardLimitStopThreshold;
			}

			public void setCardLimitStopThreshold(Integer cardLimitStopThreshold) {
				this.cardLimitStopThreshold = cardLimitStopThreshold;
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

			public String getCertifyType() {
				return this.certifyType;
			}

			public void setCertifyType(String certifyType) {
				this.certifyType = certifyType;
			}

			public String getSimType() {
				return this.simType;
			}

			public void setSimType(String simType) {
				this.simType = simType;
			}

			public String getCertifyStatus() {
				return this.certifyStatus;
			}

			public void setCertifyStatus(String certifyStatus) {
				this.certifyStatus = certifyStatus;
			}

			public String getDeviceImei() {
				return this.deviceImei;
			}

			public void setDeviceImei(String deviceImei) {
				this.deviceImei = deviceImei;
			}

			public Integer getVsimInstanceId() {
				return this.vsimInstanceId;
			}

			public void setVsimInstanceId(Integer vsimInstanceId) {
				this.vsimInstanceId = vsimInstanceId;
			}

			public Boolean getAutoRebindReuse() {
				return this.autoRebindReuse;
			}

			public void setAutoRebindReuse(Boolean autoRebindReuse) {
				this.autoRebindReuse = autoRebindReuse;
			}

			public String getCredentialNo() {
				return this.credentialNo;
			}

			public void setCredentialNo(String credentialNo) {
				this.credentialNo = credentialNo;
			}

			public Integer getCredentialLimitStopThreshold() {
				return this.credentialLimitStopThreshold;
			}

			public void setCredentialLimitStopThreshold(Integer credentialLimitStopThreshold) {
				this.credentialLimitStopThreshold = credentialLimitStopThreshold;
			}

			public Boolean getOpenSms() {
				return this.openSms;
			}

			public void setOpenSms(Boolean openSms) {
				this.openSms = openSms;
			}

			public List<TagDto> getTagList() {
				return this.tagList;
			}

			public void setTagList(List<TagDto> tagList) {
				this.tagList = tagList;
			}

			public List<String> getImsi1() {
				return this.imsi1;
			}

			public void setImsi1(List<String> imsi1) {
				this.imsi1 = imsi1;
			}

			public List<String> getMsisdn2() {
				return this.msisdn2;
			}

			public void setMsisdn2(List<String> msisdn2) {
				this.msisdn2 = msisdn2;
			}

			public List<String> getIp3() {
				return this.ip3;
			}

			public void setIp3(List<String> ip3) {
				this.ip3 = ip3;
			}

			public static class TagDto {

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
	public GetCardDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCardDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
