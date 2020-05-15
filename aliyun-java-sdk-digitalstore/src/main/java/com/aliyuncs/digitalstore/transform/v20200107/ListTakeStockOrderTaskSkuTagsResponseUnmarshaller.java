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

import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderTaskSkuTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTagModel;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderTaskSkuTagsResponse.TaskSkuTagSummaryModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTakeStockOrderTaskSkuTagsResponseUnmarshaller {

	public static ListTakeStockOrderTaskSkuTagsResponse unmarshall(ListTakeStockOrderTaskSkuTagsResponse listTakeStockOrderTaskSkuTagsResponse, UnmarshallerContext _ctx) {
		
		listTakeStockOrderTaskSkuTagsResponse.setRequestId(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.RequestId"));
		listTakeStockOrderTaskSkuTagsResponse.setPageSize(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.PageSize"));
		listTakeStockOrderTaskSkuTagsResponse.setTotalCount(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TotalCount"));
		listTakeStockOrderTaskSkuTagsResponse.setPageNumber(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.PageNumber"));
		listTakeStockOrderTaskSkuTagsResponse.setSuccess(_ctx.booleanValue("ListTakeStockOrderTaskSkuTagsResponse.Success"));

		List<TakeStockOrderTaskSkuTagModel> takeStockOrderTaskSkuTags = new ArrayList<TakeStockOrderTaskSkuTagModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags.Length"); i++) {
			TakeStockOrderTaskSkuTagModel takeStockOrderTaskSkuTagModel = new TakeStockOrderTaskSkuTagModel();
			takeStockOrderTaskSkuTagModel.setBError(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].BError"));
			takeStockOrderTaskSkuTagModel.setEpc(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].Epc"));
			takeStockOrderTaskSkuTagModel.setOperateQuantity(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].OperateQuantity"));
			takeStockOrderTaskSkuTagModel.setBarcodeId(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].BarcodeId"));
			takeStockOrderTaskSkuTagModel.setBarcode(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].Barcode"));
			takeStockOrderTaskSkuTagModel.setTakeStockOrderId(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].TakeStockOrderId"));
			takeStockOrderTaskSkuTagModel.setTakeStockTaskId(_ctx.stringValue("ListTakeStockOrderTaskSkuTagsResponse.TakeStockOrderTaskSkuTags["+ i +"].TakeStockTaskId"));

			takeStockOrderTaskSkuTags.add(takeStockOrderTaskSkuTagModel);
		}
		listTakeStockOrderTaskSkuTagsResponse.setTakeStockOrderTaskSkuTags(takeStockOrderTaskSkuTags);

		List<TaskSkuTagSummaryModel> taskSkuTagSummarys = new ArrayList<TaskSkuTagSummaryModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrderTaskSkuTagsResponse.TaskSkuTagSummarys.Length"); i++) {
			TaskSkuTagSummaryModel taskSkuTagSummaryModel = new TaskSkuTagSummaryModel();
			taskSkuTagSummaryModel.setScanQuantity(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TaskSkuTagSummarys["+ i +"].ScanQuantity"));
			taskSkuTagSummaryModel.setRfidQuantity(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TaskSkuTagSummarys["+ i +"].RfidQuantity"));
			taskSkuTagSummaryModel.setTotalQuantity(_ctx.integerValue("ListTakeStockOrderTaskSkuTagsResponse.TaskSkuTagSummarys["+ i +"].TotalQuantity"));

			taskSkuTagSummarys.add(taskSkuTagSummaryModel);
		}
		listTakeStockOrderTaskSkuTagsResponse.setTaskSkuTagSummarys(taskSkuTagSummarys);
	 
	 	return listTakeStockOrderTaskSkuTagsResponse;
	}
}