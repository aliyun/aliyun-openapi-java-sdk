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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceRequest extends RpcAcsRequest<DescribePriceResponse> {
	
	public DescribePriceRequest() {
		super("EHPC", "2018-04-12", "DescribePrice", "ehs");
	}

	private String priceUnit;

	private List<Commodities> commoditiess;

	private String chargeType;

	private String orderType;

	public String getPriceUnit() {
		return this.priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
		if(priceUnit != null){
			putQueryParameter("PriceUnit", priceUnit);
		}
	}

	public List<Commodities> getCommoditiess() {
		return this.commoditiess;
	}

	public void setCommoditiess(List<Commodities> commoditiess) {
		this.commoditiess = commoditiess;	
		if (commoditiess != null) {
			for (int depth1 = 0; depth1 < commoditiess.size(); depth1++) {
				putQueryParameter("Commodities." + (depth1 + 1) + ".Amount" , commoditiess.get(depth1).getAmount());
				putQueryParameter("Commodities." + (depth1 + 1) + ".Period" , commoditiess.get(depth1).getPeriod());
				putQueryParameter("Commodities." + (depth1 + 1) + ".NodeType" , commoditiess.get(depth1).getNodeType());
				putQueryParameter("Commodities." + (depth1 + 1) + ".SystemDiskCategory" , commoditiess.get(depth1).getSystemDiskCategory());
				putQueryParameter("Commodities." + (depth1 + 1) + ".SystemDiskSize" , commoditiess.get(depth1).getSystemDiskSize());
				putQueryParameter("Commodities." + (depth1 + 1) + ".InstanceType" , commoditiess.get(depth1).getInstanceType());
				putQueryParameter("Commodities." + (depth1 + 1) + ".NetworkType" , commoditiess.get(depth1).getNetworkType());
			}
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

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public static class Commodities {

		private Integer amount;

		private Integer period;

		private String nodeType;

		private String systemDiskCategory;

		private Integer systemDiskSize;

		private String instanceType;

		private String networkType;

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}
	}

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
