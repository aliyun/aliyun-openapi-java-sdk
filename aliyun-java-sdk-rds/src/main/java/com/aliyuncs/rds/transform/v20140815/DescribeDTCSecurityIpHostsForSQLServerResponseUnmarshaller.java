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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDTCSecurityIpHostsForSQLServerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDTCSecurityIpHostsForSQLServerResponse.WhiteListGroups;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDTCSecurityIpHostsForSQLServerResponseUnmarshaller {

	public static DescribeDTCSecurityIpHostsForSQLServerResponse unmarshall(DescribeDTCSecurityIpHostsForSQLServerResponse describeDTCSecurityIpHostsForSQLServerResponse, UnmarshallerContext _ctx) {
		
		describeDTCSecurityIpHostsForSQLServerResponse.setRequestId(_ctx.stringValue("DescribeDTCSecurityIpHostsForSQLServerResponse.RequestId"));
		describeDTCSecurityIpHostsForSQLServerResponse.setDBInstanceId(_ctx.stringValue("DescribeDTCSecurityIpHostsForSQLServerResponse.DBInstanceId"));
		describeDTCSecurityIpHostsForSQLServerResponse.setIpHostPairNum(_ctx.stringValue("DescribeDTCSecurityIpHostsForSQLServerResponse.IpHostPairNum"));

		List<WhiteListGroups> items = new ArrayList<WhiteListGroups>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDTCSecurityIpHostsForSQLServerResponse.Items.Length"); i++) {
			WhiteListGroups whiteListGroups = new WhiteListGroups();
			whiteListGroups.setSecurityIpHosts(_ctx.stringValue("DescribeDTCSecurityIpHostsForSQLServerResponse.Items["+ i +"].SecurityIpHosts"));
			whiteListGroups.setWhitelistGroupName(_ctx.stringValue("DescribeDTCSecurityIpHostsForSQLServerResponse.Items["+ i +"].WhitelistGroupName"));

			items.add(whiteListGroups);
		}
		describeDTCSecurityIpHostsForSQLServerResponse.setItems(items);
	 
	 	return describeDTCSecurityIpHostsForSQLServerResponse;
	}
}