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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.AddDomainBackupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDomainBackupResponseUnmarshaller {

	public static AddDomainBackupResponse unmarshall(AddDomainBackupResponse addDomainBackupResponse, UnmarshallerContext _ctx) {
		
		addDomainBackupResponse.setRequestId(_ctx.stringValue("AddDomainBackupResponse.RequestId"));
		addDomainBackupResponse.setPeriodType(_ctx.stringValue("AddDomainBackupResponse.PeriodType"));
		addDomainBackupResponse.setDomainName(_ctx.stringValue("AddDomainBackupResponse.DomainName"));
	 
	 	return addDomainBackupResponse;
	}
}