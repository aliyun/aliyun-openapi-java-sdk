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

import com.aliyuncs.websitebuild.model.v20250429.DescribeAppDomainDnsRecordResponse;
import com.aliyuncs.websitebuild.model.v20250429.DescribeAppDomainDnsRecordResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppDomainDnsRecordResponseUnmarshaller {

	public static DescribeAppDomainDnsRecordResponse unmarshall(DescribeAppDomainDnsRecordResponse describeAppDomainDnsRecordResponse, UnmarshallerContext _ctx) {
		
		describeAppDomainDnsRecordResponse.setRequestId(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.RequestId"));
		describeAppDomainDnsRecordResponse.setDynamicCode(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.DynamicCode"));
		describeAppDomainDnsRecordResponse.setDynamicMessage(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.DynamicMessage"));
		describeAppDomainDnsRecordResponse.setSynchro(_ctx.booleanValue("DescribeAppDomainDnsRecordResponse.Synchro"));
		describeAppDomainDnsRecordResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.AccessDeniedDetail"));
		describeAppDomainDnsRecordResponse.setRootErrorMsg(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.RootErrorMsg"));
		describeAppDomainDnsRecordResponse.setRootErrorCode(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.RootErrorCode"));
		describeAppDomainDnsRecordResponse.setAllowRetry(_ctx.booleanValue("DescribeAppDomainDnsRecordResponse.AllowRetry"));
		describeAppDomainDnsRecordResponse.setAppName(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppDomainDnsRecordResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.ErrorArgs["+ i +"]"));
		}
		describeAppDomainDnsRecordResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setRecordType(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.Module.RecordType"));
		module.setHost(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.Module.Host"));
		module.setValue(_ctx.stringValue("DescribeAppDomainDnsRecordResponse.Module.Value"));
		describeAppDomainDnsRecordResponse.setModule(module);
	 
	 	return describeAppDomainDnsRecordResponse;
	}
}