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

import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo.NodeRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo.NodeRelation.DependPeriod;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo.Param;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskInfoByVersionResponse.TaskInfo.SparkClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTaskInfoByVersionResponseUnmarshaller {

	public static GetBatchTaskInfoByVersionResponse unmarshall(GetBatchTaskInfoByVersionResponse getBatchTaskInfoByVersionResponse, UnmarshallerContext _ctx) {
		
		getBatchTaskInfoByVersionResponse.setRequestId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.RequestId"));
		getBatchTaskInfoByVersionResponse.setSuccess(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.Success"));
		getBatchTaskInfoByVersionResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.HttpStatusCode"));
		getBatchTaskInfoByVersionResponse.setCode(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.Code"));
		getBatchTaskInfoByVersionResponse.setMessage(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.Message"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setFileId(_ctx.longValue("GetBatchTaskInfoByVersionResponse.TaskInfo.FileId"));
		taskInfo.setName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Name"));
		taskInfo.setStatus(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Status"));
		taskInfo.setPublished(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Published"));
		taskInfo.setNeedPublish(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NeedPublish"));
		taskInfo.setHasDevNode(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.HasDevNode"));
		taskInfo.setNodeId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeId"));
		taskInfo.setNodeName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeName"));
		taskInfo.setOwnerUserId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.OwnerUserId"));
		taskInfo.setOwnerName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.OwnerName"));
		taskInfo.setOperatorUserId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.OperatorUserId"));
		taskInfo.setNodeDescription(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeDescription"));
		taskInfo.setTaskType(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.TaskType"));
		taskInfo.setScheduleType(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.ScheduleType"));
		taskInfo.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.SchedulePeriod"));
		taskInfo.setCronExpression(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CronExpression"));
		taskInfo.setCode(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Code"));
		taskInfo.setRemark(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Remark"));
		taskInfo.setDagId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.DagId"));
		taskInfo.setRerunable(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Rerunable"));
		taskInfo.setPriority(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Priority"));
		taskInfo.setNodeStatus(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeStatus"));
		taskInfo.setPaused(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.Paused"));
		taskInfo.setNodeFrom(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeFrom"));
		taskInfo.setProjectId(_ctx.longValue("GetBatchTaskInfoByVersionResponse.TaskInfo.ProjectId"));
		taskInfo.setDataSourceId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.DataSourceId"));
		taskInfo.setDataSourceCatalog(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.DataSourceCatalog"));
		taskInfo.setDataSourceSchema(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.DataSourceSchema"));

		List<String> nodeOutputNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeOutputNameList.Length"); i++) {
			nodeOutputNameList.add(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.NodeOutputNameList["+ i +"]"));
		}
		taskInfo.setNodeOutputNameList(nodeOutputNameList);

		CustomScheduleConfig customScheduleConfig = new CustomScheduleConfig();
		customScheduleConfig.setSchedulePeriod(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig.SchedulePeriod"));
		customScheduleConfig.setInterval(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig.Interval"));
		customScheduleConfig.setIntervalUnit(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig.IntervalUnit"));
		customScheduleConfig.setStartTime(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig.StartTime"));
		customScheduleConfig.setEndTime(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.CustomScheduleConfig.EndTime"));
		taskInfo.setCustomScheduleConfig(customScheduleConfig);

		SparkClientInfo sparkClientInfo = new SparkClientInfo();
		sparkClientInfo.setSparkClientVersion(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.SparkClientInfo.SparkClientVersion"));
		taskInfo.setSparkClientInfo(sparkClientInfo);

		List<Param> paramList = new ArrayList<Param>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoByVersionResponse.TaskInfo.ParamList.Length"); i++) {
			Param param = new Param();
			param.setKey(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.ParamList["+ i +"].Key"));
			param.setValue(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.ParamList["+ i +"].Value"));

			paramList.add(param);
		}
		taskInfo.setParamList(paramList);

		List<NodeRelation> upStreamList = new ArrayList<NodeRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList.Length"); i++) {
			NodeRelation nodeRelation = new NodeRelation();
			nodeRelation.setNodeType(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].NodeType"));
			nodeRelation.setSourceNodeId(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeId"));
			nodeRelation.setSourceNodeName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeName"));
			nodeRelation.setSourceNodeUserName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeUserName"));
			nodeRelation.setSourceNodeOutputName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeOutputName"));
			nodeRelation.setSourceTableName(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceTableName"));
			nodeRelation.setPeriodDiff(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].PeriodDiff"));
			nodeRelation.setDependStrategy(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].DependStrategy"));
			nodeRelation.setSourceNodeEnabled(_ctx.booleanValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].SourceNodeEnabled"));

			List<String> fieldList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].FieldList.Length"); j++) {
				fieldList.add(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].FieldList["+ j +"]"));
			}
			nodeRelation.setFieldList(fieldList);

			DependPeriod dependPeriod = new DependPeriod();
			dependPeriod.setPeriodType(_ctx.stringValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].DependPeriod.PeriodType"));
			dependPeriod.setPeriodOffset(_ctx.integerValue("GetBatchTaskInfoByVersionResponse.TaskInfo.UpStreamList["+ i +"].DependPeriod.PeriodOffset"));
			nodeRelation.setDependPeriod(dependPeriod);

			upStreamList.add(nodeRelation);
		}
		taskInfo.setUpStreamList(upStreamList);
		getBatchTaskInfoByVersionResponse.setTaskInfo(taskInfo);
	 
	 	return getBatchTaskInfoByVersionResponse;
	}
}