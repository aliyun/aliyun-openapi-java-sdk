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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.TestSpeechResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestSpeechResponseUnmarshaller {

	public static TestSpeechResponse unmarshall(TestSpeechResponse testSpeechResponse, UnmarshallerContext _ctx) {
		
		testSpeechResponse.setRequestId(_ctx.stringValue("TestSpeechResponse.RequestId"));
		testSpeechResponse.setSuccess(_ctx.booleanValue("TestSpeechResponse.Success"));
		testSpeechResponse.setCode(_ctx.stringValue("TestSpeechResponse.Code"));
		testSpeechResponse.setErrorMessage(_ctx.stringValue("TestSpeechResponse.ErrorMessage"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("TestSpeechResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("TestSpeechResponse.Data["+ i +"]"));
		}
		testSpeechResponse.setData(data);
	 
	 	return testSpeechResponse;
	}
}