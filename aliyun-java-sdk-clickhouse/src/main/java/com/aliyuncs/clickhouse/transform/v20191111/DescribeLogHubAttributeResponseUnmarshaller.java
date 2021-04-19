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

import com.aliyuncs.clickhouse.model.v20191111.DescribeLogHubAttributeResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLogHubAttributeResponse.LoghubInfo;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLogHubAttributeResponse.LoghubInfo.LogHubStore;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogHubAttributeResponseUnmarshaller {

	public static DescribeLogHubAttributeResponse unmarshall(DescribeLogHubAttributeResponse describeLogHubAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLogHubAttributeResponse.setRequestId(_ctx.stringValue("DescribeLogHubAttributeResponse.RequestId"));

		LoghubInfo loghubInfo = new LoghubInfo();
		loghubInfo.setId(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.Id"));
		loghubInfo.setDeliverName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.DeliverName"));
		loghubInfo.setDescription(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.Description"));
		loghubInfo.setProjectName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.ProjectName"));
		loghubInfo.setLogStoreName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.LogStoreName"));
		loghubInfo.setDBType(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.DBType"));
		loghubInfo.setDBClusterId(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.DBClusterId"));
		loghubInfo.setSchemaName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.SchemaName"));
		loghubInfo.setTableName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.TableName"));
		loghubInfo.setUserName(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.UserName"));
		loghubInfo.setRegionId(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.RegionId"));
		loghubInfo.setFilterDirtyData(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.FilterDirtyData"));
		loghubInfo.setDeliverTime(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.DeliverTime"));
		loghubInfo.setZoneId(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.ZoneId"));
		loghubInfo.setPassword(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.Password"));
		loghubInfo.setDomainUrl(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.DomainUrl"));

		List<LogHubStore> logHubStores = new ArrayList<LogHubStore>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogHubAttributeResponse.LoghubInfo.LogHubStores.Length"); i++) {
			LogHubStore logHubStore = new LogHubStore();
			logHubStore.setLogKey(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.LogHubStores["+ i +"].LogKey"));
			logHubStore.setFieldKey(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.LogHubStores["+ i +"].FieldKey"));
			logHubStore.setType(_ctx.stringValue("DescribeLogHubAttributeResponse.LoghubInfo.LogHubStores["+ i +"].Type"));

			logHubStores.add(logHubStore);
		}
		loghubInfo.setLogHubStores(logHubStores);
		describeLogHubAttributeResponse.setLoghubInfo(loghubInfo);
	 
	 	return describeLogHubAttributeResponse;
	}
}