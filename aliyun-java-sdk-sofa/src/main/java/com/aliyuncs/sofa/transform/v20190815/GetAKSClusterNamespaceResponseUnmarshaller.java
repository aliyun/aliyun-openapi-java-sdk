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

import com.aliyuncs.sofa.model.v20190815.GetAKSClusterNamespaceResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSClusterNamespaceResponse.Namespace;
import com.aliyuncs.sofa.model.v20190815.GetAKSClusterNamespaceResponse.Namespace.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.GetAKSClusterNamespaceResponse.Namespace.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSClusterNamespaceResponseUnmarshaller {

	public static GetAKSClusterNamespaceResponse unmarshall(GetAKSClusterNamespaceResponse getAKSClusterNamespaceResponse, UnmarshallerContext _ctx) {
		
		getAKSClusterNamespaceResponse.setRequestId(_ctx.stringValue("GetAKSClusterNamespaceResponse.RequestId"));
		getAKSClusterNamespaceResponse.setResultCode(_ctx.stringValue("GetAKSClusterNamespaceResponse.ResultCode"));
		getAKSClusterNamespaceResponse.setResultMessage(_ctx.stringValue("GetAKSClusterNamespaceResponse.ResultMessage"));

		Namespace namespace = new Namespace();
		namespace.setClusterId(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.ClusterId"));
		namespace.setCreateTime(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.CreateTime"));
		namespace.setName(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.Name"));
		namespace.setRegionId(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.RegionId"));
		namespace.setState(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.State"));
		namespace.setTenantId(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.TenantId"));
		namespace.setWorkspaceId(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.WorkspaceId"));

		List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSClusterNamespaceResponse.Namespace.Annotations.Length"); i++) {
			AnnotationsItem annotationsItem = new AnnotationsItem();
			annotationsItem.setKey(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.Annotations["+ i +"].Key"));
			annotationsItem.setValue(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.Annotations["+ i +"].Value"));

			annotations.add(annotationsItem);
		}
		namespace.setAnnotations(annotations);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSClusterNamespaceResponse.Namespace.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.Labels["+ i +"].Key"));
			labelsItem.setValue(_ctx.stringValue("GetAKSClusterNamespaceResponse.Namespace.Labels["+ i +"].Value"));

			labels.add(labelsItem);
		}
		namespace.setLabels(labels);
		getAKSClusterNamespaceResponse.setNamespace(namespace);
	 
	 	return getAKSClusterNamespaceResponse;
	}
}