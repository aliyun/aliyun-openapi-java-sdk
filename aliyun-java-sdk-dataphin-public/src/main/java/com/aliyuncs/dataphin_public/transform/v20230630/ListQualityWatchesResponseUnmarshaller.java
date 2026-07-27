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
		listQualityWatchesResponse.setMessage(_ctx.stringValue("ListQualityWatchesResponse.Message"));
		listQualityWatchesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityWatchesResponse.HttpStatusCode"));
		listQualityWatchesResponse.setCode(_ctx.stringValue("ListQualityWatchesResponse.Code"));
		listQualityWatchesResponse.setSuccess(_ctx.booleanValue("ListQualityWatchesResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.TotalCount"));

		List<QualityWatch> qualityWatchList = new ArrayList<QualityWatch>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityWatchesResponse.PageResult.QualityWatchList.Length"); i++) {
			QualityWatch qualityWatch = new QualityWatch();
			qualityWatch.setStatus(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Status"));
			qualityWatch.setRuleCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].RuleCount"));
			qualityWatch.setLatestWatchTaskId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].LatestWatchTaskId"));
			qualityWatch.setModifyTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].ModifyTime"));
			qualityWatch.setCreateTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].CreateTime"));
			qualityWatch.setEnabledRuleCount(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].EnabledRuleCount"));
			qualityWatch.setLatestWatchTaskStatus(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].LatestWatchTaskStatus"));
			qualityWatch.setCreator(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Creator"));
			qualityWatch.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Name"));
			qualityWatch.setQualityOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].QualityOwnerName"));
			qualityWatch.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Type"));
			qualityWatch.setQualityOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].QualityOwner"));
			qualityWatch.setId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Id"));
			qualityWatch.setModifier(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].Modifier"));
			qualityWatch.setCreatorName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].CreatorName"));

			IndexInfo indexInfo = new IndexInfo();
			indexInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Owner"));
			indexInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.OwnerName"));
			indexInfo.setDescription(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Description"));
			indexInfo.setProjectName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ProjectName"));
			indexInfo.setProjectId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ProjectId"));
			indexInfo.setGuid(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Guid"));
			indexInfo.setComputeType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.ComputeType"));
			indexInfo.setCatalog(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Catalog"));
			indexInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Name"));
			indexInfo.setGranularityDisplayName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.GranularityDisplayName"));
			indexInfo.setBizUnitId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.BizUnitId"));
			indexInfo.setCellSumLogicTableName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.CellSumLogicTableName"));
			indexInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Type"));
			indexInfo.setDisplayName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.DisplayName"));
			indexInfo.setGranularityId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.GranularityId"));
			indexInfo.setBizUnitName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.BizUnitName"));
			indexInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.Id"));
			indexInfo.setDateType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].IndexInfo.DateType"));
			qualityWatch.setIndexInfo(indexInfo);

			DataSourceInfo dataSourceInfo = new DataSourceInfo();
			dataSourceInfo.setModifyTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.ModifyTime"));
			dataSourceInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Type"));
			dataSourceInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Owner"));
			dataSourceInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.OwnerName"));
			dataSourceInfo.setCreateTime(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.CreateTime"));
			dataSourceInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Id"));
			dataSourceInfo.setCreator(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Creator"));
			dataSourceInfo.setEnv(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Env"));
			dataSourceInfo.setCreatorName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.CreatorName"));
			dataSourceInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].DataSourceInfo.Name"));
			qualityWatch.setDataSourceInfo(dataSourceInfo);

			TableInfo tableInfo = new TableInfo();
			tableInfo.setOwner(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Owner"));
			tableInfo.setOwnerName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.OwnerName"));
			tableInfo.setDescription(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Description"));
			tableInfo.setIsPartitionTable(_ctx.booleanValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.IsPartitionTable"));
			tableInfo.setProjectName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.ProjectName"));
			tableInfo.setProjectId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.ProjectId"));
			tableInfo.setEnv(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Env"));
			tableInfo.setCatalog(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Catalog"));
			tableInfo.setName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Name"));
			tableInfo.setBizUnitId(_ctx.longValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.BizUnitId"));
			tableInfo.setType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Type"));
			tableInfo.setDataSourceType(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.DataSourceType"));
			tableInfo.setBizUnitName(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.BizUnitName"));
			tableInfo.setId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.Id"));
			tableInfo.setDataSourceId(_ctx.stringValue("ListQualityWatchesResponse.PageResult.QualityWatchList["+ i +"].TableInfo.DataSourceId"));
			qualityWatch.setTableInfo(tableInfo);

			qualityWatchList.add(qualityWatch);
		}
		pageResult.setQualityWatchList(qualityWatchList);
		listQualityWatchesResponse.setPageResult(pageResult);
	 
	 	return listQualityWatchesResponse;
	}
}