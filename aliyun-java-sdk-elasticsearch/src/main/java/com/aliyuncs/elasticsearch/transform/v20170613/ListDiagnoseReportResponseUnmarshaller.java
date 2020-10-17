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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportResponse.ResultItem.DiagnoseItemsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListDiagnoseReportResponse.ResultItem.DiagnoseItemsItem.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiagnoseReportResponseUnmarshaller {

	public static ListDiagnoseReportResponse unmarshall(ListDiagnoseReportResponse listDiagnoseReportResponse, UnmarshallerContext _ctx) {
		
		listDiagnoseReportResponse.setRequestId(_ctx.stringValue("ListDiagnoseReportResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListDiagnoseReportResponse.Headers.X-Total-Count"));
		listDiagnoseReportResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDiagnoseReportResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setReportId(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].reportId"));
			resultItem.setInstanceId(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].instanceId"));
			resultItem.setState(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].state"));
			resultItem.setTrigger(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].trigger"));
			resultItem.setHealth(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].health"));
			resultItem.setCreateTime(_ctx.longValue("ListDiagnoseReportResponse.Result["+ i +"].createTime"));

			List<DiagnoseItemsItem> diagnoseItems = new ArrayList<DiagnoseItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems.Length"); j++) {
				DiagnoseItemsItem diagnoseItemsItem = new DiagnoseItemsItem();
				diagnoseItemsItem.setItem(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].item"));
				diagnoseItemsItem.setHealth(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].health"));

				Detail detail = new Detail();
				detail.setName(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].detail.name"));
				detail.setDesc(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].detail.desc"));
				detail.setType(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].detail.type"));
				detail.setSuggest(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].detail.suggest"));
				detail.setResult(_ctx.stringValue("ListDiagnoseReportResponse.Result["+ i +"].diagnoseItems["+ j +"].detail.result"));
				diagnoseItemsItem.setDetail(detail);

				diagnoseItems.add(diagnoseItemsItem);
			}
			resultItem.setDiagnoseItems(diagnoseItems);

			result.add(resultItem);
		}
		listDiagnoseReportResponse.setResult(result);
	 
	 	return listDiagnoseReportResponse;
	}
}