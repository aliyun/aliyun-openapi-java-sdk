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

import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationBalanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryInspirationBalanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInspirationBalanceResponseUnmarshaller {

	public static QueryInspirationBalanceResponse unmarshall(QueryInspirationBalanceResponse queryInspirationBalanceResponse, UnmarshallerContext _ctx) {
		
		queryInspirationBalanceResponse.setRequestId(_ctx.stringValue("QueryInspirationBalanceResponse.RequestId"));
		queryInspirationBalanceResponse.setDynamicCode(_ctx.stringValue("QueryInspirationBalanceResponse.DynamicCode"));
		queryInspirationBalanceResponse.setDynamicMessage(_ctx.stringValue("QueryInspirationBalanceResponse.DynamicMessage"));
		queryInspirationBalanceResponse.setSynchro(_ctx.booleanValue("QueryInspirationBalanceResponse.Synchro"));
		queryInspirationBalanceResponse.setAccessDeniedDetail(_ctx.stringValue("QueryInspirationBalanceResponse.AccessDeniedDetail"));
		queryInspirationBalanceResponse.setRootErrorMsg(_ctx.stringValue("QueryInspirationBalanceResponse.RootErrorMsg"));
		queryInspirationBalanceResponse.setRootErrorCode(_ctx.stringValue("QueryInspirationBalanceResponse.RootErrorCode"));
		queryInspirationBalanceResponse.setAllowRetry(_ctx.booleanValue("QueryInspirationBalanceResponse.AllowRetry"));
		queryInspirationBalanceResponse.setAppName(_ctx.stringValue("QueryInspirationBalanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspirationBalanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryInspirationBalanceResponse.ErrorArgs["+ i +"]"));
		}
		queryInspirationBalanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalQuota(_ctx.longValue("QueryInspirationBalanceResponse.Module.TotalQuota"));
		module.setTotalUsed(_ctx.longValue("QueryInspirationBalanceResponse.Module.TotalUsed"));
		module.setRemaining(_ctx.longValue("QueryInspirationBalanceResponse.Module.Remaining"));
		queryInspirationBalanceResponse.setModule(module);
	 
	 	return queryInspirationBalanceResponse;
	}
}