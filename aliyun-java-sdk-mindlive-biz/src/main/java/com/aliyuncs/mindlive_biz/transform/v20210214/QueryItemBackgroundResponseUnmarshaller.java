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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryItemBackgroundResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryItemBackgroundResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemBackgroundResponseUnmarshaller {

	public static QueryItemBackgroundResponse unmarshall(QueryItemBackgroundResponse queryItemBackgroundResponse, UnmarshallerContext _ctx) {
		
		queryItemBackgroundResponse.setRequestId(_ctx.stringValue("QueryItemBackgroundResponse.RequestId"));
		queryItemBackgroundResponse.setErrorMessage(_ctx.stringValue("QueryItemBackgroundResponse.ErrorMessage"));
		queryItemBackgroundResponse.setSuccess(_ctx.booleanValue("QueryItemBackgroundResponse.Success"));
		queryItemBackgroundResponse.setErrorCode(_ctx.stringValue("QueryItemBackgroundResponse.ErrorCode"));

		Data data = new Data();
		data.setScope(_ctx.stringValue("QueryItemBackgroundResponse.Data.Scope"));
		data.setItemId(_ctx.stringValue("QueryItemBackgroundResponse.Data.ItemId"));
		data.setResourceUuid(_ctx.stringValue("QueryItemBackgroundResponse.Data.ResourceUuid"));
		data.setDownloadUrl(_ctx.stringValue("QueryItemBackgroundResponse.Data.DownloadUrl"));
		data.setFileType(_ctx.stringValue("QueryItemBackgroundResponse.Data.FileType"));
		queryItemBackgroundResponse.setData(data);
	 
	 	return queryItemBackgroundResponse;
	}
}