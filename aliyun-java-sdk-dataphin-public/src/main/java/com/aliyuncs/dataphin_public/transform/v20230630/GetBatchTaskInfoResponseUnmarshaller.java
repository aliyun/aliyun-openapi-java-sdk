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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.ContextParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.NodeRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.NodeRelation.DependPeriod;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.Param;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.SparkClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTaskInfoResponseUnmarshaller {

	public static GetBatchTaskInfoResponse unmarshall(GetBatchTaskInfoResponse getBatchTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getBatchTaskInfoResponse.setRequestId(_ctx.stringValue("GetBatchTaskInfoResponse.RequestId"));
		getBatchTaskInfoResponse.setMessage(_ctx.stringValue("GetBatchTaskInfoResponse.Message"));
		getBatchTaskInfoResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTaskInfoResponse.HttpStatusCode"));
		getBatchTaskInfoResponse.setCode(_ctx.stringValue("GetBatchTaskInfoResponse.Code"));
		getBatchTaskInfoResponse.setSuccess(_ctx.booleanValue("GetBatchTaskInfoResponse.Success"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setScheduleType(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.ScheduleType"));
		taskInfo.setConditionScheduleEnable(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleEnable"));
		taskInfo.setResourceGroupId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ResourceGroupId"));
		taskInfo.setDataSourceSchema(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceSchema"));
		taskInfo.setNodeName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeName"));
		taskInfo.setBaseScheduleTemplateName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.BaseScheduleTemplateName"));
		taskInfo.setDevelopOwnerId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerId"));
		taskInfo.setName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Name"));
		taskInfo.setRemark(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Remark"));
		taskInfo.setValidEndDate(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ValidEndDate"));
		taskInfo.setNodeDescription(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeDescription"));
		taskInfo.setTaskType(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.TaskType"));
		taskInfo.setRerunable(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Rerunable"));
		taskInfo.setBaseScheduleTemplateId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.BaseScheduleTemplateId"));
		taskInfo.setCronExpression(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CronExpression"));
		taskInfo.setOpsOwnerId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerId"));
		taskInfo.setStatus(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Status"));
		taskInfo.setValidStartDate(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ValidStartDate"));
		taskInfo.setPriority(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.Priority"));
		taskInfo.setNodeFrom(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeFrom"));
		taskInfo.setCode(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Code"));
		taskInfo.setOwnerUserId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OwnerUserId"));
		taskInfo.setOpsOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerName"));
		taskInfo.setNeedPublish(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.NeedPublish"));
		taskInfo.setNodeId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeId"));
		taskInfo.setFileId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.FileId"));
		taskInfo.setProdHttpPath(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ProdHttpPath"));
		taskInfo.setDevResourceGroupId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevResourceGroupId"));
		taskInfo.setNodeStatus(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.NodeStatus"));
		taskInfo.setHasDevNode(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.HasDevNode"));
		taskInfo.setResourceGroupName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ResourceGroupName"));
		taskInfo.setOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OwnerName"));
		taskInfo.setDevHttpPath(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevHttpPath"));
		taskInfo.setDagId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DagId"));
		taskInfo.setDevResourceGroupName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevResourceGroupName"));
		taskInfo.setDevelopOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerName"));
		taskInfo.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.SchedulePeriod"));
		taskInfo.setPaused(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Paused"));
		taskInfo.setProjectId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.ProjectId"));
		taskInfo.setConditionScheduleTemplateName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleTemplateName"));
		taskInfo.setOperatorUserId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OperatorUserId"));
		taskInfo.setConditionScheduleTemplateId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleTemplateId"));
		taskInfo.setDataSourceCatalog(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceCatalog"));
		taskInfo.setPublished(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Published"));
		taskInfo.setDataSourceId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceId"));

		List<String> nodeOutputNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.NodeOutputNameList.Length"); i++) {
			nodeOutputNameList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeOutputNameList["+ i +"]"));
		}
		taskInfo.setNodeOutputNameList(nodeOutputNameList);

		List<String> developOwnerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerNameList.Length"); i++) {
			developOwnerNameList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerNameList["+ i +"]"));
		}
		taskInfo.setDevelopOwnerNameList(developOwnerNameList);

		List<String> developOwnerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerIdList.Length"); i++) {
			developOwnerIdList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerIdList["+ i +"]"));
		}
		taskInfo.setDevelopOwnerIdList(developOwnerIdList);

		List<String> opsOwnerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerIdList.Length"); i++) {
			opsOwnerIdList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerIdList["+ i +"]"));
		}
		taskInfo.setOpsOwnerIdList(opsOwnerIdList);

		List<String> opsOwnerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerNameList.Length"); i++) {
			opsOwnerNameList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerNameList["+ i +"]"));
		}
		taskInfo.setOpsOwnerNameList(opsOwnerNameList);

		List<String> taskTagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.TaskTagList.Length"); i++) {
			taskTagList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.TaskTagList["+ i +"]"));
		}
		taskInfo.setTaskTagList(taskTagList);

		SparkClientInfo sparkClientInfo = new SparkClientInfo();
		sparkClientInfo.setSparkClientVersion(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.SparkClientInfo.SparkClientVersion"));
		taskInfo.setSparkClientInfo(sparkClientInfo);

		CustomScheduleConfig customScheduleConfig = new CustomScheduleConfig();
		customScheduleConfig.setIntervalUnit(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.IntervalUnit"));
		customScheduleConfig.setEndTime(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.EndTime"));
		customScheduleConfig.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.SchedulePeriod"));
		customScheduleConfig.setStartTime(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.StartTime"));
		customScheduleConfig.setInterval(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.Interval"));
		taskInfo.setCustomScheduleConfig(customScheduleConfig);

		List<ContextParam> contextParamList = new ArrayList<ContextParam>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.ContextParamList.Length"); i++) {
			ContextParam contextParam = new ContextParam();
			contextParam.setDefaultValue(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ContextParamList["+ i +"].DefaultValue"));
			contextParam.setDesc(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ContextParamList["+ i +"].Desc"));
			contextParam.setParamKey(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ContextParamList["+ i +"].ParamKey"));

			contextParamList.add(contextParam);
		}
		taskInfo.setContextParamList(contextParamList);

		List<Param> paramList = new ArrayList<Param>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.ParamList.Length"); i++) {
			Param param = new Param();
			param.setValue(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ParamList["+ i +"].Value"));
			param.setKey(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ParamList["+ i +"].Key"));

			paramList.add(param);
		}
		taskInfo.setParamList(paramList);

		List<ConditionScheduleParam> conditionScheduleParamList = new ArrayList<ConditionScheduleParam>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList.Length"); i++) {
			ConditionScheduleParam conditionScheduleParam = new ConditionScheduleParam();
			conditionScheduleParam.setScheduleTime(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].ScheduleTime"));
			conditionScheduleParam.setEnable(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].Enable"));
			conditionScheduleParam.setCronExpression(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].CronExpression"));
			conditionScheduleParam.setConditionName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].ConditionName"));
			conditionScheduleParam.setFollowScheduleParam(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].FollowScheduleParam"));
			conditionScheduleParam.setNodeStatus(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].NodeStatus"));
			conditionScheduleParam.setScheduleConditionJson(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ConditionScheduleParamList["+ i +"].ScheduleConditionJson"));

			conditionScheduleParamList.add(conditionScheduleParam);
		}
		taskInfo.setConditionScheduleParamList(conditionScheduleParamList);

		List<NodeRelation> upStreamList = new ArrayList<NodeRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList.Length"); i++) {
			NodeRelation nodeRelation = new NodeRelation();
			nodeRelation.setSourceTableName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceTableName"));
			nodeRelation.setSourceNodeId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeId"));
			nodeRelation.setPeriodDiff(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].PeriodDiff"));
			nodeRelation.setNodeType(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].NodeType"));
			nodeRelation.setSourceNodeName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeName"));
			nodeRelation.setSourceNodeUserName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeUserName"));
			nodeRelation.setSourceNodeEnabled(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeEnabled"));
			nodeRelation.setDependStrategy(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].DependStrategy"));
			nodeRelation.setSourceNodeOutputName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeOutputName"));

			List<String> fieldList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].FieldList.Length"); j++) {
				fieldList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].FieldList["+ j +"]"));
			}
			nodeRelation.setFieldList(fieldList);

			DependPeriod dependPeriod = new DependPeriod();
			dependPeriod.setPeriodType(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].DependPeriod.PeriodType"));
			dependPeriod.setPeriodOffset(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].DependPeriod.PeriodOffset"));
			nodeRelation.setDependPeriod(dependPeriod);

			upStreamList.add(nodeRelation);
		}
		taskInfo.setUpStreamList(upStreamList);
		getBatchTaskInfoResponse.setTaskInfo(taskInfo);
	 
	 	return getBatchTaskInfoResponse;
	}
}