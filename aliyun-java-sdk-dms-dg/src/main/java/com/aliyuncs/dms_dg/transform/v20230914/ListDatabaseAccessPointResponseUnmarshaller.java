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

package com.aliyuncs.dms_dg.transform.v20230914;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_dg.model.v20230914.ListDatabaseAccessPointResponse;
import com.aliyuncs.dms_dg.model.v20230914.ListDatabaseAccessPointResponse.DbInstanceAccessPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatabaseAccessPointResponseUnmarshaller {

	public static ListDatabaseAccessPointResponse unmarshall(ListDatabaseAccessPointResponse listDatabaseAccessPointResponse, UnmarshallerContext _ctx) {
		
		listDatabaseAccessPointResponse.setRequestId(_ctx.stringValue("ListDatabaseAccessPointResponse.RequestId"));
		listDatabaseAccessPointResponse.setSuccess(_ctx.stringValue("ListDatabaseAccessPointResponse.Success"));
		listDatabaseAccessPointResponse.setCode(_ctx.stringValue("ListDatabaseAccessPointResponse.Code"));
		listDatabaseAccessPointResponse.setErrorMsg(_ctx.stringValue("ListDatabaseAccessPointResponse.ErrorMsg"));
		listDatabaseAccessPointResponse.setCount(_ctx.integerValue("ListDatabaseAccessPointResponse.Count"));

		List<DbInstanceAccessPoint> dbInstanceAccessPointList = new ArrayList<DbInstanceAccessPoint>();
		for (int i = 0; i < _ctx.lengthValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList.Length"); i++) {
			DbInstanceAccessPoint dbInstanceAccessPoint = new DbInstanceAccessPoint();
			dbInstanceAccessPoint.setAccessAddr(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].AccessAddr"));
			dbInstanceAccessPoint.setAccessPort(_ctx.integerValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].AccessPort"));
			dbInstanceAccessPoint.setDbInstanceId(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].DbInstanceId"));
			dbInstanceAccessPoint.setGmtCreate(_ctx.longValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].GmtCreate"));
			dbInstanceAccessPoint.setGmtModified(_ctx.longValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].GmtModified"));
			dbInstanceAccessPoint.setRouterId(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].RouterId"));
			dbInstanceAccessPoint.setVpcAzoneId(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].VpcAzoneId"));
			dbInstanceAccessPoint.setVpcId(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].VpcId"));
			dbInstanceAccessPoint.setVswitchId(_ctx.stringValue("ListDatabaseAccessPointResponse.DbInstanceAccessPointList["+ i +"].VswitchId"));

			dbInstanceAccessPointList.add(dbInstanceAccessPoint);
		}
		listDatabaseAccessPointResponse.setDbInstanceAccessPointList(dbInstanceAccessPointList);
	 
	 	return listDatabaseAccessPointResponse;
	}
}