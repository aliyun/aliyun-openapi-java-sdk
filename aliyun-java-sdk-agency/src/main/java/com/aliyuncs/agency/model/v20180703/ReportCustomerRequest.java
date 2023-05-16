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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportCustomerRequest extends RpcAcsRequest<ReportCustomerResponse> {
	   

	private List<ReportCustomerInfoList> reportCustomerInfoLists;
	public ReportCustomerRequest() {
		super("Agency", "2018-07-03", "ReportCustomer", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ReportCustomerInfoList> getReportCustomerInfoLists() {
		return this.reportCustomerInfoLists;
	}

	public void setReportCustomerInfoLists(List<ReportCustomerInfoList> reportCustomerInfoLists) {
		this.reportCustomerInfoLists = reportCustomerInfoLists;	
		if (reportCustomerInfoLists != null) {
			for (int depth1 = 0; depth1 < reportCustomerInfoLists.size(); depth1++) {
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".AliyunPk" , reportCustomerInfoLists.get(depth1).getAliyunPk());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".RamUid" , reportCustomerInfoLists.get(depth1).getRamUid());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".CustomerType" , reportCustomerInfoLists.get(depth1).getCustomerType());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".CustomerTrade" , reportCustomerInfoLists.get(depth1).getCustomerTrade());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".PhoneNumber" , reportCustomerInfoLists.get(depth1).getPhoneNumber());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".CustomerName" , reportCustomerInfoLists.get(depth1).getCustomerName());
				putQueryParameter("ReportCustomerInfoList." + (depth1 + 1) + ".CustomerSubTrade" , reportCustomerInfoLists.get(depth1).getCustomerSubTrade());
			}
		}	
	}

	public static class ReportCustomerInfoList {

		private Long aliyunPk;

		private Long ramUid;

		private Integer customerType;

		private String customerTrade;

		private String phoneNumber;

		private String customerName;

		private String customerSubTrade;

		public Long getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(Long aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public Long getRamUid() {
			return this.ramUid;
		}

		public void setRamUid(Long ramUid) {
			this.ramUid = ramUid;
		}

		public Integer getCustomerType() {
			return this.customerType;
		}

		public void setCustomerType(Integer customerType) {
			this.customerType = customerType;
		}

		public String getCustomerTrade() {
			return this.customerTrade;
		}

		public void setCustomerTrade(String customerTrade) {
			this.customerTrade = customerTrade;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerSubTrade() {
			return this.customerSubTrade;
		}

		public void setCustomerSubTrade(String customerSubTrade) {
			this.customerSubTrade = customerSubTrade;
		}
	}

	@Override
	public Class<ReportCustomerResponse> getResponseClass() {
		return ReportCustomerResponse.class;
	}

}
