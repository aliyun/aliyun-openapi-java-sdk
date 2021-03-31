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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListK8sPvcResponse;
import com.aliyuncs.edas.model.v20170801.ListK8sPvcResponse.K8sPvcListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListK8sPvcResponseUnmarshaller {

	public static ListK8sPvcResponse unmarshall(ListK8sPvcResponse listK8sPvcResponse, UnmarshallerContext _ctx) {
		
		listK8sPvcResponse.setRequestId(_ctx.stringValue("ListK8sPvcResponse.RequestId"));
		listK8sPvcResponse.setCode(_ctx.integerValue("ListK8sPvcResponse.Code"));
		listK8sPvcResponse.setMessage(_ctx.stringValue("ListK8sPvcResponse.Message"));

		List<K8sPvcListItem> k8sPvcList = new ArrayList<K8sPvcListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListK8sPvcResponse.K8sPvcList.Length"); i++) {
			K8sPvcListItem k8sPvcListItem = new K8sPvcListItem();
			k8sPvcListItem.setName(_ctx.stringValue("ListK8sPvcResponse.K8sPvcList["+ i +"].Name"));
			k8sPvcListItem.setNamespace(_ctx.stringValue("ListK8sPvcResponse.K8sPvcList["+ i +"].Namespace"));
			k8sPvcListItem.setCreationTime(_ctx.stringValue("ListK8sPvcResponse.K8sPvcList["+ i +"].CreationTime"));
			k8sPvcListItem.setVolumeName(_ctx.stringValue("ListK8sPvcResponse.K8sPvcList["+ i +"].VolumeName"));
			k8sPvcListItem.setVolumeMode(_ctx.stringValue("ListK8sPvcResponse.K8sPvcList["+ i +"].VolumeMode"));

			k8sPvcList.add(k8sPvcListItem);
		}
		listK8sPvcResponse.setK8sPvcList(k8sPvcList);
	 
	 	return listK8sPvcResponse;
	}
}