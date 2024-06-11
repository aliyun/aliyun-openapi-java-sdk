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

package com.aliyuncs.beian.transform.v20160810;

import com.aliyuncs.beian.model.v20160810.GetMainDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMainDomainResponseUnmarshaller {

	public static GetMainDomainResponse unmarshall(GetMainDomainResponse getMainDomainResponse, UnmarshallerContext _ctx) {
		
		getMainDomainResponse.setRequestId(_ctx.stringValue("GetMainDomainResponse.RequestId"));
		getMainDomainResponse.setCode(_ctx.stringValue("GetMainDomainResponse.Code"));
		getMainDomainResponse.setMessage(_ctx.stringValue("GetMainDomainResponse.Message"));
		getMainDomainResponse.setData(_ctx.stringValue("GetMainDomainResponse.Data"));
	 
	 	return getMainDomainResponse;
	}
}