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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.AppsItem;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstanceGroupResponseUnmarshaller {

	public static ListAppInstanceGroupResponse unmarshall(ListAppInstanceGroupResponse listAppInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		listAppInstanceGroupResponse.setRequestId(_ctx.stringValue("ListAppInstanceGroupResponse.RequestId"));
		listAppInstanceGroupResponse.setTotalCount(_ctx.integerValue("ListAppInstanceGroupResponse.TotalCount"));
		listAppInstanceGroupResponse.setPageSize(_ctx.integerValue("ListAppInstanceGroupResponse.PageSize"));
		listAppInstanceGroupResponse.setPageNumber(_ctx.integerValue("ListAppInstanceGroupResponse.PageNumber"));

		List<Data> appInstanceGroupModels = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels.Length"); i++) {
			Data data = new Data();
			data.setAppCenterImageId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppCenterImageId"));
			data.setAliyunImageId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AliyunImageId"));
			data.setRegionId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].RegionId"));
			data.setProductType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ProductType"));
			data.setAppInstanceType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceType"));
			data.setAppInstanceGroupId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceGroupId"));
			data.setCpu(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Cpu"));
			data.setGpu(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Gpu"));
			data.setMemory(_ctx.longValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Memory"));
			data.setAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Amount"));
			data.setMinAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].MinAmount"));
			data.setMaxAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].MaxAmount"));
			data.setChargeType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ChargeType"));
			data.setGmtCreate(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].GmtCreate"));
			data.setStatus(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Status"));
			data.setSpecId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].SpecId"));
			data.setSessionTimeout(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].SessionTimeout"));
			data.setAppInstanceGroupName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceGroupName"));
			data.setExpiredTime(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ExpiredTime"));

			List<AppsItem> apps = new ArrayList<AppsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps.Length"); j++) {
				AppsItem appsItem = new AppsItem();
				appsItem.setAppId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppId"));
				appsItem.setAppName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppName"));

				apps.add(appsItem);
			}
			data.setApps(apps);

			List<Node> nodePool = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool.Length"); j++) {
				Node node = new Node();
				node.setNodePoolId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodePoolId"));
				node.setNodeInstanceType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeInstanceType"));
				node.setNodeAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeAmount"));
				node.setNodeUsed(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeUsed"));
				node.setNodeCapacity(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeCapacity"));

				nodePool.add(node);
			}
			data.setNodePool(nodePool);

			appInstanceGroupModels.add(data);
		}
		listAppInstanceGroupResponse.setAppInstanceGroupModels(appInstanceGroupModels);
	 
	 	return listAppInstanceGroupResponse;
	}
}