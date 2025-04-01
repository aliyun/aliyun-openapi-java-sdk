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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSqlAuditStatResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSqlAuditStatResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlAuditStatResponseUnmarshaller {

	public static DescribeSqlAuditStatResponse unmarshall(DescribeSqlAuditStatResponse describeSqlAuditStatResponse, UnmarshallerContext _ctx) {
		
		describeSqlAuditStatResponse.setRequestId(_ctx.stringValue("DescribeSqlAuditStatResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlAuditStatResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].InstanceId"));
			dataItem.setTenantId(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].TenantId"));
			dataItem.setUserClientIp(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].UserClientIp"));
			dataItem.setUserName(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].UserName"));
			dataItem.setDatabaseName(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].DatabaseName"));
			dataItem.setSqlId(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].SqlId"));
			dataItem.setTotalSucceed(_ctx.longValue("DescribeSqlAuditStatResponse.Data["+ i +"].TotalSucceed"));
			dataItem.setTotalFailed(_ctx.longValue("DescribeSqlAuditStatResponse.Data["+ i +"].TotalFailed"));
			dataItem.setTotalAffectRows(_ctx.longValue("DescribeSqlAuditStatResponse.Data["+ i +"].TotalAffectRows"));
			dataItem.setTotalScanRows(_ctx.longValue("DescribeSqlAuditStatResponse.Data["+ i +"].TotalScanRows"));
			dataItem.setTotalReturnRows(_ctx.longValue("DescribeSqlAuditStatResponse.Data["+ i +"].TotalReturnRows"));
			dataItem.setAffectRows(_ctx.doubleValue("DescribeSqlAuditStatResponse.Data["+ i +"].AffectRows"));
			dataItem.setScanRows(_ctx.doubleValue("DescribeSqlAuditStatResponse.Data["+ i +"].ScanRows"));
			dataItem.setReturnRows(_ctx.doubleValue("DescribeSqlAuditStatResponse.Data["+ i +"].ReturnRows"));
			dataItem.setExecuteTime(_ctx.doubleValue("DescribeSqlAuditStatResponse.Data["+ i +"].ExecuteTime"));
			dataItem.setSqlStatement(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].SqlStatement"));
			dataItem.setOperatorType(_ctx.stringValue("DescribeSqlAuditStatResponse.Data["+ i +"].OperatorType"));

			data.add(dataItem);
		}
		describeSqlAuditStatResponse.setData(data);
	 
	 	return describeSqlAuditStatResponse;
	}
}