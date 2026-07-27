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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchByObjectIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchByObjectIdResponse.QualityWatchInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityWatchByObjectIdResponseUnmarshaller {

	public static GetQualityWatchByObjectIdResponse unmarshall(GetQualityWatchByObjectIdResponse getQualityWatchByObjectIdResponse, UnmarshallerContext _ctx) {
		
		getQualityWatchByObjectIdResponse.setRequestId(_ctx.stringValue("GetQualityWatchByObjectIdResponse.RequestId"));
		getQualityWatchByObjectIdResponse.setMessage(_ctx.stringValue("GetQualityWatchByObjectIdResponse.Message"));
		getQualityWatchByObjectIdResponse.setHttpStatusCode(_ctx.integerValue("GetQualityWatchByObjectIdResponse.HttpStatusCode"));
		getQualityWatchByObjectIdResponse.setCode(_ctx.stringValue("GetQualityWatchByObjectIdResponse.Code"));
		getQualityWatchByObjectIdResponse.setSuccess(_ctx.booleanValue("GetQualityWatchByObjectIdResponse.Success"));

		QualityWatchInfo qualityWatchInfo = new QualityWatchInfo();
		qualityWatchInfo.setStatus(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Status"));
		qualityWatchInfo.setRuleCount(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.RuleCount"));
		qualityWatchInfo.setLatestWatchTaskId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.LatestWatchTaskId"));
		qualityWatchInfo.setModifyTime(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.ModifyTime"));
		qualityWatchInfo.setCreateTime(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.CreateTime"));
		qualityWatchInfo.setEnabledRuleCount(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.EnabledRuleCount"));
		qualityWatchInfo.setLatestWatchTaskStatus(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.LatestWatchTaskStatus"));
		qualityWatchInfo.setCreator(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Creator"));
		qualityWatchInfo.setName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Name"));
		qualityWatchInfo.setQualityOwnerName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.QualityOwnerName"));
		qualityWatchInfo.setType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Type"));
		qualityWatchInfo.setQualityOwner(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.QualityOwner"));
		qualityWatchInfo.setId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Id"));
		qualityWatchInfo.setModifier(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.Modifier"));
		qualityWatchInfo.setCreatorName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.CreatorName"));

		IndexInfo indexInfo = new IndexInfo();
		indexInfo.setOwner(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Owner"));
		indexInfo.setOwnerName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.OwnerName"));
		indexInfo.setDescription(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Description"));
		indexInfo.setProjectName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.ProjectName"));
		indexInfo.setProjectId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.ProjectId"));
		indexInfo.setGuid(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Guid"));
		indexInfo.setComputeType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.ComputeType"));
		indexInfo.setCatalog(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Catalog"));
		indexInfo.setName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Name"));
		indexInfo.setGranularityDisplayName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.GranularityDisplayName"));
		indexInfo.setBizUnitId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.BizUnitId"));
		indexInfo.setCellSumLogicTableName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.CellSumLogicTableName"));
		indexInfo.setType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Type"));
		indexInfo.setDisplayName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.DisplayName"));
		indexInfo.setGranularityId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.GranularityId"));
		indexInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.BizUnitName"));
		indexInfo.setId(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.Id"));
		indexInfo.setDateType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.IndexInfo.DateType"));
		qualityWatchInfo.setIndexInfo(indexInfo);

		DataSourceInfo dataSourceInfo = new DataSourceInfo();
		dataSourceInfo.setModifyTime(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.ModifyTime"));
		dataSourceInfo.setType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Type"));
		dataSourceInfo.setOwner(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Owner"));
		dataSourceInfo.setOwnerName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.OwnerName"));
		dataSourceInfo.setCreateTime(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.CreateTime"));
		dataSourceInfo.setId(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Id"));
		dataSourceInfo.setCreator(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Creator"));
		dataSourceInfo.setEnv(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Env"));
		dataSourceInfo.setCreatorName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.CreatorName"));
		dataSourceInfo.setName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.DataSourceInfo.Name"));
		qualityWatchInfo.setDataSourceInfo(dataSourceInfo);

		TableInfo tableInfo = new TableInfo();
		tableInfo.setOwner(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Owner"));
		tableInfo.setOwnerName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.OwnerName"));
		tableInfo.setDescription(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Description"));
		tableInfo.setIsPartitionTable(_ctx.booleanValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.IsPartitionTable"));
		tableInfo.setProjectName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.ProjectName"));
		tableInfo.setProjectId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.ProjectId"));
		tableInfo.setEnv(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Env"));
		tableInfo.setCatalog(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Catalog"));
		tableInfo.setName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Name"));
		tableInfo.setBizUnitId(_ctx.longValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.BizUnitId"));
		tableInfo.setType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Type"));
		tableInfo.setDataSourceType(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.DataSourceType"));
		tableInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.BizUnitName"));
		tableInfo.setId(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.Id"));
		tableInfo.setDataSourceId(_ctx.stringValue("GetQualityWatchByObjectIdResponse.QualityWatchInfo.TableInfo.DataSourceId"));
		qualityWatchInfo.setTableInfo(tableInfo);
		getQualityWatchByObjectIdResponse.setQualityWatchInfo(qualityWatchInfo);
	 
	 	return getQualityWatchByObjectIdResponse;
	}
}