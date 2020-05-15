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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListAssistActionDetailsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListAssistActionDetailsResponse.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssistActionDetailsResponseUnmarshaller {

	public static ListAssistActionDetailsResponse unmarshall(ListAssistActionDetailsResponse listAssistActionDetailsResponse, UnmarshallerContext _ctx) {
		
		listAssistActionDetailsResponse.setRequestId(_ctx.stringValue("ListAssistActionDetailsResponse.RequestId"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssistActionDetailsResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setDeviceId(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].DeviceId"));
			resultsItem.setAction(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].Action"));
			resultsItem.setTimestamp(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].Timestamp"));
			resultsItem.setType(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].Type"));
			resultsItem.setData(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].Data"));
			resultsItem.setID(_ctx.stringValue("ListAssistActionDetailsResponse.Results["+ i +"].ID"));
			resultsItem.setCreatedAt(_ctx.longValue("ListAssistActionDetailsResponse.Results["+ i +"].CreatedAt"));
			resultsItem.setUpdatedAt(_ctx.longValue("ListAssistActionDetailsResponse.Results["+ i +"].UpdatedAt"));

			results.add(resultsItem);
		}
		listAssistActionDetailsResponse.setResults(results);
	 
	 	return listAssistActionDetailsResponse;
	}
}