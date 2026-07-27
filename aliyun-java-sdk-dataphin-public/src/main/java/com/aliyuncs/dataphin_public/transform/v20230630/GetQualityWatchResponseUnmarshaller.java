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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchResponse.QualityWatchInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchResponse.QualityWatchInfo.IndexInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchResponse.QualityWatchInfo.TableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityWatchResponseUnmarshaller {

	public static GetQualityWatchResponse unmarshall(GetQualityWatchResponse getQualityWatchResponse, UnmarshallerContext _ctx) {
		
		getQualityWatchResponse.setRequestId(_ctx.stringValue("GetQualityWatchResponse.RequestId"));
		getQualityWatchResponse.setMessage(_ctx.stringValue("GetQualityWatchResponse.Message"));
		getQualityWatchResponse.setHttpStatusCode(_ctx.integerValue("GetQualityWatchResponse.HttpStatusCode"));
		getQualityWatchResponse.setCode(_ctx.stringValue("GetQualityWatchResponse.Code"));
		getQualityWatchResponse.setSuccess(_ctx.booleanValue("GetQualityWatchResponse.Success"));

		QualityWatchInfo qualityWatchInfo = new QualityWatchInfo();
		qualityWatchInfo.setStatus(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Status"));
		qualityWatchInfo.setRuleCount(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.RuleCount"));
		qualityWatchInfo.setLatestWatchTaskId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.LatestWatchTaskId"));
		qualityWatchInfo.setModifyTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.ModifyTime"));
		qualityWatchInfo.setCreateTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.CreateTime"));
		qualityWatchInfo.setEnabledRuleCount(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.EnabledRuleCount"));
		qualityWatchInfo.setLatestWatchTaskStatus(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.LatestWatchTaskStatus"));
		qualityWatchInfo.setCreator(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Creator"));
		qualityWatchInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Name"));
		qualityWatchInfo.setQualityOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.QualityOwnerName"));
		qualityWatchInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Type"));
		qualityWatchInfo.setQualityOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.QualityOwner"));
		qualityWatchInfo.setId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.Id"));
		qualityWatchInfo.setModifier(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Modifier"));
		qualityWatchInfo.setCreatorName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.CreatorName"));

		IndexInfo indexInfo = new IndexInfo();
		indexInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Owner"));
		indexInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.OwnerName"));
		indexInfo.setDescription(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Description"));
		indexInfo.setProjectName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ProjectName"));
		indexInfo.setProjectId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ProjectId"));
		indexInfo.setGuid(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Guid"));
		indexInfo.setComputeType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ComputeType"));
		indexInfo.setCatalog(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Catalog"));
		indexInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Name"));
		indexInfo.setGranularityDisplayName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.GranularityDisplayName"));
		indexInfo.setBizUnitId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.BizUnitId"));
		indexInfo.setCellSumLogicTableName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.CellSumLogicTableName"));
		indexInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Type"));
		indexInfo.setDisplayName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.DisplayName"));
		indexInfo.setGranularityId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.GranularityId"));
		indexInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.BizUnitName"));
		indexInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Id"));
		indexInfo.setDateType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.DateType"));
		qualityWatchInfo.setIndexInfo(indexInfo);

		DataSourceInfo dataSourceInfo = new DataSourceInfo();
		dataSourceInfo.setModifyTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.ModifyTime"));
		dataSourceInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Type"));
		dataSourceInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Owner"));
		dataSourceInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.OwnerName"));
		dataSourceInfo.setCreateTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.CreateTime"));
		dataSourceInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Id"));
		dataSourceInfo.setCreator(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Creator"));
		dataSourceInfo.setEnv(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Env"));
		dataSourceInfo.setCreatorName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.CreatorName"));
		dataSourceInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Name"));
		qualityWatchInfo.setDataSourceInfo(dataSourceInfo);

		TableInfo tableInfo = new TableInfo();
		tableInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Owner"));
		tableInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.OwnerName"));
		tableInfo.setDescription(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Description"));
		tableInfo.setIsPartitionTable(_ctx.booleanValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.IsPartitionTable"));
		tableInfo.setProjectName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.ProjectName"));
		tableInfo.setProjectId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.ProjectId"));
		tableInfo.setEnv(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Env"));
		tableInfo.setCatalog(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Catalog"));
		tableInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Name"));
		tableInfo.setBizUnitId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.BizUnitId"));
		tableInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Type"));
		tableInfo.setDataSourceType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.DataSourceType"));
		tableInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.BizUnitName"));
		tableInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Id"));
		tableInfo.setDataSourceId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.DataSourceId"));
		qualityWatchInfo.setTableInfo(tableInfo);
		getQualityWatchResponse.setQualityWatchInfo(qualityWatchInfo);
	 
	 	return getQualityWatchResponse;
	}
}