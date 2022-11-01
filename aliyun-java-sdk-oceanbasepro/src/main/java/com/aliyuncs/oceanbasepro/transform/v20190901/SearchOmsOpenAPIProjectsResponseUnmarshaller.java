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

import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.DestConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Label;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.SourceConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Step;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Step.ExtraInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Step.ExtraInfo.ErrorDetail;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Step.StepInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.Step.StepInfo.ConnectorFullProgressOverview;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferMapping;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferMapping.Database;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferMapping.Database.Table;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferMapping.Database.Table.AdbTableSchema;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferStepConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.DataItem.TransferStepConfig.IncrSyncStepTransferConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIProjectsResponse.ErrorDetail1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchOmsOpenAPIProjectsResponseUnmarshaller {

	public static SearchOmsOpenAPIProjectsResponse unmarshall(SearchOmsOpenAPIProjectsResponse searchOmsOpenAPIProjectsResponse, UnmarshallerContext _ctx) {
		
		searchOmsOpenAPIProjectsResponse.setRequestId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.RequestId"));
		searchOmsOpenAPIProjectsResponse.setSuccess(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Success"));
		searchOmsOpenAPIProjectsResponse.setCode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Code"));
		searchOmsOpenAPIProjectsResponse.setMessage(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Message"));
		searchOmsOpenAPIProjectsResponse.setAdvice(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Advice"));
		searchOmsOpenAPIProjectsResponse.setPageNumber(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.PageNumber"));
		searchOmsOpenAPIProjectsResponse.setPageSize(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.PageSize"));
		searchOmsOpenAPIProjectsResponse.setTotalCount(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.TotalCount"));
		searchOmsOpenAPIProjectsResponse.setCost(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Cost"));

		ErrorDetail1 errorDetail1 = new ErrorDetail1();
		errorDetail1.setCode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.ErrorDetail.Code"));
		errorDetail1.setLevel(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.ErrorDetail.Level"));
		errorDetail1.setMessage(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.ErrorDetail.Message"));
		errorDetail1.setProposal(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.ErrorDetail.Proposal"));
		searchOmsOpenAPIProjectsResponse.setErrorDetail1(errorDetail1);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProjectId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].ProjectId"));
			dataItem.setProjectName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectOwner(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].ProjectOwner"));
			dataItem.setBusinessName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].BusinessName"));

			SourceConfig sourceConfig = new SourceConfig();
			sourceConfig.setEndpointType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.EndpointType"));
			sourceConfig.setEndpointId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.EndpointId"));
			sourceConfig.setPartitionMode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.PartitionMode"));
			sourceConfig.setPartition(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.Partition"));
			sourceConfig.setSerializerType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.SerializerType"));
			sourceConfig.setTopicType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.TopicType"));
			sourceConfig.setSequenceEnable(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.SequenceEnable"));
			sourceConfig.setSequenceStartTimestamp(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.SequenceStartTimestamp"));
			sourceConfig.setProducerGroup(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.ProducerGroup"));
			sourceConfig.setMsgTags(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.MsgTags"));
			sourceConfig.setEnableMsgTrace(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.EnableMsgTrace"));
			sourceConfig.setSendMsgTimeout(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].SourceConfig.SendMsgTimeout"));
			dataItem.setSourceConfig(sourceConfig);

			DestConfig destConfig = new DestConfig();
			destConfig.setEndpointType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.EndpointType"));
			destConfig.setEndpointId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.EndpointId"));
			destConfig.setPartitionMode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.PartitionMode"));
			destConfig.setPartition(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.Partition"));
			destConfig.setSerializerType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.SerializerType"));
			destConfig.setTopicType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.TopicType"));
			destConfig.setSequenceEnable(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.SequenceEnable"));
			destConfig.setSequenceStartTimestamp(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.SequenceStartTimestamp"));
			destConfig.setProducerGroup(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.ProducerGroup"));
			destConfig.setMsgTags(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.MsgTags"));
			destConfig.setEnableMsgTrace(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.EnableMsgTrace"));
			destConfig.setSendMsgTimeout(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].DestConfig.SendMsgTimeout"));
			dataItem.setDestConfig(destConfig);

			TransferMapping transferMapping = new TransferMapping();
			transferMapping.setMode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Mode"));

			List<Database> databases = new ArrayList<Database>();
			for (int j = 0; j < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases.Length"); j++) {
				Database database = new Database();
				database.setTenantName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].TenantName"));
				database.setMappedName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].MappedName"));
				database.setDatabaseId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].DatabaseId"));
				database.setDatabaseName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].DatabaseName"));
				database.setType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Type"));

				List<Table> tables = new ArrayList<Table>();
				for (int k = 0; k < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables.Length"); k++) {
					Table table = new Table();
					table.setMappedName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].MappedName"));
					table.setTableId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].TableId"));
					table.setTableName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].TableName"));
					table.setWhereClause(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].WhereClause"));
					table.setType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].Type"));

					List<String> filterColumns = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].FilterColumns.Length"); l++) {
						filterColumns.add(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].FilterColumns["+ l +"]"));
					}
					table.setFilterColumns(filterColumns);

					List<String> shardColumns = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].ShardColumns.Length"); l++) {
						shardColumns.add(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].ShardColumns["+ l +"]"));
					}
					table.setShardColumns(shardColumns);

					AdbTableSchema adbTableSchema = new AdbTableSchema();
					adbTableSchema.setPartitionStatement(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.PartitionStatement"));
					adbTableSchema.setPartitionLifeCycle(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.PartitionLifeCycle"));

					List<String> primaryKeys = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.PrimaryKeys.Length"); l++) {
						primaryKeys.add(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.PrimaryKeys["+ l +"]"));
					}
					adbTableSchema.setPrimaryKeys(primaryKeys);

					List<String> distributedKeys = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.DistributedKeys.Length"); l++) {
						distributedKeys.add(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferMapping.Databases["+ j +"].Tables["+ k +"].AdbTableSchema.DistributedKeys["+ l +"]"));
					}
					adbTableSchema.setDistributedKeys(distributedKeys);
					table.setAdbTableSchema(adbTableSchema);

					tables.add(table);
				}
				database.setTables(tables);

				databases.add(database);
			}
			transferMapping.setDatabases(databases);
			dataItem.setTransferMapping(transferMapping);

			TransferStepConfig transferStepConfig = new TransferStepConfig();
			transferStepConfig.setEnableStructSync(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.EnableStructSync"));
			transferStepConfig.setEnableFullSync(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.EnableFullSync"));
			transferStepConfig.setEnableIncrSync(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.EnableIncrSync"));

			IncrSyncStepTransferConfig incrSyncStepTransferConfig = new IncrSyncStepTransferConfig();
			incrSyncStepTransferConfig.setStartTimestamp(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.StartTimestamp"));
			incrSyncStepTransferConfig.setStoreLogKeptHour(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.StoreLogKeptHour"));
			incrSyncStepTransferConfig.setStoreTransactionEnabled(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.StoreTransactionEnabled"));
			incrSyncStepTransferConfig.setTransferStepType(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.TransferStepType"));

			List<String> recordTypeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.RecordTypeList.Length"); j++) {
				recordTypeList.add(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].TransferStepConfig.IncrSyncStepTransferConfig.RecordTypeList["+ j +"]"));
			}
			incrSyncStepTransferConfig.setRecordTypeList(recordTypeList);
			transferStepConfig.setIncrSyncStepTransferConfig(incrSyncStepTransferConfig);
			dataItem.setTransferStepConfig(transferStepConfig);

			List<Label> labels = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Labels["+ j +"].Id"));
				label.setName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Labels["+ j +"].Name"));
				label.setCreator(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Labels["+ j +"].Creator"));
				label.setCount(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Labels["+ j +"].Count"));

				labels.add(label);
			}
			dataItem.setLabels(labels);

			List<Step> steps = new ArrayList<Step>();
			for (int j = 0; j < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps.Length"); j++) {
				Step step = new Step();
				step.setStepOrder(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepOrder"));
				step.setStepName(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepName"));
				step.setStepDescription(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepDescription"));
				step.setStepStatus(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepStatus"));
				step.setStepProgress(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepProgress"));
				step.setStartTime(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StartTime"));
				step.setEstimatedRemainingSeconds(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].EstimatedRemainingSeconds"));
				step.setFinishTime(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].FinishTime"));
				step.setInteractive(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].Interactive"));

				StepInfo stepInfo = new StepInfo();
				stepInfo.setJobId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.JobId"));
				stepInfo.setIncrTimestampCheckpoint(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.IncrTimestampCheckpoint"));
				stepInfo.setCheckpoint(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Checkpoint"));
				stepInfo.setGmt(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Gmt"));
				stepInfo.setValidated(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Validated"));
				stepInfo.setSkipped(_ctx.booleanValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Skipped"));
				stepInfo.setInconsistencies(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Inconsistencies"));
				stepInfo.setDeployId(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DeployId"));
				stepInfo.setProcessedRecords(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.ProcessedRecords"));
				stepInfo.setCapacity(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.Capacity"));
				stepInfo.setSrcRps(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcRps"));
				stepInfo.setSrcRt(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcRt"));
				stepInfo.setSrcIops(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcIops"));
				stepInfo.setDstRps(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DstRps"));
				stepInfo.setDstRt(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DstRt"));
				stepInfo.setDstIops(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DstIops"));
				stepInfo.setSrcRpsRef(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcRpsRef"));
				stepInfo.setSrcRtRef(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcRtRef"));
				stepInfo.setDstRpsRef(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DstRpsRef"));
				stepInfo.setDstRtRef(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.DstRtRef"));
				stepInfo.setSrcIopsRef(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.SrcIopsRef"));

				ConnectorFullProgressOverview connectorFullProgressOverview = new ConnectorFullProgressOverview();
				connectorFullProgressOverview.setEstimatedTotalCount(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.ConnectorFullProgressOverview.EstimatedTotalCount"));
				connectorFullProgressOverview.setFinishedCount(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.ConnectorFullProgressOverview.FinishedCount"));
				connectorFullProgressOverview.setProgress(_ctx.integerValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.ConnectorFullProgressOverview.Progress"));
				connectorFullProgressOverview.setEstimatedRemainingTimeOfSec(_ctx.longValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].StepInfo.ConnectorFullProgressOverview.EstimatedRemainingTimeOfSec"));
				stepInfo.setConnectorFullProgressOverview(connectorFullProgressOverview);
				step.setStepInfo(stepInfo);

				ExtraInfo extraInfo = new ExtraInfo();
				extraInfo.setErrorCode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorCode"));
				extraInfo.setErrorMsg(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorMsg"));
				extraInfo.setErrorParam(_ctx.mapValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorParam"));
				extraInfo.setFailedTime(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.FailedTime"));

				List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();
				for (int k = 0; k < _ctx.lengthValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorDetails.Length"); k++) {
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setCode(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorDetails["+ k +"].Code"));
					errorDetail.setLevel(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorDetails["+ k +"].Level"));
					errorDetail.setMessage(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorDetails["+ k +"].Message"));
					errorDetail.setProposal(_ctx.stringValue("SearchOmsOpenAPIProjectsResponse.Data["+ i +"].Steps["+ j +"].ExtraInfo.ErrorDetails["+ k +"].Proposal"));

					errorDetails.add(errorDetail);
				}
				extraInfo.setErrorDetails(errorDetails);
				step.setExtraInfo(extraInfo);

				steps.add(step);
			}
			dataItem.setSteps(steps);

			data.add(dataItem);
		}
		searchOmsOpenAPIProjectsResponse.setData(data);
	 
	 	return searchOmsOpenAPIProjectsResponse;
	}
}