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

package com.aliyuncs.bss.model.v20140714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCouponListRequest extends RpcAcsRequest<DescribeCouponListResponse> {
	
	public DescribeCouponListRequest() {
		super("Bss", "2014-07-14", "DescribeCouponList", "bss");
		setProtocol(ProtocolType.HTTPS);
	}

	private String startDeliveryTime;

	private Integer pageSize;

	private String endDeliveryTime;

	private Integer pageNum;

	private String status;

	public String getStartDeliveryTime() {
		return this.startDeliveryTime;
	}

	public void setStartDeliveryTime(String startDeliveryTime) {
		this.startDeliveryTime = startDeliveryTime;
		if(startDeliveryTime != null){
			putQueryParameter("StartDeliveryTime", startDeliveryTime);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getEndDeliveryTime() {
		return this.endDeliveryTime;
	}

	public void setEndDeliveryTime(String endDeliveryTime) {
		this.endDeliveryTime = endDeliveryTime;
		if(endDeliveryTime != null){
			putQueryParameter("EndDeliveryTime", endDeliveryTime);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeCouponListResponse> getResponseClass() {
		return DescribeCouponListResponse.class;
	}

}
