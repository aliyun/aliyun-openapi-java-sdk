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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderCaseSKUResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkuModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationOrderCaseSKUResponseUnmarshaller {

	public static ListApplicationOrderCaseSKUResponse unmarshall(ListApplicationOrderCaseSKUResponse listApplicationOrderCaseSKUResponse, UnmarshallerContext _ctx) {
		
		listApplicationOrderCaseSKUResponse.setRequestId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.RequestId"));
		listApplicationOrderCaseSKUResponse.setPageSize(_ctx.integerValue("ListApplicationOrderCaseSKUResponse.PageSize"));
		listApplicationOrderCaseSKUResponse.setTotalCount(_ctx.integerValue("ListApplicationOrderCaseSKUResponse.TotalCount"));
		listApplicationOrderCaseSKUResponse.setPageNumber(_ctx.integerValue("ListApplicationOrderCaseSKUResponse.PageNumber"));
		listApplicationOrderCaseSKUResponse.setSuccess(_ctx.booleanValue("ListApplicationOrderCaseSKUResponse.Success"));

		List<ApplyOrderCaseSkuModel> applyOrderCaseSkus = new ArrayList<ApplyOrderCaseSkuModel>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus.Length"); i++) {
			ApplyOrderCaseSkuModel applyOrderCaseSkuModel = new ApplyOrderCaseSkuModel();
			applyOrderCaseSkuModel.setProductSizeName(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductSizeName"));
			applyOrderCaseSkuModel.setCaseCode(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].CaseCode"));
			applyOrderCaseSkuModel.setBoxQuantity(_ctx.integerValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].BoxQuantity"));
			applyOrderCaseSkuModel.setProductId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductId"));
			applyOrderCaseSkuModel.setProductColorCode(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductColorCode"));
			applyOrderCaseSkuModel.setProductName(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductName"));
			applyOrderCaseSkuModel.setProductSizeCode(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductSizeCode"));
			applyOrderCaseSkuModel.setProductCode(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductCode"));
			applyOrderCaseSkuModel.setProductSizeId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductSizeId"));
			applyOrderCaseSkuModel.setProductColorId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductColorId"));
			applyOrderCaseSkuModel.setCaseId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].CaseId"));
			applyOrderCaseSkuModel.setProductColorName(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].ProductColorName"));
			applyOrderCaseSkuModel.setBindingQuantity(_ctx.integerValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].BindingQuantity"));
			applyOrderCaseSkuModel.setBarcodeId(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].BarcodeId"));
			applyOrderCaseSkuModel.setBarcode(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].Barcode"));
			applyOrderCaseSkuModel.setSKUName(_ctx.stringValue("ListApplicationOrderCaseSKUResponse.ApplyOrderCaseSkus["+ i +"].SKUName"));

			applyOrderCaseSkus.add(applyOrderCaseSkuModel);
		}
		listApplicationOrderCaseSKUResponse.setApplyOrderCaseSkus(applyOrderCaseSkus);
	 
	 	return listApplicationOrderCaseSKUResponse;
	}
}