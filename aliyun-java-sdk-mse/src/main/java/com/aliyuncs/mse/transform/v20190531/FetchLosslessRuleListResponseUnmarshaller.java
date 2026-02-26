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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.FetchLosslessRuleListResponse;
import com.aliyuncs.mse.model.v20190531.FetchLosslessRuleListResponse.Data;
import com.aliyuncs.mse.model.v20190531.FetchLosslessRuleListResponse.Data.ApplicationList;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchLosslessRuleListResponseUnmarshaller {

	public static FetchLosslessRuleListResponse unmarshall(FetchLosslessRuleListResponse fetchLosslessRuleListResponse, UnmarshallerContext _ctx) {
		
		fetchLosslessRuleListResponse.setRequestId(_ctx.stringValue("FetchLosslessRuleListResponse.RequestId"));
		fetchLosslessRuleListResponse.setSuccess(_ctx.booleanValue("FetchLosslessRuleListResponse.Success"));
		fetchLosslessRuleListResponse.setCode(_ctx.integerValue("FetchLosslessRuleListResponse.Code"));
		fetchLosslessRuleListResponse.setErrorCode(_ctx.stringValue("FetchLosslessRuleListResponse.ErrorCode"));
		fetchLosslessRuleListResponse.setHttpStatusCode(_ctx.integerValue("FetchLosslessRuleListResponse.HttpStatusCode"));
		fetchLosslessRuleListResponse.setMessage(_ctx.stringValue("FetchLosslessRuleListResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("FetchLosslessRuleListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("FetchLosslessRuleListResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("FetchLosslessRuleListResponse.Data.TotalSize"));

		List<ApplicationList> results = new ArrayList<ApplicationList>();
		for (int i = 0; i < _ctx.lengthValue("FetchLosslessRuleListResponse.Data.Results.Length"); i++) {
			ApplicationList applicationList = new ApplicationList();
			applicationList.setAppName(_ctx.stringValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].AppName"));
			applicationList.setAppId(_ctx.stringValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].AppId"));
			applicationList.setCount(_ctx.integerValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].Count"));
			applicationList.setEnable(_ctx.booleanValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].Enable"));
			applicationList.setWarmupTime(_ctx.integerValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].WarmupTime"));
			applicationList.setDelayTime(_ctx.integerValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].DelayTime"));
			applicationList.setFuncType(_ctx.integerValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].FuncType"));
			applicationList.setAligned(_ctx.booleanValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].Aligned"));
			applicationList.setRelated(_ctx.booleanValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].Related"));
			applicationList.setLossLessDetail(_ctx.booleanValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].LossLessDetail"));
			applicationList.setNotice(_ctx.booleanValue("FetchLosslessRuleListResponse.Data.Results["+ i +"].Notice"));

			results.add(applicationList);
		}
		data.setResults(results);
		fetchLosslessRuleListResponse.setData(data);
	 
	 	return fetchLosslessRuleListResponse;
	}
}