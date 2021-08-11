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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeClustersResponse;
import com.aliyuncs.vs.model.v20181212.DescribeClustersResponse.Cluster;
import com.aliyuncs.vs.model.v20181212.DescribeClustersResponse.Cluster.InternalPort;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersResponseUnmarshaller {

	public static DescribeClustersResponse unmarshall(DescribeClustersResponse describeClustersResponse, UnmarshallerContext _ctx) {
		
		describeClustersResponse.setRequestId(_ctx.stringValue("DescribeClustersResponse.RequestId"));
		describeClustersResponse.setTotal(_ctx.longValue("DescribeClustersResponse.Total"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].ClusterId"));
			cluster.setName(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Name"));
			cluster.setDescription(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Description"));
			cluster.setMaintainTime(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].MaintainTime"));
			cluster.setStatus(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].Status"));

			List<InternalPort> internalPorts = new ArrayList<InternalPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClustersResponse.Clusters["+ i +"].InternalPorts.Length"); j++) {
				InternalPort internalPort = new InternalPort();
				internalPort.setPlatform(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].InternalPorts["+ j +"].Platform"));
				internalPort.setIpProtocol(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].InternalPorts["+ j +"].IpProtocol"));

				List<String> port = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeClustersResponse.Clusters["+ i +"].InternalPorts["+ j +"].Port.Length"); k++) {
					port.add(_ctx.stringValue("DescribeClustersResponse.Clusters["+ i +"].InternalPorts["+ j +"].Port["+ k +"]"));
				}
				internalPort.setPort(port);

				internalPorts.add(internalPort);
			}
			cluster.setInternalPorts(internalPorts);

			clusters.add(cluster);
		}
		describeClustersResponse.setClusters(clusters);
	 
	 	return describeClustersResponse;
	}
}