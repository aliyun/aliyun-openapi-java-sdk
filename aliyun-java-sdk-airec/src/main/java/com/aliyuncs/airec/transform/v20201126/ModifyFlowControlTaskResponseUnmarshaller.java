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

import com.aliyuncs.airec.model.v20201126.ModifyFlowControlTaskResponse;
import com.aliyuncs.airec.model.v20201126.ModifyFlowControlTaskResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifyFlowControlTaskResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.ModifyFlowControlTaskResponse.Result.Meta.SelectionParamsItem;
import com.aliyuncs.airec.model.v20201126.ModifyFlowControlTaskResponse.Result.Meta.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFlowControlTaskResponseUnmarshaller {

	public static ModifyFlowControlTaskResponse unmarshall(ModifyFlowControlTaskResponse modifyFlowControlTaskResponse, UnmarshallerContext _ctx) {
		
		modifyFlowControlTaskResponse.setRequestId(_ctx.stringValue("ModifyFlowControlTaskResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("ModifyFlowControlTaskResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyFlowControlTaskResponse.result.gmtModified"));
		result.setStatus(_ctx.stringValue("ModifyFlowControlTaskResponse.result.status"));
		result.setTaskId(_ctx.stringValue("ModifyFlowControlTaskResponse.result.TaskId"));

		Meta meta = new Meta();
		meta.setDescription(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.description"));
		meta.setEndTime(_ctx.longValue("ModifyFlowControlTaskResponse.result.meta.endTime"));
		meta.setMetaType(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.metaType"));
		meta.setSceneIds(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.sceneIds"));
		meta.setStartTime(_ctx.longValue("ModifyFlowControlTaskResponse.result.meta.startTime"));
		meta.setTaskName(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.taskName"));

		Target target = new Target();
		target.setType(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.target.type"));
		target.setValue(_ctx.longValue("ModifyFlowControlTaskResponse.result.meta.target.value"));
		meta.setTarget(target);

		List<SelectionParamsItem> selectionParams = new ArrayList<SelectionParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyFlowControlTaskResponse.result.meta.selectionParams.Length"); i++) {
			SelectionParamsItem selectionParamsItem = new SelectionParamsItem();
			selectionParamsItem.setSelectType(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.selectionParams["+ i +"].selectType"));
			selectionParamsItem.setSelectValue(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.selectionParams["+ i +"].selectValue"));
			selectionParamsItem.setSelectionOperation(_ctx.stringValue("ModifyFlowControlTaskResponse.result.meta.selectionParams["+ i +"].selectionOperation"));

			selectionParams.add(selectionParamsItem);
		}
		meta.setSelectionParams(selectionParams);
		result.setMeta(meta);
		modifyFlowControlTaskResponse.setResult(result);
	 
	 	return modifyFlowControlTaskResponse;
	}
}