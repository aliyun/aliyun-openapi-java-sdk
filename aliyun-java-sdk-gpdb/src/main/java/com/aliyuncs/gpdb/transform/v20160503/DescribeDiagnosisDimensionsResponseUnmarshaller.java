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

import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisDimensionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisDimensionsResponseUnmarshaller {

	public static DescribeDiagnosisDimensionsResponse unmarshall(DescribeDiagnosisDimensionsResponse describeDiagnosisDimensionsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisDimensionsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisDimensionsResponse.RequestId"));

		List<String> databases = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisDimensionsResponse.Databases.Length"); i++) {
			databases.add(_ctx.stringValue("DescribeDiagnosisDimensionsResponse.Databases["+ i +"]"));
		}
		describeDiagnosisDimensionsResponse.setDatabases(databases);

		List<String> userNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisDimensionsResponse.UserNames.Length"); i++) {
			userNames.add(_ctx.stringValue("DescribeDiagnosisDimensionsResponse.UserNames["+ i +"]"));
		}
		describeDiagnosisDimensionsResponse.setUserNames(userNames);
	 
	 	return describeDiagnosisDimensionsResponse;
	}
}