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

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderCaseSkusResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderCaseSkusResponse.InOutOrderCaseSkuModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrderCaseSkusResponseUnmarshaller {

	public static ListInboundOrderCaseSkusResponse unmarshall(ListInboundOrderCaseSkusResponse listInboundOrderCaseSkusResponse, UnmarshallerContext _ctx) {
		
		listInboundOrderCaseSkusResponse.setRequestId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.RequestId"));
		listInboundOrderCaseSkusResponse.setPageSize(_ctx.integerValue("ListInboundOrderCaseSkusResponse.PageSize"));
		listInboundOrderCaseSkusResponse.setTotalCount(_ctx.integerValue("ListInboundOrderCaseSkusResponse.TotalCount"));
		listInboundOrderCaseSkusResponse.setOrderByField(_ctx.stringValue("ListInboundOrderCaseSkusResponse.OrderByField"));
		listInboundOrderCaseSkusResponse.setPageNumber(_ctx.integerValue("ListInboundOrderCaseSkusResponse.PageNumber"));
		listInboundOrderCaseSkusResponse.setOrderByMethod(_ctx.stringValue("ListInboundOrderCaseSkusResponse.OrderByMethod"));
		listInboundOrderCaseSkusResponse.setSuccess(_ctx.booleanValue("ListInboundOrderCaseSkusResponse.Success"));

		List<InOutOrderCaseSkuModel> skuTags = new ArrayList<InOutOrderCaseSkuModel>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrderCaseSkusResponse.SkuTags.Length"); i++) {
			InOutOrderCaseSkuModel inOutOrderCaseSkuModel = new InOutOrderCaseSkuModel();
			inOutOrderCaseSkuModel.setBindingQuantity(_ctx.integerValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].BindingQuantity"));
			inOutOrderCaseSkuModel.setBarcodeId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].BarcodeId"));
			inOutOrderCaseSkuModel.setBarcode(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].Barcode"));
			inOutOrderCaseSkuModel.setProductCode(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductCode"));
			inOutOrderCaseSkuModel.setProductSizeId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeId"));
			inOutOrderCaseSkuModel.setProductColorId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorId"));
			inOutOrderCaseSkuModel.setCaseId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].CaseId"));
			inOutOrderCaseSkuModel.setProductColorName(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorName"));
			inOutOrderCaseSkuModel.setProductName(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductName"));
			inOutOrderCaseSkuModel.setProductSizeCode(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeCode"));
			inOutOrderCaseSkuModel.setProductSizeName(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeName"));
			inOutOrderCaseSkuModel.setCaseCode(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].CaseCode"));
			inOutOrderCaseSkuModel.setProductId(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductId"));
			inOutOrderCaseSkuModel.setProductColorCode(_ctx.stringValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorCode"));
			inOutOrderCaseSkuModel.setBoxQuantity(_ctx.integerValue("ListInboundOrderCaseSkusResponse.SkuTags["+ i +"].BoxQuantity"));

			skuTags.add(inOutOrderCaseSkuModel);
		}
		listInboundOrderCaseSkusResponse.setSkuTags(skuTags);
	 
	 	return listInboundOrderCaseSkusResponse;
	}
}