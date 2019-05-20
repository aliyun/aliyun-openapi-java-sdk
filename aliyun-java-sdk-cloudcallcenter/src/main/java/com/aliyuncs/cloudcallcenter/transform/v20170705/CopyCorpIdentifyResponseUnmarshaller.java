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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CopyCorpIdentifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyCorpIdentifyResponseUnmarshaller {

	public static CopyCorpIdentifyResponse unmarshall(CopyCorpIdentifyResponse copyCorpIdentifyResponse, UnmarshallerContext context) {
		
		copyCorpIdentifyResponse.setRequestId(context.stringValue("CopyCorpIdentifyResponse.RequestId"));
		copyCorpIdentifyResponse.setSuccess(context.booleanValue("CopyCorpIdentifyResponse.Success"));
		copyCorpIdentifyResponse.setCode(context.stringValue("CopyCorpIdentifyResponse.Code"));
		copyCorpIdentifyResponse.setMessage(context.stringValue("CopyCorpIdentifyResponse.Message"));
		copyCorpIdentifyResponse.setHttpStatusCode(context.integerValue("CopyCorpIdentifyResponse.HttpStatusCode"));
		copyCorpIdentifyResponse.setData(context.stringValue("CopyCorpIdentifyResponse.Data"));
	 
	 	return copyCorpIdentifyResponse;
	}
}