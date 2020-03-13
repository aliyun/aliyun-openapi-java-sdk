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

import com.aliyuncs.sofa.model.v20190815.UpdateAKSClusterNamespaceResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSClusterNamespaceResponse.Namespace;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSClusterNamespaceResponse.Namespace.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateAKSClusterNamespaceResponse.Namespace.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAKSClusterNamespaceResponseUnmarshaller {

	public static UpdateAKSClusterNamespaceResponse unmarshall(UpdateAKSClusterNamespaceResponse updateAKSClusterNamespaceResponse, UnmarshallerContext _ctx) {
		
		updateAKSClusterNamespaceResponse.setRequestId(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.RequestId"));
		updateAKSClusterNamespaceResponse.setResultCode(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.ResultCode"));
		updateAKSClusterNamespaceResponse.setResultMessage(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.ResultMessage"));

		Namespace namespace = new Namespace();
		namespace.setClusterId(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.ClusterId"));
		namespace.setCreateTime(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.CreateTime"));
		namespace.setName(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.Name"));
		namespace.setRegionId(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.RegionId"));
		namespace.setState(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.State"));
		namespace.setTenantId(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.TenantId"));
		namespace.setWorkspaceId(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.WorkspaceId"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSClusterNamespaceResponse.Namespace.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		namespace.setAnnotations(annotations);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAKSClusterNamespaceResponse.Namespace.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("UpdateAKSClusterNamespaceResponse.Namespace.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		namespace.setLabels(labels);
		updateAKSClusterNamespaceResponse.setNamespace(namespace);
	 
	 	return updateAKSClusterNamespaceResponse;
	}
}