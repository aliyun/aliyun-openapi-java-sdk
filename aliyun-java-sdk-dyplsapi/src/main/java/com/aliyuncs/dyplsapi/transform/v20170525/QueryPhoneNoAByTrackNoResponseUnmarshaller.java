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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.QueryPhoneNoAByTrackNoResponse;
import com.aliyuncs.dyplsapi.model.v20170525.QueryPhoneNoAByTrackNoResponse.PhoneNoAInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPhoneNoAByTrackNoResponseUnmarshaller {

	public static QueryPhoneNoAByTrackNoResponse unmarshall(QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNoResponse, UnmarshallerContext _ctx) {
		
		queryPhoneNoAByTrackNoResponse.setRequestId(_ctx.stringValue("QueryPhoneNoAByTrackNoResponse.RequestId"));
		queryPhoneNoAByTrackNoResponse.setCode(_ctx.stringValue("QueryPhoneNoAByTrackNoResponse.Code"));
		queryPhoneNoAByTrackNoResponse.setMessage(_ctx.stringValue("QueryPhoneNoAByTrackNoResponse.Message"));

		List<PhoneNoAInfo> module = new ArrayList<PhoneNoAInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryPhoneNoAByTrackNoResponse.Module.Length"); i++) {
			PhoneNoAInfo phoneNoAInfo = new PhoneNoAInfo();
			phoneNoAInfo.setPhoneNoA(_ctx.stringValue("QueryPhoneNoAByTrackNoResponse.Module["+ i +"].PhoneNoA"));
			phoneNoAInfo.setPhoneNoX(_ctx.stringValue("QueryPhoneNoAByTrackNoResponse.Module["+ i +"].PhoneNoX"));

			module.add(phoneNoAInfo);
		}
		queryPhoneNoAByTrackNoResponse.setModule(module);
	 
	 	return queryPhoneNoAByTrackNoResponse;
	}
}