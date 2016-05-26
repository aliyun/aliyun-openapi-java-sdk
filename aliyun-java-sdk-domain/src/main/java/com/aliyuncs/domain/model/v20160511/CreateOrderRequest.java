/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	
	public CreateOrderRequest() {
		super("Domain", "2016-05-11", "CreateOrder");
	}

	private List<SubOrderParam> subOrderParams;

	public List<SubOrderParam> getSubOrderParams() {
		return this.subOrderParams;
	}

	public void setSubOrderParams(List<SubOrderParam> subOrderParams) {
		this.subOrderParams = subOrderParams;	
		for (int i = 0; i < subOrderParams.size(); i++) {
			putQueryParameter("SubOrderParam." + (i + 1) + ".SaleID" , subOrderParams.get(i).getSaleID());
			putQueryParameter("SubOrderParam." + (i + 1) + ".RelatedName" , subOrderParams.get(i).getRelatedName());
			putQueryParameter("SubOrderParam." + (i + 1) + ".Action" , subOrderParams.get(i).getAction());
			putQueryParameter("SubOrderParam." + (i + 1) + ".Period" , subOrderParams.get(i).getPeriod());
			putQueryParameter("SubOrderParam." + (i + 1) + ".DomainTemplateID" , subOrderParams.get(i).getDomainTemplateID());
		}	
	}

	public static class SubOrderParam {

		private String saleID;

		private String relatedName;

		private String action;

		private Integer period;

		private String domainTemplateID;

		public String getSaleID() {
			return this.saleID;
		}

		public void setSaleID(String saleID) {
			this.saleID = saleID;
		}

		public String getRelatedName() {
			return this.relatedName;
		}

		public void setRelatedName(String relatedName) {
			this.relatedName = relatedName;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getDomainTemplateID() {
			return this.domainTemplateID;
		}

		public void setDomainTemplateID(String domainTemplateID) {
			this.domainTemplateID = domainTemplateID;
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
