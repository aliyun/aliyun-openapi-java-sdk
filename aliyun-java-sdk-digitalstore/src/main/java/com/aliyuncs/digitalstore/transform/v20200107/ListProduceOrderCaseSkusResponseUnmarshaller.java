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

import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderCaseSkusResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderCaseSkusResponse.ProduceOrderCaseSkuModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceOrderCaseSkusResponseUnmarshaller {

	public static ListProduceOrderCaseSkusResponse unmarshall(ListProduceOrderCaseSkusResponse listProduceOrderCaseSkusResponse, UnmarshallerContext _ctx) {
		
		listProduceOrderCaseSkusResponse.setRequestId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.RequestId"));
		listProduceOrderCaseSkusResponse.setPageSize(_ctx.integerValue("ListProduceOrderCaseSkusResponse.PageSize"));
		listProduceOrderCaseSkusResponse.setTotalCount(_ctx.integerValue("ListProduceOrderCaseSkusResponse.TotalCount"));
		listProduceOrderCaseSkusResponse.setPageNumber(_ctx.integerValue("ListProduceOrderCaseSkusResponse.PageNumber"));
		listProduceOrderCaseSkusResponse.setSuccess(_ctx.booleanValue("ListProduceOrderCaseSkusResponse.Success"));

		List<ProduceOrderCaseSkuModel> productionOrderCaseSkus = new ArrayList<ProduceOrderCaseSkuModel>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus.Length"); i++) {
			ProduceOrderCaseSkuModel produceOrderCaseSkuModel = new ProduceOrderCaseSkuModel();
			produceOrderCaseSkuModel.setProductSizeName(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductSizeName"));
			produceOrderCaseSkuModel.setCaseCode(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].CaseCode"));
			produceOrderCaseSkuModel.setBoxQuantity(_ctx.integerValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].BoxQuantity"));
			produceOrderCaseSkuModel.setProductId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductId"));
			produceOrderCaseSkuModel.setProductColorCode(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductColorCode"));
			produceOrderCaseSkuModel.setProductName(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductName"));
			produceOrderCaseSkuModel.setProductSizeCode(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductSizeCode"));
			produceOrderCaseSkuModel.setProductCode(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductCode"));
			produceOrderCaseSkuModel.setProductSizeId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductSizeId"));
			produceOrderCaseSkuModel.setProductColorId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductColorId"));
			produceOrderCaseSkuModel.setCaseId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].CaseId"));
			produceOrderCaseSkuModel.setProductColorName(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].ProductColorName"));
			produceOrderCaseSkuModel.setBindingQuantity(_ctx.integerValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].BindingQuantity"));
			produceOrderCaseSkuModel.setBarcodeId(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].BarcodeId"));
			produceOrderCaseSkuModel.setBarcode(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].Barcode"));
			produceOrderCaseSkuModel.setSKUName(_ctx.stringValue("ListProduceOrderCaseSkusResponse.ProductionOrderCaseSkus["+ i +"].SKUName"));

			productionOrderCaseSkus.add(produceOrderCaseSkuModel);
		}
		listProduceOrderCaseSkusResponse.setProductionOrderCaseSkus(productionOrderCaseSkus);
	 
	 	return listProduceOrderCaseSkusResponse;
	}
}