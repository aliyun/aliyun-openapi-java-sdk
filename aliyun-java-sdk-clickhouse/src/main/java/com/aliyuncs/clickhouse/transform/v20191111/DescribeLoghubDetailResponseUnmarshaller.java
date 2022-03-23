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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLoghubDetailResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLoghubDetailResponse.LoghubInfo;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLoghubDetailResponse.LoghubInfo.LogHubStore;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoghubDetailResponseUnmarshaller {

	public static DescribeLoghubDetailResponse unmarshall(DescribeLoghubDetailResponse describeLoghubDetailResponse, UnmarshallerContext _ctx) {
		
		describeLoghubDetailResponse.setRequestId(_ctx.stringValue("DescribeLoghubDetailResponse.RequestId"));

		LoghubInfo loghubInfo = new LoghubInfo();
		loghubInfo.setAccessKey(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.AccessKey"));
		loghubInfo.setTableName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.TableName"));
		loghubInfo.setAccessSecret(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.AccessSecret"));
		loghubInfo.setProjectName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.ProjectName"));
		loghubInfo.setSchemaName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.SchemaName"));
		loghubInfo.setDBType(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.DBType"));
		loghubInfo.setDeliverName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.DeliverName"));
		loghubInfo.setRegionId(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.RegionId"));
		loghubInfo.setPassword(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.Password"));
		loghubInfo.setDBClusterId(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.DBClusterId"));
		loghubInfo.setDescription(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.Description"));
		loghubInfo.setFilterDirtyData(_ctx.booleanValue("DescribeLoghubDetailResponse.LoghubInfo.FilterDirtyData"));
		loghubInfo.setZoneId(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.ZoneId"));
		loghubInfo.setLogStoreName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.LogStoreName"));
		loghubInfo.setUserName(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.UserName"));
		loghubInfo.setDomainUrl(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.DomainUrl"));
		loghubInfo.setDeliverTime(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.DeliverTime"));

		List<LogHubStore> logHubStores = new ArrayList<LogHubStore>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoghubDetailResponse.LoghubInfo.LogHubStores.Length"); i++) {
			LogHubStore logHubStore = new LogHubStore();
			logHubStore.setType(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.LogHubStores["+ i +"].Type"));
			logHubStore.setLogKey(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.LogHubStores["+ i +"].LogKey"));
			logHubStore.setFieldKey(_ctx.stringValue("DescribeLoghubDetailResponse.LoghubInfo.LogHubStores["+ i +"].FieldKey"));

			logHubStores.add(logHubStore);
		}
		loghubInfo.setLogHubStores(logHubStores);
		describeLoghubDetailResponse.setLoghubInfo(loghubInfo);
	 
	 	return describeLoghubDetailResponse;
	}
}