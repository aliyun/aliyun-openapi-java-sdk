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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetMigrationSummaryResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMigrationSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMigrationSummaryResponseUnmarshaller {

	public static GetMigrationSummaryResponse unmarshall(GetMigrationSummaryResponse getMigrationSummaryResponse, UnmarshallerContext _ctx) {
		
		getMigrationSummaryResponse.setRequestId(_ctx.stringValue("GetMigrationSummaryResponse.RequestId"));
		getMigrationSummaryResponse.setSuccess(_ctx.booleanValue("GetMigrationSummaryResponse.Success"));

		Data data = new Data();
		data.setMigrationId(_ctx.longValue("GetMigrationSummaryResponse.Data.MigrationId"));
		data.setName(_ctx.stringValue("GetMigrationSummaryResponse.Data.Name"));
		data.setGmtCreate(_ctx.longValue("GetMigrationSummaryResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetMigrationSummaryResponse.Data.GmtModified"));
		data.setCreateUser(_ctx.stringValue("GetMigrationSummaryResponse.Data.CreateUser"));
		data.setOpUser(_ctx.stringValue("GetMigrationSummaryResponse.Data.OpUser"));
		data.setStatus(_ctx.stringValue("GetMigrationSummaryResponse.Data.Status"));
		data.setProjectId(_ctx.longValue("GetMigrationSummaryResponse.Data.ProjectId"));
		data.setDownloadUrl(_ctx.stringValue("GetMigrationSummaryResponse.Data.DownloadUrl"));
		getMigrationSummaryResponse.setData(data);
	 
	 	return getMigrationSummaryResponse;
	}
}