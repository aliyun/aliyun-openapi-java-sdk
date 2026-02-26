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
		getQualityWatchResponse.setSuccess(_ctx.booleanValue("GetQualityWatchResponse.Success"));
		getQualityWatchResponse.setHttpStatusCode(_ctx.integerValue("GetQualityWatchResponse.HttpStatusCode"));
		getQualityWatchResponse.setCode(_ctx.stringValue("GetQualityWatchResponse.Code"));
		getQualityWatchResponse.setMessage(_ctx.stringValue("GetQualityWatchResponse.Message"));

		QualityWatchInfo qualityWatchInfo = new QualityWatchInfo();
		qualityWatchInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Type"));
		qualityWatchInfo.setId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.Id"));
		qualityWatchInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Name"));
		qualityWatchInfo.setStatus(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Status"));
		qualityWatchInfo.setQualityOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.QualityOwner"));
		qualityWatchInfo.setQualityOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.QualityOwnerName"));
		qualityWatchInfo.setLatestWatchTaskId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.LatestWatchTaskId"));
		qualityWatchInfo.setLatestWatchTaskStatus(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.LatestWatchTaskStatus"));
		qualityWatchInfo.setRuleCount(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.RuleCount"));
		qualityWatchInfo.setEnabledRuleCount(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.EnabledRuleCount"));
		qualityWatchInfo.setCreator(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Creator"));
		qualityWatchInfo.setCreatorName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.CreatorName"));
		qualityWatchInfo.setCreateTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.CreateTime"));
		qualityWatchInfo.setModifyTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.ModifyTime"));
		qualityWatchInfo.setModifier(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.Modifier"));

		DataSourceInfo dataSourceInfo = new DataSourceInfo();
		dataSourceInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Id"));
		dataSourceInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Name"));
		dataSourceInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Type"));
		dataSourceInfo.setCreator(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Creator"));
		dataSourceInfo.setCreatorName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.CreatorName"));
		dataSourceInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Owner"));
		dataSourceInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.OwnerName"));
		dataSourceInfo.setCreateTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.CreateTime"));
		dataSourceInfo.setModifyTime(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.ModifyTime"));
		dataSourceInfo.setEnv(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.DataSourceInfo.Env"));
		qualityWatchInfo.setDataSourceInfo(dataSourceInfo);

		TableInfo tableInfo = new TableInfo();
		tableInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Type"));
		tableInfo.setCatalog(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Catalog"));
		tableInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Id"));
		tableInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Name"));
		tableInfo.setDescription(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Description"));
		tableInfo.setEnv(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Env"));
		tableInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.Owner"));
		tableInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.OwnerName"));
		tableInfo.setBizUnitId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.BizUnitId"));
		tableInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.BizUnitName"));
		tableInfo.setProjectId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.ProjectId"));
		tableInfo.setProjectName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.ProjectName"));
		tableInfo.setDataSourceType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.DataSourceType"));
		tableInfo.setDataSourceId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.DataSourceId"));
		tableInfo.setIsPartitionTable(_ctx.booleanValue("GetQualityWatchResponse.QualityWatchInfo.TableInfo.IsPartitionTable"));
		qualityWatchInfo.setTableInfo(tableInfo);

		IndexInfo indexInfo = new IndexInfo();
		indexInfo.setProjectId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ProjectId"));
		indexInfo.setProjectName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ProjectName"));
		indexInfo.setCatalog(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Catalog"));
		indexInfo.setId(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Id"));
		indexInfo.setGuid(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Guid"));
		indexInfo.setName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Name"));
		indexInfo.setDisplayName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.DisplayName"));
		indexInfo.setGranularityId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.GranularityId"));
		indexInfo.setGranularityDisplayName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.GranularityDisplayName"));
		indexInfo.setComputeType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.ComputeType"));
		indexInfo.setCellSumLogicTableName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.CellSumLogicTableName"));
		indexInfo.setType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Type"));
		indexInfo.setBizUnitId(_ctx.longValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.BizUnitId"));
		indexInfo.setBizUnitName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.BizUnitName"));
		indexInfo.setOwner(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Owner"));
		indexInfo.setOwnerName(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.OwnerName"));
		indexInfo.setDescription(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.Description"));
		indexInfo.setDateType(_ctx.stringValue("GetQualityWatchResponse.QualityWatchInfo.IndexInfo.DateType"));
		qualityWatchInfo.setIndexInfo(indexInfo);
		getQualityWatchResponse.setQualityWatchInfo(qualityWatchInfo);
	 
	 	return getQualityWatchResponse;
	}
}