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

import com.aliyuncs.gpdb.model.v20160503.DescribeHadoopClustersInSameNetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHadoopClustersInSameNetResponseUnmarshaller {

	public static DescribeHadoopClustersInSameNetResponse unmarshall(DescribeHadoopClustersInSameNetResponse describeHadoopClustersInSameNetResponse, UnmarshallerContext _ctx) {
		
		describeHadoopClustersInSameNetResponse.setRequestId(_ctx.stringValue("DescribeHadoopClustersInSameNetResponse.RequestId"));

		List<String> clusters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHadoopClustersInSameNetResponse.Clusters.Length"); i++) {
			clusters.add(_ctx.stringValue("DescribeHadoopClustersInSameNetResponse.Clusters["+ i +"]"));
		}
		describeHadoopClustersInSameNetResponse.setClusters(clusters);
	 
	 	return describeHadoopClustersInSameNetResponse;
	}
}