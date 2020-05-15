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

import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderCaseSkusResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderCaseSkusResponse.InOutOrderCaseSkuModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundOrderCaseSkusResponseUnmarshaller {

	public static ListOutboundOrderCaseSkusResponse unmarshall(ListOutboundOrderCaseSkusResponse listOutboundOrderCaseSkusResponse, UnmarshallerContext _ctx) {
		
		listOutboundOrderCaseSkusResponse.setRequestId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.RequestId"));
		listOutboundOrderCaseSkusResponse.setPageSize(_ctx.integerValue("ListOutboundOrderCaseSkusResponse.PageSize"));
		listOutboundOrderCaseSkusResponse.setTotalCount(_ctx.integerValue("ListOutboundOrderCaseSkusResponse.TotalCount"));
		listOutboundOrderCaseSkusResponse.setOrderByField(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.OrderByField"));
		listOutboundOrderCaseSkusResponse.setPageNumber(_ctx.integerValue("ListOutboundOrderCaseSkusResponse.PageNumber"));
		listOutboundOrderCaseSkusResponse.setOrderByMethod(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.OrderByMethod"));
		listOutboundOrderCaseSkusResponse.setSuccess(_ctx.booleanValue("ListOutboundOrderCaseSkusResponse.Success"));

		List<InOutOrderCaseSkuModel> skuTags = new ArrayList<InOutOrderCaseSkuModel>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundOrderCaseSkusResponse.SkuTags.Length"); i++) {
			InOutOrderCaseSkuModel inOutOrderCaseSkuModel = new InOutOrderCaseSkuModel();
			inOutOrderCaseSkuModel.setBindingQuantity(_ctx.integerValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].BindingQuantity"));
			inOutOrderCaseSkuModel.setBarcodeId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].BarcodeId"));
			inOutOrderCaseSkuModel.setBarcode(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].Barcode"));
			inOutOrderCaseSkuModel.setProductCode(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductCode"));
			inOutOrderCaseSkuModel.setProductSizeId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeId"));
			inOutOrderCaseSkuModel.setProductColorId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorId"));
			inOutOrderCaseSkuModel.setCaseId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].CaseId"));
			inOutOrderCaseSkuModel.setProductColorName(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorName"));
			inOutOrderCaseSkuModel.setProductName(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductName"));
			inOutOrderCaseSkuModel.setProductSizeCode(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeCode"));
			inOutOrderCaseSkuModel.setProductSizeName(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductSizeName"));
			inOutOrderCaseSkuModel.setCaseCode(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].CaseCode"));
			inOutOrderCaseSkuModel.setProductId(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductId"));
			inOutOrderCaseSkuModel.setProductColorCode(_ctx.stringValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].ProductColorCode"));
			inOutOrderCaseSkuModel.setBoxQuantity(_ctx.integerValue("ListOutboundOrderCaseSkusResponse.SkuTags["+ i +"].BoxQuantity"));

			skuTags.add(inOutOrderCaseSkuModel);
		}
		listOutboundOrderCaseSkusResponse.setSkuTags(skuTags);
	 
	 	return listOutboundOrderCaseSkusResponse;
	}
}