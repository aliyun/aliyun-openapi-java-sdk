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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListABMetricGroupsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListABMetricGroupsResponse.ABMetricGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListABMetricGroupsResponseUnmarshaller {

	public static ListABMetricGroupsResponse unmarshall(ListABMetricGroupsResponse listABMetricGroupsResponse, UnmarshallerContext _ctx) {
		
		listABMetricGroupsResponse.setRequestId(_ctx.stringValue("ListABMetricGroupsResponse.RequestId"));
		listABMetricGroupsResponse.setTotalCount(_ctx.longValue("ListABMetricGroupsResponse.TotalCount"));

		List<ABMetricGroupsItem> aBMetricGroups = new ArrayList<ABMetricGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListABMetricGroupsResponse.ABMetricGroups.Length"); i++) {
			ABMetricGroupsItem aBMetricGroupsItem = new ABMetricGroupsItem();
			aBMetricGroupsItem.setABMetricGroupId(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].ABMetricGroupId"));
			aBMetricGroupsItem.setName(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].Name"));
			aBMetricGroupsItem.setSceneId(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].SceneId"));
			aBMetricGroupsItem.setDescription(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].Description"));
			aBMetricGroupsItem.setOwner(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].Owner"));
			aBMetricGroupsItem.setABMetricIds(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].ABMetricIds"));
			aBMetricGroupsItem.setABMetricNames(_ctx.stringValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].ABMetricNames"));
			aBMetricGroupsItem.setRealtime(_ctx.booleanValue("ListABMetricGroupsResponse.ABMetricGroups["+ i +"].Realtime"));

			aBMetricGroups.add(aBMetricGroupsItem);
		}
		listABMetricGroupsResponse.setABMetricGroups(aBMetricGroups);
	 
	 	return listABMetricGroupsResponse;
	}
}