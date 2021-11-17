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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryDefaultLiveBackgroundResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryDefaultLiveBackgroundResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDefaultLiveBackgroundResponseUnmarshaller {

	public static QueryDefaultLiveBackgroundResponse unmarshall(QueryDefaultLiveBackgroundResponse queryDefaultLiveBackgroundResponse, UnmarshallerContext _ctx) {
		
		queryDefaultLiveBackgroundResponse.setRequestId(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.RequestId"));
		queryDefaultLiveBackgroundResponse.setErrorMessage(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.ErrorMessage"));
		queryDefaultLiveBackgroundResponse.setSuccess(_ctx.booleanValue("QueryDefaultLiveBackgroundResponse.Success"));
		queryDefaultLiveBackgroundResponse.setErrorCode(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.ErrorCode"));

		Data data = new Data();
		data.setUuid(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.Data.Uuid"));
		data.setName(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.Data.Name"));
		data.setDownloadUrl(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.Data.DownloadUrl"));
		data.setFileType(_ctx.stringValue("QueryDefaultLiveBackgroundResponse.Data.FileType"));
		data.setSizeInBytes(_ctx.integerValue("QueryDefaultLiveBackgroundResponse.Data.SizeInBytes"));
		queryDefaultLiveBackgroundResponse.setData(data);
	 
	 	return queryDefaultLiveBackgroundResponse;
	}
}