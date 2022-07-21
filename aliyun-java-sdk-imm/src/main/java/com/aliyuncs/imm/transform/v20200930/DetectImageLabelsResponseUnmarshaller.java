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

import com.aliyuncs.imm.model.v20200930.DetectImageLabelsResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageLabelsResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageLabelsResponseUnmarshaller {

	public static DetectImageLabelsResponse unmarshall(DetectImageLabelsResponse detectImageLabelsResponse, UnmarshallerContext _ctx) {
		
		detectImageLabelsResponse.setRequestId(_ctx.stringValue("DetectImageLabelsResponse.RequestId"));

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageLabelsResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setLanguage(_ctx.stringValue("DetectImageLabelsResponse.Labels["+ i +"].Language"));
			labelsItem.setLabelName(_ctx.stringValue("DetectImageLabelsResponse.Labels["+ i +"].LabelName"));
			labelsItem.setLabelLevel(_ctx.longValue("DetectImageLabelsResponse.Labels["+ i +"].LabelLevel"));
			labelsItem.setLabelConfidence(_ctx.floatValue("DetectImageLabelsResponse.Labels["+ i +"].LabelConfidence"));
			labelsItem.setParentLabelName(_ctx.stringValue("DetectImageLabelsResponse.Labels["+ i +"].ParentLabelName"));
			labelsItem.setCentricScore(_ctx.floatValue("DetectImageLabelsResponse.Labels["+ i +"].CentricScore"));

			labels.add(labelsItem);
		}
		detectImageLabelsResponse.setLabels(labels);
	 
	 	return detectImageLabelsResponse;
	}
}