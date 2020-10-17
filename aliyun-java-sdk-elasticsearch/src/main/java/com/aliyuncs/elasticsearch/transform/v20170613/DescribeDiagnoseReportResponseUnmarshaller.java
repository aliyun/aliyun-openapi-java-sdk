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

import com.aliyuncs.elasticsearch.model.v20170613.DescribeDiagnoseReportResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeDiagnoseReportResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeDiagnoseReportResponse.Result.DiagnoseItemsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeDiagnoseReportResponse.Result.DiagnoseItemsItem.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnoseReportResponseUnmarshaller {

	public static DescribeDiagnoseReportResponse unmarshall(DescribeDiagnoseReportResponse describeDiagnoseReportResponse, UnmarshallerContext _ctx) {
		
		describeDiagnoseReportResponse.setRequestId(_ctx.stringValue("DescribeDiagnoseReportResponse.RequestId"));

		Result result = new Result();
		result.setReportId(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.reportId"));
		result.setInstanceId(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.instanceId"));
		result.setState(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.state"));
		result.setCreateTime(_ctx.longValue("DescribeDiagnoseReportResponse.Result.createTime"));
		result.setHealth(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.health"));
		result.setTrigger(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.trigger"));

		List<DiagnoseItemsItem> diagnoseItems = new ArrayList<DiagnoseItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnoseReportResponse.Result.diagnoseItems.Length"); i++) {
			DiagnoseItemsItem diagnoseItemsItem = new DiagnoseItemsItem();
			diagnoseItemsItem.setItem(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].item"));
			diagnoseItemsItem.setHealth(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].health"));

			Detail detail = new Detail();
			detail.setName(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].detail.name"));
			detail.setDesc(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].detail.desc"));
			detail.setType(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].detail.type"));
			detail.setSuggest(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].detail.suggest"));
			detail.setResult(_ctx.stringValue("DescribeDiagnoseReportResponse.Result.diagnoseItems["+ i +"].detail.result"));
			diagnoseItemsItem.setDetail(detail);

			diagnoseItems.add(diagnoseItemsItem);
		}
		result.setDiagnoseItems(diagnoseItems);
		describeDiagnoseReportResponse.setResult(result);
	 
	 	return describeDiagnoseReportResponse;
	}
}