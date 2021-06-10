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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetTableTopologyResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableTopologyResponse.TableTopology;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableTopologyResponse.TableTopology.TableTopologyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableTopologyResponseUnmarshaller {

	public static GetTableTopologyResponse unmarshall(GetTableTopologyResponse getTableTopologyResponse, UnmarshallerContext _ctx) {
		
		getTableTopologyResponse.setRequestId(_ctx.stringValue("GetTableTopologyResponse.RequestId"));
		getTableTopologyResponse.setSuccess(_ctx.booleanValue("GetTableTopologyResponse.Success"));
		getTableTopologyResponse.setErrorMessage(_ctx.stringValue("GetTableTopologyResponse.ErrorMessage"));
		getTableTopologyResponse.setErrorCode(_ctx.stringValue("GetTableTopologyResponse.ErrorCode"));

		TableTopology tableTopology = new TableTopology();
		tableTopology.setTableGuid(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableGuid"));
		tableTopology.setTableName(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableName"));
		tableTopology.setLogic(_ctx.booleanValue("GetTableTopologyResponse.TableTopology.Logic"));

		List<TableTopologyInfo> tableTopologyInfoList = new ArrayList<TableTopologyInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList.Length"); i++) {
			TableTopologyInfo tableTopologyInfo = new TableTopologyInfo();
			tableTopologyInfo.setTableNameList(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].TableNameList"));
			tableTopologyInfo.setTableNameExpr(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].TableNameExpr"));
			tableTopologyInfo.setTableCount(_ctx.longValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].TableCount"));
			tableTopologyInfo.setDbId(_ctx.longValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].DbId"));
			tableTopologyInfo.setDbSearchName(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].DbSearchName"));
			tableTopologyInfo.setInstanceId(_ctx.longValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].InstanceId"));
			tableTopologyInfo.setRegionId(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].RegionId"));
			tableTopologyInfo.setInstanceResourceId(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].InstanceResourceId"));
			tableTopologyInfo.setInstanceSource(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].InstanceSource"));
			tableTopologyInfo.setDbName(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].DbName"));
			tableTopologyInfo.setDbType(_ctx.stringValue("GetTableTopologyResponse.TableTopology.TableTopologyInfoList["+ i +"].DbType"));

			tableTopologyInfoList.add(tableTopologyInfo);
		}
		tableTopology.setTableTopologyInfoList(tableTopologyInfoList);
		getTableTopologyResponse.setTableTopology(tableTopology);
	 
	 	return getTableTopologyResponse;
	}
}