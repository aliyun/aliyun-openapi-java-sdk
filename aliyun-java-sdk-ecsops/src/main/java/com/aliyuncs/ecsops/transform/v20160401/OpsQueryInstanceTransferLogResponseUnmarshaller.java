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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceTransferLogResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceTransferLogResponse.TransferLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInstanceTransferLogResponseUnmarshaller {

	public static OpsQueryInstanceTransferLogResponse unmarshall(OpsQueryInstanceTransferLogResponse opsQueryInstanceTransferLogResponse, UnmarshallerContext _ctx) {
		
		opsQueryInstanceTransferLogResponse.setRequestId(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.RequestId"));
		opsQueryInstanceTransferLogResponse.setPageSize(_ctx.integerValue("OpsQueryInstanceTransferLogResponse.PageSize"));
		opsQueryInstanceTransferLogResponse.setTotal(_ctx.integerValue("OpsQueryInstanceTransferLogResponse.Total"));
		opsQueryInstanceTransferLogResponse.setPageNo(_ctx.integerValue("OpsQueryInstanceTransferLogResponse.PageNo"));

		List<TransferLog> transferLogs = new ArrayList<TransferLog>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryInstanceTransferLogResponse.TransferLogs.Length"); i++) {
			TransferLog transferLog = new TransferLog();
			transferLog.setOldVmTypeFamily(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldVmTypeFamily"));
			transferLog.setStatus(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].Status"));
			transferLog.setNewPrivateBps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewPrivateBps"));
			transferLog.setNewPrivatePps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewPrivatePps"));
			transferLog.setNewPublicPps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewPublicPps"));
			transferLog.setOldPrivateBps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldPrivateBps"));
			transferLog.setNewVmTypeFamily(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewVmTypeFamily"));
			transferLog.setOldGpu(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldGpu"));
			transferLog.setOldDiskIo2(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldDiskIo2"));
			transferLog.setOldPrivatePps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldPrivatePps"));
			transferLog.setOldNcIp(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldNcIp"));
			transferLog.setNewVmType(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewVmType"));
			transferLog.setOldMemory(_ctx.longValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldMemory"));
			transferLog.setNewNcId(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewNcId"));
			transferLog.setOldVecus(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldVecus"));
			transferLog.setNewDiskIo1(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewDiskIo1"));
			transferLog.setOldNcId(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldNcId"));
			transferLog.setOldPublicPps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldPublicPps"));
			transferLog.setNewGpu(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewGpu"));
			transferLog.setOldNodeIds(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldNodeIds"));
			transferLog.setCreatedTime(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].CreatedTime"));
			transferLog.setOldLocaldiskIsdeleted(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldLocaldiskIsdeleted"));
			transferLog.setNewPublicBps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewPublicBps"));
			transferLog.setOldPublicBps(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldPublicBps"));
			transferLog.setOldVcpus(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldVcpus"));
			transferLog.setNewNodeIds(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewNodeIds"));
			transferLog.setNewVecus(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewVecus"));
			transferLog.setOldLocaldiskIds(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldLocaldiskIds"));
			transferLog.setNewMemory(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewMemory"));
			transferLog.setInstanceId(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].InstanceId"));
			transferLog.setNewIops(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewIops"));
			transferLog.setNewNcIp(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewNcIp"));
			transferLog.setNewDiskIo2(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewDiskIo2"));
			transferLog.setOldDiskIo1(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldDiskIo1"));
			transferLog.setModifiedTime(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].ModifiedTime"));
			transferLog.setOldIops(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldIops"));
			transferLog.setNewVcpus(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].NewVcpus"));
			transferLog.setReason(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].Reason"));
			transferLog.setOldVmType(_ctx.stringValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].OldVmType"));
			transferLog.setId(_ctx.longValue("OpsQueryInstanceTransferLogResponse.TransferLogs["+ i +"].Id"));

			transferLogs.add(transferLog);
		}
		opsQueryInstanceTransferLogResponse.setTransferLogs(transferLogs);
	 
	 	return opsQueryInstanceTransferLogResponse;
	}
}