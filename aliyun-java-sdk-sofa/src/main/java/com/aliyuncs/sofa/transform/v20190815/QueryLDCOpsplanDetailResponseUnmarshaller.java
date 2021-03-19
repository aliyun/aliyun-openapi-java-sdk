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

import com.aliyuncs.sofa.model.v20190815.QueryLDCOpsplanDetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLDCOpsplanDetailResponse.AppInfosItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCOpsplanDetailResponse.GroupCollectionListItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCOpsplanDetailResponse.GroupCollectionListItem.AppGroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLDCOpsplanDetailResponseUnmarshaller {

	public static QueryLDCOpsplanDetailResponse unmarshall(QueryLDCOpsplanDetailResponse queryLDCOpsplanDetailResponse, UnmarshallerContext _ctx) {
		
		queryLDCOpsplanDetailResponse.setRequestId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.RequestId"));
		queryLDCOpsplanDetailResponse.setResultCode(_ctx.stringValue("QueryLDCOpsplanDetailResponse.ResultCode"));
		queryLDCOpsplanDetailResponse.setResultMessage(_ctx.stringValue("QueryLDCOpsplanDetailResponse.ResultMessage"));
		queryLDCOpsplanDetailResponse.setAppCount(_ctx.longValue("QueryLDCOpsplanDetailResponse.AppCount"));
		queryLDCOpsplanDetailResponse.setExecutor(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Executor"));
		queryLDCOpsplanDetailResponse.setFinishTime(_ctx.stringValue("QueryLDCOpsplanDetailResponse.FinishTime"));
		queryLDCOpsplanDetailResponse.setId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Id"));
		queryLDCOpsplanDetailResponse.setMessageDetail(_ctx.stringValue("QueryLDCOpsplanDetailResponse.MessageDetail"));
		queryLDCOpsplanDetailResponse.setMode(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Mode"));
		queryLDCOpsplanDetailResponse.setName(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Name"));
		queryLDCOpsplanDetailResponse.setRemark(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Remark"));
		queryLDCOpsplanDetailResponse.setStartTime(_ctx.stringValue("QueryLDCOpsplanDetailResponse.StartTime"));
		queryLDCOpsplanDetailResponse.setState(_ctx.stringValue("QueryLDCOpsplanDetailResponse.State"));
		queryLDCOpsplanDetailResponse.setTimeSeriesId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.TimeSeriesId"));
		queryLDCOpsplanDetailResponse.setType(_ctx.stringValue("QueryLDCOpsplanDetailResponse.Type"));

		List<AppInfosItem> appInfos = new ArrayList<AppInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLDCOpsplanDetailResponse.AppInfos.Length"); i++) {
			AppInfosItem appInfosItem = new AppInfosItem();
			appInfosItem.setAppId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].AppId"));
			appInfosItem.setAppInstanceGroupName(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].AppInstanceGroupName"));
			appInfosItem.setAppName(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].AppName"));
			appInfosItem.setExecutor(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].Executor"));
			appInfosItem.setFinishTime(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].FinishTime"));
			appInfosItem.setGroupNum(_ctx.longValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].GroupNum"));
			appInfosItem.setGroupStrategy(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].GroupStrategy"));
			appInfosItem.setId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].Id"));
			appInfosItem.setNamespace(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].Namespace"));
			appInfosItem.setOperationType(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].OperationType"));
			appInfosItem.setRevision(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].Revision"));
			appInfosItem.setRollbackRevision(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].RollbackRevision"));
			appInfosItem.setStandaloneExecutable(_ctx.booleanValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].StandaloneExecutable"));
			appInfosItem.setStartTime(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].StartTime"));
			appInfosItem.setState(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].State"));
			appInfosItem.setPodCount(_ctx.longValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].PodCount"));
			appInfosItem.setRollbackReason(_ctx.stringValue("QueryLDCOpsplanDetailResponse.AppInfos["+ i +"].RollbackReason"));

			appInfos.add(appInfosItem);
		}
		queryLDCOpsplanDetailResponse.setAppInfos(appInfos);

		List<GroupCollectionListItem> groupCollectionList = new ArrayList<GroupCollectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLDCOpsplanDetailResponse.GroupCollectionList.Length"); i++) {
			GroupCollectionListItem groupCollectionListItem = new GroupCollectionListItem();

			List<AppGroupListItem> appGroupList = new ArrayList<AppGroupListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCOpsplanDetailResponse.GroupCollectionList["+ i +"].AppGroupList.Length"); j++) {
				AppGroupListItem appGroupListItem = new AppGroupListItem();
				appGroupListItem.setId(_ctx.stringValue("QueryLDCOpsplanDetailResponse.GroupCollectionList["+ i +"].AppGroupList["+ j +"].Id"));
				appGroupListItem.setState(_ctx.stringValue("QueryLDCOpsplanDetailResponse.GroupCollectionList["+ i +"].AppGroupList["+ j +"].State"));

				List<String> appIdList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCOpsplanDetailResponse.GroupCollectionList["+ i +"].AppGroupList["+ j +"].AppIdList.Length"); k++) {
					appIdList.add(_ctx.stringValue("QueryLDCOpsplanDetailResponse.GroupCollectionList["+ i +"].AppGroupList["+ j +"].AppIdList["+ k +"]"));
				}
				appGroupListItem.setAppIdList(appIdList);

				appGroupList.add(appGroupListItem);
			}
			groupCollectionListItem.setAppGroupList(appGroupList);

			groupCollectionList.add(groupCollectionListItem);
		}
		queryLDCOpsplanDetailResponse.setGroupCollectionList(groupCollectionList);
	 
	 	return queryLDCOpsplanDetailResponse;
	}
}