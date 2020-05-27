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

import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderLinesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderLinesResponse.ProduceOrderLineModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceOrderLinesResponseUnmarshaller {

	public static ListProduceOrderLinesResponse unmarshall(ListProduceOrderLinesResponse listProduceOrderLinesResponse, UnmarshallerContext _ctx) {
		
		listProduceOrderLinesResponse.setRequestId(_ctx.stringValue("ListProduceOrderLinesResponse.RequestId"));
		listProduceOrderLinesResponse.setPageSize(_ctx.integerValue("ListProduceOrderLinesResponse.PageSize"));
		listProduceOrderLinesResponse.setTotalCount(_ctx.integerValue("ListProduceOrderLinesResponse.TotalCount"));
		listProduceOrderLinesResponse.setPageNumber(_ctx.integerValue("ListProduceOrderLinesResponse.PageNumber"));
		listProduceOrderLinesResponse.setSuccess(_ctx.booleanValue("ListProduceOrderLinesResponse.Success"));

		List<ProduceOrderLineModel> produceOrderLines = new ArrayList<ProduceOrderLineModel>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceOrderLinesResponse.ProduceOrderLines.Length"); i++) {
			ProduceOrderLineModel produceOrderLineModel = new ProduceOrderLineModel();
			produceOrderLineModel.setProductId(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductId"));
			produceOrderLineModel.setProductColorCode(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductColorCode"));
			produceOrderLineModel.setOrderId(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].OrderId"));
			produceOrderLineModel.setUpdateDate(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].UpdateDate"));
			produceOrderLineModel.setProductSizeName(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductSizeName"));
			produceOrderLineModel.setProductName(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductName"));
			produceOrderLineModel.setProductSizeCode(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductSizeCode"));
			produceOrderLineModel.setOperateQuantity(_ctx.integerValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].OperateQuantity"));
			produceOrderLineModel.setCreateDate(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].CreateDate"));
			produceOrderLineModel.setInboundQuantity(_ctx.integerValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].InboundQuantity"));
			produceOrderLineModel.setBoxedNum(_ctx.integerValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].BoxedNum"));
			produceOrderLineModel.setQuantity(_ctx.integerValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].Quantity"));
			produceOrderLineModel.setProductColorName(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductColorName"));
			produceOrderLineModel.setProductCode(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].ProductCode"));
			produceOrderLineModel.setBusinessPrice(_ctx.integerValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].BusinessPrice"));
			produceOrderLineModel.setBarcodeId(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].BarcodeId"));
			produceOrderLineModel.setBarcode(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].Barcode"));
			produceOrderLineModel.setSKUName(_ctx.stringValue("ListProduceOrderLinesResponse.ProduceOrderLines["+ i +"].SKUName"));

			produceOrderLines.add(produceOrderLineModel);
		}
		listProduceOrderLinesResponse.setProduceOrderLines(produceOrderLines);
	 
	 	return listProduceOrderLinesResponse;
	}
}