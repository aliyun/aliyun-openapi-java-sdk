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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.GetCompanyRegOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCompanyRegOrderResponse extends AcsResponse {

	private String platformName;

	private Long gmtPaid;

	private String bizStatusStage;

	private String supplementBizInfo;

	private Float orderAmount;

	private String bizId;

	private String bizSubCode;

	private String inboundPhone;

	private Float yunMarketOrderAmount;

	private Long gmtModified;

	private String bizStatus;

	private String extend;

	private String requestId;

	private String bizInfo;

	private String aliyunOrderId;

	private String outboundPhone;

	private String companyName;

	private List<BizOperation> operations;

	public String getPlatformName() {
		return this.platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public Long getGmtPaid() {
		return this.gmtPaid;
	}

	public void setGmtPaid(Long gmtPaid) {
		this.gmtPaid = gmtPaid;
	}

	public String getBizStatusStage() {
		return this.bizStatusStage;
	}

	public void setBizStatusStage(String bizStatusStage) {
		this.bizStatusStage = bizStatusStage;
	}

	public String getSupplementBizInfo() {
		return this.supplementBizInfo;
	}

	public void setSupplementBizInfo(String supplementBizInfo) {
		this.supplementBizInfo = supplementBizInfo;
	}

	public Float getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(Float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizSubCode() {
		return this.bizSubCode;
	}

	public void setBizSubCode(String bizSubCode) {
		this.bizSubCode = bizSubCode;
	}

	public String getInboundPhone() {
		return this.inboundPhone;
	}

	public void setInboundPhone(String inboundPhone) {
		this.inboundPhone = inboundPhone;
	}

	public Float getYunMarketOrderAmount() {
		return this.yunMarketOrderAmount;
	}

	public void setYunMarketOrderAmount(Float yunMarketOrderAmount) {
		this.yunMarketOrderAmount = yunMarketOrderAmount;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
	}

	public String getOutboundPhone() {
		return this.outboundPhone;
	}

	public void setOutboundPhone(String outboundPhone) {
		this.outboundPhone = outboundPhone;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<BizOperation> getOperations() {
		return this.operations;
	}

	public void setOperations(List<BizOperation> operations) {
		this.operations = operations;
	}

	public static class BizOperation {

		private String actionType;

		private Long gmtAction;

		private String actionInfo;

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public Long getGmtAction() {
			return this.gmtAction;
		}

		public void setGmtAction(Long gmtAction) {
			this.gmtAction = gmtAction;
		}

		public String getActionInfo() {
			return this.actionInfo;
		}

		public void setActionInfo(String actionInfo) {
			this.actionInfo = actionInfo;
		}
	}

	@Override
	public GetCompanyRegOrderResponse getInstance(UnmarshallerContext context) {
		return	GetCompanyRegOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
