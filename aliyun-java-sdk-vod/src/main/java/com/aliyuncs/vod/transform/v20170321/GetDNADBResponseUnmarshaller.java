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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetDNADBResponse;
import com.aliyuncs.vod.model.v20170321.GetDNADBResponse.DNADB;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDNADBResponseUnmarshaller {

	public static GetDNADBResponse unmarshall(GetDNADBResponse getDNADBResponse, UnmarshallerContext _ctx) {
		
		getDNADBResponse.setRequestId(_ctx.stringValue("GetDNADBResponse.RequestId"));

		DNADB dNADB = new DNADB();
		dNADB.setDBId(_ctx.stringValue("GetDNADBResponse.DNADB.DBId"));
		dNADB.setStatus(_ctx.stringValue("GetDNADBResponse.DNADB.Status"));
		dNADB.setDBDescription(_ctx.stringValue("GetDNADBResponse.DNADB.DBDescription"));
		dNADB.setDBType(_ctx.stringValue("GetDNADBResponse.DNADB.DBType"));
		dNADB.setDBName(_ctx.stringValue("GetDNADBResponse.DNADB.DBName"));
		dNADB.setDBRegion(_ctx.stringValue("GetDNADBResponse.DNADB.DBRegion"));
		getDNADBResponse.setDNADB(dNADB);
	 
	 	return getDNADBResponse;
	}
}