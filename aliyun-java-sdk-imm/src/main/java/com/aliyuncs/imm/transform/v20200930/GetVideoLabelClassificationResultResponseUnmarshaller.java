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

import com.aliyuncs.imm.model.v20200930.GetVideoLabelClassificationResultResponse;
import com.aliyuncs.imm.model.v20200930.GetVideoLabelClassificationResultResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoLabelClassificationResultResponseUnmarshaller {

	public static GetVideoLabelClassificationResultResponse unmarshall(GetVideoLabelClassificationResultResponse getVideoLabelClassificationResultResponse, UnmarshallerContext _ctx) {
		
		getVideoLabelClassificationResultResponse.setRequestId(_ctx.stringValue("GetVideoLabelClassificationResultResponse.RequestId"));
		getVideoLabelClassificationResultResponse.setProjectName(_ctx.stringValue("GetVideoLabelClassificationResultResponse.ProjectName"));
		getVideoLabelClassificationResultResponse.setEventId(_ctx.stringValue("GetVideoLabelClassificationResultResponse.EventId"));
		getVideoLabelClassificationResultResponse.setStatus(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Status"));
		getVideoLabelClassificationResultResponse.setCode(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Code"));
		getVideoLabelClassificationResultResponse.setMessage(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Message"));
		getVideoLabelClassificationResultResponse.setStartTime(_ctx.stringValue("GetVideoLabelClassificationResultResponse.StartTime"));
		getVideoLabelClassificationResultResponse.setEndTime(_ctx.stringValue("GetVideoLabelClassificationResultResponse.EndTime"));
		getVideoLabelClassificationResultResponse.setUserData(_ctx.stringValue("GetVideoLabelClassificationResultResponse.UserData"));
		getVideoLabelClassificationResultResponse.setTaskType(_ctx.stringValue("GetVideoLabelClassificationResultResponse.TaskType"));
		getVideoLabelClassificationResultResponse.setTaskId(_ctx.stringValue("GetVideoLabelClassificationResultResponse.TaskId"));

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoLabelClassificationResultResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setLanguage(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].Language"));
			labelsItem.setLabelName(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].LabelName"));
			labelsItem.setLabelLevel(_ctx.longValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].LabelLevel"));
			labelsItem.setLabelConfidence(_ctx.floatValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].LabelConfidence"));
			labelsItem.setParentLabelName(_ctx.stringValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].ParentLabelName"));
			labelsItem.setCentricScore(_ctx.floatValue("GetVideoLabelClassificationResultResponse.Labels["+ i +"].CentricScore"));

			labels.add(labelsItem);
		}
		getVideoLabelClassificationResultResponse.setLabels(labels);
	 
	 	return getVideoLabelClassificationResultResponse;
	}
}