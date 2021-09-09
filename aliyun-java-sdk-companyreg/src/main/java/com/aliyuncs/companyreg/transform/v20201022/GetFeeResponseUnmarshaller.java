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

import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.AcctgTransList;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.AcctgTransList.VoucherTransId;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.FeeTypeEnum;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.Kind;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.PayMethod;
import com.aliyuncs.companyreg.model.v20201022.GetFeeResponse.Use;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFeeResponseUnmarshaller {

	public static GetFeeResponse unmarshall(GetFeeResponse getFeeResponse, UnmarshallerContext _ctx) {
		
		getFeeResponse.setRequestId(_ctx.stringValue("GetFeeResponse.RequestId"));
		getFeeResponse.setAcctgPeriod(_ctx.stringValue("GetFeeResponse.AcctgPeriod"));
		getFeeResponse.setBaseTotalAmount(_ctx.stringValue("GetFeeResponse.BaseTotalAmount"));
		getFeeResponse.setBaseTotalAmountWithoutTax(_ctx.stringValue("GetFeeResponse.BaseTotalAmountWithoutTax"));
		getFeeResponse.setBaseTotalTax(_ctx.stringValue("GetFeeResponse.BaseTotalTax"));
		getFeeResponse.setCreatedStamp(_ctx.longValue("GetFeeResponse.CreatedStamp"));
		getFeeResponse.setId(_ctx.longValue("GetFeeResponse.Id"));
		getFeeResponse.setUrl(_ctx.stringValue("GetFeeResponse.Url"));
		getFeeResponse.setPayer(_ctx.stringValue("GetFeeResponse.Payer"));
		getFeeResponse.setCanUpdate(_ctx.booleanValue("GetFeeResponse.CanUpdate"));
		getFeeResponse.setLabelData(_ctx.stringValue("GetFeeResponse.LabelData"));

		FeeTypeEnum feeTypeEnum = new FeeTypeEnum();
		feeTypeEnum.setLabel(_ctx.stringValue("GetFeeResponse.FeeTypeEnum.Label"));
		feeTypeEnum.setValue(_ctx.stringValue("GetFeeResponse.FeeTypeEnum.Value"));
		getFeeResponse.setFeeTypeEnum(feeTypeEnum);

		Kind kind = new Kind();
		kind.setKey(_ctx.stringValue("GetFeeResponse.Kind.Key"));
		kind.setValue(_ctx.stringValue("GetFeeResponse.Kind.Value"));
		getFeeResponse.setKind(kind);

		PayMethod payMethod = new PayMethod();
		payMethod.setKey(_ctx.stringValue("GetFeeResponse.PayMethod.Key"));
		payMethod.setValue(_ctx.stringValue("GetFeeResponse.PayMethod.Value"));
		getFeeResponse.setPayMethod(payMethod);

		Use use = new Use();
		use.setKey(_ctx.stringValue("GetFeeResponse.Use.Key"));
		use.setValue(_ctx.stringValue("GetFeeResponse.Use.Value"));
		getFeeResponse.setUse(use);

		List<AcctgTransList> voucherTransList = new ArrayList<AcctgTransList>();
		for (int i = 0; i < _ctx.lengthValue("GetFeeResponse.VoucherTransList.Length"); i++) {
			AcctgTransList acctgTransList = new AcctgTransList();

			VoucherTransId voucherTransId = new VoucherTransId();
			voucherTransId.setId(_ctx.longValue("GetFeeResponse.VoucherTransList["+ i +"].VoucherTransId.Id"));
			voucherTransId.setRefVoucherIds(_ctx.stringValue("GetFeeResponse.VoucherTransList["+ i +"].VoucherTransId.RefVoucherIds"));
			acctgTransList.setVoucherTransId(voucherTransId);

			voucherTransList.add(acctgTransList);
		}
		getFeeResponse.setVoucherTransList(voucherTransList);
	 
	 	return getFeeResponse;
	}
}