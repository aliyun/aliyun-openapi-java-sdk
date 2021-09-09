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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.AcctgTransList;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.AcctgTransList.VoucherTransId;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.BuyMethod;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.BuyTarget;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.CustVendorId;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.DetailsItem;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.DetailsItem.Product;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.FixedAssetType;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.IncomeOutType;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.Kind;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.PayMethod;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.ShellMethod;
import com.aliyuncs.companyreg.model.v20201022.GetInvoiceInfoResponse.Use;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInvoiceInfoResponseUnmarshaller {

	public static GetInvoiceInfoResponse unmarshall(GetInvoiceInfoResponse getInvoiceInfoResponse, UnmarshallerContext _ctx) {
		
		getInvoiceInfoResponse.setRequestId(_ctx.stringValue("GetInvoiceInfoResponse.RequestId"));
		getInvoiceInfoResponse.setAcctgPeriod(_ctx.stringValue("GetInvoiceInfoResponse.AcctgPeriod"));
		getInvoiceInfoResponse.setBaseTotalAmountWithTax(_ctx.stringValue("GetInvoiceInfoResponse.BaseTotalAmountWithTax"));
		getInvoiceInfoResponse.setBaseTotalAmountWithoutTax(_ctx.stringValue("GetInvoiceInfoResponse.BaseTotalAmountWithoutTax"));
		getInvoiceInfoResponse.setBaseTotalTax(_ctx.stringValue("GetInvoiceInfoResponse.BaseTotalTax"));
		getInvoiceInfoResponse.setBizDate(_ctx.longValue("GetInvoiceInfoResponse.BizDate"));
		getInvoiceInfoResponse.setComments(_ctx.stringValue("GetInvoiceInfoResponse.Comments"));
		getInvoiceInfoResponse.setCreatedStamp(_ctx.longValue("GetInvoiceInfoResponse.CreatedStamp"));
		getInvoiceInfoResponse.setDueDate(_ctx.longValue("GetInvoiceInfoResponse.DueDate"));
		getInvoiceInfoResponse.setElecInvoiceUrl(_ctx.stringValue("GetInvoiceInfoResponse.ElecInvoiceUrl"));
		getInvoiceInfoResponse.setId(_ctx.longValue("GetInvoiceInfoResponse.Id"));
		getInvoiceInfoResponse.setInvoiceCode(_ctx.stringValue("GetInvoiceInfoResponse.InvoiceCode"));
		getInvoiceInfoResponse.setInvoiceNo(_ctx.stringValue("GetInvoiceInfoResponse.InvoiceNo"));
		getInvoiceInfoResponse.setIsElectronic(_ctx.booleanValue("GetInvoiceInfoResponse.IsElectronic"));
		getInvoiceInfoResponse.setIsAuth(_ctx.booleanValue("GetInvoiceInfoResponse.IsAuth"));
		getInvoiceInfoResponse.setIsFee(_ctx.booleanValue("GetInvoiceInfoResponse.IsFee"));
		getInvoiceInfoResponse.setOrgName(_ctx.stringValue("GetInvoiceInfoResponse.OrgName"));
		getInvoiceInfoResponse.setSimulationCertified(_ctx.booleanValue("GetInvoiceInfoResponse.SimulationCertified"));
		getInvoiceInfoResponse.setTaxNo(_ctx.stringValue("GetInvoiceInfoResponse.TaxNo"));
		getInvoiceInfoResponse.setTaxPct(_ctx.stringValue("GetInvoiceInfoResponse.TaxPct"));
		getInvoiceInfoResponse.setType(_ctx.stringValue("GetInvoiceInfoResponse.Type"));
		getInvoiceInfoResponse.setPayer(_ctx.stringValue("GetInvoiceInfoResponse.Payer"));
		getInvoiceInfoResponse.setCanUpdate(_ctx.booleanValue("GetInvoiceInfoResponse.CanUpdate"));
		getInvoiceInfoResponse.setLabelData(_ctx.stringValue("GetInvoiceInfoResponse.LabelData"));

		BuyMethod buyMethod = new BuyMethod();
		buyMethod.setKey(_ctx.stringValue("GetInvoiceInfoResponse.BuyMethod.Key"));
		buyMethod.setValue(_ctx.stringValue("GetInvoiceInfoResponse.BuyMethod.Value"));
		getInvoiceInfoResponse.setBuyMethod(buyMethod);

		BuyTarget buyTarget = new BuyTarget();
		buyTarget.setKey(_ctx.stringValue("GetInvoiceInfoResponse.BuyTarget.Key"));
		buyTarget.setValue(_ctx.stringValue("GetInvoiceInfoResponse.BuyTarget.Value"));
		getInvoiceInfoResponse.setBuyTarget(buyTarget);

		CustVendorId custVendorId = new CustVendorId();
		custVendorId.setPartyName(_ctx.stringValue("GetInvoiceInfoResponse.CustVendorId.PartyName"));
		getInvoiceInfoResponse.setCustVendorId(custVendorId);

		FixedAssetType fixedAssetType = new FixedAssetType();
		fixedAssetType.setKey(_ctx.stringValue("GetInvoiceInfoResponse.FixedAssetType.Key"));
		fixedAssetType.setValue(_ctx.stringValue("GetInvoiceInfoResponse.FixedAssetType.Value"));
		getInvoiceInfoResponse.setFixedAssetType(fixedAssetType);

		IncomeOutType incomeOutType = new IncomeOutType();
		incomeOutType.setLabel(_ctx.stringValue("GetInvoiceInfoResponse.IncomeOutType.Label"));
		incomeOutType.setValue(_ctx.stringValue("GetInvoiceInfoResponse.IncomeOutType.Value"));
		getInvoiceInfoResponse.setIncomeOutType(incomeOutType);

		Kind kind = new Kind();
		kind.setKey(_ctx.stringValue("GetInvoiceInfoResponse.Kind.Key"));
		kind.setValue(_ctx.stringValue("GetInvoiceInfoResponse.Kind.Value"));
		getInvoiceInfoResponse.setKind(kind);

		PayMethod payMethod = new PayMethod();
		payMethod.setKey(_ctx.stringValue("GetInvoiceInfoResponse.PayMethod.Key"));
		payMethod.setValue(_ctx.stringValue("GetInvoiceInfoResponse.PayMethod.Value"));
		getInvoiceInfoResponse.setPayMethod(payMethod);

		ShellMethod shellMethod = new ShellMethod();
		shellMethod.setKey(_ctx.stringValue("GetInvoiceInfoResponse.ShellMethod.Key"));
		shellMethod.setValue(_ctx.stringValue("GetInvoiceInfoResponse.ShellMethod.Value"));
		getInvoiceInfoResponse.setShellMethod(shellMethod);

		Use use = new Use();
		use.setKey(_ctx.stringValue("GetInvoiceInfoResponse.Use.Key"));
		use.setValue(_ctx.stringValue("GetInvoiceInfoResponse.Use.Value"));
		getInvoiceInfoResponse.setUse(use);

		List<DetailsItem> details = new ArrayList<DetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInvoiceInfoResponse.Details.Length"); i++) {
			DetailsItem detailsItem = new DetailsItem();

			Product product = new Product();
			product.setId(_ctx.longValue("GetInvoiceInfoResponse.Details["+ i +"].Product.Id"));
			product.setName(_ctx.stringValue("GetInvoiceInfoResponse.Details["+ i +"].Product.Name"));
			detailsItem.setProduct(product);

			details.add(detailsItem);
		}
		getInvoiceInfoResponse.setDetails(details);

		List<AcctgTransList> voucherTransList = new ArrayList<AcctgTransList>();
		for (int i = 0; i < _ctx.lengthValue("GetInvoiceInfoResponse.VoucherTransList.Length"); i++) {
			AcctgTransList acctgTransList = new AcctgTransList();

			VoucherTransId voucherTransId = new VoucherTransId();
			voucherTransId.setId(_ctx.longValue("GetInvoiceInfoResponse.VoucherTransList["+ i +"].VoucherTransId.Id"));
			voucherTransId.setRefVoucherIds(_ctx.stringValue("GetInvoiceInfoResponse.VoucherTransList["+ i +"].VoucherTransId.RefVoucherIds"));
			acctgTransList.setVoucherTransId(voucherTransId);

			voucherTransList.add(acctgTransList);
		}
		getInvoiceInfoResponse.setVoucherTransList(voucherTransList);
	 
	 	return getInvoiceInfoResponse;
	}
}