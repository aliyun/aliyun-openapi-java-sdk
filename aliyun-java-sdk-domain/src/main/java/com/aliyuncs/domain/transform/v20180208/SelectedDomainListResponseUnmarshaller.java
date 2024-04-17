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

package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.SelectedDomainListResponse;
import com.aliyuncs.domain.model.v20180208.SelectedDomainListResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectedDomainListResponseUnmarshaller {

	public static SelectedDomainListResponse unmarshall(SelectedDomainListResponse selectedDomainListResponse, UnmarshallerContext _ctx) {
		
		selectedDomainListResponse.setRequestId(_ctx.stringValue("SelectedDomainListResponse.RequestId"));
		selectedDomainListResponse.setSuccess(_ctx.booleanValue("SelectedDomainListResponse.Success"));
		selectedDomainListResponse.setErrorCode(_ctx.stringValue("SelectedDomainListResponse.ErrorCode"));

		Module module = new Module();
		module.setDownloadUrl(_ctx.stringValue("SelectedDomainListResponse.Module.DownloadUrl"));
		selectedDomainListResponse.setModule(module);
	 
	 	return selectedDomainListResponse;
	}
}