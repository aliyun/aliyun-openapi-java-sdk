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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListFederationsResponse;
import com.aliyuncs.dfs.model.v20180620.ListFederationsResponse.Federation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFederationsResponseUnmarshaller {

	public static ListFederationsResponse unmarshall(ListFederationsResponse listFederationsResponse, UnmarshallerContext _ctx) {
		
		listFederationsResponse.setRequestId(_ctx.stringValue("ListFederationsResponse.RequestId"));

		List<Federation> federations = new ArrayList<Federation>();
		for (int i = 0; i < _ctx.lengthValue("ListFederationsResponse.Federations.Length"); i++) {
			Federation federation = new Federation();
			federation.setFederationId(_ctx.stringValue("ListFederationsResponse.Federations["+ i +"].FederationId"));
			federation.setFileSystemIds(_ctx.stringValue("ListFederationsResponse.Federations["+ i +"].FileSystemIds"));

			federations.add(federation);
		}
		listFederationsResponse.setFederations(federations);
	 
	 	return listFederationsResponse;
	}
}