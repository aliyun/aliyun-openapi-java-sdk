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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodMediaPlayDataRequest extends RpcAcsRequest<DescribeVodMediaPlayDataResponse> {
	   

	private Long pageSize;

	private String playDate;

	private String os;

	private String mediaId;

	private String orderName;

	private Long pageNo;

	private String region;

	private String terminalType;

	private String orderType;
	public DescribeVodMediaPlayDataRequest() {
		super("vod", "2017-03-21", "DescribeVodMediaPlayData", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPlayDate() {
		return this.playDate;
	}

	public void setPlayDate(String playDate) {
		this.playDate = playDate;
		if(playDate != null){
			putQueryParameter("PlayDate", playDate);
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
		}
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putQueryParameter("MediaId", mediaId);
		}
	}

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
		if(orderName != null){
			putQueryParameter("OrderName", orderName);
		}
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getTerminalType() {
		return this.terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
		if(terminalType != null){
			putQueryParameter("TerminalType", terminalType);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<DescribeVodMediaPlayDataResponse> getResponseClass() {
		return DescribeVodMediaPlayDataResponse.class;
	}

}
