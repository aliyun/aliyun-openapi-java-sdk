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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushTradeDetailRequest extends RpcAcsRequest<PushTradeDetailResponse> {
	   

	private Float salePrice;

	private Long endTime;

	private Integer tradeStatus;

	private String commodityId;

	private Long startTime;

	private String tradeOrderId;

	private String deviceSn;

	private String commodityName;

	private Integer verificationStatus;

	private String alipayOrderId;

	private String channelId;

	private String outerTradeId;

	private Long tradeTime;

	private Float tradePrice;
	public PushTradeDetailRequest() {
		super("UniMkt", "2018-12-12", "PushTradeDetail", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
		if(salePrice != null){
			putBodyParameter("SalePrice", salePrice.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Integer getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
		if(tradeStatus != null){
			putBodyParameter("TradeStatus", tradeStatus.toString());
		}
	}

	public String getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
		if(commodityId != null){
			putBodyParameter("CommodityId", commodityId);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}

	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
		if(tradeOrderId != null){
			putBodyParameter("TradeOrderId", tradeOrderId);
		}
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
		if(deviceSn != null){
			putBodyParameter("DeviceSn", deviceSn);
		}
	}

	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
		if(commodityName != null){
			putBodyParameter("CommodityName", commodityName);
		}
	}

	public Integer getVerificationStatus() {
		return this.verificationStatus;
	}

	public void setVerificationStatus(Integer verificationStatus) {
		this.verificationStatus = verificationStatus;
		if(verificationStatus != null){
			putBodyParameter("VerificationStatus", verificationStatus.toString());
		}
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
		if(alipayOrderId != null){
			putBodyParameter("AlipayOrderId", alipayOrderId);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	public String getOuterTradeId() {
		return this.outerTradeId;
	}

	public void setOuterTradeId(String outerTradeId) {
		this.outerTradeId = outerTradeId;
		if(outerTradeId != null){
			putBodyParameter("OuterTradeId", outerTradeId);
		}
	}

	public Long getTradeTime() {
		return this.tradeTime;
	}

	public void setTradeTime(Long tradeTime) {
		this.tradeTime = tradeTime;
		if(tradeTime != null){
			putBodyParameter("TradeTime", tradeTime.toString());
		}
	}

	public Float getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Float tradePrice) {
		this.tradePrice = tradePrice;
		if(tradePrice != null){
			putBodyParameter("TradePrice", tradePrice.toString());
		}
	}

	@Override
	public Class<PushTradeDetailResponse> getResponseClass() {
		return PushTradeDetailResponse.class;
	}

}
