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

import com.aliyuncs.sofa.model.v20190815.ListAKSKubernetesResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSKubernetesResourcesResponseUnmarshaller {

	public static ListAKSKubernetesResourcesResponse unmarshall(ListAKSKubernetesResourcesResponse listAKSKubernetesResourcesResponse, UnmarshallerContext _ctx) {
		
		listAKSKubernetesResourcesResponse.setRequestId(_ctx.stringValue("ListAKSKubernetesResourcesResponse.RequestId"));
		listAKSKubernetesResourcesResponse.setResultCode(_ctx.stringValue("ListAKSKubernetesResourcesResponse.ResultCode"));
		listAKSKubernetesResourcesResponse.setResultMessage(_ctx.stringValue("ListAKSKubernetesResourcesResponse.ResultMessage"));
		listAKSKubernetesResourcesResponse.setPageNumber(_ctx.longValue("ListAKSKubernetesResourcesResponse.PageNumber"));
		listAKSKubernetesResourcesResponse.setPageSize(_ctx.longValue("ListAKSKubernetesResourcesResponse.PageSize"));
		listAKSKubernetesResourcesResponse.setTotalCount(_ctx.longValue("ListAKSKubernetesResourcesResponse.TotalCount"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSKubernetesResourcesResponse.Items.Length"); i++) {
			items.add(_ctx.stringValue("ListAKSKubernetesResourcesResponse.Items["+ i +"]"));
		}
		listAKSKubernetesResourcesResponse.setItems(items);
	 
	 	return listAKSKubernetesResourcesResponse;
	}
}