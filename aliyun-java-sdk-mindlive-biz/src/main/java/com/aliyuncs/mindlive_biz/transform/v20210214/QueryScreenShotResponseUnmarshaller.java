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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryScreenShotResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryScreenShotResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryScreenShotResponseUnmarshaller {

	public static QueryScreenShotResponse unmarshall(QueryScreenShotResponse queryScreenShotResponse, UnmarshallerContext _ctx) {
		
		queryScreenShotResponse.setRequestId(_ctx.stringValue("QueryScreenShotResponse.RequestId"));
		queryScreenShotResponse.setErrorMessage(_ctx.stringValue("QueryScreenShotResponse.ErrorMessage"));
		queryScreenShotResponse.setSuccess(_ctx.booleanValue("QueryScreenShotResponse.Success"));
		queryScreenShotResponse.setErrorCode(_ctx.stringValue("QueryScreenShotResponse.ErrorCode"));

		Data data = new Data();
		data.setDownloadUrl(_ctx.stringValue("QueryScreenShotResponse.Data.DownloadUrl"));
		queryScreenShotResponse.setData(data);
	 
	 	return queryScreenShotResponse;
	}
}