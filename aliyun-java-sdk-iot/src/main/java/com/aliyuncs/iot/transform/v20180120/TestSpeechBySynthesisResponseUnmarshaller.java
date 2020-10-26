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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.TestSpeechBySynthesisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestSpeechBySynthesisResponseUnmarshaller {

	public static TestSpeechBySynthesisResponse unmarshall(TestSpeechBySynthesisResponse testSpeechBySynthesisResponse, UnmarshallerContext _ctx) {
		
		testSpeechBySynthesisResponse.setRequestId(_ctx.stringValue("TestSpeechBySynthesisResponse.RequestId"));
		testSpeechBySynthesisResponse.setSuccess(_ctx.booleanValue("TestSpeechBySynthesisResponse.Success"));
		testSpeechBySynthesisResponse.setCode(_ctx.stringValue("TestSpeechBySynthesisResponse.Code"));
		testSpeechBySynthesisResponse.setErrorMessage(_ctx.stringValue("TestSpeechBySynthesisResponse.ErrorMessage"));
		testSpeechBySynthesisResponse.setData(_ctx.stringValue("TestSpeechBySynthesisResponse.Data"));
	 
	 	return testSpeechBySynthesisResponse;
	}
}