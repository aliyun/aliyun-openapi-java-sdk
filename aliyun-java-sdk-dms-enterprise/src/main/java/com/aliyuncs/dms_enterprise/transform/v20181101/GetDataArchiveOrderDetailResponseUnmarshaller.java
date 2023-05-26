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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.InstancesItem;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.NextFireTimeResult;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.IncludeTables;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataArchiveOrderDetailResponseUnmarshaller {

	public static GetDataArchiveOrderDetailResponse unmarshall(GetDataArchiveOrderDetailResponse getDataArchiveOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getDataArchiveOrderDetailResponse.setRequestId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.RequestId"));
		getDataArchiveOrderDetailResponse.setTraceId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.TraceId"));
		getDataArchiveOrderDetailResponse.setSuccess(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.Success"));
		getDataArchiveOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetDataArchiveOrderDetailResponse.ErrorMessage"));
		getDataArchiveOrderDetailResponse.setErrorCode(_ctx.stringValue("GetDataArchiveOrderDetailResponse.ErrorCode"));

		DataArchiveOrderDetail dataArchiveOrderDetail = new DataArchiveOrderDetail();
		dataArchiveOrderDetail.setComment(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.Comment"));
		dataArchiveOrderDetail.setCommitter(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.Committer"));
		dataArchiveOrderDetail.setCommitterId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.CommitterId"));
		dataArchiveOrderDetail.setGmtCreate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.GmtCreate"));
		dataArchiveOrderDetail.setGmtModified(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.GmtModified"));
		dataArchiveOrderDetail.setId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.Id"));
		dataArchiveOrderDetail.setPluginType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginType"));
		dataArchiveOrderDetail.setStatusCode(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.StatusCode"));
		dataArchiveOrderDetail.setStatusDesc(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.StatusDesc"));
		dataArchiveOrderDetail.setWorkflowInstanceId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.WorkflowInstanceId"));
		dataArchiveOrderDetail.setWorkflowStatusDesc(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.WorkflowStatusDesc"));

		List<Long> relatedUserList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.RelatedUserList.Length"); i++) {
			relatedUserList.add(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.RelatedUserList["+ i +"]"));
		}
		dataArchiveOrderDetail.setRelatedUserList(relatedUserList);

		List<String> relatedUserNickList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.RelatedUserNickList.Length"); i++) {
			relatedUserNickList.add(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.RelatedUserNickList["+ i +"]"));
		}
		dataArchiveOrderDetail.setRelatedUserNickList(relatedUserNickList);

		PluginExtraData pluginExtraData = new PluginExtraData();
		pluginExtraData.setInstanceTotal(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.InstanceTotal"));
		pluginExtraData.setPageIndex(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.PageIndex"));
		pluginExtraData.setPageSize(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.PageSize"));

		DagInfo dagInfo = new DagInfo();
		dagInfo.setCreatorId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.CreatorId"));
		dagInfo.setCronBeginDate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.CronBeginDate"));
		dagInfo.setCronEndDate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.CronEndDate"));
		dagInfo.setCronTrigger(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.CronTrigger"));
		dagInfo.setDWDevelop(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.DWDevelop"));
		dagInfo.setDagName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.DagName"));
		dagInfo.setDagOwnerId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.DagOwnerId"));
		dagInfo.setDeployId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.DeployId"));
		dagInfo.setDescription(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.Description"));
		dagInfo.setEditDagId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.EditDagId"));
		dagInfo.setGmtCreate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.GmtCreate"));
		dagInfo.setGmtModified(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.GmtModified"));
		dagInfo.setId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.Id"));
		dagInfo.setIsPublic(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.IsPublic"));
		dagInfo.setLegacy(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.Legacy"));
		dagInfo.setSystem(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.System"));
		dagInfo.setTenantId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.TenantId"));
		dagInfo.setTriggerOnce(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DagInfo.TriggerOnce"));
		pluginExtraData.setDagInfo(dagInfo);

		DbBaseInfo dbBaseInfo = new DbBaseInfo();
		dbBaseInfo.setAlias(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Alias"));
		dbBaseInfo.setAlterTimeout(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.AlterTimeout"));
		dbBaseInfo.setAssetControl(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.AssetControl"));
		dbBaseInfo.setCatalogName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.CatalogName"));
		dbBaseInfo.setClusterNode(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.ClusterNode"));
		dbBaseInfo.setDbId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.DbId"));
		dbBaseInfo.setDbType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.DbType"));
		dbBaseInfo.setDbaId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.DbaId"));
		dbBaseInfo.setDbaName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.DbaName"));
		dbBaseInfo.setDescription(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Description"));
		dbBaseInfo.setEncoding(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Encoding"));
		dbBaseInfo.setEnvType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.EnvType"));
		dbBaseInfo.setFollow(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Follow"));
		dbBaseInfo.setHost(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Host"));
		dbBaseInfo.setIdc(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Idc"));
		dbBaseInfo.setIdcTitle(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.IdcTitle"));
		dbBaseInfo.setInstanceId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.InstanceId"));
		dbBaseInfo.setInstanceSource(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.InstanceSource"));
		dbBaseInfo.setLastSyncTime(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.LastSyncTime"));
		dbBaseInfo.setLevel(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Level"));
		dbBaseInfo.setLogic(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Logic"));
		dbBaseInfo.setPort(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.Port"));
		dbBaseInfo.setSchemaName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.SchemaName"));
		dbBaseInfo.setSearchName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.SearchName"));
		dbBaseInfo.setState(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.State"));
		dbBaseInfo.setTableCount(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.TableCount"));
		dbBaseInfo.setTnsName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.TnsName"));
		dbBaseInfo.setUnitType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.UnitType"));

		List<Long> ownerIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.OwnerIds.Length"); i++) {
			ownerIds.add(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.OwnerIds["+ i +"]"));
		}
		dbBaseInfo.setOwnerIds(ownerIds);

		List<String> ownerNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.OwnerNames.Length"); i++) {
			ownerNames.add(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.OwnerNames["+ i +"]"));
		}
		dbBaseInfo.setOwnerNames(ownerNames);

		StandardGroup standardGroup = new StandardGroup();
		standardGroup.setDbType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.DbType"));
		standardGroup.setDescription(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.Description"));
		standardGroup.setFreeOrStable(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.FreeOrStable"));
		standardGroup.setGmtCreate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.GmtCreate"));
		standardGroup.setGmtModified(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.GmtModified"));
		standardGroup.setGroupMode(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.GroupMode"));
		standardGroup.setGroupName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.GroupName"));
		standardGroup.setId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.Id"));
		standardGroup.setLastMenderId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.DbBaseInfo.StandardGroup.LastMenderId"));
		dbBaseInfo.setStandardGroup(standardGroup);
		pluginExtraData.setDbBaseInfo(dbBaseInfo);

		NextFireTimeResult nextFireTimeResult = new NextFireTimeResult();
		nextFireTimeResult.setCronFireType(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.NextFireTimeResult.CronFireType"));
		pluginExtraData.setNextFireTimeResult(nextFireTimeResult);

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setBusinessTime(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].BusinessTime"));
			instancesItem.setDagId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].DagId"));
			instancesItem.setEndTime(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].EndTime"));
			instancesItem.setGmtCreate(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].GmtCreate"));
			instancesItem.setGmtModified(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].GmtModified"));
			instancesItem.setHistoryDagId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].HistoryDagId"));
			instancesItem.setId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].Id"));
			instancesItem.setLastRunningContext(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].LastRunningContext"));
			instancesItem.setMsg(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].Msg"));
			instancesItem.setStatus(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].Status"));
			instancesItem.setTenantId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].TenantId"));
			instancesItem.setTriggerType(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].TriggerType"));
			instancesItem.setVersion(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginExtraData.Instances["+ i +"].Version"));

			instances.add(instancesItem);
		}
		pluginExtraData.setInstances(instances);
		dataArchiveOrderDetail.setPluginExtraData(pluginExtraData);

		PluginParam pluginParam = new PluginParam();
		pluginParam.setArchiveMethod(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.ArchiveMethod"));
		pluginParam.setDbSchema(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.DbSchema"));
		pluginParam.setLogic(_ctx.booleanValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.Logic"));
		pluginParam.setRunMethod(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.RunMethod"));
		pluginParam.setSourceDatabaseId(_ctx.longValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.SourceDatabaseId"));
		pluginParam.setTargetInstanceId(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TargetInstanceId"));

		List<String> orderAfter = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.OrderAfter.Length"); i++) {
			orderAfter.add(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.OrderAfter["+ i +"]"));
		}
		pluginParam.setOrderAfter(orderAfter);

		List<String> tableMapping = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TableMapping.Length"); i++) {
			tableMapping.add(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TableMapping["+ i +"]"));
		}
		pluginParam.setTableMapping(tableMapping);

		List<String> variables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.Variables.Length"); i++) {
			variables.add(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.Variables["+ i +"]"));
		}
		pluginParam.setVariables(variables);

		List<IncludeTables> tableIncludes = new ArrayList<IncludeTables>();
		for (int i = 0; i < _ctx.lengthValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TableIncludes.Length"); i++) {
			IncludeTables includeTables = new IncludeTables();
			includeTables.setTableName(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TableIncludes["+ i +"].TableName"));
			includeTables.setTableWhere(_ctx.stringValue("GetDataArchiveOrderDetailResponse.DataArchiveOrderDetail.PluginParam.TableIncludes["+ i +"].TableWhere"));

			tableIncludes.add(includeTables);
		}
		pluginParam.setTableIncludes(tableIncludes);
		dataArchiveOrderDetail.setPluginParam(pluginParam);
		getDataArchiveOrderDetailResponse.setDataArchiveOrderDetail(dataArchiveOrderDetail);
	 
	 	return getDataArchiveOrderDetailResponse;
	}
}