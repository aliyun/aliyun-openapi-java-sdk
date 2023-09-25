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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.CommittedFile;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.Input;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.Output;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.DeletedFile;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.FileExecutionCommand;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.TableModel;
import com.aliyuncs.dataworks_public.model.v20200518.GetIDEEventDetailResponse.EventDetail.TableModel.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIDEEventDetailResponseUnmarshaller {

	public static GetIDEEventDetailResponse unmarshall(GetIDEEventDetailResponse getIDEEventDetailResponse, UnmarshallerContext _ctx) {
		
		getIDEEventDetailResponse.setRequestId(_ctx.stringValue("GetIDEEventDetailResponse.RequestId"));

		EventDetail eventDetail = new EventDetail();

		FileExecutionCommand fileExecutionCommand = new FileExecutionCommand();
		fileExecutionCommand.setFileId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.FileExecutionCommand.FileId"));
		fileExecutionCommand.setDataSourceName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.FileExecutionCommand.DataSourceName"));
		fileExecutionCommand.setContent(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.FileExecutionCommand.Content"));
		fileExecutionCommand.setFileType(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.FileExecutionCommand.FileType"));
		eventDetail.setFileExecutionCommand(fileExecutionCommand);

		DeletedFile deletedFile = new DeletedFile();
		deletedFile.setOwner(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.Owner"));
		deletedFile.setFileType(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.FileType"));
		deletedFile.setCurrentVersion(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.CurrentVersion"));
		deletedFile.setBusinessId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.BusinessId"));
		deletedFile.setFileName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.FileName"));
		deletedFile.setDataSourceName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.DataSourceName"));
		deletedFile.setUseType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.UseType"));
		deletedFile.setFolderId(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.FolderId"));
		deletedFile.setParentFileId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.ParentFileId"));
		deletedFile.setContent(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.Content"));
		deletedFile.setNodeId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.NodeId"));
		deletedFile.setFileId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.DeletedFile.FileId"));
		eventDetail.setDeletedFile(deletedFile);

		CommittedFile committedFile = new CommittedFile();
		committedFile.setFileId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FileId"));
		committedFile.setContent(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.Content"));
		committedFile.setCommittor(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.Committor"));
		committedFile.setFileType(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FileType"));
		committedFile.setChangeType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.ChangeType"));
		committedFile.setFileName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FileName"));
		committedFile.setNodeId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeId"));
		committedFile.setComment(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.Comment"));
		committedFile.setUseType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.UseType"));

		FilePropertyContent filePropertyContent = new FilePropertyContent();
		filePropertyContent.setDataSourceName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.DataSourceName"));
		filePropertyContent.setParentFileId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.ParentFileId"));
		filePropertyContent.setBusinessId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.BusinessId"));
		filePropertyContent.setCurrentVersion(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.CurrentVersion"));
		filePropertyContent.setOwner(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.Owner"));
		filePropertyContent.setFolderId(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.FilePropertyContent.FolderId"));
		committedFile.setFilePropertyContent(filePropertyContent);

		NodeConfiguration nodeConfiguration = new NodeConfiguration();
		nodeConfiguration.setRerunMode(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.RerunMode"));
		nodeConfiguration.setSchedulerType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.SchedulerType"));
		nodeConfiguration.setParaValue(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.ParaValue"));
		nodeConfiguration.setCycleType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.CycleType"));
		nodeConfiguration.setDependentNodeIdList(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.DependentNodeIdList"));
		nodeConfiguration.setResourceGroupId(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.ResourceGroupId"));
		nodeConfiguration.setAutoRerunTimes(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.AutoRerunTimes"));
		nodeConfiguration.setAutoRerunIntervalMillis(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.AutoRerunIntervalMillis"));
		nodeConfiguration.setCronExpress(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.CronExpress"));
		nodeConfiguration.setDependentType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.DependentType"));

		List<Input> inputList = new ArrayList<Input>();
		for (int i = 0; i < _ctx.lengthValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.InputList.Length"); i++) {
			Input input = new Input();
			input.setInput(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.InputList["+ i +"].Input"));
			input.setParseType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.InputList["+ i +"].ParseType"));

			inputList.add(input);
		}
		nodeConfiguration.setInputList(inputList);

		List<Output> outputList = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.OutputList.Length"); i++) {
			Output output = new Output();
			output.setRefTableName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.OutputList["+ i +"].RefTableName"));
			output.setOutput(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.CommittedFile.NodeConfiguration.OutputList["+ i +"].Output"));

			outputList.add(output);
		}
		nodeConfiguration.setOutputList(outputList);
		committedFile.setNodeConfiguration(nodeConfiguration);
		eventDetail.setCommittedFile(committedFile);

		TableModel tableModel = new TableModel();
		tableModel.setEnv(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Env"));
		tableModel.setLifeCycle(_ctx.longValue("GetIDEEventDetailResponse.EventDetail.TableModel.LifeCycle"));
		tableModel.setTableName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.TableName"));
		tableModel.setDataSourceName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.DataSourceName"));
		tableModel.setComment(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Comment"));
		tableModel.setLocation(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Location"));

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetIDEEventDetailResponse.EventDetail.TableModel.Columns.Length"); i++) {
			Column column = new Column();
			column.setColumnName(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Columns["+ i +"].ColumnName"));
			column.setColumnType(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Columns["+ i +"].ColumnType"));
			column.setIsPartitionColumn(_ctx.booleanValue("GetIDEEventDetailResponse.EventDetail.TableModel.Columns["+ i +"].IsPartitionColumn"));
			column.setComment(_ctx.stringValue("GetIDEEventDetailResponse.EventDetail.TableModel.Columns["+ i +"].Comment"));

			columns.add(column);
		}
		tableModel.setColumns(columns);
		eventDetail.setTableModel(tableModel);
		getIDEEventDetailResponse.setEventDetail(eventDetail);
	 
	 	return getIDEEventDetailResponse;
	}
}