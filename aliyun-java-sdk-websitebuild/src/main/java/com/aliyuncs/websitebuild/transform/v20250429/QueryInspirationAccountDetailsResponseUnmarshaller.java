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

import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationAccountDetailsResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationAccountDetailsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationAccountDetailsResponse.Module.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationAccountDetailsResponse.Module.Next;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInspirationAccountDetailsResponseUnmarshaller {

	public static QueryInspirationAccountDetailsResponse unmarshall(QueryInspirationAccountDetailsResponse queryInspirationAccountDetailsResponse, UnmarshallerContext _ctx) {
		
		queryInspirationAccountDetailsResponse.setRequestId(_ctx.stringValue("QueryInspirationAccountDetailsResponse.RequestId"));
		queryInspirationAccountDetailsResponse.setDynamicCode(_ctx.stringValue("QueryInspirationAccountDetailsResponse.DynamicCode"));
		queryInspirationAccountDetailsResponse.setDynamicMessage(_ctx.stringValue("QueryInspirationAccountDetailsResponse.DynamicMessage"));
		queryInspirationAccountDetailsResponse.setSynchro(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Synchro"));
		queryInspirationAccountDetailsResponse.setAccessDeniedDetail(_ctx.stringValue("QueryInspirationAccountDetailsResponse.AccessDeniedDetail"));
		queryInspirationAccountDetailsResponse.setRootErrorMsg(_ctx.stringValue("QueryInspirationAccountDetailsResponse.RootErrorMsg"));
		queryInspirationAccountDetailsResponse.setRootErrorCode(_ctx.stringValue("QueryInspirationAccountDetailsResponse.RootErrorCode"));
		queryInspirationAccountDetailsResponse.setAllowRetry(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.AllowRetry"));
		queryInspirationAccountDetailsResponse.setAppName(_ctx.stringValue("QueryInspirationAccountDetailsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspirationAccountDetailsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryInspirationAccountDetailsResponse.ErrorArgs["+ i +"]"));
		}
		queryInspirationAccountDetailsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("QueryInspirationAccountDetailsResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("QueryInspirationAccountDetailsResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("QueryInspirationAccountDetailsResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("QueryInspirationAccountDetailsResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Module.ResultLimit"));

		Next next = new Next();
		next.setAcquisitionTime(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Next.AcquisitionTime"));
		next.setSourceType(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Next.SourceType"));
		next.setSourceTypeName(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Next.SourceTypeName"));
		next.setInitQuota(_ctx.longValue("QueryInspirationAccountDetailsResponse.Module.Next.InitQuota"));
		next.setBalance(_ctx.longValue("QueryInspirationAccountDetailsResponse.Module.Next.Balance"));
		next.setEndDate(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Next.EndDate"));
		next.setExpired(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Module.Next.Expired"));
		module.setNext(next);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspirationAccountDetailsResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAcquisitionTime(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].AcquisitionTime"));
			dataItem.setSourceType(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].SourceType"));
			dataItem.setSourceTypeName(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].SourceTypeName"));
			dataItem.setInitQuota(_ctx.longValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].InitQuota"));
			dataItem.setBalance(_ctx.longValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].Balance"));
			dataItem.setEndDate(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].EndDate"));
			dataItem.setExpired(_ctx.booleanValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].Expired"));
			dataItem.setStatus(_ctx.stringValue("QueryInspirationAccountDetailsResponse.Module.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		module.setData(data);
		queryInspirationAccountDetailsResponse.setModule(module);
	 
	 	return queryInspirationAccountDetailsResponse;
	}
}