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

import com.aliyuncs.sofa.model.v20190815.CreateAKSConfigmapResponse;
import com.aliyuncs.sofa.model.v20190815.CreateAKSConfigmapResponse.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSConfigmapResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSConfigmapResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAKSConfigmapResponseUnmarshaller {

	public static CreateAKSConfigmapResponse unmarshall(CreateAKSConfigmapResponse createAKSConfigmapResponse, UnmarshallerContext _ctx) {
		
		createAKSConfigmapResponse.setRequestId(_ctx.stringValue("CreateAKSConfigmapResponse.RequestId"));
		createAKSConfigmapResponse.setResultCode(_ctx.stringValue("CreateAKSConfigmapResponse.ResultCode"));
		createAKSConfigmapResponse.setResultMessage(_ctx.stringValue("CreateAKSConfigmapResponse.ResultMessage"));
		createAKSConfigmapResponse.setCreationTimeStamp(_ctx.stringValue("CreateAKSConfigmapResponse.CreationTimeStamp"));
		createAKSConfigmapResponse.setName(_ctx.stringValue("CreateAKSConfigmapResponse.Name"));
		createAKSConfigmapResponse.setNamespace(_ctx.stringValue("CreateAKSConfigmapResponse.Namespace"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSConfigmapResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("CreateAKSConfigmapResponse.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("CreateAKSConfigmapResponse.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		createAKSConfigmapResponse.setAnnotations(annotations);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSConfigmapResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("CreateAKSConfigmapResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("CreateAKSConfigmapResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		createAKSConfigmapResponse.setData(data);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSConfigmapResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("CreateAKSConfigmapResponse.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("CreateAKSConfigmapResponse.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		createAKSConfigmapResponse.setLabels(labels);
	 
	 	return createAKSConfigmapResponse;
	}
}