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

import com.aliyuncs.sofa.model.v20190815.QueryAKSClusterNamespaceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryAKSClusterNamespaceResponse.NamespacesItem;
import com.aliyuncs.sofa.model.v20190815.QueryAKSClusterNamespaceResponse.NamespacesItem.AnnotationsItem;
import com.aliyuncs.sofa.model.v20190815.QueryAKSClusterNamespaceResponse.NamespacesItem.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAKSClusterNamespaceResponseUnmarshaller {

	public static QueryAKSClusterNamespaceResponse unmarshall(QueryAKSClusterNamespaceResponse queryAKSClusterNamespaceResponse, UnmarshallerContext _ctx) {
		
		queryAKSClusterNamespaceResponse.setRequestId(_ctx.stringValue("QueryAKSClusterNamespaceResponse.RequestId"));
		queryAKSClusterNamespaceResponse.setResultCode(_ctx.stringValue("QueryAKSClusterNamespaceResponse.ResultCode"));
		queryAKSClusterNamespaceResponse.setResultMessage(_ctx.stringValue("QueryAKSClusterNamespaceResponse.ResultMessage"));

		List<NamespacesItem> namespaces = new ArrayList<NamespacesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAKSClusterNamespaceResponse.Namespaces.Length"); i++) {
			NamespacesItem namespacesItem = new NamespacesItem();
			namespacesItem.setClusterId(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].ClusterId"));
			namespacesItem.setCreateTime(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].CreateTime"));
			namespacesItem.setName(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Name"));
			namespacesItem.setRegionId(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].RegionId"));
			namespacesItem.setState(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].State"));
			namespacesItem.setTenantId(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].TenantId"));
			namespacesItem.setWorkspaceId(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].WorkspaceId"));

			List<AnnotationsItem> annotations = new ArrayList<AnnotationsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Annotations.Length"); j++) {
				AnnotationsItem annotationsItem = new AnnotationsItem();
				annotationsItem.setKey(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Annotations["+ j +"].Key"));
				annotationsItem.setValue(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Annotations["+ j +"].Value"));

				annotations.add(annotationsItem);
			}
			namespacesItem.setAnnotations(annotations);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setKey(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Labels["+ j +"].Key"));
				labelsItem.setValue(_ctx.stringValue("QueryAKSClusterNamespaceResponse.Namespaces["+ i +"].Labels["+ j +"].Value"));

				labels.add(labelsItem);
			}
			namespacesItem.setLabels(labels);

			namespaces.add(namespacesItem);
		}
		queryAKSClusterNamespaceResponse.setNamespaces(namespaces);
	 
	 	return queryAKSClusterNamespaceResponse;
	}
}