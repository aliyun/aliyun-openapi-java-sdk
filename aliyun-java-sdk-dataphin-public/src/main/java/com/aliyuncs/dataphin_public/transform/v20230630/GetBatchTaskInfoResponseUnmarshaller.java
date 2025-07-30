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
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.NodeRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.NodeRelation.DependPeriod;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.Param;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoResponse.TaskInfo.SparkClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTaskInfoResponseUnmarshaller {

	public static GetBatchTaskInfoResponse unmarshall(GetBatchTaskInfoResponse getBatchTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getBatchTaskInfoResponse.setRequestId(_ctx.stringValue("GetBatchTaskInfoResponse.RequestId"));
		getBatchTaskInfoResponse.setSuccess(_ctx.booleanValue("GetBatchTaskInfoResponse.Success"));
		getBatchTaskInfoResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTaskInfoResponse.HttpStatusCode"));
		getBatchTaskInfoResponse.setCode(_ctx.stringValue("GetBatchTaskInfoResponse.Code"));
		getBatchTaskInfoResponse.setMessage(_ctx.stringValue("GetBatchTaskInfoResponse.Message"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setFileId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.FileId"));
		taskInfo.setName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Name"));
		taskInfo.setStatus(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Status"));
		taskInfo.setPublished(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Published"));
		taskInfo.setNeedPublish(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.NeedPublish"));
		taskInfo.setHasDevNode(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.HasDevNode"));
		taskInfo.setNodeId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeId"));
		taskInfo.setNodeName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeName"));
		taskInfo.setOwnerUserId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OwnerUserId"));
		taskInfo.setOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OwnerName"));
		taskInfo.setOperatorUserId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OperatorUserId"));
		taskInfo.setNodeDescription(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeDescription"));
		taskInfo.setTaskType(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.TaskType"));
		taskInfo.setScheduleType(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.ScheduleType"));
		taskInfo.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.SchedulePeriod"));
		taskInfo.setCronExpression(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CronExpression"));
		taskInfo.setCode(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Code"));
		taskInfo.setRemark(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.Remark"));
		taskInfo.setDagId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DagId"));
		taskInfo.setRerunable(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Rerunable"));
		taskInfo.setPriority(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.Priority"));
		taskInfo.setNodeStatus(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.NodeStatus"));
		taskInfo.setPaused(_ctx.booleanValue("GetBatchTaskInfoResponse.TaskInfo.Paused"));
		taskInfo.setNodeFrom(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeFrom"));
		taskInfo.setProjectId(_ctx.longValue("GetBatchTaskInfoResponse.TaskInfo.ProjectId"));
		taskInfo.setDataSourceId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceId"));
		taskInfo.setDataSourceCatalog(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceCatalog"));
		taskInfo.setDataSourceSchema(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DataSourceSchema"));
		taskInfo.setDevelopOwnerId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerId"));
		taskInfo.setDevelopOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.DevelopOwnerName"));
		taskInfo.setOpsOwnerId(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerId"));
		taskInfo.setOpsOwnerName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.OpsOwnerName"));

		List<String> nodeOutputNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.NodeOutputNameList.Length"); i++) {
			nodeOutputNameList.add(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.NodeOutputNameList["+ i +"]"));
		}
		taskInfo.setNodeOutputNameList(nodeOutputNameList);

		CustomScheduleConfig customScheduleConfig = new CustomScheduleConfig();
		customScheduleConfig.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.SchedulePeriod"));
		customScheduleConfig.setInterval(_ctx.integerValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.Interval"));
		customScheduleConfig.setIntervalUnit(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.IntervalUnit"));
		customScheduleConfig.setStartTime(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.StartTime"));
		customScheduleConfig.setEndTime(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.CustomScheduleConfig.EndTime"));
		taskInfo.setCustomScheduleConfig(customScheduleConfig);

		SparkClientInfo sparkClientInfo = new SparkClientInfo();
		sparkClientInfo.setSparkClientVersion(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.SparkClientInfo.SparkClientVersion"));
		taskInfo.setSparkClientInfo(sparkClientInfo);

		List<Param> paramList = new ArrayList<Param>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoResponse.TaskInfo.ParamList.Length"); i++) {
			Param param = new Param();
			param.setValue(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ParamList["+ i +"].Value"));
			param.setKey(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.ParamList["+ i +"].Key"));

			paramList.add(param);
		}
		taskInfo.setParamList(paramList);

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
			nodeRelation.setSourceNodeOutputName(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeOutputName"));
			nodeRelation.setDependStrategy(_ctx.stringValue("GetBatchTaskInfoResponse.TaskInfo.UpStreamList["+ i +"].DependStrategy"));

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