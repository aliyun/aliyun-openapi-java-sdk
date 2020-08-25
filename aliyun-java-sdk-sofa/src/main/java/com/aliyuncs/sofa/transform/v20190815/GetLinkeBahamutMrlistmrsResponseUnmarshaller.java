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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMrlistmrsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMrlistmrsResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMrlistmrsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMrlistmrsResponseUnmarshaller {

	public static GetLinkeBahamutMrlistmrsResponse unmarshall(GetLinkeBahamutMrlistmrsResponse getLinkeBahamutMrlistmrsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMrlistmrsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.RequestId"));
		getLinkeBahamutMrlistmrsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.ResultCode"));
		getLinkeBahamutMrlistmrsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.ResultMessage"));
		getLinkeBahamutMrlistmrsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.ErrorMessage"));
		getLinkeBahamutMrlistmrsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMrlistmrsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Message"));
		getLinkeBahamutMrlistmrsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMrlistmrsResponse.ResponseStatusCode"));
		getLinkeBahamutMrlistmrsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMrlistmrsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutMrlistmrsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutMrlistmrsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutMrlistmrsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutMrlistmrsResponse.Paginator.PageSize"));
		getLinkeBahamutMrlistmrsResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMrlistmrsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignedTo(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setCreateTime(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].CreateTime"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Creator"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Id"));
			resultItem.setMergeStatus(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].MergeStatus"));
			resultItem.setRepository(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Repository"));
			resultItem.setRepositoryUrl(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].RepositoryUrl"));
			resultItem.setState(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].State"));
			resultItem.setTitle(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Title"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Url"));

			List<String> reviewers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Reviewers.Length"); j++) {
				reviewers.add(_ctx.stringValue("GetLinkeBahamutMrlistmrsResponse.Result["+ i +"].Reviewers["+ j +"]"));
			}
			resultItem.setReviewers(reviewers);

			result.add(resultItem);
		}
		getLinkeBahamutMrlistmrsResponse.setResult(result);
	 
	 	return getLinkeBahamutMrlistmrsResponse;
	}
}