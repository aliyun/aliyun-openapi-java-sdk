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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseResponseUnmarshaller {

	public static DescribeDatabaseResponse unmarshall(DescribeDatabaseResponse describeDatabaseResponse, UnmarshallerContext _ctx) {
		
		describeDatabaseResponse.setRequestId(_ctx.stringValue("DescribeDatabaseResponse.RequestId"));
		describeDatabaseResponse.setConnLimit(_ctx.stringValue("DescribeDatabaseResponse.ConnLimit"));
		describeDatabaseResponse.setCharacterSetName(_ctx.stringValue("DescribeDatabaseResponse.CharacterSetName"));
		describeDatabaseResponse.setTableSpace(_ctx.stringValue("DescribeDatabaseResponse.TableSpace"));
		describeDatabaseResponse.setOwner(_ctx.stringValue("DescribeDatabaseResponse.Owner"));
		describeDatabaseResponse.setDescription(_ctx.stringValue("DescribeDatabaseResponse.Description"));
		describeDatabaseResponse.setDBInstanceId(_ctx.stringValue("DescribeDatabaseResponse.DBInstanceId"));
		describeDatabaseResponse.setSize(_ctx.stringValue("DescribeDatabaseResponse.Size"));
		describeDatabaseResponse.setDatabaseName(_ctx.stringValue("DescribeDatabaseResponse.DatabaseName"));
		describeDatabaseResponse.setCollate(_ctx.stringValue("DescribeDatabaseResponse.Collate"));
		describeDatabaseResponse.setCtype(_ctx.stringValue("DescribeDatabaseResponse.Ctype"));
		describeDatabaseResponse.setAccessPrivilege(_ctx.stringValue("DescribeDatabaseResponse.AccessPrivilege"));
	 
	 	return describeDatabaseResponse;
	}
}