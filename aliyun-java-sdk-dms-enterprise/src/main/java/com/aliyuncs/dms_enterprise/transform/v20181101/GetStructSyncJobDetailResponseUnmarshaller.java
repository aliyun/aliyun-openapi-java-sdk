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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobDetailResponse.StructSyncJobDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStructSyncJobDetailResponseUnmarshaller {

	public static GetStructSyncJobDetailResponse unmarshall(GetStructSyncJobDetailResponse getStructSyncJobDetailResponse, UnmarshallerContext _ctx) {
		
		getStructSyncJobDetailResponse.setRequestId(_ctx.stringValue("GetStructSyncJobDetailResponse.RequestId"));
		getStructSyncJobDetailResponse.setSuccess(_ctx.booleanValue("GetStructSyncJobDetailResponse.Success"));
		getStructSyncJobDetailResponse.setErrorMessage(_ctx.stringValue("GetStructSyncJobDetailResponse.ErrorMessage"));
		getStructSyncJobDetailResponse.setErrorCode(_ctx.stringValue("GetStructSyncJobDetailResponse.ErrorCode"));

		StructSyncJobDetail structSyncJobDetail = new StructSyncJobDetail();
		structSyncJobDetail.setJobStatus(_ctx.stringValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.JobStatus"));
		structSyncJobDetail.setMessage(_ctx.stringValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.Message"));
		structSyncJobDetail.setTableAnalyzed(_ctx.longValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.TableAnalyzed"));
		structSyncJobDetail.setTableCount(_ctx.longValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.TableCount"));
		structSyncJobDetail.setSqlCount(_ctx.longValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.SqlCount"));
		structSyncJobDetail.setExecuteCount(_ctx.longValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.ExecuteCount"));
		structSyncJobDetail.setSecurityRule(_ctx.stringValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.SecurityRule"));
		structSyncJobDetail.setDBTaskGroupId(_ctx.longValue("GetStructSyncJobDetailResponse.StructSyncJobDetail.DBTaskGroupId"));
		getStructSyncJobDetailResponse.setStructSyncJobDetail(structSyncJobDetail);
	 
	 	return getStructSyncJobDetailResponse;
	}
}