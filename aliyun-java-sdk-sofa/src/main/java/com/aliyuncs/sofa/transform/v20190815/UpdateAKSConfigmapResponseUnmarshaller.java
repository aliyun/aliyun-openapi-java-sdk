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

import com.aliyuncs.sofa.model.v20190815.UpdateAKSConfigmapResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSConfigmapResponse.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSConfigmapResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSConfigmapResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAKSConfigmapResponseUnmarshaller {

	public static UpdateAKSConfigmapResponse unmarshall(UpdateAKSConfigmapResponse updateAKSConfigmapResponse, UnmarshallerContext _ctx) {
		
		updateAKSConfigmapResponse.setRequestId(_ctx.stringValue("UpdateAKSConfigmapResponse.RequestId"));
		updateAKSConfigmapResponse.setResultCode(_ctx.stringValue("UpdateAKSConfigmapResponse.ResultCode"));
		updateAKSConfigmapResponse.setResultMessage(_ctx.stringValue("UpdateAKSConfigmapResponse.ResultMessage"));
		updateAKSConfigmapResponse.setCreationTimeStamp(_ctx.stringValue("UpdateAKSConfigmapResponse.CreationTimeStamp"));
		updateAKSConfigmapResponse.setName(_ctx.stringValue("UpdateAKSConfigmapResponse.Name"));
		updateAKSConfigmapResponse.setNamespace(_ctx.stringValue("UpdateAKSConfigmapResponse.Namespace"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSConfigmapResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("UpdateAKSConfigmapResponse.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("UpdateAKSConfigmapResponse.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		updateAKSConfigmapResponse.setAnnotations(annotations);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSConfigmapResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("UpdateAKSConfigmapResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("UpdateAKSConfigmapResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		updateAKSConfigmapResponse.setData(data);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSConfigmapResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("UpdateAKSConfigmapResponse.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("UpdateAKSConfigmapResponse.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		updateAKSConfigmapResponse.setLabels(labels);
	 
	 	return updateAKSConfigmapResponse;
	}
}