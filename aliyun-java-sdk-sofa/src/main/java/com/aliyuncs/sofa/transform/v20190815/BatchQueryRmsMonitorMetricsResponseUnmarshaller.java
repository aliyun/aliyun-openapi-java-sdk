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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result.ListItem;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result.ListItem.Value;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result.ListItem.Value.DatasItem;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result.ListItem.Value.DatasItem.DpsItem;
import com.aliyuncs.sofa.model.v20190815.BatchQueryRmsMonitorMetricsResponse.Result.ListItem.Value.DatasItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryRmsMonitorMetricsResponseUnmarshaller {

	public static BatchQueryRmsMonitorMetricsResponse unmarshall(BatchQueryRmsMonitorMetricsResponse batchQueryRmsMonitorMetricsResponse, UnmarshallerContext _ctx) {
		
		batchQueryRmsMonitorMetricsResponse.setRequestId(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.RequestId"));
		batchQueryRmsMonitorMetricsResponse.setResultCode(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.ResultCode"));
		batchQueryRmsMonitorMetricsResponse.setResultMessage(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.ResultMessage"));

		Result result = new Result();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryRmsMonitorMetricsResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setKey(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Key"));

			Value value = new Value();
			value.setErrMsg(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.ErrMsg"));
			value.setSuccess(_ctx.booleanValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Success"));

			List<DatasItem> datas = new ArrayList<DatasItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas.Length"); j++) {
				DatasItem datasItem = new DatasItem();
				datasItem.setMetric(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Metric"));

				List<DpsItem> dps = new ArrayList<DpsItem>();
				for (int k = 0; k < _ctx.lengthValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Dps.Length"); k++) {
					DpsItem dpsItem = new DpsItem();
					dpsItem.setKey(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Dps["+ k +"].Key"));
					dpsItem.setValue(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Dps["+ k +"].Value"));

					dps.add(dpsItem);
				}
				datasItem.setDps(dps);

				List<TagsItem> tags = new ArrayList<TagsItem>();
				for (int k = 0; k < _ctx.lengthValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Tags.Length"); k++) {
					TagsItem tagsItem = new TagsItem();
					tagsItem.setKey(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Tags["+ k +"].Key"));
					tagsItem.setValue(_ctx.stringValue("BatchQueryRmsMonitorMetricsResponse.Result.List["+ i +"].Value.Datas["+ j +"].Tags["+ k +"].Value"));

					tags.add(tagsItem);
				}
				datasItem.setTags(tags);

				datas.add(datasItem);
			}
			value.setDatas(datas);
			listItem.setValue(value);

			list.add(listItem);
		}
		result.setList(list);
		batchQueryRmsMonitorMetricsResponse.setResult(result);
	 
	 	return batchQueryRmsMonitorMetricsResponse;
	}
}