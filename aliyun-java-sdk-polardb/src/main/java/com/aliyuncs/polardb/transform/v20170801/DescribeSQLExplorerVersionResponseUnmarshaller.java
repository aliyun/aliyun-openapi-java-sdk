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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeSQLExplorerVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLExplorerVersionResponseUnmarshaller {

	public static DescribeSQLExplorerVersionResponse unmarshall(DescribeSQLExplorerVersionResponse describeSQLExplorerVersionResponse, UnmarshallerContext _ctx) {
		
		describeSQLExplorerVersionResponse.setRequestId(_ctx.stringValue("DescribeSQLExplorerVersionResponse.RequestId"));
		describeSQLExplorerVersionResponse.setConfigValue(_ctx.stringValue("DescribeSQLExplorerVersionResponse.ConfigValue"));
		describeSQLExplorerVersionResponse.setDBInstanceID(_ctx.integerValue("DescribeSQLExplorerVersionResponse.DBInstanceID"));
		describeSQLExplorerVersionResponse.setDBInstanceName(_ctx.stringValue("DescribeSQLExplorerVersionResponse.DBInstanceName"));
	 
	 	return describeSQLExplorerVersionResponse;
	}
}