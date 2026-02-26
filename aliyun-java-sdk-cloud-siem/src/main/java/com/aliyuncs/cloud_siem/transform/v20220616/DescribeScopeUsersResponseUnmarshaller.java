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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeScopeUsersResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeScopeUsersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScopeUsersResponseUnmarshaller {

	public static DescribeScopeUsersResponse unmarshall(DescribeScopeUsersResponse describeScopeUsersResponse, UnmarshallerContext _ctx) {
		
		describeScopeUsersResponse.setRequestId(_ctx.stringValue("DescribeScopeUsersResponse.RequestId"));
		describeScopeUsersResponse.setSuccess(_ctx.booleanValue("DescribeScopeUsersResponse.Success"));
		describeScopeUsersResponse.setCode(_ctx.integerValue("DescribeScopeUsersResponse.Code"));
		describeScopeUsersResponse.setMessage(_ctx.stringValue("DescribeScopeUsersResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScopeUsersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAliUid(_ctx.longValue("DescribeScopeUsersResponse.Data["+ i +"].AliUid"));
			dataItem.setUserName(_ctx.stringValue("DescribeScopeUsersResponse.Data["+ i +"].UserName"));
			dataItem.setUserId(_ctx.stringValue("DescribeScopeUsersResponse.Data["+ i +"].UserId"));
			dataItem.setCloudCode(_ctx.stringValue("DescribeScopeUsersResponse.Data["+ i +"].CloudCode"));
			dataItem.setInstanceId(_ctx.stringValue("DescribeScopeUsersResponse.Data["+ i +"].InstanceId"));

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScopeUsersResponse.Data["+ i +"].Domains.Length"); j++) {
				domains.add(_ctx.stringValue("DescribeScopeUsersResponse.Data["+ i +"].Domains["+ j +"]"));
			}
			dataItem.setDomains(domains);

			data.add(dataItem);
		}
		describeScopeUsersResponse.setData(data);
	 
	 	return describeScopeUsersResponse;
	}
}