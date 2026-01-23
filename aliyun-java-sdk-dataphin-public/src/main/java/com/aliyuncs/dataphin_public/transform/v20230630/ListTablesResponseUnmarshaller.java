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

import com.aliyuncs.dataphin_public.model.v20230630.ListTablesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListTablesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListTablesResponse.PageResult.Table;
import com.aliyuncs.dataphin_public.model.v20230630.ListTablesResponse.PageResult.Table.StreamTableConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTablesResponseUnmarshaller {

	public static ListTablesResponse unmarshall(ListTablesResponse listTablesResponse, UnmarshallerContext _ctx) {
		
		listTablesResponse.setRequestId(_ctx.stringValue("ListTablesResponse.RequestId"));
		listTablesResponse.setSuccess(_ctx.booleanValue("ListTablesResponse.Success"));
		listTablesResponse.setHttpStatusCode(_ctx.integerValue("ListTablesResponse.HttpStatusCode"));
		listTablesResponse.setCode(_ctx.stringValue("ListTablesResponse.Code"));
		listTablesResponse.setMessage(_ctx.stringValue("ListTablesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListTablesResponse.PageResult.TotalCount"));

		List<Table> tableList = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("ListTablesResponse.PageResult.TableList.Length"); i++) {
			Table table = new Table();
			table.setGuid(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Guid"));
			table.setDataSourceId(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].DataSourceId"));
			table.setTableSizeInBytes(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].TableSizeInBytes"));
			table.setLifeCycle(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].LifeCycle"));
			table.setCreateTime(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].CreateTime"));
			table.setLastDdlTime(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].LastDdlTime"));
			table.setLastQueryTime(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].LastQueryTime"));
			table.setOwner(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Owner"));
			table.setCreator(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Creator"));
			table.setVisitCount30d(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].VisitCount30d"));
			table.setEnv(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Env"));
			table.setName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Name"));
			table.setDisplayName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].DisplayName"));
			table.setLastDmlTime(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].LastDmlTime"));
			table.setComment(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].Comment"));
			table.setBizUnitId(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].BizUnitId"));
			table.setBizUnitName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].BizUnitName"));
			table.setDataDomainId(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].DataDomainId"));
			table.setDataDomainName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].DataDomainName"));
			table.setProjectId(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].ProjectId"));
			table.setProjectName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].ProjectName"));
			table.setParentModelId(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].ParentModelId"));
			table.setFileId(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].FileId"));
			table.setIsPartitionTable(_ctx.booleanValue("ListTablesResponse.PageResult.TableList["+ i +"].IsPartitionTable"));
			table.setStorageType(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].StorageType"));
			table.setIsBasicMode(_ctx.booleanValue("ListTablesResponse.PageResult.TableList["+ i +"].IsBasicMode"));
			table.setSecurityLevel(_ctx.longValue("ListTablesResponse.PageResult.TableList["+ i +"].SecurityLevel"));
			table.setSecurityLevelName(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].SecurityLevelName"));
			table.setSecurityLevelAbbreviation(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].SecurityLevelAbbreviation"));

			List<String> assetTagList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTablesResponse.PageResult.TableList["+ i +"].AssetTagList.Length"); j++) {
				assetTagList.add(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].AssetTagList["+ j +"]"));
			}
			table.setAssetTagList(assetTagList);

			List<StreamTableConfigItem> streamTableConfig = new ArrayList<StreamTableConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTablesResponse.PageResult.TableList["+ i +"].StreamTableConfig.Length"); j++) {
				StreamTableConfigItem streamTableConfigItem = new StreamTableConfigItem();
				streamTableConfigItem.setKey(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].StreamTableConfig["+ j +"].Key"));
				streamTableConfigItem.setValue(_ctx.stringValue("ListTablesResponse.PageResult.TableList["+ i +"].StreamTableConfig["+ j +"].Value"));

				streamTableConfig.add(streamTableConfigItem);
			}
			table.setStreamTableConfig(streamTableConfig);

			tableList.add(table);
		}
		pageResult.setTableList(tableList);
		listTablesResponse.setPageResult(pageResult);
	 
	 	return listTablesResponse;
	}
}