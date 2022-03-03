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

import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.Fee;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.Fee.KindEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.Fee.PayMethodEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.Fee.UseEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.InInvoice;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.InInvoice.BuyMethodEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.InInvoice.BuyTargetEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.InInvoice.FixedAssetTypeEnum;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.OutInvoice;
import com.aliyuncs.companyreg.model.v20201022.GetTypeListResponse.OutInvoice.ShellMethodEnum;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTypeListResponseUnmarshaller {

	public static GetTypeListResponse unmarshall(GetTypeListResponse getTypeListResponse, UnmarshallerContext _ctx) {
		
		getTypeListResponse.setRequestId(_ctx.stringValue("GetTypeListResponse.RequestId"));

		Fee fee = new Fee();

		List<KindEnum> kind = new ArrayList<KindEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.Fee.Kind.Length"); i++) {
			KindEnum kindEnum = new KindEnum();
			kindEnum.setKey(_ctx.stringValue("GetTypeListResponse.Fee.Kind["+ i +"].Key"));
			kindEnum.setValue(_ctx.stringValue("GetTypeListResponse.Fee.Kind["+ i +"].Value"));

			kind.add(kindEnum);
		}
		fee.setKind(kind);

		List<PayMethodEnum> payMethod = new ArrayList<PayMethodEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.Fee.PayMethod.Length"); i++) {
			PayMethodEnum payMethodEnum = new PayMethodEnum();
			payMethodEnum.setKey(_ctx.stringValue("GetTypeListResponse.Fee.PayMethod["+ i +"].Key"));
			payMethodEnum.setValue(_ctx.stringValue("GetTypeListResponse.Fee.PayMethod["+ i +"].Value"));

			payMethod.add(payMethodEnum);
		}
		fee.setPayMethod(payMethod);

		List<UseEnum> use = new ArrayList<UseEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.Fee.Use.Length"); i++) {
			UseEnum useEnum = new UseEnum();
			useEnum.setKey(_ctx.stringValue("GetTypeListResponse.Fee.Use["+ i +"].Key"));
			useEnum.setValue(_ctx.stringValue("GetTypeListResponse.Fee.Use["+ i +"].Value"));

			use.add(useEnum);
		}
		fee.setUse(use);
		getTypeListResponse.setFee(fee);

		InInvoice inInvoice = new InInvoice();

		List<BuyMethodEnum> buyMethod = new ArrayList<BuyMethodEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.InInvoice.BuyMethod.Length"); i++) {
			BuyMethodEnum buyMethodEnum = new BuyMethodEnum();
			buyMethodEnum.setKey(_ctx.stringValue("GetTypeListResponse.InInvoice.BuyMethod["+ i +"].Key"));
			buyMethodEnum.setValue(_ctx.stringValue("GetTypeListResponse.InInvoice.BuyMethod["+ i +"].Value"));

			buyMethod.add(buyMethodEnum);
		}
		inInvoice.setBuyMethod(buyMethod);

		List<FixedAssetTypeEnum> fixedAssetType = new ArrayList<FixedAssetTypeEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.InInvoice.FixedAssetType.Length"); i++) {
			FixedAssetTypeEnum fixedAssetTypeEnum = new FixedAssetTypeEnum();
			fixedAssetTypeEnum.setKey(_ctx.stringValue("GetTypeListResponse.InInvoice.FixedAssetType["+ i +"].Key"));
			fixedAssetTypeEnum.setValue(_ctx.stringValue("GetTypeListResponse.InInvoice.FixedAssetType["+ i +"].Value"));

			fixedAssetType.add(fixedAssetTypeEnum);
		}
		inInvoice.setFixedAssetType(fixedAssetType);

		List<BuyTargetEnum> buyTarget = new ArrayList<BuyTargetEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.InInvoice.BuyTarget.Length"); i++) {
			BuyTargetEnum buyTargetEnum = new BuyTargetEnum();
			buyTargetEnum.setKey(_ctx.stringValue("GetTypeListResponse.InInvoice.BuyTarget["+ i +"].Key"));
			buyTargetEnum.setValue(_ctx.stringValue("GetTypeListResponse.InInvoice.BuyTarget["+ i +"].Value"));

			buyTarget.add(buyTargetEnum);
		}
		inInvoice.setBuyTarget(buyTarget);
		getTypeListResponse.setInInvoice(inInvoice);

		OutInvoice outInvoice = new OutInvoice();

		List<ShellMethodEnum> shellMethod = new ArrayList<ShellMethodEnum>();
		for (int i = 0; i < _ctx.lengthValue("GetTypeListResponse.OutInvoice.ShellMethod.Length"); i++) {
			ShellMethodEnum shellMethodEnum = new ShellMethodEnum();
			shellMethodEnum.setKey(_ctx.stringValue("GetTypeListResponse.OutInvoice.ShellMethod["+ i +"].Key"));
			shellMethodEnum.setValue(_ctx.stringValue("GetTypeListResponse.OutInvoice.ShellMethod["+ i +"].Value"));

			shellMethod.add(shellMethodEnum);
		}
		outInvoice.setShellMethod(shellMethod);
		getTypeListResponse.setOutInvoice(outInvoice);
	 
	 	return getTypeListResponse;
	}
}