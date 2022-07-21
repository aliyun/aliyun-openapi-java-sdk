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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetDetectVideoLabelsResultResponse;
import com.aliyuncs.imm.model.v20200930.GetDetectVideoLabelsResultResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectVideoLabelsResultResponseUnmarshaller {

	public static GetDetectVideoLabelsResultResponse unmarshall(GetDetectVideoLabelsResultResponse getDetectVideoLabelsResultResponse, UnmarshallerContext _ctx) {
		
		getDetectVideoLabelsResultResponse.setRequestId(_ctx.stringValue("GetDetectVideoLabelsResultResponse.RequestId"));
		getDetectVideoLabelsResultResponse.setProjectName(_ctx.stringValue("GetDetectVideoLabelsResultResponse.ProjectName"));
		getDetectVideoLabelsResultResponse.setEventId(_ctx.stringValue("GetDetectVideoLabelsResultResponse.EventId"));
		getDetectVideoLabelsResultResponse.setStatus(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Status"));
		getDetectVideoLabelsResultResponse.setCode(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Code"));
		getDetectVideoLabelsResultResponse.setMessage(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Message"));
		getDetectVideoLabelsResultResponse.setStartTime(_ctx.stringValue("GetDetectVideoLabelsResultResponse.StartTime"));
		getDetectVideoLabelsResultResponse.setEndTime(_ctx.stringValue("GetDetectVideoLabelsResultResponse.EndTime"));
		getDetectVideoLabelsResultResponse.setUserData(_ctx.stringValue("GetDetectVideoLabelsResultResponse.UserData"));
		getDetectVideoLabelsResultResponse.setTaskType(_ctx.stringValue("GetDetectVideoLabelsResultResponse.TaskType"));
		getDetectVideoLabelsResultResponse.setTaskId(_ctx.stringValue("GetDetectVideoLabelsResultResponse.TaskId"));

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDetectVideoLabelsResultResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setLanguage(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].Language"));
			labelsItem.setLabelName(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].LabelName"));
			labelsItem.setLabelLevel(_ctx.longValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].LabelLevel"));
			labelsItem.setLabelConfidence(_ctx.floatValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].LabelConfidence"));
			labelsItem.setParentLabelName(_ctx.stringValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].ParentLabelName"));
			labelsItem.setCentricScore(_ctx.floatValue("GetDetectVideoLabelsResultResponse.Labels["+ i +"].CentricScore"));

			labels.add(labelsItem);
		}
		getDetectVideoLabelsResultResponse.setLabels(labels);
	 
	 	return getDetectVideoLabelsResultResponse;
	}
}