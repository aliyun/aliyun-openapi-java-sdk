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

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse.PageResult.QualityWatch;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse.PageResult.QualityWatch.DataSourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse.PageResult.QualityWatch.IndexInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchesResponse.PageResult.QualityWatch.TableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityWatchesResponseUnmarshaller {

	public static ListQualityWatchesResponse unmarshall(ListQualityWatchesResponse listQualityWatchesResponse, UnmarshallerContext _ctx) {
		
		listQualityWatchesResponse.setRequestId(_ctx.stringValue("ListQualityWatchesResponse.RequestId"));
		listQualityWatchesResponse.setSuccess(_ctx.booleanValue("ListQualityWatchesResponse.Success"));
		listQualityWatchesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityWatchesResponse.HttpStatusCode"));
		listQualityWatchesResponse.setCode(_ctx.stringValue("ListQualityWatchesResponse.Code"));
		listQualityWatchesResponse.setMessage(_ctx.stringValue("ListQualityWatchesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.TotalCount"));

		List<QualityWatch> qualityWatchList = new ArrayList<QualityWatch>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityWatchesResponse.PageResult.QualityWatchList.Length"); i++) {
			QualityWatch qualityWatch = new QualityWatch();
			qualityWatch.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Type"));
			qualityWatch.setId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Id"));
			qualityWatch.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Name"));
			qualityWatch.setStatus(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Status"));
			qualityWatch.setQualityOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].QualityOwner"));
			qualityWatch.setQualityOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].QualityOwnerName"));
			qualityWatch.setLatestWatchTaskId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].LatestWatchTaskId"));
			qualityWatch.setLatestWatchTaskStatus(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].LatestWatchTaskStatus"));
			qualityWatch.setRuleCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].RuleCount"));
			qualityWatch.setEnabledRuleCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].EnabledRuleCount"));
			qualityWatch.setCreator(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Creator"));
			qualityWatch.setCreatorName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].CreatorName"));
			qualityWatch.setCreateTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].CreateTime"));
			qualityWatch.setModifyTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].ModifyTime"));
			qualityWatch.setModifier(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Modifier"));

			DataSourceInfo dataSourceInfo = new DataSourceInfo();
			dataSourceInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Id"));
			dataSourceInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Name"));
			dataSourceInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Type"));
			dataSourceInfo.setCreator(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Creator"));
			dataSourceInfo.setCreatorName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.CreatorName"));
			dataSourceInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Owner"));
			dataSourceInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.OwnerName"));
			dataSourceInfo.setCreateTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.CreateTime"));
			dataSourceInfo.setModifyTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.ModifyTime"));
			dataSourceInfo.setEnv(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Env"));
			qualityWatch.setDataSourceInfo(dataSourceInfo);

			TableInfo tableInfo = new TableInfo();
			tableInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Type"));
			tableInfo.setCatalog(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Catalog"));
			tableInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Id"));
			tableInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Name"));
			tableInfo.setDescription(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Description"));
			tableInfo.setEnv(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Env"));
			tableInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Owner"));
			tableInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.OwnerName"));
			tableInfo.setBizUnitId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.BizUnitId"));
			tableInfo.setBizUnitName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.BizUnitName"));
			tableInfo.setProjectId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.ProjectId"));
			tableInfo.setProjectName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.ProjectName"));
			tableInfo.setDataSourceType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.DataSourceType"));
			tableInfo.setDataSourceId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.DataSourceId"));
			tableInfo.setIsPartitionTable(_ctx.booleanValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.IsPartitionTable"));
			qualityWatch.setTableInfo(tableInfo);

			IndexInfo indexInfo = new IndexInfo();
			indexInfo.setProjectId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ProjectId"));
			indexInfo.setProjectName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ProjectName"));
			indexInfo.setCatalog(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Catalog"));
			indexInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Id"));
			indexInfo.setGuid(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Guid"));
			indexInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Name"));
			indexInfo.setDisplayName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.DisplayName"));
			indexInfo.setGranularityId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.GranularityId"));
			indexInfo.setGranularityDisplayName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.GranularityDisplayName"));
			indexInfo.setComputeType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ComputeType"));
			indexInfo.setCellSumLogicTableName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.CellSumLogicTableName"));
			indexInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Type"));
			indexInfo.setBizUnitId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.BizUnitId"));
			indexInfo.setBizUnitName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.BizUnitName"));
			indexInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Owner"));
			indexInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.OwnerName"));
			indexInfo.setDescription(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Description"));
			indexInfo.setDateType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.DateType"));
			qualityWatch.setIndexInfo(indexInfo);

			qualityWatchList.add(qualityWatch);
		}
		pageResult.setQualityWatchList(qualityWatchList);
		listQualityWatchesResponse.setPageResult(pageResult);
	 
	 	return listQualityWatchesResponse;
	}
}