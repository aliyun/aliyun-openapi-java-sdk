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

import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretResponse;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretResponse.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.CreateAKSSecretResponse.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAKSSecretResponseUnmarshaller {

	public static CreateAKSSecretResponse unmarshall(CreateAKSSecretResponse createAKSSecretResponse, UnmarshallerContext _ctx) {
		
		createAKSSecretResponse.setRequestId(_ctx.stringValue("CreateAKSSecretResponse.RequestId"));
		createAKSSecretResponse.setResultCode(_ctx.stringValue("CreateAKSSecretResponse.ResultCode"));
		createAKSSecretResponse.setResultMessage(_ctx.stringValue("CreateAKSSecretResponse.ResultMessage"));
		createAKSSecretResponse.setCreationTimeStamp(_ctx.stringValue("CreateAKSSecretResponse.CreationTimeStamp"));
		createAKSSecretResponse.setName(_ctx.stringValue("CreateAKSSecretResponse.Name"));
		createAKSSecretResponse.setNamespace(_ctx.stringValue("CreateAKSSecretResponse.Namespace"));
		createAKSSecretResponse.setType(_ctx.stringValue("CreateAKSSecretResponse.Type"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretResponse.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("CreateAKSSecretResponse.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("CreateAKSSecretResponse.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		createAKSSecretResponse.setAnnotations(annotations);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("CreateAKSSecretResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("CreateAKSSecretResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		createAKSSecretResponse.setData(data);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAKSSecretResponse.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("CreateAKSSecretResponse.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("CreateAKSSecretResponse.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		createAKSSecretResponse.setLabels(labels);
	 
	 	return createAKSSecretResponse;
	}
}