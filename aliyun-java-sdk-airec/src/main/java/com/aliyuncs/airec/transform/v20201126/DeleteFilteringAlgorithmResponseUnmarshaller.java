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

import com.aliyuncs.airec.model.v20201126.DeleteFilteringAlgorithmResponse;
import com.aliyuncs.airec.model.v20201126.DeleteFilteringAlgorithmResponse.Result;
import com.aliyuncs.airec.model.v20201126.DeleteFilteringAlgorithmResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.DeleteFilteringAlgorithmResponse.Result.Meta.ExtInfo;
import com.aliyuncs.airec.model.v20201126.DeleteFilteringAlgorithmResponse.Result.Meta.Threshold;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteFilteringAlgorithmResponseUnmarshaller {

	public static DeleteFilteringAlgorithmResponse unmarshall(DeleteFilteringAlgorithmResponse deleteFilteringAlgorithmResponse, UnmarshallerContext _ctx) {
		
		deleteFilteringAlgorithmResponse.setRequestId(_ctx.stringValue("DeleteFilteringAlgorithmResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.gmtModified"));
		result.setAlgorithmId(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.algorithmId"));

		Meta meta = new Meta();
		meta.setMetaType(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.metaType"));
		meta.setAlgorithmName(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.algorithmName"));
		meta.setCron(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.cron"));
		meta.setCronEnabled(_ctx.booleanValue("DeleteFilteringAlgorithmResponse.result.meta.cronEnabled"));
		meta.setTaskId(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.taskId"));
		meta.setProjectName(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.projectName"));
		meta.setTableName(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.tableName"));
		meta.setType(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.type"));
		meta.setCategory(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.category"));
		meta.setClusterId(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.clusterId"));
		meta.setDescription(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.description"));

		ExtInfo extInfo = new ExtInfo();
		extInfo.setItemSeparator(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.extInfo.itemSeparator"));
		extInfo.setKvSeparator(_ctx.stringValue("DeleteFilteringAlgorithmResponse.result.meta.extInfo.kvSeparator"));
		meta.setExtInfo(extInfo);

		Threshold threshold = new Threshold();
		threshold.setIndexLossThreshold(_ctx.integerValue("DeleteFilteringAlgorithmResponse.result.meta.threshold.indexLossThreshold"));
		threshold.setIndexSizeThreshold(_ctx.integerValue("DeleteFilteringAlgorithmResponse.result.meta.threshold.indexSizeThreshold"));
		threshold.setSourceDataSizeThreshold(_ctx.integerValue("DeleteFilteringAlgorithmResponse.result.meta.threshold.sourceDataSizeThreshold"));
		threshold.setSourceDataRecordThreshold(_ctx.integerValue("DeleteFilteringAlgorithmResponse.result.meta.threshold.sourceDataRecordThreshold"));
		meta.setThreshold(threshold);
		result.setMeta(meta);
		deleteFilteringAlgorithmResponse.setResult(result);
	 
	 	return deleteFilteringAlgorithmResponse;
	}
}