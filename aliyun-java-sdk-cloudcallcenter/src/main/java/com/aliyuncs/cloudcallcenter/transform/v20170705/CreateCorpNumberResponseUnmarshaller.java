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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateCorpNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCorpNumberResponseUnmarshaller {

	public static CreateCorpNumberResponse unmarshall(CreateCorpNumberResponse createCorpNumberResponse, UnmarshallerContext context) {
		
		createCorpNumberResponse.setRequestId(context.stringValue("CreateCorpNumberResponse.RequestId"));
		createCorpNumberResponse.setSuccess(context.booleanValue("CreateCorpNumberResponse.Success"));
		createCorpNumberResponse.setCode(context.stringValue("CreateCorpNumberResponse.Code"));
		createCorpNumberResponse.setMessage(context.stringValue("CreateCorpNumberResponse.Message"));
		createCorpNumberResponse.setHttpStatusCode(context.integerValue("CreateCorpNumberResponse.HttpStatusCode"));
		createCorpNumberResponse.setCount(context.integerValue("CreateCorpNumberResponse.Count"));
	 
	 	return createCorpNumberResponse;
	}
}