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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.QueryCollectionDataResponse;
import com.aliyuncs.gpdb.model.v20160503.QueryCollectionDataResponse.Match;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCollectionDataResponseUnmarshaller {

	public static QueryCollectionDataResponse unmarshall(QueryCollectionDataResponse queryCollectionDataResponse, UnmarshallerContext _ctx) {
		
		queryCollectionDataResponse.setRequestId(_ctx.stringValue("QueryCollectionDataResponse.RequestId"));
		queryCollectionDataResponse.setStatus(_ctx.stringValue("QueryCollectionDataResponse.Status"));
		queryCollectionDataResponse.setMessage(_ctx.stringValue("QueryCollectionDataResponse.Message"));
		queryCollectionDataResponse.setTotal(_ctx.integerValue("QueryCollectionDataResponse.Total"));

		List<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < _ctx.lengthValue("QueryCollectionDataResponse.Matches.Length"); i++) {
			Match match = new Match();
			match.setId(_ctx.stringValue("QueryCollectionDataResponse.Matches["+ i +"].Id"));
			match.setMetadata(_ctx.mapValue("QueryCollectionDataResponse.Matches["+ i +"].Metadata"));
			match.setScore(_ctx.doubleValue("QueryCollectionDataResponse.Matches["+ i +"].Score"));

			List<Double> values = new ArrayList<Double>();
			for (int j = 0; j < _ctx.lengthValue("QueryCollectionDataResponse.Matches["+ i +"].Values.Length"); j++) {
				values.add(_ctx.doubleValue("QueryCollectionDataResponse.Matches["+ i +"].Values["+ j +"]"));
			}
			match.setValues(values);

			matches.add(match);
		}
		queryCollectionDataResponse.setMatches(matches);
	 
	 	return queryCollectionDataResponse;
	}
}