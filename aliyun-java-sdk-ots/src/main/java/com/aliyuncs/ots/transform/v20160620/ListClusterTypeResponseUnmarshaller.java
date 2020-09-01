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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.ListClusterTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTypeResponseUnmarshaller {

	public static ListClusterTypeResponse unmarshall(ListClusterTypeResponse listClusterTypeResponse, UnmarshallerContext _ctx) {
		
		listClusterTypeResponse.setRequestId(_ctx.stringValue("ListClusterTypeResponse.RequestId"));

		List<String> clusterTypeInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterTypeResponse.ClusterTypeInfos.Length"); i++) {
			clusterTypeInfos.add(_ctx.stringValue("ListClusterTypeResponse.ClusterTypeInfos["+ i +"]"));
		}
		listClusterTypeResponse.setClusterTypeInfos(clusterTypeInfos);
	 
	 	return listClusterTypeResponse;
	}
}