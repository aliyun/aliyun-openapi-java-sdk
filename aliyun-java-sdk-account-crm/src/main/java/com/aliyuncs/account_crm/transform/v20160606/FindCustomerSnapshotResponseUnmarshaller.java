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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.FindCustomerSnapshotResponse;
import com.aliyuncs.account_crm.model.v20160606.FindCustomerSnapshotResponse.CustomerSnapshot;
import com.aliyuncs.account_crm.model.v20160606.FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel;
import com.aliyuncs.account_crm.model.v20160606.FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCustomerSnapshotResponseUnmarshaller {

	public static FindCustomerSnapshotResponse unmarshall(FindCustomerSnapshotResponse findCustomerSnapshotResponse, UnmarshallerContext _ctx) {
		
		findCustomerSnapshotResponse.setRequestId(_ctx.stringValue("FindCustomerSnapshotResponse.RequestId"));
		findCustomerSnapshotResponse.setCode(_ctx.stringValue("FindCustomerSnapshotResponse.Code"));
		findCustomerSnapshotResponse.setMessage(_ctx.stringValue("FindCustomerSnapshotResponse.Message"));
		findCustomerSnapshotResponse.setSuccess(_ctx.booleanValue("FindCustomerSnapshotResponse.Success"));

		CustomerSnapshot customerSnapshot = new CustomerSnapshot();
		customerSnapshot.setGmtCreate(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.GmtCreate"));
		customerSnapshot.setInfoType(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.InfoType"));
		customerSnapshot.setKpId(_ctx.longValue("FindCustomerSnapshotResponse.CustomerSnapshot.KpId"));
		customerSnapshot.setId(_ctx.longValue("FindCustomerSnapshotResponse.CustomerSnapshot.Id"));

		AccountInfoSnapshotModel accountInfoSnapshotModel = new AccountInfoSnapshotModel();
		accountInfoSnapshotModel.setAddress6(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address6"));
		accountInfoSnapshotModel.setPostCode(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.PostCode"));
		accountInfoSnapshotModel.setProvinceName(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.ProvinceName"));
		accountInfoSnapshotModel.setCityId(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.CityId"));
		accountInfoSnapshotModel.setAddress4(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address4"));
		accountInfoSnapshotModel.setProvinceId(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.ProvinceId"));
		accountInfoSnapshotModel.setAddress3(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address3"));
		accountInfoSnapshotModel.setAddress5(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address5"));
		accountInfoSnapshotModel.setCityName(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.CityName"));
		accountInfoSnapshotModel.setAddress(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address"));
		accountInfoSnapshotModel.setAddress2(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.Address2"));
		accountInfoSnapshotModel.setTrueName(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountInfoSnapshotModel.TrueName"));
		customerSnapshot.setAccountInfoSnapshotModel(accountInfoSnapshotModel);

		AccountTaxSnapshotModel accountTaxSnapshotModel = new AccountTaxSnapshotModel();
		accountTaxSnapshotModel.setFinanceTaxCertificateImgName(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.FinanceTaxCertificateImgName"));
		accountTaxSnapshotModel.setFinanceTaxCertificateImgUrl(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.FinanceTaxCertificateImgUrl"));
		accountTaxSnapshotModel.setSecondFinanceTaxCertificateImgUrl(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.SecondFinanceTaxCertificateImgUrl"));
		accountTaxSnapshotModel.setTax(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.Tax"));
		accountTaxSnapshotModel.setSecondFinanceTax(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.SecondFinanceTax"));
		accountTaxSnapshotModel.setSecondFinanceTaxCertificateImgName(_ctx.stringValue("FindCustomerSnapshotResponse.CustomerSnapshot.AccountTaxSnapshotModel.SecondFinanceTaxCertificateImgName"));
		customerSnapshot.setAccountTaxSnapshotModel(accountTaxSnapshotModel);
		findCustomerSnapshotResponse.setCustomerSnapshot(customerSnapshot);
	 
	 	return findCustomerSnapshotResponse;
	}
}