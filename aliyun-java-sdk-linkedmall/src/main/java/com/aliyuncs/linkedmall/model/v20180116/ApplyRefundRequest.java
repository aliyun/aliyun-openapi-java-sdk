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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ApplyRefundRequest extends RpcAcsRequest<ApplyRefundResponse> {
	   

	private String bizUid;

	private Integer bizClaimType;

	private Long applyReasonTextId;

	private String accountType;

	private Boolean useAnonymousTbAccount;

	private List<LeavePictureList> leavePictureLists;

	private Integer applyRefundCount;

	private Integer goodsStatus;

	private String subLmOrderId;

	private String thirdPartyUserId;

	private Long applyRefundFee;

	private String bizId;

	private String leaveMessage;
	public ApplyRefundRequest() {
		super("linkedmall", "2018-01-16", "ApplyRefund");
		setMethod(MethodType.POST);
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public Integer getBizClaimType() {
		return this.bizClaimType;
	}

	public void setBizClaimType(Integer bizClaimType) {
		this.bizClaimType = bizClaimType;
		if(bizClaimType != null){
			putQueryParameter("BizClaimType", bizClaimType.toString());
		}
	}

	public Long getApplyReasonTextId() {
		return this.applyReasonTextId;
	}

	public void setApplyReasonTextId(Long applyReasonTextId) {
		this.applyReasonTextId = applyReasonTextId;
		if(applyReasonTextId != null){
			putQueryParameter("ApplyReasonTextId", applyReasonTextId.toString());
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public Boolean getUseAnonymousTbAccount() {
		return this.useAnonymousTbAccount;
	}

	public void setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
		this.useAnonymousTbAccount = useAnonymousTbAccount;
		if(useAnonymousTbAccount != null){
			putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount.toString());
		}
	}

	public List<LeavePictureList> getLeavePictureLists() {
		return this.leavePictureLists;
	}

	public void setLeavePictureLists(List<LeavePictureList> leavePictureLists) {
		this.leavePictureLists = leavePictureLists;	
		if (leavePictureLists != null) {
			for (int depth1 = 0; depth1 < leavePictureLists.size(); depth1++) {
				putBodyParameter("LeavePictureList." + (depth1 + 1) + ".Picture" , leavePictureLists.get(depth1).getPicture());
				putBodyParameter("LeavePictureList." + (depth1 + 1) + ".Desc" , leavePictureLists.get(depth1).getDesc());
			}
		}	
	}

	public Integer getApplyRefundCount() {
		return this.applyRefundCount;
	}

	public void setApplyRefundCount(Integer applyRefundCount) {
		this.applyRefundCount = applyRefundCount;
		if(applyRefundCount != null){
			putQueryParameter("ApplyRefundCount", applyRefundCount.toString());
		}
	}

	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
		if(goodsStatus != null){
			putQueryParameter("GoodsStatus", goodsStatus.toString());
		}
	}

	public String getSubLmOrderId() {
		return this.subLmOrderId;
	}

	public void setSubLmOrderId(String subLmOrderId) {
		this.subLmOrderId = subLmOrderId;
		if(subLmOrderId != null){
			putQueryParameter("SubLmOrderId", subLmOrderId);
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
		}
	}

	public Long getApplyRefundFee() {
		return this.applyRefundFee;
	}

	public void setApplyRefundFee(Long applyRefundFee) {
		this.applyRefundFee = applyRefundFee;
		if(applyRefundFee != null){
			putQueryParameter("ApplyRefundFee", applyRefundFee.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getLeaveMessage() {
		return this.leaveMessage;
	}

	public void setLeaveMessage(String leaveMessage) {
		this.leaveMessage = leaveMessage;
		if(leaveMessage != null){
			putBodyParameter("LeaveMessage", leaveMessage);
		}
	}

	public static class LeavePictureList {

		private String picture;

		private String desc;

		public String getPicture() {
			return this.picture;
		}

		public void setPicture(String picture) {
			this.picture = picture;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	@Override
	public Class<ApplyRefundResponse> getResponseClass() {
		return ApplyRefundResponse.class;
	}

}
