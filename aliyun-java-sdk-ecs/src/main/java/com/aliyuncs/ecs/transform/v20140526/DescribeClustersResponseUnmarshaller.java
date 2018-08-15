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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeClustersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeClustersResponse.Cluster;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersResponseUnmarshaller {

	public static DescribeClustersResponse unmarshall(DescribeClustersResponse describeClustersResponse, UnmarshallerContext context) {
		
		describeClustersResponse.setRequestId(context.stringValue("DescribeClustersResponse.RequestId"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("DescribeClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(context.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterId"));

			clusters.add(cluster);
		}
		describeClustersResponse.setClusters(clusters);
	 
	 	return describeClustersResponse;
	}
}