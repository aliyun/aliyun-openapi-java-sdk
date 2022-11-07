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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.DestConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Label;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.SourceConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Step;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Step.ExtraInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Step.ExtraInfo.ErrorDetail1;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Step.StepInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.Step.StepInfo.ConnectorFullProgressOverview;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferMapping;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Database;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Database.Table;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Database.Table.AdbTableSchema;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectResponse.ErrorDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOmsOpenAPIProjectResponseUnmarshaller {

	public static DescribeOmsOpenAPIProjectResponse unmarshall(DescribeOmsOpenAPIProjectResponse describeOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		describeOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.RequestId"));
		describeOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Success"));
		describeOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Code"));
		describeOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Message"));
		describeOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Advice"));
		describeOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.PageNumber"));
		describeOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.PageSize"));
		describeOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.TotalCount"));
		describeOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Cost"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		describeOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);

		Data data = new Data();
		data.setProjectId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.ProjectId"));
		data.setProjectName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.ProjectName"));
		data.setProjectOwner(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.ProjectOwner"));
		data.setBusinessName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.BusinessName"));

		SourceConfig sourceConfig = new SourceConfig();
		sourceConfig.setEndpointType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.EndpointType"));
		sourceConfig.setEndpointId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.EndpointId"));
		sourceConfig.setPartitionMode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.PartitionMode"));
		sourceConfig.setPartition(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.Partition"));
		sourceConfig.setSerializerType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.SerializerType"));
		sourceConfig.setTopicType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.TopicType"));
		sourceConfig.setSequenceEnable(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.SequenceEnable"));
		sourceConfig.setSequenceStartTimestamp(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.SequenceStartTimestamp"));
		sourceConfig.setProducerGroup(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.ProducerGroup"));
		sourceConfig.setMsgTags(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.MsgTags"));
		sourceConfig.setEnableMsgTrace(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.EnableMsgTrace"));
		sourceConfig.setSendMsgTimeout(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.SourceConfig.SendMsgTimeout"));
		data.setSourceConfig(sourceConfig);

		DestConfig destConfig = new DestConfig();
		destConfig.setEndpointType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.EndpointType"));
		destConfig.setEndpointId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.EndpointId"));
		destConfig.setPartitionMode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.PartitionMode"));
		destConfig.setPartition(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.Partition"));
		destConfig.setSerializerType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.SerializerType"));
		destConfig.setTopicType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.TopicType"));
		destConfig.setSequenceEnable(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.SequenceEnable"));
		destConfig.setSequenceStartTimestamp(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.SequenceStartTimestamp"));
		destConfig.setProducerGroup(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.ProducerGroup"));
		destConfig.setMsgTags(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.MsgTags"));
		destConfig.setEnableMsgTrace(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.EnableMsgTrace"));
		destConfig.setSendMsgTimeout(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.DestConfig.SendMsgTimeout"));
		data.setDestConfig(destConfig);

		TransferMapping transferMapping = new TransferMapping();
		transferMapping.setMode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Mode"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases.Length"); i++) {
			Database database = new Database();
			database.setTenantName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].TenantName"));
			database.setMappedName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].MappedName"));
			database.setDatabaseId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].DatabaseId"));
			database.setDatabaseName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].DatabaseName"));
			database.setType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Type"));

			List<Table> tables = new ArrayList<Table>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables.Length"); j++) {
				Table table = new Table();
				table.setMappedName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].MappedName"));
				table.setTableId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].TableId"));
				table.setTableName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].TableName"));
				table.setWhereClause(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].WhereClause"));
				table.setType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].Type"));

				List<String> filterColumns = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].FilterColumns.Length"); k++) {
					filterColumns.add(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].FilterColumns["+ k +"]"));
				}
				table.setFilterColumns(filterColumns);

				List<String> shardColumns = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].ShardColumns.Length"); k++) {
					shardColumns.add(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].ShardColumns["+ k +"]"));
				}
				table.setShardColumns(shardColumns);

				AdbTableSchema adbTableSchema = new AdbTableSchema();
				adbTableSchema.setPartitionStatement(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.PartitionStatement"));
				adbTableSchema.setPartitionLifeCycle(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.PartitionLifeCycle"));

				List<String> primaryKeys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.PrimaryKeys.Length"); k++) {
					primaryKeys.add(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.PrimaryKeys["+ k +"]"));
				}
				adbTableSchema.setPrimaryKeys(primaryKeys);

				List<String> distributedKeys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.DistributedKeys.Length"); k++) {
					distributedKeys.add(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferMapping.Databases["+ i +"].Tables["+ j +"].AdbTableSchema.DistributedKeys["+ k +"]"));
				}
				adbTableSchema.setDistributedKeys(distributedKeys);
				table.setAdbTableSchema(adbTableSchema);

				tables.add(table);
			}
			database.setTables(tables);

			databases.add(database);
		}
		transferMapping.setDatabases(databases);
		data.setTransferMapping(transferMapping);

		TransferStepConfig transferStepConfig = new TransferStepConfig();
		transferStepConfig.setEnableStructSync(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.EnableStructSync"));
		transferStepConfig.setEnableFullSync(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.EnableFullSync"));
		transferStepConfig.setEnableIncrSync(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.EnableIncrSync"));

		IncrSyncStepTransferConfig incrSyncStepTransferConfig = new IncrSyncStepTransferConfig();
		incrSyncStepTransferConfig.setStartTimestamp(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.StartTimestamp"));
		incrSyncStepTransferConfig.setStoreLogKeptHour(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.StoreLogKeptHour"));
		incrSyncStepTransferConfig.setStoreTransactionEnabled(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.StoreTransactionEnabled"));
		incrSyncStepTransferConfig.setTransferStepType(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.TransferStepType"));

		List<String> recordTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.RecordTypeList.Length"); i++) {
			recordTypeList.add(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.TransferStepConfig.IncrSyncStepTransferConfig.RecordTypeList["+ i +"]"));
		}
		incrSyncStepTransferConfig.setRecordTypeList(recordTypeList);
		transferStepConfig.setIncrSyncStepTransferConfig(incrSyncStepTransferConfig);
		data.setTransferStepConfig(transferStepConfig);

		List<Label> labels = new ArrayList<Label>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.Labels.Length"); i++) {
			Label label = new Label();
			label.setId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Labels["+ i +"].Id"));
			label.setName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Labels["+ i +"].Name"));
			label.setCreator(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Labels["+ i +"].Creator"));
			label.setCount(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.Labels["+ i +"].Count"));

			labels.add(label);
		}
		data.setLabels(labels);

		List<Step> steps = new ArrayList<Step>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.Steps.Length"); i++) {
			Step step = new Step();
			step.setStepOrder(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepOrder"));
			step.setStepName(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepName"));
			step.setStepDescription(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepDescription"));
			step.setStepStatus(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepStatus"));
			step.setStepProgress(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepProgress"));
			step.setStartTime(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StartTime"));
			step.setEstimatedRemainingSeconds(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].EstimatedRemainingSeconds"));
			step.setFinishTime(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].FinishTime"));
			step.setInteractive(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].Interactive"));

			StepInfo stepInfo = new StepInfo();
			stepInfo.setJobId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.JobId"));
			stepInfo.setIncrTimestampCheckpoint(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.IncrTimestampCheckpoint"));
			stepInfo.setCheckpoint(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Checkpoint"));
			stepInfo.setGmt(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Gmt"));
			stepInfo.setValidated(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Validated"));
			stepInfo.setSkipped(_ctx.booleanValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Skipped"));
			stepInfo.setInconsistencies(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Inconsistencies"));
			stepInfo.setDeployId(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DeployId"));
			stepInfo.setProcessedRecords(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.ProcessedRecords"));
			stepInfo.setCapacity(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.Capacity"));
			stepInfo.setSrcRps(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcRps"));
			stepInfo.setSrcRt(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcRt"));
			stepInfo.setSrcIops(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcIops"));
			stepInfo.setDstRps(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DstRps"));
			stepInfo.setDstRt(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DstRt"));
			stepInfo.setDstIops(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DstIops"));
			stepInfo.setSrcRpsRef(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcRpsRef"));
			stepInfo.setSrcRtRef(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcRtRef"));
			stepInfo.setDstRpsRef(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DstRpsRef"));
			stepInfo.setDstRtRef(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.DstRtRef"));
			stepInfo.setSrcIopsRef(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.SrcIopsRef"));

			ConnectorFullProgressOverview connectorFullProgressOverview = new ConnectorFullProgressOverview();
			connectorFullProgressOverview.setEstimatedTotalCount(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.ConnectorFullProgressOverview.EstimatedTotalCount"));
			connectorFullProgressOverview.setFinishedCount(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.ConnectorFullProgressOverview.FinishedCount"));
			connectorFullProgressOverview.setProgress(_ctx.integerValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.ConnectorFullProgressOverview.Progress"));
			connectorFullProgressOverview.setEstimatedRemainingTimeOfSec(_ctx.longValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].StepInfo.ConnectorFullProgressOverview.EstimatedRemainingTimeOfSec"));
			stepInfo.setConnectorFullProgressOverview(connectorFullProgressOverview);
			step.setStepInfo(stepInfo);

			ExtraInfo extraInfo = new ExtraInfo();
			extraInfo.setErrorCode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorCode"));
			extraInfo.setErrorMsg(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorMsg"));
			extraInfo.setErrorParam(_ctx.mapValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorParam"));
			extraInfo.setFailedTime(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.FailedTime"));

			List<ErrorDetail1> errorDetails = new ArrayList<ErrorDetail1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorDetails.Length"); j++) {
				ErrorDetail1 errorDetail1 = new ErrorDetail1();
				errorDetail1.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Code"));
				errorDetail1.setLevel(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Level"));
				errorDetail1.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Message"));
				errorDetail1.setProposal(_ctx.stringValue("DescribeOmsOpenAPIProjectResponse.Data.Steps["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Proposal"));

				errorDetails.add(errorDetail1);
			}
			extraInfo.setErrorDetails(errorDetails);
			step.setExtraInfo(extraInfo);

			steps.add(step);
		}
		data.setSteps(steps);
		describeOmsOpenAPIProjectResponse.setData(data);
	 
	 	return describeOmsOpenAPIProjectResponse;
	}
}