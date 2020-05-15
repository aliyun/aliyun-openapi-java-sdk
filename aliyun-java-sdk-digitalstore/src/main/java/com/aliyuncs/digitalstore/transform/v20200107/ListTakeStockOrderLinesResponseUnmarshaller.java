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

import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderLinesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderLinesResponse.SummaryModel;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderLinesResponse.TakeStockOrderLineModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTakeStockOrderLinesResponseUnmarshaller {

	public static ListTakeStockOrderLinesResponse unmarshall(ListTakeStockOrderLinesResponse listTakeStockOrderLinesResponse, UnmarshallerContext _ctx) {
		
		listTakeStockOrderLinesResponse.setRequestId(_ctx.stringValue("ListTakeStockOrderLinesResponse.RequestId"));
		listTakeStockOrderLinesResponse.setPageSize(_ctx.integerValue("ListTakeStockOrderLinesResponse.PageSize"));
		listTakeStockOrderLinesResponse.setTotalCount(_ctx.integerValue("ListTakeStockOrderLinesResponse.TotalCount"));
		listTakeStockOrderLinesResponse.setPageNumber(_ctx.integerValue("ListTakeStockOrderLinesResponse.PageNumber"));
		listTakeStockOrderLinesResponse.setSuccess(_ctx.booleanValue("ListTakeStockOrderLinesResponse.Success"));

		List<TakeStockOrderLineModel> takeStockOrderLines = new ArrayList<TakeStockOrderLineModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines.Length"); i++) {
			TakeStockOrderLineModel takeStockOrderLineModel = new TakeStockOrderLineModel();
			takeStockOrderLineModel.setDifferenceAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].DifferenceAmount"));
			takeStockOrderLineModel.setProductName(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductName"));
			takeStockOrderLineModel.setProductSizeCode(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductSizeCode"));
			takeStockOrderLineModel.setOperateQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].OperateQuantity"));
			takeStockOrderLineModel.setCreateDate(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].CreateDate"));
			takeStockOrderLineModel.setUpdateDate(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].UpdateDate"));
			takeStockOrderLineModel.setConfirmQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ConfirmQuantity"));
			takeStockOrderLineModel.setProductSizeName(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductSizeName"));
			takeStockOrderLineModel.setSnapQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].SnapQuantity"));
			takeStockOrderLineModel.setConfirmAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ConfirmAmount"));
			takeStockOrderLineModel.setSkuCurrentPrice(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].SkuCurrentPrice"));
			takeStockOrderLineModel.setProductColorCode(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductColorCode"));
			takeStockOrderLineModel.setDifferenceQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].DifferenceQuantity"));
			takeStockOrderLineModel.setBarcodeId(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].BarcodeId"));
			takeStockOrderLineModel.setOperateAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].OperateAmount"));
			takeStockOrderLineModel.setOrderLineId(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].OrderLineId"));
			takeStockOrderLineModel.setBarcode(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].Barcode"));
			takeStockOrderLineModel.setSkuRetailPrice(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].SkuRetailPrice"));
			takeStockOrderLineModel.setSnapAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].SnapAmount"));
			takeStockOrderLineModel.setProductCode(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductCode"));
			takeStockOrderLineModel.setTakeStockOrderId(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].TakeStockOrderId"));
			takeStockOrderLineModel.setProductColorName(_ctx.stringValue("ListTakeStockOrderLinesResponse.TakeStockOrderLines["+ i +"].ProductColorName"));

			takeStockOrderLines.add(takeStockOrderLineModel);
		}
		listTakeStockOrderLinesResponse.setTakeStockOrderLines(takeStockOrderLines);

		List<SummaryModel> summarys = new ArrayList<SummaryModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrderLinesResponse.Summarys.Length"); i++) {
			SummaryModel summaryModel = new SummaryModel();
			summaryModel.setDifferenceQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].DifferenceQuantity"));
			summaryModel.setSnapRetailAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].SnapRetailAmount"));
			summaryModel.setOperateQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].OperateQuantity"));
			summaryModel.setDifferenceRetailAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].DifferenceRetailAmount"));
			summaryModel.setOperateAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].OperateAmount"));
			summaryModel.setConfirmQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].ConfirmQuantity"));
			summaryModel.setSnapQuantity(_ctx.integerValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].SnapQuantity"));
			summaryModel.setConfirmRetailAmount(_ctx.floatValue("ListTakeStockOrderLinesResponse.Summarys["+ i +"].ConfirmRetailAmount"));

			summarys.add(summaryModel);
		}
		listTakeStockOrderLinesResponse.setSummarys(summarys);
	 
	 	return listTakeStockOrderLinesResponse;
	}
}