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

package com.aliyuncs.partnerbill.model.v20200108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPartnerInstancesMonthBillRequest extends RpcAcsRequest<GetPartnerInstancesMonthBillResponse> {
	   

	private Long aliyunPk;

	private Boolean containRelatedOrder;

	private Boolean test;

	private String billPeriod;
	public GetPartnerInstancesMonthBillRequest() {
		super("PartnerBill", "2020-01-08", "GetPartnerInstancesMonthBill", "GetPartnerInstancesMonthBill");
		setMethod(MethodType.POST);
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public Boolean getContainRelatedOrder() {
		return this.containRelatedOrder;
	}

	public void setContainRelatedOrder(Boolean containRelatedOrder) {
		this.containRelatedOrder = containRelatedOrder;
		if(containRelatedOrder != null){
			putQueryParameter("ContainRelatedOrder", containRelatedOrder.toString());
		}
	}

	public Boolean getTest() {
		return this.test;
	}

	public void setTest(Boolean test) {
		this.test = test;
		if(test != null){
			putQueryParameter("Test", test.toString());
		}
	}

	public String getBillPeriod() {
		return this.billPeriod;
	}

	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
		if(billPeriod != null){
			putQueryParameter("BillPeriod", billPeriod);
		}
	}

	@Override
	public Class<GetPartnerInstancesMonthBillResponse> getResponseClass() {
		return GetPartnerInstancesMonthBillResponse.class;
	}

}
