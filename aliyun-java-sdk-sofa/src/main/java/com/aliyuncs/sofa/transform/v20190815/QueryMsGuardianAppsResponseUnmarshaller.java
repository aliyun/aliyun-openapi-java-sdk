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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianAppsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianAppsResponse.GuardianAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsGuardianAppsResponseUnmarshaller {

	public static QueryMsGuardianAppsResponse unmarshall(QueryMsGuardianAppsResponse queryMsGuardianAppsResponse, UnmarshallerContext _ctx) {
		
		queryMsGuardianAppsResponse.setRequestId(_ctx.stringValue("QueryMsGuardianAppsResponse.RequestId"));
		queryMsGuardianAppsResponse.setResultCode(_ctx.stringValue("QueryMsGuardianAppsResponse.ResultCode"));
		queryMsGuardianAppsResponse.setResultMessage(_ctx.stringValue("QueryMsGuardianAppsResponse.ResultMessage"));
		queryMsGuardianAppsResponse.setCurrentPage(_ctx.longValue("QueryMsGuardianAppsResponse.CurrentPage"));
		queryMsGuardianAppsResponse.setPageSize(_ctx.longValue("QueryMsGuardianAppsResponse.PageSize"));
		queryMsGuardianAppsResponse.setStartIndex(_ctx.longValue("QueryMsGuardianAppsResponse.StartIndex"));
		queryMsGuardianAppsResponse.setTotalSize(_ctx.longValue("QueryMsGuardianAppsResponse.TotalSize"));

		List<GuardianAppsItem> guardianApps = new ArrayList<GuardianAppsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsGuardianAppsResponse.GuardianApps.Length"); i++) {
			GuardianAppsItem guardianAppsItem = new GuardianAppsItem();
			guardianAppsItem.setEnable(_ctx.booleanValue("QueryMsGuardianAppsResponse.GuardianApps["+ i +"].Enable"));
			guardianAppsItem.setId(_ctx.longValue("QueryMsGuardianAppsResponse.GuardianApps["+ i +"].Id"));
			guardianAppsItem.setInstanceId(_ctx.stringValue("QueryMsGuardianAppsResponse.GuardianApps["+ i +"].InstanceId"));
			guardianAppsItem.setName(_ctx.stringValue("QueryMsGuardianAppsResponse.GuardianApps["+ i +"].Name"));
			guardianAppsItem.setRunMode(_ctx.stringValue("QueryMsGuardianAppsResponse.GuardianApps["+ i +"].RunMode"));

			guardianApps.add(guardianAppsItem);
		}
		queryMsGuardianAppsResponse.setGuardianApps(guardianApps);
	 
	 	return queryMsGuardianAppsResponse;
	}
}