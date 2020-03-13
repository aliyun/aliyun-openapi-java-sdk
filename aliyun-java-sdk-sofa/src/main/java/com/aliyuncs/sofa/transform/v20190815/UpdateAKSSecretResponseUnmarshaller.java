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

import com.aliyuncs.sofa.model.v20190815.UpdateAKSSecretResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSSecretResponse.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSSecretResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSSecretResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAKSSecretResponseUnmarshaller {

	public static UpdateAKSSecretResponse unmarshall(UpdateAKSSecretResponse updateAKSSecretResponse, UnmarshallerContext _ctx) {
		
		updateAKSSecretResponse.setRequestId(_ctx.stringValue("UpdateAKSSecretResponse.RequestId"));
		updateAKSSecretResponse.setResultCode(_ctx.stringValue("UpdateAKSSecretResponse.ResultCode"));
		updateAKSSecretResponse.setResultMessage(_ctx.stringValue("UpdateAKSSecretResponse.ResultMessage"));
		updateAKSSecretResponse.setCreationTimeStamp(_ctx.stringValue("UpdateAKSSecretResponse.CreationTimeStamp"));
		updateAKSSecretResponse.setName(_ctx.stringValue("UpdateAKSSecretResponse.Name"));
		updateAKSSecretResponse.setNamespace(_ctx.stringValue("UpdateAKSSecretResponse.Namespace"));
		updateAKSSecretResponse.setType(_ctx.stringValue("UpdateAKSSecretResponse.Type"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSSecretResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("UpdateAKSSecretResponse.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("UpdateAKSSecretResponse.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		updateAKSSecretResponse.setAnnotations(annotations);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSSecretResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("UpdateAKSSecretResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("UpdateAKSSecretResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		updateAKSSecretResponse.setData(data);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSSecretResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("UpdateAKSSecretResponse.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("UpdateAKSSecretResponse.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		updateAKSSecretResponse.setLabels(labels);
	 
	 	return updateAKSSecretResponse;
	}
}