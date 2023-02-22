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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListInterceptionHistoryResponse;
import com.aliyuncs.sas.model.v20181203.ListInterceptionHistoryResponse.InterceptionHistory;
import com.aliyuncs.sas.model.v20181203.ListInterceptionHistoryResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInterceptionHistoryResponseUnmarshaller {

	public static ListInterceptionHistoryResponse unmarshall(ListInterceptionHistoryResponse listInterceptionHistoryResponse, UnmarshallerContext _ctx) {
		
		listInterceptionHistoryResponse.setRequestId(_ctx.stringValue("ListInterceptionHistoryResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListInterceptionHistoryResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListInterceptionHistoryResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListInterceptionHistoryResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListInterceptionHistoryResponse.PageInfo.Count"));
		listInterceptionHistoryResponse.setPageInfo(pageInfo);

		List<InterceptionHistory> interceptionHistoryList = new ArrayList<InterceptionHistory>();
		for (int i = 0; i < _ctx.lengthValue("ListInterceptionHistoryResponse.InterceptionHistoryList.Length"); i++) {
			InterceptionHistory interceptionHistory = new InterceptionHistory();
			interceptionHistory.setSrcNamespace(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].SrcNamespace"));
			interceptionHistory.setSrcRuleTargetName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].SrcRuleTargetName"));
			interceptionHistory.setRiskLevel(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RiskLevel"));
			interceptionHistory.setStatus(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].Status"));
			interceptionHistory.setDstImageList(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstImageList"));
			interceptionHistory.setSrcTagList(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].SrcTagList"));
			interceptionHistory.setDstPort(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstPort"));
			interceptionHistory.setFirstTime(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].FirstTime"));
			interceptionHistory.setSrcAppName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].SrcAppName"));
			interceptionHistory.setSrcImageList(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].SrcImageList"));
			interceptionHistory.setRuleId(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RuleId"));
			interceptionHistory.setRuleName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RuleName"));
			interceptionHistory.setInterceptionName(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].InterceptionName"));
			interceptionHistory.setDstNamespace(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstNamespace"));
			interceptionHistory.setLastTime(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].LastTime"));
			interceptionHistory.setDstAppName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstAppName"));
			interceptionHistory.setDstRuleTargetName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstRuleTargetName"));
			interceptionHistory.setClusterName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].ClusterName"));
			interceptionHistory.setTryCount(_ctx.integerValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].TryCount"));
			interceptionHistory.setDstTagList(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].DstTagList"));
			interceptionHistory.setInterceptionType(_ctx.integerValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].InterceptionType"));
			interceptionHistory.setRealInterceptionType(_ctx.integerValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealInterceptionType"));
			interceptionHistory.setId(_ctx.longValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].Id"));
			interceptionHistory.setClusterId(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].ClusterId"));
			interceptionHistory.setRealSrcAppName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealSrcAppName"));
			interceptionHistory.setRealSrcPodName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealSrcPodName"));
			interceptionHistory.setRealDstAppName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealDstAppName"));
			interceptionHistory.setRealDstPodName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealDstPodName"));
			interceptionHistory.setRealDstNamespace(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealDstNamespace"));
			interceptionHistory.setRealDstImageName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealDstImageName"));
			interceptionHistory.setRealSrcNamespace(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealSrcNamespace"));
			interceptionHistory.setRealSrcImageName(_ctx.stringValue("ListInterceptionHistoryResponse.InterceptionHistoryList["+ i +"].RealSrcImageName"));

			interceptionHistoryList.add(interceptionHistory);
		}
		listInterceptionHistoryResponse.setInterceptionHistoryList(interceptionHistoryList);
	 
	 	return listInterceptionHistoryResponse;
	}
}