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

import com.aliyuncs.websitebuild.model.v20250429.ListAppDomainRedirectRecordsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppDomainRedirectRecordsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAppDomainRedirectRecordsResponse.Module.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppDomainRedirectRecordsResponse.Module.Next;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppDomainRedirectRecordsResponseUnmarshaller {

	public static ListAppDomainRedirectRecordsResponse unmarshall(ListAppDomainRedirectRecordsResponse listAppDomainRedirectRecordsResponse, UnmarshallerContext _ctx) {
		
		listAppDomainRedirectRecordsResponse.setRequestId(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.RequestId"));
		listAppDomainRedirectRecordsResponse.setDynamicCode(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.DynamicCode"));
		listAppDomainRedirectRecordsResponse.setDynamicMessage(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.DynamicMessage"));
		listAppDomainRedirectRecordsResponse.setSynchro(_ctx.booleanValue("ListAppDomainRedirectRecordsResponse.Synchro"));
		listAppDomainRedirectRecordsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.AccessDeniedDetail"));
		listAppDomainRedirectRecordsResponse.setRootErrorMsg(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.RootErrorMsg"));
		listAppDomainRedirectRecordsResponse.setRootErrorCode(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.RootErrorCode"));
		listAppDomainRedirectRecordsResponse.setAllowRetry(_ctx.booleanValue("ListAppDomainRedirectRecordsResponse.AllowRetry"));
		listAppDomainRedirectRecordsResponse.setAppName(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.AppName"));
		listAppDomainRedirectRecordsResponse.setMaxResults(_ctx.integerValue("ListAppDomainRedirectRecordsResponse.MaxResults"));
		listAppDomainRedirectRecordsResponse.setNextToken(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppDomainRedirectRecordsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.ErrorArgs["+ i +"]"));
		}
		listAppDomainRedirectRecordsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("ListAppDomainRedirectRecordsResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("ListAppDomainRedirectRecordsResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("ListAppDomainRedirectRecordsResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("ListAppDomainRedirectRecordsResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("ListAppDomainRedirectRecordsResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("ListAppDomainRedirectRecordsResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("ListAppDomainRedirectRecordsResponse.Module.ResultLimit"));

		Next next = new Next();
		next.setRecordId(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Next.RecordId"));
		next.setSourceDomain(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Next.SourceDomain"));
		next.setTargetDomain(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Next.TargetDomain"));
		module.setNext(next);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppDomainRedirectRecordsResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRecordId(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Data["+ i +"].RecordId"));
			dataItem.setSourceDomain(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Data["+ i +"].SourceDomain"));
			dataItem.setTargetDomain(_ctx.stringValue("ListAppDomainRedirectRecordsResponse.Module.Data["+ i +"].TargetDomain"));

			data.add(dataItem);
		}
		module.setData(data);
		listAppDomainRedirectRecordsResponse.setModule(module);
	 
	 	return listAppDomainRedirectRecordsResponse;
	}
}