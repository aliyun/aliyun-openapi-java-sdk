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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListPodRiskResponse;
import com.aliyuncs.sas.model.v20181203.ListPodRiskResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListPodRiskResponse.PodRiskListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPodRiskResponseUnmarshaller {

	public static ListPodRiskResponse unmarshall(ListPodRiskResponse listPodRiskResponse, UnmarshallerContext _ctx) {
		
		listPodRiskResponse.setRequestId(_ctx.stringValue("ListPodRiskResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotalCount(_ctx.integerValue("ListPodRiskResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListPodRiskResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("ListPodRiskResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(_ctx.integerValue("ListPodRiskResponse.PageInfo.CurrentPage"));
		listPodRiskResponse.setPageInfo(pageInfo);

		List<PodRiskListItem> podRiskList = new ArrayList<PodRiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPodRiskResponse.PodRiskList.Length"); i++) {
			PodRiskListItem podRiskListItem = new PodRiskListItem();
			podRiskListItem.setPod(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].Pod"));
			podRiskListItem.setNodeName(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].NodeName"));
			podRiskListItem.setClusterId(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].ClusterId"));
			podRiskListItem.setPodIp(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].PodIp"));
			podRiskListItem.setCreateTime(_ctx.longValue("ListPodRiskResponse.PodRiskList["+ i +"].CreateTime"));
			podRiskListItem.setClusterName(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].ClusterName"));
			podRiskListItem.setNamespace(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].Namespace"));
			podRiskListItem.setVulCount(_ctx.integerValue("ListPodRiskResponse.PodRiskList["+ i +"].VulCount"));
			podRiskListItem.setAlarmCount(_ctx.integerValue("ListPodRiskResponse.PodRiskList["+ i +"].AlarmCount"));
			podRiskListItem.setHcCount(_ctx.integerValue("ListPodRiskResponse.PodRiskList["+ i +"].HcCount"));
			podRiskListItem.setInstanceId(_ctx.stringValue("ListPodRiskResponse.PodRiskList["+ i +"].InstanceId"));

			podRiskList.add(podRiskListItem);
		}
		listPodRiskResponse.setPodRiskList(podRiskList);
	 
	 	return listPodRiskResponse;
	}
}