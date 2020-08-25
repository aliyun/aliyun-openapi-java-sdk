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

import com.aliyuncs.sofa.model.v20190815.QueryDTXAppsDetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDTXAppsDetailResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryDTXAppsDetailResponse.Data.ActionArrayItem;
import com.aliyuncs.sofa.model.v20190815.QueryDTXAppsDetailResponse.Data.RecoveryArrayItem;
import com.aliyuncs.sofa.model.v20190815.QueryDTXAppsDetailResponse.Data.RecoveryArrayItem.DsArrayItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDTXAppsDetailResponseUnmarshaller {

	public static QueryDTXAppsDetailResponse unmarshall(QueryDTXAppsDetailResponse queryDTXAppsDetailResponse, UnmarshallerContext _ctx) {
		
		queryDTXAppsDetailResponse.setRequestId(_ctx.stringValue("QueryDTXAppsDetailResponse.RequestId"));
		queryDTXAppsDetailResponse.setResultCode(_ctx.stringValue("QueryDTXAppsDetailResponse.ResultCode"));
		queryDTXAppsDetailResponse.setResultMessage(_ctx.stringValue("QueryDTXAppsDetailResponse.ResultMessage"));

		Data data = new Data();
		data.setActionCount(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActionCount"));
		data.setActivityCount(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActivityCount"));
		data.setActivityMode(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActivityMode"));
		data.setAppName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.AppName"));
		data.setDbRuleName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.DbRuleName"));
		data.setDbRuleTemplate(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.DbRuleTemplate"));
		data.setDesc(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.Desc"));
		data.setId(_ctx.longValue("QueryDTXAppsDetailResponse.Data.Id"));
		data.setSpliteMode(_ctx.longValue("QueryDTXAppsDetailResponse.Data.SpliteMode"));
		data.setTableRuleName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.TableRuleName"));
		data.setTableRuleTemplate(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.TableRuleTemplate"));
		data.setUsed(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.Used"));

		List<ActionArrayItem> actionArray = new ArrayList<ActionArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXAppsDetailResponse.Data.ActionArray.Length"); i++) {
			ActionArrayItem actionArrayItem = new ActionArrayItem();
			actionArrayItem.setActionName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].ActionName"));
			actionArrayItem.setAppName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].AppName"));
			actionArrayItem.setClassName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].ClassName"));
			actionArrayItem.setCommitMethodName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].CommitMethodName"));
			actionArrayItem.setCommitMethodParamsType(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].CommitMethodParamsType"));
			actionArrayItem.setElasticKey(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].ElasticKey"));
			actionArrayItem.setElasticRouteRule(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].ElasticRouteRule"));
			actionArrayItem.setId(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].Id"));
			actionArrayItem.setInstanceId(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].InstanceId"));
			actionArrayItem.setIsZoneRoute(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].IsZoneRoute"));
			actionArrayItem.setRollbackMethodName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].RollbackMethodName"));
			actionArrayItem.setRollbackMethodParamsType(_ctx.longValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].RollbackMethodParamsType"));
			actionArrayItem.setTestUrl(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].TestUrl"));
			actionArrayItem.setUniqueId(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].UniqueId"));
			actionArrayItem.setUsed(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].Used"));
			actionArrayItem.setWsTr(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.ActionArray["+ i +"].WsTr"));

			actionArray.add(actionArrayItem);
		}
		data.setActionArray(actionArray);

		List<RecoveryArrayItem> recoveryArray = new ArrayList<RecoveryArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXAppsDetailResponse.Data.RecoveryArray.Length"); i++) {
			RecoveryArrayItem recoveryArrayItem = new RecoveryArrayItem();
			recoveryArrayItem.setAppName(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].AppName"));
			recoveryArrayItem.setClientVersion(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].ClientVersion"));
			recoveryArrayItem.setId(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].Id"));
			recoveryArrayItem.setIsAsyn(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].IsAsyn"));
			recoveryArrayItem.setIsDds(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].IsDds"));
			recoveryArrayItem.setIsLoadTest(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].IsLoadTest"));
			recoveryArrayItem.setIsMix(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].IsMix"));
			recoveryArrayItem.setRecoveryLimit(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].RecoveryLimit"));
			recoveryArrayItem.setRecoveryThreadNum(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].RecoveryThreadNum"));
			recoveryArrayItem.setUsed(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].Used"));

			List<DsArrayItem> dsArray = new ArrayList<DsArrayItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray.Length"); j++) {
				DsArrayItem dsArrayItem = new DsArrayItem();
				dsArrayItem.setActionTableIndexEnd(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActionTableIndexEnd"));
				dsArrayItem.setActionTableIndexStart(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActionTableIndexStart"));
				dsArrayItem.setActionTableNameFormat(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActionTableNameFormat"));
				dsArrayItem.setActivityTableIndexEnd(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActivityTableIndexEnd"));
				dsArrayItem.setActivityTableIndexStart(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActivityTableIndexStart"));
				dsArrayItem.setActivityTableNameFormat(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].ActivityTableNameFormat"));
				dsArrayItem.setDbConnectMin(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DbConnectMin"));
				dsArrayItem.setDbConnMax(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DbConnMax"));
				dsArrayItem.setDbType(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DbType"));
				dsArrayItem.setDsIndexEnd(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DsIndexEnd"));
				dsArrayItem.setDsIndexStart(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DsIndexStart"));
				dsArrayItem.setDsNameFormat(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].DsNameFormat"));
				dsArrayItem.setId(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].Id"));
				dsArrayItem.setIsLdc(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].IsLdc"));
				dsArrayItem.setIsLocalDs(_ctx.booleanValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].IsLocalDs"));
				dsArrayItem.setTaskIndexEnd(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].TaskIndexEnd"));
				dsArrayItem.setTaskIndexStart(_ctx.longValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].TaskIndexStart"));
				dsArrayItem.setTaskNameFormat(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].TaskNameFormat"));
				dsArrayItem.setZone(_ctx.stringValue("QueryDTXAppsDetailResponse.Data.RecoveryArray["+ i +"].DsArray["+ j +"].Zone"));

				dsArray.add(dsArrayItem);
			}
			recoveryArrayItem.setDsArray(dsArray);

			recoveryArray.add(recoveryArrayItem);
		}
		data.setRecoveryArray(recoveryArray);
		queryDTXAppsDetailResponse.setData(data);
	 
	 	return queryDTXAppsDetailResponse;
	}
}