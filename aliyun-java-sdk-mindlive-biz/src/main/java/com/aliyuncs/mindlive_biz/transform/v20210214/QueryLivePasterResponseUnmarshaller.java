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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryLivePasterResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryLivePasterResponse.PasterConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLivePasterResponseUnmarshaller {

	public static QueryLivePasterResponse unmarshall(QueryLivePasterResponse queryLivePasterResponse, UnmarshallerContext _ctx) {
		
		queryLivePasterResponse.setRequestId(_ctx.stringValue("QueryLivePasterResponse.RequestId"));
		queryLivePasterResponse.setErrorMessage(_ctx.stringValue("QueryLivePasterResponse.ErrorMessage"));
		queryLivePasterResponse.setSuccess(_ctx.booleanValue("QueryLivePasterResponse.Success"));
		queryLivePasterResponse.setErrorCode(_ctx.stringValue("QueryLivePasterResponse.ErrorCode"));

		List<PasterConfig> data = new ArrayList<PasterConfig>();
		for (int i = 0; i < _ctx.lengthValue("QueryLivePasterResponse.Data.Length"); i++) {
			PasterConfig pasterConfig = new PasterConfig();
			pasterConfig.setResourceUuid(_ctx.stringValue("QueryLivePasterResponse.Data["+ i +"].ResourceUuid"));
			pasterConfig.setDownloadUrl(_ctx.stringValue("QueryLivePasterResponse.Data["+ i +"].DownloadUrl"));
			pasterConfig.setConfigs(_ctx.mapValue("QueryLivePasterResponse.Data["+ i +"].Configs"));

			data.add(pasterConfig);
		}
		queryLivePasterResponse.setData(data);
	 
	 	return queryLivePasterResponse;
	}
}