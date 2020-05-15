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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeAuditLogsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeAuditLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditLogsResponseUnmarshaller {

	public static DescribeAuditLogsResponse unmarshall(DescribeAuditLogsResponse describeAuditLogsResponse, UnmarshallerContext _ctx) {
		
		describeAuditLogsResponse.setRequestId(_ctx.stringValue("DescribeAuditLogsResponse.RequestId"));
		describeAuditLogsResponse.setPageSize(_ctx.integerValue("DescribeAuditLogsResponse.PageSize"));
		describeAuditLogsResponse.setCurrentPage(_ctx.integerValue("DescribeAuditLogsResponse.CurrentPage"));
		describeAuditLogsResponse.setTotalCount(_ctx.integerValue("DescribeAuditLogsResponse.TotalCount"));

		List<Log> items = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditLogsResponse.Items.Length"); i++) {
			Log log = new Log();
			log.setId(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].Id"));
			log.setProductCode(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].ProductCode"));
			log.setProductId(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].ProductId"));
			log.setLogTime(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].LogTime"));
			log.setUserId(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].UserId"));
			log.setUserName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].UserName"));
			log.setClientIp(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].ClientIp"));
			log.setClientPort(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].ClientPort"));
			log.setClientUa(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].ClientUa"));
			log.setInstanceName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].InstanceName"));
			log.setCreationTime(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].CreationTime"));
			log.setDatabaseName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].DatabaseName"));
			log.setTableName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].TableName"));
			log.setColumnName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].ColumnName"));
			log.setPackageName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].PackageName"));
			log.setOssObjectKey(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].OssObjectKey"));
			log.setExecuteTime(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].ExecuteTime"));
			log.setEffectRow(_ctx.longValue("DescribeAuditLogsResponse.Items["+ i +"].EffectRow"));
			log.setOperateType(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].OperateType"));
			log.setRuleId(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].RuleId"));
			log.setRuleName(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].RuleName"));
			log.setWarnLevel(_ctx.stringValue("DescribeAuditLogsResponse.Items["+ i +"].WarnLevel"));
			log.setExecuteStatus(_ctx.integerValue("DescribeAuditLogsResponse.Items["+ i +"].ExecuteStatus"));

			items.add(log);
		}
		describeAuditLogsResponse.setItems(items);
	 
	 	return describeAuditLogsResponse;
	}
}