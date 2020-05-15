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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerRestoresResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerRestoresResponse.SqlServerRestore;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlServerRestoresResponseUnmarshaller {

	public static DescribeSqlServerRestoresResponse unmarshall(DescribeSqlServerRestoresResponse describeSqlServerRestoresResponse, UnmarshallerContext _ctx) {
		
		describeSqlServerRestoresResponse.setRequestId(_ctx.stringValue("DescribeSqlServerRestoresResponse.RequestId"));
		describeSqlServerRestoresResponse.setSuccess(_ctx.booleanValue("DescribeSqlServerRestoresResponse.Success"));
		describeSqlServerRestoresResponse.setCode(_ctx.stringValue("DescribeSqlServerRestoresResponse.Code"));
		describeSqlServerRestoresResponse.setMessage(_ctx.stringValue("DescribeSqlServerRestoresResponse.Message"));
		describeSqlServerRestoresResponse.setTotalCount(_ctx.integerValue("DescribeSqlServerRestoresResponse.TotalCount"));
		describeSqlServerRestoresResponse.setPageSize(_ctx.integerValue("DescribeSqlServerRestoresResponse.PageSize"));
		describeSqlServerRestoresResponse.setPageNumber(_ctx.integerValue("DescribeSqlServerRestoresResponse.PageNumber"));

		List<SqlServerRestore> sqlServerRestores = new ArrayList<SqlServerRestore>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlServerRestoresResponse.SqlServerRestores.Length"); i++) {
			SqlServerRestore sqlServerRestore = new SqlServerRestore();
			sqlServerRestore.setRestoreId(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].RestoreId"));
			sqlServerRestore.setClusterId(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].ClusterId"));
			sqlServerRestore.setVaultId(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].VaultId"));
			sqlServerRestore.setSourceDatabaseId(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].SourceDatabaseId"));
			sqlServerRestore.setTargetDatabaseName(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].TargetDatabaseName"));
			sqlServerRestore.setFileDestination(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].FileDestination"));
			sqlServerRestore.setPointInTime(_ctx.longValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].PointInTime"));
			sqlServerRestore.setCreatedTime(_ctx.longValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].CreatedTime"));
			sqlServerRestore.setCompleteTime(_ctx.longValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].CompleteTime"));
			sqlServerRestore.setBytesTotal(_ctx.longValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].BytesTotal"));
			sqlServerRestore.setPercentage(_ctx.integerValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].Percentage"));
			sqlServerRestore.setErrorMessage(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].ErrorMessage"));
			sqlServerRestore.setStatus(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].Status"));
			sqlServerRestore.setSourceDatabaseName(_ctx.stringValue("DescribeSqlServerRestoresResponse.SqlServerRestores["+ i +"].SourceDatabaseName"));

			sqlServerRestores.add(sqlServerRestore);
		}
		describeSqlServerRestoresResponse.setSqlServerRestores(sqlServerRestores);
	 
	 	return describeSqlServerRestoresResponse;
	}
}