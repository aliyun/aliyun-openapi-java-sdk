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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateCorpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCorpResponseUnmarshaller {

	public static CreateCorpResponse unmarshall(CreateCorpResponse createCorpResponse, UnmarshallerContext _ctx) {
		
		createCorpResponse.setRequestId(_ctx.stringValue("CreateCorpResponse.RequestId"));
		createCorpResponse.setCorpId(_ctx.stringValue("CreateCorpResponse.CorpId"));
		createCorpResponse.setMessage(_ctx.stringValue("CreateCorpResponse.Message"));
		createCorpResponse.setCode(_ctx.stringValue("CreateCorpResponse.Code"));
	 
	 	return createCorpResponse;
	}
}