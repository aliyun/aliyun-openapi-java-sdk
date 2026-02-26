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

import com.aliyuncs.ccc.model.v20200701.ListBlacklistCallTaggingsResponse;
import com.aliyuncs.ccc.model.v20200701.ListBlacklistCallTaggingsResponse.BlacklistedNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBlacklistCallTaggingsResponseUnmarshaller {

	public static ListBlacklistCallTaggingsResponse unmarshall(ListBlacklistCallTaggingsResponse listBlacklistCallTaggingsResponse, UnmarshallerContext _ctx) {
		
		listBlacklistCallTaggingsResponse.setRequestId(_ctx.stringValue("ListBlacklistCallTaggingsResponse.RequestId"));
		listBlacklistCallTaggingsResponse.setHttpStatusCode(_ctx.integerValue("ListBlacklistCallTaggingsResponse.HttpStatusCode"));
		listBlacklistCallTaggingsResponse.setCode(_ctx.stringValue("ListBlacklistCallTaggingsResponse.Code"));
		listBlacklistCallTaggingsResponse.setMessage(_ctx.stringValue("ListBlacklistCallTaggingsResponse.Message"));

		List<BlacklistedNumber> data = new ArrayList<BlacklistedNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListBlacklistCallTaggingsResponse.Data.Length"); i++) {
			BlacklistedNumber blacklistedNumber = new BlacklistedNumber();
			blacklistedNumber.setJobId(_ctx.stringValue("ListBlacklistCallTaggingsResponse.Data["+ i +"].JobId"));
			blacklistedNumber.setNumber(_ctx.stringValue("ListBlacklistCallTaggingsResponse.Data["+ i +"].Number"));
			blacklistedNumber.setBlacklisted(_ctx.booleanValue("ListBlacklistCallTaggingsResponse.Data["+ i +"].Blacklisted"));

			data.add(blacklistedNumber);
		}
		listBlacklistCallTaggingsResponse.setData(data);
	 
	 	return listBlacklistCallTaggingsResponse;
	}
}