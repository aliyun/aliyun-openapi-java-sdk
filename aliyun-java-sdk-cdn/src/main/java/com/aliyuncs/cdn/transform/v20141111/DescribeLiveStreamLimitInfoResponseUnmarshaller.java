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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamLimitInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamLimitInfoResponse.UserLimitMode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamLimitInfoResponseUnmarshaller {

	public static DescribeLiveStreamLimitInfoResponse unmarshall(DescribeLiveStreamLimitInfoResponse describeLiveStreamLimitInfoResponse, UnmarshallerContext context) {
		
		describeLiveStreamLimitInfoResponse.setRequestId(context.stringValue("DescribeLiveStreamLimitInfoResponse.RequestId"));

		List<UserLimitMode> userLimitLists = new ArrayList<UserLimitMode>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamLimitInfoResponse.UserLimitLists.Length"); i++) {
			UserLimitMode userLimitMode = new UserLimitMode();
			userLimitMode.setLimitDomain(context.stringValue("DescribeLiveStreamLimitInfoResponse.UserLimitLists["+ i +"].LimitDomain"));
			userLimitMode.setLimitNum(context.stringValue("DescribeLiveStreamLimitInfoResponse.UserLimitLists["+ i +"].LimitNum"));
			userLimitMode.setLimitTranscodeNum(context.stringValue("DescribeLiveStreamLimitInfoResponse.UserLimitLists["+ i +"].LimitTranscodeNum"));

			userLimitLists.add(userLimitMode);
		}
		describeLiveStreamLimitInfoResponse.setUserLimitLists(userLimitLists);
	 
	 	return describeLiveStreamLimitInfoResponse;
	}
}