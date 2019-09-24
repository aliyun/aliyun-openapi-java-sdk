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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeServersResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeServersResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServersResponseUnmarshaller {

	public static DescribeServersResponse unmarshall(DescribeServersResponse describeServersResponse, UnmarshallerContext _ctx) {
		
		describeServersResponse.setRequestId(_ctx.stringValue("DescribeServersResponse.RequestId"));
		describeServersResponse.setSuccess(_ctx.booleanValue("DescribeServersResponse.Success"));
		describeServersResponse.setCode(_ctx.stringValue("DescribeServersResponse.Code"));
		describeServersResponse.setMessage(_ctx.stringValue("DescribeServersResponse.Message"));
		describeServersResponse.setTotalCount(_ctx.integerValue("DescribeServersResponse.TotalCount"));
		describeServersResponse.setPageNumber(_ctx.integerValue("DescribeServersResponse.PageNumber"));
		describeServersResponse.setPageSize(_ctx.integerValue("DescribeServersResponse.PageSize"));

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServersResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setServerId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ServerId"));
			server.setOriginalInstanceId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].OriginalInstanceId"));
			server.setHostname(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Hostname"));
			server.setAlias(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Alias"));
			server.setIpAddress(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].IpAddress"));
			server.setOsType(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].OsType"));
			server.setOsDetail(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].OsDetail"));
			server.setCpu(_ctx.integerValue("DescribeServersResponse.Servers["+ i +"].Cpu"));
			server.setMemory(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].Memory"));
			server.setAgentVersion(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].AgentVersion"));
			server.setConnectionStatus(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ConnectionStatus"));
			server.setUpgradeStatus(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].UpgradeStatus"));
			server.setStatus(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Status"));
			server.setPrimarySiteId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].PrimarySiteId"));
			server.setSecondarySiteId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].SecondarySiteId"));
			server.setReplicationUseOriginalInstance(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].ReplicationUseOriginalInstance"));
			server.setReplicationInfrastructureId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationInfrastructureId"));
			server.setReplicationInfrastructureType(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationInfrastructureType"));
			server.setReplicationLocation(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationLocation"));
			server.setReplicationComputeResource(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationComputeResource"));
			server.setReplicationDatastore(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationDatastore"));
			server.setReplicationUseSsd(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].ReplicationUseSsd"));
			server.setReplicationNetwork(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationNetwork"));
			server.setReplicationUseDhcp(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].ReplicationUseDhcp"));
			server.setReplicationIpAddress(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationIpAddress"));
			server.setReplicationNetMask(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationNetMask"));
			server.setReplicationDns(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationDns"));
			server.setReplicationGateway(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].ReplicationGateway"));
			server.setCrashConsistentPointPolicy(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].CrashConsistentPointPolicy"));
			server.setAppConsistentPointPolicy(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].AppConsistentPointPolicy"));
			server.setRpo(_ctx.integerValue("DescribeServersResponse.Servers["+ i +"].Rpo"));
			server.setFullSyncProgress(_ctx.integerValue("DescribeServersResponse.Servers["+ i +"].FullSyncProgress"));
			server.setFullSyncTotalSize(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].FullSyncTotalSize"));
			server.setFullSyncCurrentSize(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].FullSyncCurrentSize"));
			server.setFullSyncStartTime(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].FullSyncStartTime"));
			server.setIncrementalSyncStartTime(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].IncrementalSyncStartTime"));
			server.setErrno(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Errno"));
			server.setRecoveryInfrastructureId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryInfrastructureId"));
			server.setRecoveryInfrastructureType(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryInfrastructureType"));
			server.setRecoveryInstanceName(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryInstanceName"));
			server.setRecoveryCpu(_ctx.integerValue("DescribeServersResponse.Servers["+ i +"].RecoveryCpu"));
			server.setRecoveryMemory(_ctx.longValue("DescribeServersResponse.Servers["+ i +"].RecoveryMemory"));
			server.setRecoveryUseSsd(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].RecoveryUseSsd"));
			server.setRecoveryNetwork(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryNetwork"));
			server.setRecoveryReserveIp(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].RecoveryReserveIp"));
			server.setRecoveryUseDhcp(_ctx.booleanValue("DescribeServersResponse.Servers["+ i +"].RecoveryUseDhcp"));
			server.setRecoveryIpAddress(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryIpAddress"));
			server.setRecoveryPostScriptType(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryPostScriptType"));
			server.setRecoveryPostScriptContent(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveryPostScriptContent"));
			server.setTestRecoveredInstanceName(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TestRecoveredInstanceName"));
			server.setTestRecoveredInstanceId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TestRecoveredInstanceId"));
			server.setTestRecoveredIpAddress(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TestRecoveredIpAddress"));
			server.setTestFailoverStatus(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TestFailoverStatus"));
			server.setRecoveredInstanceName(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveredInstanceName"));
			server.setRecoveredInstanceId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveredInstanceId"));
			server.setRecoveredIpAddress(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].RecoveredIpAddress"));
			server.setTaskId(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TaskId"));
			server.setOperations(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].Operations"));
			server.setSourceGatewayVersion(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].SourceGatewayVersion"));
			server.setTargetGatewayVersion(_ctx.stringValue("DescribeServersResponse.Servers["+ i +"].TargetGatewayVersion"));

			servers.add(server);
		}
		describeServersResponse.setServers(servers);
	 
	 	return describeServersResponse;
	}
}