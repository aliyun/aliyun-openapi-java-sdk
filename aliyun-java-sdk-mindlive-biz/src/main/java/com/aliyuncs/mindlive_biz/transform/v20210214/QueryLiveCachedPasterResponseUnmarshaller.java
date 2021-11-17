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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryLiveCachedPasterResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryLiveCachedPasterResponse.PasterConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLiveCachedPasterResponseUnmarshaller {

	public static QueryLiveCachedPasterResponse unmarshall(QueryLiveCachedPasterResponse queryLiveCachedPasterResponse, UnmarshallerContext _ctx) {
		
		queryLiveCachedPasterResponse.setRequestId(_ctx.stringValue("QueryLiveCachedPasterResponse.RequestId"));
		queryLiveCachedPasterResponse.setErrorMessage(_ctx.stringValue("QueryLiveCachedPasterResponse.ErrorMessage"));
		queryLiveCachedPasterResponse.setSuccess(_ctx.booleanValue("QueryLiveCachedPasterResponse.Success"));
		queryLiveCachedPasterResponse.setErrorCode(_ctx.stringValue("QueryLiveCachedPasterResponse.ErrorCode"));

		List<PasterConfig> data = new ArrayList<PasterConfig>();
		for (int i = 0; i < _ctx.lengthValue("QueryLiveCachedPasterResponse.Data.Length"); i++) {
			PasterConfig pasterConfig = new PasterConfig();
			pasterConfig.setResourceUuid(_ctx.stringValue("QueryLiveCachedPasterResponse.Data["+ i +"].ResourceUuid"));
			pasterConfig.setDownloadUrl(_ctx.stringValue("QueryLiveCachedPasterResponse.Data["+ i +"].DownloadUrl"));
			pasterConfig.setConfigs(_ctx.mapValue("QueryLiveCachedPasterResponse.Data["+ i +"].Configs"));

			data.add(pasterConfig);
		}
		queryLiveCachedPasterResponse.setData(data);
	 
	 	return queryLiveCachedPasterResponse;
	}
}