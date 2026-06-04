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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.ListAppPublishHistoryResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppPublishHistoryResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAppPublishHistoryResponse.Module.HistoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppPublishHistoryResponseUnmarshaller {

	public static ListAppPublishHistoryResponse unmarshall(ListAppPublishHistoryResponse listAppPublishHistoryResponse, UnmarshallerContext _ctx) {
		
		listAppPublishHistoryResponse.setRequestId(_ctx.stringValue("ListAppPublishHistoryResponse.RequestId"));
		listAppPublishHistoryResponse.setDynamicCode(_ctx.stringValue("ListAppPublishHistoryResponse.DynamicCode"));
		listAppPublishHistoryResponse.setDynamicMessage(_ctx.stringValue("ListAppPublishHistoryResponse.DynamicMessage"));
		listAppPublishHistoryResponse.setSynchro(_ctx.booleanValue("ListAppPublishHistoryResponse.Synchro"));
		listAppPublishHistoryResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppPublishHistoryResponse.AccessDeniedDetail"));
		listAppPublishHistoryResponse.setRootErrorMsg(_ctx.stringValue("ListAppPublishHistoryResponse.RootErrorMsg"));
		listAppPublishHistoryResponse.setRootErrorCode(_ctx.stringValue("ListAppPublishHistoryResponse.RootErrorCode"));
		listAppPublishHistoryResponse.setAllowRetry(_ctx.booleanValue("ListAppPublishHistoryResponse.AllowRetry"));
		listAppPublishHistoryResponse.setAppName(_ctx.stringValue("ListAppPublishHistoryResponse.AppName"));
		listAppPublishHistoryResponse.setMaxResults(_ctx.integerValue("ListAppPublishHistoryResponse.MaxResults"));
		listAppPublishHistoryResponse.setNextToken(_ctx.stringValue("ListAppPublishHistoryResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPublishHistoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppPublishHistoryResponse.ErrorArgs["+ i +"]"));
		}
		listAppPublishHistoryResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPageNum(_ctx.integerValue("ListAppPublishHistoryResponse.Module.PageNum"));
		module.setPageSize(_ctx.integerValue("ListAppPublishHistoryResponse.Module.PageSize"));
		module.setTotal(_ctx.integerValue("ListAppPublishHistoryResponse.Module.Total"));
		module.setCurrentPublishOrderId(_ctx.longValue("ListAppPublishHistoryResponse.Module.CurrentPublishOrderId"));

		List<HistoryItem> history = new ArrayList<HistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPublishHistoryResponse.Module.History.Length"); i++) {
			HistoryItem historyItem = new HistoryItem();
			historyItem.setIsFinish(_ctx.booleanValue("ListAppPublishHistoryResponse.Module.History["+ i +"].IsFinish"));
			historyItem.setIsSuccess(_ctx.booleanValue("ListAppPublishHistoryResponse.Module.History["+ i +"].IsSuccess"));
			historyItem.setMsg(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].Msg"));
			historyItem.setPercent(_ctx.integerValue("ListAppPublishHistoryResponse.Module.History["+ i +"].Percent"));
			historyItem.setPublishOrderId(_ctx.longValue("ListAppPublishHistoryResponse.Module.History["+ i +"].PublishOrderId"));
			historyItem.setCurrentStep(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].CurrentStep"));
			historyItem.setOrderType(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].OrderType"));
			historyItem.setPublishNumber(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].PublishNumber"));
			historyItem.setPublishTime(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].PublishTime"));
			historyItem.setDescription(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].Description"));
			historyItem.setErrorStep(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].ErrorStep"));
			historyItem.setDeployChannel(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].DeployChannel"));
			historyItem.setCanQuickRevert(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].CanQuickRevert"));

			List<String> steps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAppPublishHistoryResponse.Module.History["+ i +"].Steps.Length"); j++) {
				steps.add(_ctx.stringValue("ListAppPublishHistoryResponse.Module.History["+ i +"].Steps["+ j +"]"));
			}
			historyItem.setSteps(steps);

			history.add(historyItem);
		}
		module.setHistory(history);
		listAppPublishHistoryResponse.setModule(module);
	 
	 	return listAppPublishHistoryResponse;
	}
}