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

package com.aliyuncs.eds_user.transform.v20210308;

import com.aliyuncs.eds_user.model.v20210308.QuerySyncStatusByAliUidResponse;
import com.aliyuncs.eds_user.model.v20210308.QuerySyncStatusByAliUidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySyncStatusByAliUidResponseUnmarshaller {

	public static QuerySyncStatusByAliUidResponse unmarshall(QuerySyncStatusByAliUidResponse querySyncStatusByAliUidResponse, UnmarshallerContext _ctx) {
		
		querySyncStatusByAliUidResponse.setRequestId(_ctx.stringValue("QuerySyncStatusByAliUidResponse.RequestId"));
		querySyncStatusByAliUidResponse.setSuccess(_ctx.booleanValue("QuerySyncStatusByAliUidResponse.Success"));
		querySyncStatusByAliUidResponse.setCode(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Code"));
		querySyncStatusByAliUidResponse.setMessage(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Message"));
		querySyncStatusByAliUidResponse.setHttpStatusCode(_ctx.integerValue("QuerySyncStatusByAliUidResponse.HttpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.longValue("QuerySyncStatusByAliUidResponse.Data.Id"));
		data.setGmtCreated(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.GmtCreated"));
		data.setGmtModified(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.GmtModified"));
		data.setAliUid(_ctx.longValue("QuerySyncStatusByAliUidResponse.Data.AliUid"));
		data.setStatus(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.Status"));
		data.setCorpId(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.CorpId"));
		data.setLatestBeginTime(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.LatestBeginTime"));
		data.setLatestEndTime(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.LatestEndTime"));
		data.setLatestSuccessTime(_ctx.stringValue("QuerySyncStatusByAliUidResponse.Data.LatestSuccessTime"));
		querySyncStatusByAliUidResponse.setData(data);
	 
	 	return querySyncStatusByAliUidResponse;
	}
}