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

package com.aliyuncs.smc.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smc.model.v20190601.DescribeSourceServersResponse;
import com.aliyuncs.smc.model.v20190601.DescribeSourceServersResponse.SourceServer;
import com.aliyuncs.smc.model.v20190601.DescribeSourceServersResponse.SourceServer.DataDisk;
import com.aliyuncs.smc.model.v20190601.DescribeSourceServersResponse.SourceServer.DataDisk.Part;
import com.aliyuncs.smc.model.v20190601.DescribeSourceServersResponse.SourceServer.SystemDiskPart;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSourceServersResponseUnmarshaller {

	public static DescribeSourceServersResponse unmarshall(DescribeSourceServersResponse describeSourceServersResponse, UnmarshallerContext _ctx) {
		
		describeSourceServersResponse.setRequestId(_ctx.stringValue("DescribeSourceServersResponse.RequestId"));
		describeSourceServersResponse.setTotalCount(_ctx.integerValue("DescribeSourceServersResponse.TotalCount"));
		describeSourceServersResponse.setPageNumber(_ctx.integerValue("DescribeSourceServersResponse.PageNumber"));
		describeSourceServersResponse.setPageSize(_ctx.integerValue("DescribeSourceServersResponse.PageSize"));

		List<SourceServer> sourceServers = new ArrayList<SourceServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSourceServersResponse.SourceServers.Length"); i++) {
			SourceServer sourceServer = new SourceServer();
			sourceServer.setSourceId(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].SourceId"));
			sourceServer.setJobId(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].JobId"));
			sourceServer.setAgentVersion(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].AgentVersion"));
			sourceServer.setName(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].Name"));
			sourceServer.setDescription(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].Description"));
			sourceServer.setKernelLevel(_ctx.integerValue("DescribeSourceServersResponse.SourceServers["+ i +"].KernelLevel"));
			sourceServer.setPlatform(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].Platform"));
			sourceServer.setArchitecture(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].Architecture"));
			sourceServer.setSystemDiskSize(_ctx.integerValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskSize"));
			sourceServer.setReplicationDriver(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].ReplicationDriver"));
			sourceServer.setSystemInfo(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemInfo"));
			sourceServer.setCreationTime(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].CreationTime"));
			sourceServer.setState(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].State"));
			sourceServer.setErrorCode(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].ErrorCode"));
			sourceServer.setStatusInfo(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].StatusInfo"));
			sourceServer.setHeartbeatRate(_ctx.integerValue("DescribeSourceServersResponse.SourceServers["+ i +"].HeartbeatRate"));

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setIndex(_ctx.integerValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Index"));
				dataDisk.setSize(_ctx.integerValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setPath(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Path"));

				List<Part> parts = new ArrayList<Part>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts.Length"); k++) {
					Part part = new Part();
					part.setPath(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts["+ k +"].Path"));
					part.setDevice(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts["+ k +"].Device"));
					part.setSizeBytes(_ctx.longValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts["+ k +"].SizeBytes"));
					part.setNeed(_ctx.booleanValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts["+ k +"].Need"));
					part.setCanBlock(_ctx.booleanValue("DescribeSourceServersResponse.SourceServers["+ i +"].DataDisks["+ j +"].Parts["+ k +"].CanBlock"));

					parts.add(part);
				}
				dataDisk.setParts(parts);

				dataDisks.add(dataDisk);
			}
			sourceServer.setDataDisks(dataDisks);

			List<SystemDiskPart> systemDiskParts = new ArrayList<SystemDiskPart>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts.Length"); j++) {
				SystemDiskPart systemDiskPart = new SystemDiskPart();
				systemDiskPart.setPath(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts["+ j +"].Path"));
				systemDiskPart.setDevice(_ctx.stringValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts["+ j +"].Device"));
				systemDiskPart.setSizeBytes(_ctx.longValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts["+ j +"].SizeBytes"));
				systemDiskPart.setNeed(_ctx.booleanValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts["+ j +"].Need"));
				systemDiskPart.setCanBlock(_ctx.booleanValue("DescribeSourceServersResponse.SourceServers["+ i +"].SystemDiskParts["+ j +"].CanBlock"));

				systemDiskParts.add(systemDiskPart);
			}
			sourceServer.setSystemDiskParts(systemDiskParts);

			sourceServers.add(sourceServer);
		}
		describeSourceServersResponse.setSourceServers(sourceServers);
	 
	 	return describeSourceServersResponse;
	}
}