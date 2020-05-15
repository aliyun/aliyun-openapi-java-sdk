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

import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretImagepullResponse;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretImagepullResponse.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretImagepullResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretImagepullResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAKSSecretImagepullResponseUnmarshaller {

	public static CreateAKSSecretImagepullResponse unmarshall(CreateAKSSecretImagepullResponse createAKSSecretImagepullResponse, UnmarshallerContext _ctx) {
		
		createAKSSecretImagepullResponse.setRequestId(_ctx.stringValue("CreateAKSSecretImagepullResponse.RequestId"));
		createAKSSecretImagepullResponse.setResultCode(_ctx.stringValue("CreateAKSSecretImagepullResponse.ResultCode"));
		createAKSSecretImagepullResponse.setResultMessage(_ctx.stringValue("CreateAKSSecretImagepullResponse.ResultMessage"));
		createAKSSecretImagepullResponse.setCreationTimeStamp(_ctx.stringValue("CreateAKSSecretImagepullResponse.CreationTimeStamp"));
		createAKSSecretImagepullResponse.setId(_ctx.stringValue("CreateAKSSecretImagepullResponse.Id"));
		createAKSSecretImagepullResponse.setName(_ctx.stringValue("CreateAKSSecretImagepullResponse.Name"));
		createAKSSecretImagepullResponse.setNamespace(_ctx.stringValue("CreateAKSSecretImagepullResponse.Namespace"));
		createAKSSecretImagepullResponse.setType(_ctx.stringValue("CreateAKSSecretImagepullResponse.Type"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretImagepullResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("CreateAKSSecretImagepullResponse.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("CreateAKSSecretImagepullResponse.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		createAKSSecretImagepullResponse.setAnnotations(annotations);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretImagepullResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("CreateAKSSecretImagepullResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("CreateAKSSecretImagepullResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		createAKSSecretImagepullResponse.setData(data);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretImagepullResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("CreateAKSSecretImagepullResponse.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("CreateAKSSecretImagepullResponse.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		createAKSSecretImagepullResponse.setLabels(labels);
	 
	 	return createAKSSecretImagepullResponse;
	}
}