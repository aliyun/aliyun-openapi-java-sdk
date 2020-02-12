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
public class QueryWithPayRequest extends RpcAcsRequest<QueryWithPayResponse> {
	   

	private String extra;

	private Float salePrice;

	private String commodityId;

	private String alipayOpenId;

	private String deviceSn;

	private String channelId;
	public QueryWithPayRequest() {
		super("UniMkt", "2018-12-07", "QueryWithPay", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
		}
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

	public String getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
		if(commodityId != null){
			putBodyParameter("CommodityId", commodityId);
		}
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
		if(alipayOpenId != null){
			putBodyParameter("AlipayOpenId", alipayOpenId);
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

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<QueryWithPayResponse> getResponseClass() {
		return QueryWithPayResponse.class;
	}

}
