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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.ListTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTasksResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private Long code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String bizTypes;

		private Long count;

		private String taskRules;

		private Integer type;

		private List<EffectMarketingTask> list;

		public String getBizTypes() {
			return this.bizTypes;
		}

		public void setBizTypes(String bizTypes) {
			this.bizTypes = bizTypes;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getTaskRules() {
			return this.taskRules;
		}

		public void setTaskRules(String taskRules) {
			this.taskRules = taskRules;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public List<EffectMarketingTask> getList() {
			return this.list;
		}

		public void setList(List<EffectMarketingTask> list) {
			this.list = list;
		}

		public static class EffectMarketingTask {

			private String accountNo;

			private Long accountStatus;

			private Long actualConsumeAmount;

			private Long brandActualResultNumber;

			private Long brandPredictResultNumber;

			private Long brandUserId;

			private String brandUserNick;

			private Long couponNewActualResultNumber;

			private Long couponNewPredictResultNumber;

			private Long couponNewPriceStep;

			private Long couponOldActualResultNumber;

			private Long couponOldPredictResultNumber;

			private Long couponOldPriceStep;

			private Long endTime;

			private Long gmtCreate;

			private Long gmtModified;

			private Long id;

			private Long loginActualResultNumber;

			private Long loginPredictResultNumber;

			private Long mainId;

			private Long mainType;

			private String opNick;

			private Long orderActualResultNumber;

			private Long orderPredictResultNumber;

			private Long predictConsumeAmount;

			private Long priceType;

			private Long proxyUserId;

			private String proxyUserNick;

			private String scheduleTime;

			private Long scheduleType;

			private Long startTime;

			private Long status;

			private Long systemActualConsumeAmount;

			private String targetUrl;

			private Long taskGroupId;

			private Long taskId;

			private Long taskMarketingType;

			private String taskName;

			private String taskType;

			private String predictInfo;

			private String actualInfo;

			private Long currencyType;

			private PredictBankRegisterVO predictBankRegisterVO;

			private ActualBankRegisterVO actualBankRegisterVO;

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public Long getAccountStatus() {
				return this.accountStatus;
			}

			public void setAccountStatus(Long accountStatus) {
				this.accountStatus = accountStatus;
			}

			public Long getActualConsumeAmount() {
				return this.actualConsumeAmount;
			}

			public void setActualConsumeAmount(Long actualConsumeAmount) {
				this.actualConsumeAmount = actualConsumeAmount;
			}

			public Long getBrandActualResultNumber() {
				return this.brandActualResultNumber;
			}

			public void setBrandActualResultNumber(Long brandActualResultNumber) {
				this.brandActualResultNumber = brandActualResultNumber;
			}

			public Long getBrandPredictResultNumber() {
				return this.brandPredictResultNumber;
			}

			public void setBrandPredictResultNumber(Long brandPredictResultNumber) {
				this.brandPredictResultNumber = brandPredictResultNumber;
			}

			public Long getBrandUserId() {
				return this.brandUserId;
			}

			public void setBrandUserId(Long brandUserId) {
				this.brandUserId = brandUserId;
			}

			public String getBrandUserNick() {
				return this.brandUserNick;
			}

			public void setBrandUserNick(String brandUserNick) {
				this.brandUserNick = brandUserNick;
			}

			public Long getCouponNewActualResultNumber() {
				return this.couponNewActualResultNumber;
			}

			public void setCouponNewActualResultNumber(Long couponNewActualResultNumber) {
				this.couponNewActualResultNumber = couponNewActualResultNumber;
			}

			public Long getCouponNewPredictResultNumber() {
				return this.couponNewPredictResultNumber;
			}

			public void setCouponNewPredictResultNumber(Long couponNewPredictResultNumber) {
				this.couponNewPredictResultNumber = couponNewPredictResultNumber;
			}

			public Long getCouponNewPriceStep() {
				return this.couponNewPriceStep;
			}

			public void setCouponNewPriceStep(Long couponNewPriceStep) {
				this.couponNewPriceStep = couponNewPriceStep;
			}

			public Long getCouponOldActualResultNumber() {
				return this.couponOldActualResultNumber;
			}

			public void setCouponOldActualResultNumber(Long couponOldActualResultNumber) {
				this.couponOldActualResultNumber = couponOldActualResultNumber;
			}

			public Long getCouponOldPredictResultNumber() {
				return this.couponOldPredictResultNumber;
			}

			public void setCouponOldPredictResultNumber(Long couponOldPredictResultNumber) {
				this.couponOldPredictResultNumber = couponOldPredictResultNumber;
			}

			public Long getCouponOldPriceStep() {
				return this.couponOldPriceStep;
			}

			public void setCouponOldPriceStep(Long couponOldPriceStep) {
				this.couponOldPriceStep = couponOldPriceStep;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getLoginActualResultNumber() {
				return this.loginActualResultNumber;
			}

			public void setLoginActualResultNumber(Long loginActualResultNumber) {
				this.loginActualResultNumber = loginActualResultNumber;
			}

			public Long getLoginPredictResultNumber() {
				return this.loginPredictResultNumber;
			}

			public void setLoginPredictResultNumber(Long loginPredictResultNumber) {
				this.loginPredictResultNumber = loginPredictResultNumber;
			}

			public Long getMainId() {
				return this.mainId;
			}

			public void setMainId(Long mainId) {
				this.mainId = mainId;
			}

			public Long getMainType() {
				return this.mainType;
			}

			public void setMainType(Long mainType) {
				this.mainType = mainType;
			}

			public String getOpNick() {
				return this.opNick;
			}

			public void setOpNick(String opNick) {
				this.opNick = opNick;
			}

			public Long getOrderActualResultNumber() {
				return this.orderActualResultNumber;
			}

			public void setOrderActualResultNumber(Long orderActualResultNumber) {
				this.orderActualResultNumber = orderActualResultNumber;
			}

			public Long getOrderPredictResultNumber() {
				return this.orderPredictResultNumber;
			}

			public void setOrderPredictResultNumber(Long orderPredictResultNumber) {
				this.orderPredictResultNumber = orderPredictResultNumber;
			}

			public Long getPredictConsumeAmount() {
				return this.predictConsumeAmount;
			}

			public void setPredictConsumeAmount(Long predictConsumeAmount) {
				this.predictConsumeAmount = predictConsumeAmount;
			}

			public Long getPriceType() {
				return this.priceType;
			}

			public void setPriceType(Long priceType) {
				this.priceType = priceType;
			}

			public Long getProxyUserId() {
				return this.proxyUserId;
			}

			public void setProxyUserId(Long proxyUserId) {
				this.proxyUserId = proxyUserId;
			}

			public String getProxyUserNick() {
				return this.proxyUserNick;
			}

			public void setProxyUserNick(String proxyUserNick) {
				this.proxyUserNick = proxyUserNick;
			}

			public String getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(String scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public Long getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(Long scheduleType) {
				this.scheduleType = scheduleType;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public Long getSystemActualConsumeAmount() {
				return this.systemActualConsumeAmount;
			}

			public void setSystemActualConsumeAmount(Long systemActualConsumeAmount) {
				this.systemActualConsumeAmount = systemActualConsumeAmount;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Long getTaskGroupId() {
				return this.taskGroupId;
			}

			public void setTaskGroupId(Long taskGroupId) {
				this.taskGroupId = taskGroupId;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public Long getTaskMarketingType() {
				return this.taskMarketingType;
			}

			public void setTaskMarketingType(Long taskMarketingType) {
				this.taskMarketingType = taskMarketingType;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getPredictInfo() {
				return this.predictInfo;
			}

			public void setPredictInfo(String predictInfo) {
				this.predictInfo = predictInfo;
			}

			public String getActualInfo() {
				return this.actualInfo;
			}

			public void setActualInfo(String actualInfo) {
				this.actualInfo = actualInfo;
			}

			public Long getCurrencyType() {
				return this.currencyType;
			}

			public void setCurrencyType(Long currencyType) {
				this.currencyType = currencyType;
			}

			public PredictBankRegisterVO getPredictBankRegisterVO() {
				return this.predictBankRegisterVO;
			}

			public void setPredictBankRegisterVO(PredictBankRegisterVO predictBankRegisterVO) {
				this.predictBankRegisterVO = predictBankRegisterVO;
			}

			public ActualBankRegisterVO getActualBankRegisterVO() {
				return this.actualBankRegisterVO;
			}

			public void setActualBankRegisterVO(ActualBankRegisterVO actualBankRegisterVO) {
				this.actualBankRegisterVO = actualBankRegisterVO;
			}

			public static class PredictBankRegisterVO {

				private Long inComingPartsNumber;

				private Long verificationCardNumber;

				private Long visaInterviewNumber;

				private Long swipingCardNumber;

				private Long placeOrderNumber;

				public Long getInComingPartsNumber() {
					return this.inComingPartsNumber;
				}

				public void setInComingPartsNumber(Long inComingPartsNumber) {
					this.inComingPartsNumber = inComingPartsNumber;
				}

				public Long getVerificationCardNumber() {
					return this.verificationCardNumber;
				}

				public void setVerificationCardNumber(Long verificationCardNumber) {
					this.verificationCardNumber = verificationCardNumber;
				}

				public Long getVisaInterviewNumber() {
					return this.visaInterviewNumber;
				}

				public void setVisaInterviewNumber(Long visaInterviewNumber) {
					this.visaInterviewNumber = visaInterviewNumber;
				}

				public Long getSwipingCardNumber() {
					return this.swipingCardNumber;
				}

				public void setSwipingCardNumber(Long swipingCardNumber) {
					this.swipingCardNumber = swipingCardNumber;
				}

				public Long getPlaceOrderNumber() {
					return this.placeOrderNumber;
				}

				public void setPlaceOrderNumber(Long placeOrderNumber) {
					this.placeOrderNumber = placeOrderNumber;
				}
			}

			public static class ActualBankRegisterVO {

				private Long inComingPartsNumber;

				private Long verificationCardNumber;

				private Long visaInterviewNumber;

				private Long swipingCardNumber;

				private Long placeOrderNumber;

				public Long getInComingPartsNumber() {
					return this.inComingPartsNumber;
				}

				public void setInComingPartsNumber(Long inComingPartsNumber) {
					this.inComingPartsNumber = inComingPartsNumber;
				}

				public Long getVerificationCardNumber() {
					return this.verificationCardNumber;
				}

				public void setVerificationCardNumber(Long verificationCardNumber) {
					this.verificationCardNumber = verificationCardNumber;
				}

				public Long getVisaInterviewNumber() {
					return this.visaInterviewNumber;
				}

				public void setVisaInterviewNumber(Long visaInterviewNumber) {
					this.visaInterviewNumber = visaInterviewNumber;
				}

				public Long getSwipingCardNumber() {
					return this.swipingCardNumber;
				}

				public void setSwipingCardNumber(Long swipingCardNumber) {
					this.swipingCardNumber = swipingCardNumber;
				}

				public Long getPlaceOrderNumber() {
					return this.placeOrderNumber;
				}

				public void setPlaceOrderNumber(Long placeOrderNumber) {
					this.placeOrderNumber = placeOrderNumber;
				}
			}
		}
	}

	@Override
	public ListTasksResponse getInstance(UnmarshallerContext context) {
		return	ListTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
