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

import com.aliyuncs.dms_enterprise.model.v20181101.GetDBTopologyResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDBTopologyResponse.DBTopology;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDBTopologyResponse.DBTopology.DBTopologyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDBTopologyResponseUnmarshaller {

	public static GetDBTopologyResponse unmarshall(GetDBTopologyResponse getDBTopologyResponse, UnmarshallerContext _ctx) {
		
		getDBTopologyResponse.setRequestId(_ctx.stringValue("GetDBTopologyResponse.RequestId"));
		getDBTopologyResponse.setSuccess(_ctx.booleanValue("GetDBTopologyResponse.Success"));
		getDBTopologyResponse.setErrorMessage(_ctx.stringValue("GetDBTopologyResponse.ErrorMessage"));
		getDBTopologyResponse.setErrorCode(_ctx.stringValue("GetDBTopologyResponse.ErrorCode"));

		DBTopology dBTopology = new DBTopology();
		dBTopology.setLogicDbId(_ctx.longValue("GetDBTopologyResponse.DBTopology.LogicDbId"));
		dBTopology.setLogicDbName(_ctx.stringValue("GetDBTopologyResponse.DBTopology.LogicDbName"));
		dBTopology.setSearchName(_ctx.stringValue("GetDBTopologyResponse.DBTopology.SearchName"));
		dBTopology.setAlias(_ctx.stringValue("GetDBTopologyResponse.DBTopology.Alias"));
		dBTopology.setDbType(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DbType"));
		dBTopology.setEnvType(_ctx.stringValue("GetDBTopologyResponse.DBTopology.EnvType"));

		List<DBTopologyInfo> dBTopologyInfoList = new ArrayList<DBTopologyInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList.Length"); i++) {
			DBTopologyInfo dBTopologyInfo = new DBTopologyInfo();
			dBTopologyInfo.setDbId(_ctx.longValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].DbId"));
			dBTopologyInfo.setSchemaName(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].SchemaName"));
			dBTopologyInfo.setCatalogName(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].CatalogName"));
			dBTopologyInfo.setSearchName(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].SearchName"));
			dBTopologyInfo.setDbType(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].DbType"));
			dBTopologyInfo.setEnvType(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].EnvType"));
			dBTopologyInfo.setInstanceId(_ctx.longValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].InstanceId"));
			dBTopologyInfo.setRegionId(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].RegionId"));
			dBTopologyInfo.setInstanceResourceId(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].InstanceResourceId"));
			dBTopologyInfo.setInstanceSource(_ctx.stringValue("GetDBTopologyResponse.DBTopology.DBTopologyInfoList["+ i +"].InstanceSource"));

			dBTopologyInfoList.add(dBTopologyInfo);
		}
		dBTopology.setDBTopologyInfoList(dBTopologyInfoList);
		getDBTopologyResponse.setDBTopology(dBTopology);
	 
	 	return getDBTopologyResponse;
	}
}