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

import com.aliyuncs.dataphin_public.model.v20230630.GetTableLineagesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableLineagesResponse.TableLineage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableLineagesResponseUnmarshaller {

	public static GetTableLineagesResponse unmarshall(GetTableLineagesResponse getTableLineagesResponse, UnmarshallerContext _ctx) {
		
		getTableLineagesResponse.setRequestId(_ctx.stringValue("GetTableLineagesResponse.RequestId"));
		getTableLineagesResponse.setMessage(_ctx.stringValue("GetTableLineagesResponse.Message"));
		getTableLineagesResponse.setHttpStatusCode(_ctx.integerValue("GetTableLineagesResponse.HttpStatusCode"));
		getTableLineagesResponse.setCode(_ctx.stringValue("GetTableLineagesResponse.Code"));
		getTableLineagesResponse.setSuccess(_ctx.booleanValue("GetTableLineagesResponse.Success"));

		List<TableLineage> tableLineageList = new ArrayList<TableLineage>();
		for (int i = 0; i < _ctx.lengthValue("GetTableLineagesResponse.TableLineageList.Length"); i++) {
			TableLineage tableLineage = new TableLineage();
			tableLineage.setOutputProjectId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputProjectId"));
			tableLineage.setInputProjectId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputProjectId"));
			tableLineage.setInputTableEnv(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputTableEnv"));
			tableLineage.setOutputTableName(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputTableName"));
			tableLineage.setInputTableDeleted(_ctx.booleanValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputTableDeleted"));
			tableLineage.setOutputTableGuid(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputTableGuid"));
			tableLineage.setNodeEnv(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].NodeEnv"));
			tableLineage.setOutputBizUnitId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputBizUnitId"));
			tableLineage.setOutputTableDeleted(_ctx.booleanValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputTableDeleted"));
			tableLineage.setOutputTableEnv(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputTableEnv"));
			tableLineage.setInputTableName(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputTableName"));
			tableLineage.setNodeId(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].NodeId"));
			tableLineage.setOutputDataSourceId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputDataSourceId"));
			tableLineage.setOutputDataSourceType(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].OutputDataSourceType"));
			tableLineage.setInputTableGuid(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputTableGuid"));
			tableLineage.setInputBizUnitId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputBizUnitId"));
			tableLineage.setInputDataSourceId(_ctx.longValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputDataSourceId"));
			tableLineage.setInputDataSourceType(_ctx.stringValue("GetTableLineagesResponse.TableLineageList["+ i +"].InputDataSourceType"));

			tableLineageList.add(tableLineage);
		}
		getTableLineagesResponse.setTableLineageList(tableLineageList);
	 
	 	return getTableLineagesResponse;
	}
}