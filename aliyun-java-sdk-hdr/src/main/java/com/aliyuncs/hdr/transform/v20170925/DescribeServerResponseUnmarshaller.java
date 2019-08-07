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

import com.aliyuncs.hdr.model.v20170925.DescribeServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerResponseUnmarshaller {

	public static DescribeServerResponse unmarshall(DescribeServerResponse describeServerResponse, UnmarshallerContext _ctx) {
		
		describeServerResponse.setRequestId(_ctx.stringValue("DescribeServerResponse.RequestId"));
		describeServerResponse.setSuccess(_ctx.booleanValue("DescribeServerResponse.Success"));
		describeServerResponse.setCode(_ctx.stringValue("DescribeServerResponse.Code"));
		describeServerResponse.setMessage(_ctx.stringValue("DescribeServerResponse.Message"));
		describeServerResponse.setServerId(_ctx.stringValue("DescribeServerResponse.ServerId"));
		describeServerResponse.setOriginalInstanceId(_ctx.stringValue("DescribeServerResponse.OriginalInstanceId"));
		describeServerResponse.setHostname(_ctx.stringValue("DescribeServerResponse.Hostname"));
		describeServerResponse.setAlias(_ctx.stringValue("DescribeServerResponse.Alias"));
		describeServerResponse.setIpAddress(_ctx.stringValue("DescribeServerResponse.IpAddress"));
		describeServerResponse.setOsType(_ctx.stringValue("DescribeServerResponse.OsType"));
		describeServerResponse.setOsDetail(_ctx.stringValue("DescribeServerResponse.OsDetail"));
		describeServerResponse.setCpu(_ctx.integerValue("DescribeServerResponse.Cpu"));
		describeServerResponse.setMemory(_ctx.longValue("DescribeServerResponse.Memory"));
		describeServerResponse.setAgentVersion(_ctx.stringValue("DescribeServerResponse.AgentVersion"));
		describeServerResponse.setConnectionStatus(_ctx.stringValue("DescribeServerResponse.ConnectionStatus"));
		describeServerResponse.setUpgradeStatus(_ctx.stringValue("DescribeServerResponse.UpgradeStatus"));
		describeServerResponse.setStatus(_ctx.stringValue("DescribeServerResponse.Status"));
		describeServerResponse.setPrimarySiteId(_ctx.stringValue("DescribeServerResponse.PrimarySiteId"));
		describeServerResponse.setSecondarySiteId(_ctx.stringValue("DescribeServerResponse.SecondarySiteId"));
		describeServerResponse.setReplicationUseOriginalInstance(_ctx.booleanValue("DescribeServerResponse.ReplicationUseOriginalInstance"));
		describeServerResponse.setReplicationInfrastructureId(_ctx.stringValue("DescribeServerResponse.ReplicationInfrastructureId"));
		describeServerResponse.setReplicationInfrastructureType(_ctx.stringValue("DescribeServerResponse.ReplicationInfrastructureType"));
		describeServerResponse.setReplicationLocation(_ctx.stringValue("DescribeServerResponse.ReplicationLocation"));
		describeServerResponse.setReplicationComputeResource(_ctx.stringValue("DescribeServerResponse.ReplicationComputeResource"));
		describeServerResponse.setReplicationDatastore(_ctx.stringValue("DescribeServerResponse.ReplicationDatastore"));
		describeServerResponse.setReplicationUseSsd(_ctx.booleanValue("DescribeServerResponse.ReplicationUseSsd"));
		describeServerResponse.setReplicationNetwork(_ctx.stringValue("DescribeServerResponse.ReplicationNetwork"));
		describeServerResponse.setReplicationUseDhcp(_ctx.booleanValue("DescribeServerResponse.ReplicationUseDhcp"));
		describeServerResponse.setReplicationIpAddress(_ctx.stringValue("DescribeServerResponse.ReplicationIpAddress"));
		describeServerResponse.setReplicationNetMask(_ctx.stringValue("DescribeServerResponse.ReplicationNetMask"));
		describeServerResponse.setReplicationDns(_ctx.stringValue("DescribeServerResponse.ReplicationDns"));
		describeServerResponse.setReplicationGateway(_ctx.stringValue("DescribeServerResponse.ReplicationGateway"));
		describeServerResponse.setCrashConsistentPointPolicy(_ctx.stringValue("DescribeServerResponse.CrashConsistentPointPolicy"));
		describeServerResponse.setAppConsistentPointPolicy(_ctx.stringValue("DescribeServerResponse.AppConsistentPointPolicy"));
		describeServerResponse.setRpo(_ctx.integerValue("DescribeServerResponse.Rpo"));
		describeServerResponse.setFullSyncProgress(_ctx.integerValue("DescribeServerResponse.FullSyncProgress"));
		describeServerResponse.setFullSyncTotalSize(_ctx.longValue("DescribeServerResponse.FullSyncTotalSize"));
		describeServerResponse.setFullSyncCurrentSize(_ctx.longValue("DescribeServerResponse.FullSyncCurrentSize"));
		describeServerResponse.setFullSyncStartTime(_ctx.longValue("DescribeServerResponse.FullSyncStartTime"));
		describeServerResponse.setIncrementalSyncStartTime(_ctx.longValue("DescribeServerResponse.IncrementalSyncStartTime"));
		describeServerResponse.setErrno(_ctx.stringValue("DescribeServerResponse.Errno"));
		describeServerResponse.setRecoveryInfrastructureId(_ctx.stringValue("DescribeServerResponse.RecoveryInfrastructureId"));
		describeServerResponse.setRecoveryInfrastructureType(_ctx.stringValue("DescribeServerResponse.RecoveryInfrastructureType"));
		describeServerResponse.setRecoveryInstanceName(_ctx.stringValue("DescribeServerResponse.RecoveryInstanceName"));
		describeServerResponse.setRecoveryCpu(_ctx.integerValue("DescribeServerResponse.RecoveryCpu"));
		describeServerResponse.setRecoveryMemory(_ctx.longValue("DescribeServerResponse.RecoveryMemory"));
		describeServerResponse.setRecoveryUseSsd(_ctx.booleanValue("DescribeServerResponse.RecoveryUseSsd"));
		describeServerResponse.setRecoveryNetwork(_ctx.stringValue("DescribeServerResponse.RecoveryNetwork"));
		describeServerResponse.setRecoveryReserveIp(_ctx.booleanValue("DescribeServerResponse.RecoveryReserveIp"));
		describeServerResponse.setRecoveryUseDhcp(_ctx.booleanValue("DescribeServerResponse.RecoveryUseDhcp"));
		describeServerResponse.setRecoveryIpAddress(_ctx.stringValue("DescribeServerResponse.RecoveryIpAddress"));
		describeServerResponse.setRecoveryPostScriptType(_ctx.stringValue("DescribeServerResponse.RecoveryPostScriptType"));
		describeServerResponse.setRecoveryPostScriptContent(_ctx.stringValue("DescribeServerResponse.RecoveryPostScriptContent"));
		describeServerResponse.setTestRecoveredInstanceName(_ctx.stringValue("DescribeServerResponse.TestRecoveredInstanceName"));
		describeServerResponse.setTestRecoveredInstanceId(_ctx.stringValue("DescribeServerResponse.TestRecoveredInstanceId"));
		describeServerResponse.setTestRecoveredIpAddress(_ctx.stringValue("DescribeServerResponse.TestRecoveredIpAddress"));
		describeServerResponse.setTestFailoverStatus(_ctx.stringValue("DescribeServerResponse.TestFailoverStatus"));
		describeServerResponse.setRecoveredInstanceName(_ctx.stringValue("DescribeServerResponse.RecoveredInstanceName"));
		describeServerResponse.setRecoveredInstanceId(_ctx.stringValue("DescribeServerResponse.RecoveredInstanceId"));
		describeServerResponse.setRecoveredIpAddress(_ctx.stringValue("DescribeServerResponse.RecoveredIpAddress"));
		describeServerResponse.setTaskId(_ctx.stringValue("DescribeServerResponse.TaskId"));
		describeServerResponse.setOperations(_ctx.stringValue("DescribeServerResponse.Operations"));
		describeServerResponse.setSourceGatewayVersion(_ctx.stringValue("DescribeServerResponse.SourceGatewayVersion"));
		describeServerResponse.setTargetGatewayVersion(_ctx.stringValue("DescribeServerResponse.TargetGatewayVersion"));
	 
	 	return describeServerResponse;
	}
}