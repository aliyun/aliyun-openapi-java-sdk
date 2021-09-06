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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderProxyRequest extends RpcAcsRequest<CreateOrderProxyResponse> {
	   

	private Float salePrice;

	private String commodityId;

	private String holderId;

	private String promotionId;

	private String deviceType;

	private String alipayUid;

	private String deviceCode;

	private String v;

	private String channelId;

	private String outerCode;

	private String queryStr;
	public CreateOrderProxyRequest() {
		super("UniMkt", "2018-12-07", "CreateOrderProxy", "1.0.0");
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
			putQueryParameter("SalePrice", salePrice.toString());
		}
	}

	public String getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
		if(commodityId != null){
			putQueryParameter("CommodityId", commodityId);
		}
	}

	public String getHolderId() {
		return this.holderId;
	}

	public void setHolderId(String holderId) {
		this.holderId = holderId;
		if(holderId != null){
			putQueryParameter("HolderId", holderId);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
		}
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}

	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
		if(alipayUid != null){
			putQueryParameter("AlipayUid", alipayUid);
		}
	}

	public String getDeviceCode() {
		return this.deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
		if(deviceCode != null){
			putQueryParameter("DeviceCode", deviceCode);
		}
	}

	public String getV() {
		return this.v;
	}

	public void setV(String v) {
		this.v = v;
		if(v != null){
			putQueryParameter("V", v);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
		if(outerCode != null){
			putQueryParameter("OuterCode", outerCode);
		}
	}

	public String getQueryStr() {
		return this.queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
		if(queryStr != null){
			putQueryParameter("QueryStr", queryStr);
		}
	}

	@Override
	public Class<CreateOrderProxyResponse> getResponseClass() {
		return CreateOrderProxyResponse.class;
	}

}
