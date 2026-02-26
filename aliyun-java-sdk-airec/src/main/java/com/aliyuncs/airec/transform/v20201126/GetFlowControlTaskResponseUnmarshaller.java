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

import com.aliyuncs.airec.model.v20201126.GetFlowControlTaskResponse;
import com.aliyuncs.airec.model.v20201126.GetFlowControlTaskResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.GetFlowControlTaskResponse.ResultItem.Meta;
import com.aliyuncs.airec.model.v20201126.GetFlowControlTaskResponse.ResultItem.Meta.SelectionParamsItem;
import com.aliyuncs.airec.model.v20201126.GetFlowControlTaskResponse.ResultItem.Meta.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowControlTaskResponseUnmarshaller {

	public static GetFlowControlTaskResponse unmarshall(GetFlowControlTaskResponse getFlowControlTaskResponse, UnmarshallerContext _ctx) {
		
		getFlowControlTaskResponse.setRequestId(_ctx.stringValue("GetFlowControlTaskResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFlowControlTaskResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGmtCreate(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].gmtModified"));
			resultItem.setStatus(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].status"));
			resultItem.setTaskId(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].taskId"));

			Meta meta = new Meta();
			meta.setDescription(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.description"));
			meta.setEndTime(_ctx.longValue("GetFlowControlTaskResponse.result["+ i +"].meta.endTime"));
			meta.setMetaType(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.metaType"));
			meta.setSceneIds(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.sceneIds"));
			meta.setStartTime(_ctx.longValue("GetFlowControlTaskResponse.result["+ i +"].meta.startTime"));
			meta.setTaskName(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.taskName"));

			Target target = new Target();
			target.setType(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.target.type"));
			target.setValue(_ctx.longValue("GetFlowControlTaskResponse.result["+ i +"].meta.target.value"));
			meta.setTarget(target);

			List<SelectionParamsItem> selectionParams = new ArrayList<SelectionParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetFlowControlTaskResponse.result["+ i +"].meta.selectionParams.Length"); j++) {
				SelectionParamsItem selectionParamsItem = new SelectionParamsItem();
				selectionParamsItem.setSelectType(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.selectionParams["+ j +"].selectType"));
				selectionParamsItem.setSelectValue(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.selectionParams["+ j +"].selectValue"));
				selectionParamsItem.setSelectionOperation(_ctx.stringValue("GetFlowControlTaskResponse.result["+ i +"].meta.selectionParams["+ j +"].selectionOperation"));

				selectionParams.add(selectionParamsItem);
			}
			meta.setSelectionParams(selectionParams);
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		getFlowControlTaskResponse.setResult(result);
	 
	 	return getFlowControlTaskResponse;
	}
}