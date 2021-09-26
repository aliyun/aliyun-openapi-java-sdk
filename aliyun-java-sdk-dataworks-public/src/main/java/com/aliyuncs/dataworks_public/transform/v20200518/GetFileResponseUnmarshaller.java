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

import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse.Data.File;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse.Data.NodeConfiguration;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse.Data.NodeConfiguration.NodeInputOutput;
import com.aliyuncs.dataworks_public.model.v20200518.GetFileResponse.Data.NodeConfiguration.NodeInputOutput1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileResponseUnmarshaller {

	public static GetFileResponse unmarshall(GetFileResponse getFileResponse, UnmarshallerContext _ctx) {
		
		getFileResponse.setRequestId(_ctx.stringValue("GetFileResponse.RequestId"));
		getFileResponse.setHttpStatusCode(_ctx.integerValue("GetFileResponse.HttpStatusCode"));
		getFileResponse.setErrorMessage(_ctx.stringValue("GetFileResponse.ErrorMessage"));
		getFileResponse.setErrorCode(_ctx.stringValue("GetFileResponse.ErrorCode"));
		getFileResponse.setSuccess(_ctx.booleanValue("GetFileResponse.Success"));

		Data data = new Data();

		File file = new File();
		file.setCommitStatus(_ctx.integerValue("GetFileResponse.Data.File.CommitStatus"));
		file.setAutoParsing(_ctx.booleanValue("GetFileResponse.Data.File.AutoParsing"));
		file.setOwner(_ctx.stringValue("GetFileResponse.Data.File.Owner"));
		file.setCreateTime(_ctx.longValue("GetFileResponse.Data.File.CreateTime"));
		file.setFileType(_ctx.integerValue("GetFileResponse.Data.File.FileType"));
		file.setCurrentVersion(_ctx.integerValue("GetFileResponse.Data.File.CurrentVersion"));
		file.setBizId(_ctx.longValue("GetFileResponse.Data.File.BizId"));
		file.setLastEditUser(_ctx.stringValue("GetFileResponse.Data.File.LastEditUser"));
		file.setFileName(_ctx.stringValue("GetFileResponse.Data.File.FileName"));
		file.setConnectionName(_ctx.stringValue("GetFileResponse.Data.File.ConnectionName"));
		file.setUseType(_ctx.stringValue("GetFileResponse.Data.File.UseType"));
		file.setFileFolderId(_ctx.stringValue("GetFileResponse.Data.File.FileFolderId"));
		file.setParentId(_ctx.longValue("GetFileResponse.Data.File.ParentId"));
		file.setCreateUser(_ctx.stringValue("GetFileResponse.Data.File.CreateUser"));
		file.setIsMaxCompute(_ctx.booleanValue("GetFileResponse.Data.File.IsMaxCompute"));
		file.setBusinessId(_ctx.longValue("GetFileResponse.Data.File.BusinessId"));
		file.setFileDescription(_ctx.stringValue("GetFileResponse.Data.File.FileDescription"));
		file.setDeletedStatus(_ctx.stringValue("GetFileResponse.Data.File.DeletedStatus"));
		file.setLastEditTime(_ctx.longValue("GetFileResponse.Data.File.LastEditTime"));
		file.setContent(_ctx.stringValue("GetFileResponse.Data.File.Content"));
		file.setNodeId(_ctx.longValue("GetFileResponse.Data.File.NodeId"));
		data.setFile(file);

		NodeConfiguration nodeConfiguration = new NodeConfiguration();
		nodeConfiguration.setRerunMode(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.RerunMode"));
		nodeConfiguration.setSchedulerType(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.SchedulerType"));
		nodeConfiguration.setStop(_ctx.booleanValue("GetFileResponse.Data.NodeConfiguration.Stop"));
		nodeConfiguration.setParaValue(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.ParaValue"));
		nodeConfiguration.setStartEffectDate(_ctx.longValue("GetFileResponse.Data.NodeConfiguration.StartEffectDate"));
		nodeConfiguration.setEndEffectDate(_ctx.longValue("GetFileResponse.Data.NodeConfiguration.EndEffectDate"));
		nodeConfiguration.setCycleType(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.CycleType"));
		nodeConfiguration.setDependentNodeIdList(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.DependentNodeIdList"));
		nodeConfiguration.setResourceGroupId(_ctx.longValue("GetFileResponse.Data.NodeConfiguration.ResourceGroupId"));
		nodeConfiguration.setDependentType(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.DependentType"));
		nodeConfiguration.setAutoRerunTimes(_ctx.integerValue("GetFileResponse.Data.NodeConfiguration.AutoRerunTimes"));
		nodeConfiguration.setAutoRerunIntervalMillis(_ctx.integerValue("GetFileResponse.Data.NodeConfiguration.AutoRerunIntervalMillis"));
		nodeConfiguration.setCronExpress(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.CronExpress"));

		List<NodeInputOutput> inputList = new ArrayList<NodeInputOutput>();
		for (int i = 0; i < _ctx.lengthValue("GetFileResponse.Data.NodeConfiguration.InputList.Length"); i++) {
			NodeInputOutput nodeInputOutput = new NodeInputOutput();
			nodeInputOutput.setInput(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.InputList["+ i +"].Input"));
			nodeInputOutput.setParseType(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.InputList["+ i +"].ParseType"));

			inputList.add(nodeInputOutput);
		}
		nodeConfiguration.setInputList(inputList);

		List<NodeInputOutput1> outputList = new ArrayList<NodeInputOutput1>();
		for (int i = 0; i < _ctx.lengthValue("GetFileResponse.Data.NodeConfiguration.OutputList.Length"); i++) {
			NodeInputOutput1 nodeInputOutput1 = new NodeInputOutput1();
			nodeInputOutput1.setRefTableName(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.OutputList["+ i +"].RefTableName"));
			nodeInputOutput1.setOutput(_ctx.stringValue("GetFileResponse.Data.NodeConfiguration.OutputList["+ i +"].Output"));

			outputList.add(nodeInputOutput1);
		}
		nodeConfiguration.setOutputList(outputList);
		data.setNodeConfiguration(nodeConfiguration);
		getFileResponse.setData(data);
	 
	 	return getFileResponse;
	}
}