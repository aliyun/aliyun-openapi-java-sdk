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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterScriptsResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterScriptsResponse.ClusterScript;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterScriptsResponseUnmarshaller {

	public static ListClusterScriptsResponse unmarshall(ListClusterScriptsResponse listClusterScriptsResponse, UnmarshallerContext context) {
		
		listClusterScriptsResponse.setRequestId(context.stringValue("ListClusterScriptsResponse.RequestId"));

		List<ClusterScript> clusterScripts = new ArrayList<ClusterScript>();
		for (int i = 0; i < context.lengthValue("ListClusterScriptsResponse.ClusterScripts.Length"); i++) {
			ClusterScript clusterScript = new ClusterScript();
			clusterScript.setId(context.stringValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].Id"));
			clusterScript.setName(context.stringValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].Name"));
			clusterScript.setStartTime(context.longValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].StartTime"));
			clusterScript.setEndTime(context.longValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].EndTime"));
			clusterScript.setPath(context.stringValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].Path"));
			clusterScript.setArgs(context.stringValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].Args"));
			clusterScript.setStatus(context.stringValue("ListClusterScriptsResponse.ClusterScripts["+ i +"].Status"));

			clusterScripts.add(clusterScript);
		}
		listClusterScriptsResponse.setClusterScripts(clusterScripts);
	 
	 	return listClusterScriptsResponse;
	}
}