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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.PushApplicationDataResponse;
import com.aliyuncs.ens.model.v20171110.PushApplicationDataResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushApplicationDataResponseUnmarshaller {

	public static PushApplicationDataResponse unmarshall(PushApplicationDataResponse pushApplicationDataResponse, UnmarshallerContext _ctx) {
		
		pushApplicationDataResponse.setRequestId(_ctx.stringValue("PushApplicationDataResponse.RequestId"));

		List<PushResult> pushResults = new ArrayList<PushResult>();
		for (int i = 0; i < _ctx.lengthValue("PushApplicationDataResponse.PushResults.Length"); i++) {
			PushResult pushResult = new PushResult();
			pushResult.setVersion(_ctx.stringValue("PushApplicationDataResponse.PushResults["+ i +"].Version"));
			pushResult.setResultDescrip(_ctx.stringValue("PushApplicationDataResponse.PushResults["+ i +"].ResultDescrip"));
			pushResult.setResultCode(_ctx.integerValue("PushApplicationDataResponse.PushResults["+ i +"].ResultCode"));
			pushResult.setName(_ctx.stringValue("PushApplicationDataResponse.PushResults["+ i +"].Name"));

			pushResults.add(pushResult);
		}
		pushApplicationDataResponse.setPushResults(pushResults);
	 
	 	return pushApplicationDataResponse;
	}
}