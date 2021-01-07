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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse;
import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse.FilteringAlgorithm;
import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse.FilteringAlgorithm.Meta;
import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse.FilteringAlgorithm.Meta.ExtInfo;
import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse.FilteringAlgorithm.Meta.Threshold;
import com.aliyuncs.airec.model.v20201126.ListFilteringAlgorithmsResponse.Headers;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFilteringAlgorithmsResponseUnmarshaller {

	public static ListFilteringAlgorithmsResponse unmarshall(ListFilteringAlgorithmsResponse listFilteringAlgorithmsResponse, UnmarshallerContext _ctx) {
		
		listFilteringAlgorithmsResponse.setRequestId(_ctx.stringValue("ListFilteringAlgorithmsResponse.requestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListFilteringAlgorithmsResponse.headers.X-Total-Count"));
		listFilteringAlgorithmsResponse.setHeaders(headers);

		List<FilteringAlgorithm> result = new ArrayList<FilteringAlgorithm>();
		for (int i = 0; i < _ctx.lengthValue("ListFilteringAlgorithmsResponse.result.Length"); i++) {
			FilteringAlgorithm filteringAlgorithm = new FilteringAlgorithm();
			filteringAlgorithm.setStatus(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].status"));
			filteringAlgorithm.setGmtCreate(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].gmtCreate"));
			filteringAlgorithm.setGmtModified(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].gmtModified"));
			filteringAlgorithm.setAlgorithmId(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].algorithmId"));

			Meta meta = new Meta();
			meta.setMetaType(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.metaType"));
			meta.setAlgorithmName(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.algorithmName"));
			meta.setCron(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.cron"));
			meta.setCronEnabled(_ctx.booleanValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.cronEnabled"));
			meta.setTaskId(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.taskId"));
			meta.setProjectName(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.projectName"));
			meta.setTableName(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.tableName"));
			meta.setType(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.type"));
			meta.setCategory(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.category"));
			meta.setClusterId(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.clusterId"));
			meta.setDescription(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.description"));

			ExtInfo extInfo = new ExtInfo();
			extInfo.setItemSeparator(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.extInfo.itemSeparator"));
			extInfo.setKvSeparator(_ctx.stringValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.extInfo.kvSeparator"));
			meta.setExtInfo(extInfo);

			Threshold threshold = new Threshold();
			threshold.setIndexLossThreshold(_ctx.integerValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.threshold.indexLossThreshold"));
			threshold.setIndexSizeThreshold(_ctx.integerValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.threshold.indexSizeThreshold"));
			threshold.setSourceDataSizeThreshold(_ctx.integerValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.threshold.sourceDataSizeThreshold"));
			threshold.setSourceDataRecordThreshold(_ctx.integerValue("ListFilteringAlgorithmsResponse.result["+ i +"].meta.threshold.sourceDataRecordThreshold"));
			meta.setThreshold(threshold);
			filteringAlgorithm.setMeta(meta);

			result.add(filteringAlgorithm);
		}
		listFilteringAlgorithmsResponse.setResult(result);
	 
	 	return listFilteringAlgorithmsResponse;
	}
}