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

import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse.AsynInfo;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse.AsynInfo.SplitRule;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse.Initiator;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse.Initiator.RecoveryDatasourcesItem;
import com.aliyuncs.sofa.model.v20190815.QueryDTXBizTypeResponse.ParticipatorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDTXBizTypeResponseUnmarshaller {

	public static QueryDTXBizTypeResponse unmarshall(QueryDTXBizTypeResponse queryDTXBizTypeResponse, UnmarshallerContext _ctx) {
		
		queryDTXBizTypeResponse.setRequestId(_ctx.stringValue("QueryDTXBizTypeResponse.RequestId"));
		queryDTXBizTypeResponse.setResultCode(_ctx.stringValue("QueryDTXBizTypeResponse.ResultCode"));
		queryDTXBizTypeResponse.setResultMessage(_ctx.stringValue("QueryDTXBizTypeResponse.ResultMessage"));

		AsynInfo asynInfo = new AsynInfo();
		asynInfo.setActionMode(_ctx.longValue("QueryDTXBizTypeResponse.AsynInfo.ActionMode"));
		asynInfo.setActivityMode(_ctx.longValue("QueryDTXBizTypeResponse.AsynInfo.ActivityMode"));
		asynInfo.setAppName(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.AppName"));
		asynInfo.setBizType(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.BizType"));
		asynInfo.setDesc(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.Desc"));
		asynInfo.setInstanceId(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.InstanceId"));
		asynInfo.setRole(_ctx.longValue("QueryDTXBizTypeResponse.AsynInfo.Role"));

		SplitRule splitRule = new SplitRule();
		splitRule.setDbSplitRule(_ctx.longValue("QueryDTXBizTypeResponse.AsynInfo.SplitRule.DbSplitRule"));
		splitRule.setDbSplitTemplate(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.SplitRule.DbSplitTemplate"));
		splitRule.setTableSplitRule(_ctx.longValue("QueryDTXBizTypeResponse.AsynInfo.SplitRule.TableSplitRule"));
		splitRule.setTableSplitTemplate(_ctx.stringValue("QueryDTXBizTypeResponse.AsynInfo.SplitRule.TableSplitTemplate"));
		asynInfo.setSplitRule(splitRule);
		queryDTXBizTypeResponse.setAsynInfo(asynInfo);

		Initiator initiator = new Initiator();
		initiator.setAppName(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.AppName"));
		initiator.setClientVersion(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.ClientVersion"));
		initiator.setId(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.Id"));
		initiator.setInstanceId(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.InstanceId"));
		initiator.setIsAsyn(_ctx.booleanValue("QueryDTXBizTypeResponse.Initiator.IsAsyn"));
		initiator.setIsLoadTest(_ctx.booleanValue("QueryDTXBizTypeResponse.Initiator.IsLoadTest"));
		initiator.setIsMix(_ctx.booleanValue("QueryDTXBizTypeResponse.Initiator.IsMix"));
		initiator.setRecoveryLimit(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryLimit"));
		initiator.setRecoveryThreadNum(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryThreadNum"));

		List<RecoveryDatasourcesItem> recoveryDatasources = new ArrayList<RecoveryDatasourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources.Length"); i++) {
			RecoveryDatasourcesItem recoveryDatasourcesItem = new RecoveryDatasourcesItem();
			recoveryDatasourcesItem.setActionTableIndexEnd(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActionTableIndexEnd"));
			recoveryDatasourcesItem.setActionTableIndexStart(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActionTableIndexStart"));
			recoveryDatasourcesItem.setActionTableNameFormat(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActionTableNameFormat"));
			recoveryDatasourcesItem.setActivityTableIndexEnd(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActivityTableIndexEnd"));
			recoveryDatasourcesItem.setActivityTableIndexStart(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActivityTableIndexStart"));
			recoveryDatasourcesItem.setActivityTableNameFormat(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].ActivityTableNameFormat"));
			recoveryDatasourcesItem.setDbConnectMin(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DbConnectMin"));
			recoveryDatasourcesItem.setDbConnMax(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DbConnMax"));
			recoveryDatasourcesItem.setDbType(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DbType"));
			recoveryDatasourcesItem.setDsIndexEnd(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DsIndexEnd"));
			recoveryDatasourcesItem.setDsIndexStart(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DsIndexStart"));
			recoveryDatasourcesItem.setDsNameFormat(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].DsNameFormat"));
			recoveryDatasourcesItem.setId(_ctx.longValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].Id"));
			recoveryDatasourcesItem.setInstanceId(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].InstanceId"));
			recoveryDatasourcesItem.setIsLdc(_ctx.booleanValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].IsLdc"));
			recoveryDatasourcesItem.setIsLocalDs(_ctx.booleanValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].IsLocalDs"));
			recoveryDatasourcesItem.setZone(_ctx.stringValue("QueryDTXBizTypeResponse.Initiator.RecoveryDatasources["+ i +"].Zone"));

			recoveryDatasources.add(recoveryDatasourcesItem);
		}
		initiator.setRecoveryDatasources(recoveryDatasources);
		queryDTXBizTypeResponse.setInitiator(initiator);

		List<ParticipatorsItem> participators = new ArrayList<ParticipatorsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXBizTypeResponse.Participators.Length"); i++) {
			ParticipatorsItem participatorsItem = new ParticipatorsItem();
			participatorsItem.setActionName(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].ActionName"));
			participatorsItem.setAppName(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].AppName"));
			participatorsItem.setClassName(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].ClassName"));
			participatorsItem.setCommitMethodName(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].CommitMethodName"));
			participatorsItem.setCommitMethodParamsType(_ctx.longValue("QueryDTXBizTypeResponse.Participators["+ i +"].CommitMethodParamsType"));
			participatorsItem.setElasticKey(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].ElasticKey"));
			participatorsItem.setElasticRouteRule(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].ElasticRouteRule"));
			participatorsItem.setId(_ctx.longValue("QueryDTXBizTypeResponse.Participators["+ i +"].Id"));
			participatorsItem.setInstanceId(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].InstanceId"));
			participatorsItem.setIsZoneRoute(_ctx.booleanValue("QueryDTXBizTypeResponse.Participators["+ i +"].IsZoneRoute"));
			participatorsItem.setRollbackMethodName(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].RollbackMethodName"));
			participatorsItem.setRollbackMethodParamsType(_ctx.longValue("QueryDTXBizTypeResponse.Participators["+ i +"].RollbackMethodParamsType"));
			participatorsItem.setTestUrl(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].TestUrl"));
			participatorsItem.setUniqueId(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].UniqueId"));
			participatorsItem.setWsTr(_ctx.stringValue("QueryDTXBizTypeResponse.Participators["+ i +"].WsTr"));

			participators.add(participatorsItem);
		}
		queryDTXBizTypeResponse.setParticipators(participators);
	 
	 	return queryDTXBizTypeResponse;
	}
}