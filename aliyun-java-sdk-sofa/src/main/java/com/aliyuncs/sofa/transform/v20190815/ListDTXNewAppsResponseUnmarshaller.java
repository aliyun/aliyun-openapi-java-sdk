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

import com.aliyuncs.sofa.model.v20190815.ListDTXNewAppsResponse;
import com.aliyuncs.sofa.model.v20190815.ListDTXNewAppsResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.ListDTXNewAppsResponse.DataItem.ActionArrayItem;
import com.aliyuncs.sofa.model.v20190815.ListDTXNewAppsResponse.DataItem.RecoveryArrayItem;
import com.aliyuncs.sofa.model.v20190815.ListDTXNewAppsResponse.DataItem.RecoveryArrayItem.DsArrayItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDTXNewAppsResponseUnmarshaller {

	public static ListDTXNewAppsResponse unmarshall(ListDTXNewAppsResponse listDTXNewAppsResponse, UnmarshallerContext _ctx) {
		
		listDTXNewAppsResponse.setRequestId(_ctx.stringValue("ListDTXNewAppsResponse.RequestId"));
		listDTXNewAppsResponse.setResultCode(_ctx.stringValue("ListDTXNewAppsResponse.ResultCode"));
		listDTXNewAppsResponse.setResultMessage(_ctx.stringValue("ListDTXNewAppsResponse.ResultMessage"));
		listDTXNewAppsResponse.setCurrentPage(_ctx.longValue("ListDTXNewAppsResponse.CurrentPage"));
		listDTXNewAppsResponse.setPageSize(_ctx.longValue("ListDTXNewAppsResponse.PageSize"));
		listDTXNewAppsResponse.setTotal(_ctx.longValue("ListDTXNewAppsResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDTXNewAppsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActionCount(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActionCount"));
			dataItem.setActivityCount(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActivityCount"));
			dataItem.setActivityMode(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActivityMode"));
			dataItem.setAppName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].AppName"));
			dataItem.setDbRuleName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].DbRuleName"));
			dataItem.setDbRuleTemplate(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].DbRuleTemplate"));
			dataItem.setDesc(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].Desc"));
			dataItem.setId(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].Id"));
			dataItem.setSpliteMode(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].SpliteMode"));
			dataItem.setTableRuleName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].TableRuleName"));
			dataItem.setTableRuleTemplate(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].TableRuleTemplate"));
			dataItem.setUsed(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].Used"));

			List<ActionArrayItem> actionArray = new ArrayList<ActionArrayItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray.Length"); j++) {
				ActionArrayItem actionArrayItem = new ActionArrayItem();
				actionArrayItem.setActionName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].ActionName"));
				actionArrayItem.setAppName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].AppName"));
				actionArrayItem.setClassName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].ClassName"));
				actionArrayItem.setCommitMethodName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].CommitMethodName"));
				actionArrayItem.setCommitMethodParamsType(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].CommitMethodParamsType"));
				actionArrayItem.setElasticKey(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].ElasticKey"));
				actionArrayItem.setElasticRouteRule(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].ElasticRouteRule"));
				actionArrayItem.setId(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].Id"));
				actionArrayItem.setInstanceId(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].InstanceId"));
				actionArrayItem.setIsZoneRoute(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].IsZoneRoute"));
				actionArrayItem.setRollbackMethodName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].RollbackMethodName"));
				actionArrayItem.setRollbackMethodParamsType(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].RollbackMethodParamsType"));
				actionArrayItem.setTestUrl(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].TestUrl"));
				actionArrayItem.setUniqueId(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].UniqueId"));
				actionArrayItem.setUsed(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].Used"));
				actionArrayItem.setWsTr(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].ActionArray["+ j +"].WsTr"));

				actionArray.add(actionArrayItem);
			}
			dataItem.setActionArray(actionArray);

			List<RecoveryArrayItem> recoveryArray = new ArrayList<RecoveryArrayItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray.Length"); j++) {
				RecoveryArrayItem recoveryArrayItem = new RecoveryArrayItem();
				recoveryArrayItem.setAppName(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].AppName"));
				recoveryArrayItem.setClientVersion(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].ClientVersion"));
				recoveryArrayItem.setId(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].Id"));
				recoveryArrayItem.setIsAsyn(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].IsAsyn"));
				recoveryArrayItem.setIsDds(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].IsDds"));
				recoveryArrayItem.setIsLoadTest(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].IsLoadTest"));
				recoveryArrayItem.setIsMix(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].IsMix"));
				recoveryArrayItem.setRecoveryLimit(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].RecoveryLimit"));
				recoveryArrayItem.setRecoveryThreadNum(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].RecoveryThreadNum"));
				recoveryArrayItem.setUsed(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].Used"));

				List<DsArrayItem> dsArray = new ArrayList<DsArrayItem>();
				for (int k = 0; k < _ctx.lengthValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray.Length"); k++) {
					DsArrayItem dsArrayItem = new DsArrayItem();
					dsArrayItem.setActionTableIndexEnd(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActionTableIndexEnd"));
					dsArrayItem.setActionTableIndexStart(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActionTableIndexStart"));
					dsArrayItem.setActionTableNameFormat(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActionTableNameFormat"));
					dsArrayItem.setActivityTableIndexEnd(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActivityTableIndexEnd"));
					dsArrayItem.setActivityTableIndexStart(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActivityTableIndexStart"));
					dsArrayItem.setActivityTableNameFormat(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].ActivityTableNameFormat"));
					dsArrayItem.setDbConnectMin(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DbConnectMin"));
					dsArrayItem.setDbConnMax(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DbConnMax"));
					dsArrayItem.setDbType(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DbType"));
					dsArrayItem.setDsIndexEnd(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DsIndexEnd"));
					dsArrayItem.setDsIndexStart(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DsIndexStart"));
					dsArrayItem.setDsNameFormat(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].DsNameFormat"));
					dsArrayItem.setId(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].Id"));
					dsArrayItem.setIsLdc(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].IsLdc"));
					dsArrayItem.setIsLocalDs(_ctx.booleanValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].IsLocalDs"));
					dsArrayItem.setTaskIndexEnd(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].TaskIndexEnd"));
					dsArrayItem.setTaskIndexStart(_ctx.longValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].TaskIndexStart"));
					dsArrayItem.setTaskNameFormat(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].TaskNameFormat"));
					dsArrayItem.setZone(_ctx.stringValue("ListDTXNewAppsResponse.Data["+ i +"].RecoveryArray["+ j +"].DsArray["+ k +"].Zone"));

					dsArray.add(dsArrayItem);
				}
				recoveryArrayItem.setDsArray(dsArray);

				recoveryArray.add(recoveryArrayItem);
			}
			dataItem.setRecoveryArray(recoveryArray);

			data.add(dataItem);
		}
		listDTXNewAppsResponse.setData(data);
	 
	 	return listDTXNewAppsResponse;
	}
}