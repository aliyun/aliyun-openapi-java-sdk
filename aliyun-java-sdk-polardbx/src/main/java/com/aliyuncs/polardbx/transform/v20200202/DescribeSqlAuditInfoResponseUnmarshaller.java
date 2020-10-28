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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.DescribeSqlAuditInfoResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeSqlAuditInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlAuditInfoResponseUnmarshaller {

	public static DescribeSqlAuditInfoResponse unmarshall(DescribeSqlAuditInfoResponse describeSqlAuditInfoResponse, UnmarshallerContext _ctx) {
		
		describeSqlAuditInfoResponse.setRequestId(_ctx.stringValue("DescribeSqlAuditInfoResponse.RequestId"));

		Data data = new Data();
		data.setIsEnabled(_ctx.booleanValue("DescribeSqlAuditInfoResponse.Data.IsEnabled"));
		data.setSLSProject(_ctx.stringValue("DescribeSqlAuditInfoResponse.Data.SLSProject"));
		data.setSLSLogStore(_ctx.stringValue("DescribeSqlAuditInfoResponse.Data.SLSLogStore"));
		data.setAuthenticated(_ctx.stringValue("DescribeSqlAuditInfoResponse.Data.Authenticated"));
		describeSqlAuditInfoResponse.setData(data);
	 
	 	return describeSqlAuditInfoResponse;
	}
}