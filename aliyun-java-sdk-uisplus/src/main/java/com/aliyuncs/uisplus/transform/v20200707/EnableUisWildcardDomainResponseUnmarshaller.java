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

package com.aliyuncs.uisplus.transform.v20200707;

import com.aliyuncs.uisplus.model.v20200707.EnableUisWildcardDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableUisWildcardDomainResponseUnmarshaller {

	public static EnableUisWildcardDomainResponse unmarshall(EnableUisWildcardDomainResponse enableUisWildcardDomainResponse, UnmarshallerContext _ctx) {
		
		enableUisWildcardDomainResponse.setRequestId(_ctx.stringValue("EnableUisWildcardDomainResponse.RequestId"));
	 
	 	return enableUisWildcardDomainResponse;
	}
}