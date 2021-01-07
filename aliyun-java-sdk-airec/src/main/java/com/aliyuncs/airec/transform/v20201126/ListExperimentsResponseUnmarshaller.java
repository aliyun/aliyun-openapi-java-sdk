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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListExperimentsResponse;
import com.aliyuncs.airec.model.v20201126.ListExperimentsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExperimentsResponseUnmarshaller {

	public static ListExperimentsResponse unmarshall(ListExperimentsResponse listExperimentsResponse, UnmarshallerContext _ctx) {
		
		listExperimentsResponse.setRequestId(_ctx.stringValue("ListExperimentsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExperimentsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setExperimentId(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].experimentId"));
			resultItem.setName(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].name"));
			resultItem.setDescription(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].description"));
			resultItem.setStatus(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].status"));
			resultItem.setBase(_ctx.booleanValue("ListExperimentsResponse.result["+ i +"].base"));
			resultItem.setOnlineTime(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].onlineTime"));
			resultItem.setOfflineTime(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].offlineTime"));

			List<String> buckets = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExperimentsResponse.result["+ i +"].buckets.Length"); j++) {
				buckets.add(_ctx.stringValue("ListExperimentsResponse.result["+ i +"].buckets["+ j +"]"));
			}
			resultItem.setBuckets(buckets);

			result.add(resultItem);
		}
		listExperimentsResponse.setResult(result);
	 
	 	return listExperimentsResponse;
	}
}