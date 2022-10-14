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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.StartPrivacyCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartPrivacyCallResponseUnmarshaller {

	public static StartPrivacyCallResponse unmarshall(StartPrivacyCallResponse startPrivacyCallResponse, UnmarshallerContext _ctx) {
		
		startPrivacyCallResponse.setRequestId(_ctx.stringValue("StartPrivacyCallResponse.RequestId"));
		startPrivacyCallResponse.setCode(_ctx.stringValue("StartPrivacyCallResponse.Code"));
		startPrivacyCallResponse.setHttpStatusCode(_ctx.integerValue("StartPrivacyCallResponse.HttpStatusCode"));
		startPrivacyCallResponse.setMessage(_ctx.stringValue("StartPrivacyCallResponse.Message"));
		startPrivacyCallResponse.setData(_ctx.stringValue("StartPrivacyCallResponse.Data"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartPrivacyCallResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("StartPrivacyCallResponse.Params["+ i +"]"));
		}
		startPrivacyCallResponse.setParams(params);
	 
	 	return startPrivacyCallResponse;
	}
}