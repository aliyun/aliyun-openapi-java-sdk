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

import com.aliyuncs.cloudcallcenter.model.v20170705.Apply400CorpIdentifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Apply400CorpIdentifyResponseUnmarshaller {

	public static Apply400CorpIdentifyResponse unmarshall(Apply400CorpIdentifyResponse apply400CorpIdentifyResponse, UnmarshallerContext context) {
		
		apply400CorpIdentifyResponse.setRequestId(context.stringValue("Apply400CorpIdentifyResponse.RequestId"));
		apply400CorpIdentifyResponse.setSuccess(context.booleanValue("Apply400CorpIdentifyResponse.Success"));
		apply400CorpIdentifyResponse.setCode(context.stringValue("Apply400CorpIdentifyResponse.Code"));
		apply400CorpIdentifyResponse.setMessage(context.stringValue("Apply400CorpIdentifyResponse.Message"));
		apply400CorpIdentifyResponse.setHttpStatusCode(context.integerValue("Apply400CorpIdentifyResponse.HttpStatusCode"));
		apply400CorpIdentifyResponse.setData(context.stringValue("Apply400CorpIdentifyResponse.Data"));
	 
	 	return apply400CorpIdentifyResponse;
	}
}