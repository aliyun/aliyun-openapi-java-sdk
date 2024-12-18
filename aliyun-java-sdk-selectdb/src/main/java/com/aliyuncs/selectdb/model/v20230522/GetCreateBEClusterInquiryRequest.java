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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCreateBEClusterInquiryRequest extends RpcAcsRequest<GetCreateBEClusterInquiryResponse> {
	   

	private Long resourceOwnerId;

	private Long cacheSize;

	private Long preCacheSize;

	private Long computeSize;

	private String dbInstanceId;

	private Long preComputeSize;

	private Long quantity;

	private String commodityCode;

	private String chargeType;

	private String pricingCycle;
	public GetCreateBEClusterInquiryRequest() {
		super("selectdb", "2023-05-22", "GetCreateBEClusterInquiry");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getCacheSize() {
		return this.cacheSize;
	}

	public void setCacheSize(Long cacheSize) {
		this.cacheSize = cacheSize;
		if(cacheSize != null){
			putQueryParameter("CacheSize", cacheSize.toString());
		}
	}

	public Long getPreCacheSize() {
		return this.preCacheSize;
	}

	public void setPreCacheSize(Long preCacheSize) {
		this.preCacheSize = preCacheSize;
		if(preCacheSize != null){
			putQueryParameter("PreCacheSize", preCacheSize.toString());
		}
	}

	public Long getComputeSize() {
		return this.computeSize;
	}

	public void setComputeSize(Long computeSize) {
		this.computeSize = computeSize;
		if(computeSize != null){
			putQueryParameter("ComputeSize", computeSize.toString());
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public Long getPreComputeSize() {
		return this.preComputeSize;
	}

	public void setPreComputeSize(Long preComputeSize) {
		this.preComputeSize = preComputeSize;
		if(preComputeSize != null){
			putQueryParameter("PreComputeSize", preComputeSize.toString());
		}
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	@Override
	public Class<GetCreateBEClusterInquiryResponse> getResponseClass() {
		return GetCreateBEClusterInquiryResponse.class;
	}

}
