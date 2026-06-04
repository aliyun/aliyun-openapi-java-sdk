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

import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationConsumeRecordsResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationConsumeRecordsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationConsumeRecordsResponse.Module.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationConsumeRecordsResponse.Module.Next;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInspirationConsumeRecordsResponseUnmarshaller {

	public static QueryInspirationConsumeRecordsResponse unmarshall(QueryInspirationConsumeRecordsResponse queryInspirationConsumeRecordsResponse, UnmarshallerContext _ctx) {
		
		queryInspirationConsumeRecordsResponse.setRequestId(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.RequestId"));
		queryInspirationConsumeRecordsResponse.setDynamicCode(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.DynamicCode"));
		queryInspirationConsumeRecordsResponse.setDynamicMessage(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.DynamicMessage"));
		queryInspirationConsumeRecordsResponse.setSynchro(_ctx.booleanValue("QueryInspirationConsumeRecordsResponse.Synchro"));
		queryInspirationConsumeRecordsResponse.setAccessDeniedDetail(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.AccessDeniedDetail"));
		queryInspirationConsumeRecordsResponse.setRootErrorMsg(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.RootErrorMsg"));
		queryInspirationConsumeRecordsResponse.setRootErrorCode(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.RootErrorCode"));
		queryInspirationConsumeRecordsResponse.setAllowRetry(_ctx.booleanValue("QueryInspirationConsumeRecordsResponse.AllowRetry"));
		queryInspirationConsumeRecordsResponse.setAppName(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspirationConsumeRecordsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.ErrorArgs["+ i +"]"));
		}
		queryInspirationConsumeRecordsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("QueryInspirationConsumeRecordsResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("QueryInspirationConsumeRecordsResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("QueryInspirationConsumeRecordsResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("QueryInspirationConsumeRecordsResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("QueryInspirationConsumeRecordsResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("QueryInspirationConsumeRecordsResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("QueryInspirationConsumeRecordsResponse.Module.ResultLimit"));

		Next next = new Next();
		next.setConsumeTime(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Next.ConsumeTime"));
		next.setSceneName(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Next.SceneName"));
		next.setAmount(_ctx.longValue("QueryInspirationConsumeRecordsResponse.Module.Next.Amount"));
		next.setMetaData(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Next.MetaData"));
		module.setNext(next);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspirationConsumeRecordsResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConsumeTime(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Data["+ i +"].ConsumeTime"));
			dataItem.setSceneName(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Data["+ i +"].SceneName"));
			dataItem.setAmount(_ctx.longValue("QueryInspirationConsumeRecordsResponse.Module.Data["+ i +"].Amount"));
			dataItem.setMetaData(_ctx.stringValue("QueryInspirationConsumeRecordsResponse.Module.Data["+ i +"].MetaData"));

			data.add(dataItem);
		}
		module.setData(data);
		queryInspirationConsumeRecordsResponse.setModule(module);
	 
	 	return queryInspirationConsumeRecordsResponse;
	}
}