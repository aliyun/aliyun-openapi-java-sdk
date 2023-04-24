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

import com.aliyuncs.dms_enterprise.model.v20181101.QueryDataTrackResultDownloadStatusResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.QueryDataTrackResultDownloadStatusResponse.StatusResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataTrackResultDownloadStatusResponseUnmarshaller {

	public static QueryDataTrackResultDownloadStatusResponse unmarshall(QueryDataTrackResultDownloadStatusResponse queryDataTrackResultDownloadStatusResponse, UnmarshallerContext _ctx) {
		
		queryDataTrackResultDownloadStatusResponse.setRequestId(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.RequestId"));
		queryDataTrackResultDownloadStatusResponse.setSuccess(_ctx.booleanValue("QueryDataTrackResultDownloadStatusResponse.Success"));
		queryDataTrackResultDownloadStatusResponse.setErrorMessage(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.ErrorMessage"));
		queryDataTrackResultDownloadStatusResponse.setErrorCode(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.ErrorCode"));

		StatusResult statusResult = new StatusResult();
		statusResult.setDownloadStatus(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.StatusResult.DownloadStatus"));
		statusResult.setDownloadUrl(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.StatusResult.DownloadUrl"));
		statusResult.setStatusDesc(_ctx.stringValue("QueryDataTrackResultDownloadStatusResponse.StatusResult.StatusDesc"));
		statusResult.setTotalCount(_ctx.longValue("QueryDataTrackResultDownloadStatusResponse.StatusResult.TotalCount"));
		queryDataTrackResultDownloadStatusResponse.setStatusResult(statusResult);
	 
	 	return queryDataTrackResultDownloadStatusResponse;
	}
}