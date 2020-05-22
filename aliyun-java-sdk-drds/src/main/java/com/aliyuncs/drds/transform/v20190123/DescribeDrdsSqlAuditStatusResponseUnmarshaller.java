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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsSqlAuditStatusResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsSqlAuditStatusResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsSqlAuditStatusResponseUnmarshaller {

	public static DescribeDrdsSqlAuditStatusResponse unmarshall(DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatusResponse, UnmarshallerContext _ctx) {
		
		describeDrdsSqlAuditStatusResponse.setRequestId(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.RequestId"));
		describeDrdsSqlAuditStatusResponse.setSuccess(_ctx.booleanValue("DescribeDrdsSqlAuditStatusResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsSqlAuditStatusResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDbName(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].DbName"));
			dataItem.setEnabled(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].Enabled"));
			dataItem.setDetailed(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].Detailed"));
			dataItem.setExtraWriteEnabled(_ctx.booleanValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].ExtraWriteEnabled"));
			dataItem.setExtraAliUid(_ctx.longValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].ExtraAliUid"));
			dataItem.setExtraSlsProject(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].ExtraSlsProject"));
			dataItem.setExtraSlsLogStore(_ctx.stringValue("DescribeDrdsSqlAuditStatusResponse.Data["+ i +"].ExtraSlsLogStore"));

			data.add(dataItem);
		}
		describeDrdsSqlAuditStatusResponse.setData(data);
	 
	 	return describeDrdsSqlAuditStatusResponse;
	}
}