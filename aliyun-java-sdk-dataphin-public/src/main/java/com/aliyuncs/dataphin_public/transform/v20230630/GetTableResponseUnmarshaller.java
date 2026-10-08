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

import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.Instruction;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.SimpleNodeInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.SimpleNodeInfo.BizUnit;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.SimpleNodeInfo.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.SimpleNodeInfo.Project;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableResponse.Data.StreamTableConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableResponseUnmarshaller {

	public static GetTableResponse unmarshall(GetTableResponse getTableResponse, UnmarshallerContext _ctx) {
		
		getTableResponse.setRequestId(_ctx.stringValue("GetTableResponse.RequestId"));
		getTableResponse.setMessage(_ctx.stringValue("GetTableResponse.Message"));
		getTableResponse.setHttpStatusCode(_ctx.integerValue("GetTableResponse.HttpStatusCode"));
		getTableResponse.setCode(_ctx.stringValue("GetTableResponse.Code"));
		getTableResponse.setSuccess(_ctx.booleanValue("GetTableResponse.Success"));

		Data data = new Data();
		data.setLifeCycle(_ctx.longValue("GetTableResponse.Data.LifeCycle"));
		data.setOwner(_ctx.stringValue("GetTableResponse.Data.Owner"));
		data.setIsPartitionTable(_ctx.booleanValue("GetTableResponse.Data.IsPartitionTable"));
		data.setTableSizeInBytes(_ctx.longValue("GetTableResponse.Data.TableSizeInBytes"));
		data.setProjectName(_ctx.stringValue("GetTableResponse.Data.ProjectName"));
		data.setGuid(_ctx.stringValue("GetTableResponse.Data.Guid"));
		data.setCreator(_ctx.stringValue("GetTableResponse.Data.Creator"));
		data.setEnv(_ctx.stringValue("GetTableResponse.Data.Env"));
		data.setName(_ctx.stringValue("GetTableResponse.Data.Name"));
		data.setDataDomainId(_ctx.longValue("GetTableResponse.Data.DataDomainId"));
		data.setBizUnitId(_ctx.longValue("GetTableResponse.Data.BizUnitId"));
		data.setSecurityLevel(_ctx.longValue("GetTableResponse.Data.SecurityLevel"));
		data.setDisplayName(_ctx.stringValue("GetTableResponse.Data.DisplayName"));
		data.setLastDmlTime(_ctx.stringValue("GetTableResponse.Data.LastDmlTime"));
		data.setBizUnitName(_ctx.stringValue("GetTableResponse.Data.BizUnitName"));
		data.setIsBasicMode(_ctx.booleanValue("GetTableResponse.Data.IsBasicMode"));
		data.setComment(_ctx.stringValue("GetTableResponse.Data.Comment"));
		data.setStorageType(_ctx.stringValue("GetTableResponse.Data.StorageType"));
		data.setLastDdlTime(_ctx.stringValue("GetTableResponse.Data.LastDdlTime"));
		data.setCreateTime(_ctx.stringValue("GetTableResponse.Data.CreateTime"));
		data.setLastQueryTime(_ctx.stringValue("GetTableResponse.Data.LastQueryTime"));
		data.setParentModelId(_ctx.stringValue("GetTableResponse.Data.ParentModelId"));
		data.setProjectId(_ctx.longValue("GetTableResponse.Data.ProjectId"));
		data.setVisitCount30d(_ctx.longValue("GetTableResponse.Data.VisitCount30d"));
		data.setSecurityLevelName(_ctx.stringValue("GetTableResponse.Data.SecurityLevelName"));
		data.setDataDomainName(_ctx.stringValue("GetTableResponse.Data.DataDomainName"));
		data.setFileId(_ctx.stringValue("GetTableResponse.Data.FileId"));
		data.setDataSourceId(_ctx.longValue("GetTableResponse.Data.DataSourceId"));
		data.setSecurityLevelAbbreviation(_ctx.stringValue("GetTableResponse.Data.SecurityLevelAbbreviation"));

		List<String> assetTags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Data.AssetTags.Length"); i++) {
			assetTags.add(_ctx.stringValue("GetTableResponse.Data.AssetTags["+ i +"]"));
		}
		data.setAssetTags(assetTags);

		List<String> nodeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Data.NodeIds.Length"); i++) {
			nodeIds.add(_ctx.stringValue("GetTableResponse.Data.NodeIds["+ i +"]"));
		}
		data.setNodeIds(nodeIds);

		List<StreamTableConfigItem> streamTableConfig = new ArrayList<StreamTableConfigItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Data.StreamTableConfig.Length"); i++) {
			StreamTableConfigItem streamTableConfigItem = new StreamTableConfigItem();
			streamTableConfigItem.setValue(_ctx.stringValue("GetTableResponse.Data.StreamTableConfig["+ i +"].Value"));
			streamTableConfigItem.setKey(_ctx.stringValue("GetTableResponse.Data.StreamTableConfig["+ i +"].Key"));

			streamTableConfig.add(streamTableConfigItem);
		}
		data.setStreamTableConfig(streamTableConfig);

		List<Instruction> instructions = new ArrayList<Instruction>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Data.Instructions.Length"); i++) {
			Instruction instruction = new Instruction();
			instruction.setGmtCreate(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].GmtCreate"));
			instruction.setOwnerId(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].OwnerId"));
			instruction.setContent(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].Content"));
			instruction.setGmtModified(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].GmtModified"));
			instruction.setTitle(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].Title"));
			instruction.setOwnerNickName(_ctx.stringValue("GetTableResponse.Data.Instructions["+ i +"].OwnerNickName"));

			instructions.add(instruction);
		}
		data.setInstructions(instructions);

		List<SimpleNodeInfo> simpleNodeInfos = new ArrayList<SimpleNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Data.SimpleNodeInfos.Length"); i++) {
			SimpleNodeInfo simpleNodeInfo = new SimpleNodeInfo();
			simpleNodeInfo.setNodeName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].NodeName"));
			simpleNodeInfo.setNodeId(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].NodeId"));
			simpleNodeInfo.setNodeScheduleType(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].NodeScheduleType"));
			simpleNodeInfo.setEnv(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Env"));
			simpleNodeInfo.setSubBizType(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].SubBizType"));

			BizUnit bizUnit = new BizUnit();
			bizUnit.setBizUnitId(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].BizUnit.BizUnitId"));
			bizUnit.setBizUnitDisplayName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].BizUnit.BizUnitDisplayName"));
			bizUnit.setBizUnitName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].BizUnit.BizUnitName"));
			simpleNodeInfo.setBizUnit(bizUnit);

			Project project = new Project();
			project.setProjectDisplayName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Project.ProjectDisplayName"));
			project.setProjectName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Project.ProjectName"));
			project.setProjectId(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Project.ProjectId"));
			simpleNodeInfo.setProject(project);

			List<Owner> owners = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Owners.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserId(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Owners["+ j +"].UserId"));
				owner.setDisplayName(_ctx.stringValue("GetTableResponse.Data.SimpleNodeInfos["+ i +"].Owners["+ j +"].DisplayName"));

				owners.add(owner);
			}
			simpleNodeInfo.setOwners(owners);

			simpleNodeInfos.add(simpleNodeInfo);
		}
		data.setSimpleNodeInfos(simpleNodeInfos);
		getTableResponse.setData(data);
	 
	 	return getTableResponse;
	}
}