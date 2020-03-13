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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutQualitylogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutQualitylogResponse.Result;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutQualitylogResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutQualitylogResponseUnmarshaller {

	public static QueryLinkeBahamutQualitylogResponse unmarshall(QueryLinkeBahamutQualitylogResponse queryLinkeBahamutQualitylogResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutQualitylogResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.RequestId"));
		queryLinkeBahamutQualitylogResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.ResultCode"));
		queryLinkeBahamutQualitylogResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.ResultMessage"));
		queryLinkeBahamutQualitylogResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.ErrorMessage"));
		queryLinkeBahamutQualitylogResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.Message"));
		queryLinkeBahamutQualitylogResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutQualitylogResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutQualitylogResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutQualitylogResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutQualitylogResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutQualitylogResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutQualitylogResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCommitId(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].CommitId"));
			dataItem.setContent(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].Content"));
			dataItem.setIsCommitUpToDate(_ctx.booleanValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].IsCommitUpToDate"));
			dataItem.setItem(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].Item"));
			dataItem.setReason(_ctx.stringValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].Reason"));
			dataItem.setUpdateAt(_ctx.longValue("QueryLinkeBahamutQualitylogResponse.Result.Data["+ i +"].UpdateAt"));

			data.add(dataItem);
		}
		result.setData(data);
		queryLinkeBahamutQualitylogResponse.setResult(result);
	 
	 	return queryLinkeBahamutQualitylogResponse;
	}
}