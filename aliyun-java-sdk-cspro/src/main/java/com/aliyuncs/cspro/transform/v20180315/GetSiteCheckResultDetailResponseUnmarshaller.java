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

package com.aliyuncs.cspro.transform.v20180315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cspro.model.v20180315.GetSiteCheckResultDetailResponse;
import com.aliyuncs.cspro.model.v20180315.GetSiteCheckResultDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSiteCheckResultDetailResponseUnmarshaller {

	public static GetSiteCheckResultDetailResponse unmarshall(GetSiteCheckResultDetailResponse getSiteCheckResultDetailResponse, UnmarshallerContext _ctx) {
		
		getSiteCheckResultDetailResponse.setRequestId(_ctx.stringValue("GetSiteCheckResultDetailResponse.RequestId"));
		getSiteCheckResultDetailResponse.setSuccess(_ctx.booleanValue("GetSiteCheckResultDetailResponse.Success"));
		getSiteCheckResultDetailResponse.setCode(_ctx.stringValue("GetSiteCheckResultDetailResponse.Code"));
		getSiteCheckResultDetailResponse.setMessage(_ctx.stringValue("GetSiteCheckResultDetailResponse.Message"));

		Data data = new Data();
		data.setResultId(_ctx.longValue("GetSiteCheckResultDetailResponse.Data.ResultId"));
		data.setKeywords(_ctx.stringValue("GetSiteCheckResultDetailResponse.Data.Keywords"));
		data.setContent(_ctx.stringValue("GetSiteCheckResultDetailResponse.Data.Content"));

		List<String> urls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSiteCheckResultDetailResponse.Data.Urls.Length"); i++) {
			urls.add(_ctx.stringValue("GetSiteCheckResultDetailResponse.Data.Urls["+ i +"]"));
		}
		data.setUrls(urls);
		getSiteCheckResultDetailResponse.setData(data);
	 
	 	return getSiteCheckResultDetailResponse;
	}
}