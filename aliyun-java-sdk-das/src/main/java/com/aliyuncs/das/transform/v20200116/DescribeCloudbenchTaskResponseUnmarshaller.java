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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DescribeCloudbenchTaskResponse;
import com.aliyuncs.das.model.v20200116.DescribeCloudbenchTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudbenchTaskResponseUnmarshaller {

	public static DescribeCloudbenchTaskResponse unmarshall(DescribeCloudbenchTaskResponse describeCloudbenchTaskResponse, UnmarshallerContext _ctx) {
		
		describeCloudbenchTaskResponse.setRequestId(_ctx.stringValue("DescribeCloudbenchTaskResponse.RequestId"));
		describeCloudbenchTaskResponse.setCode(_ctx.stringValue("DescribeCloudbenchTaskResponse.Code"));
		describeCloudbenchTaskResponse.setMessage(_ctx.stringValue("DescribeCloudbenchTaskResponse.Message"));
		describeCloudbenchTaskResponse.setSuccess(_ctx.stringValue("DescribeCloudbenchTaskResponse.Success"));

		Data data = new Data();
		data.setDtsJobName(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DtsJobName"));
		data.setErrorMessage(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ErrorMessage"));
		data.setExternal(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.External"));
		data.setBackupType(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.BackupType"));
		data.setUserId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.UserId"));
		data.setDstType(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DstType"));
		data.setEcsInstanceId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.EcsInstanceId"));
		data.setDstInstanceUuid(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DstInstanceUuid"));
		data.setTaskType(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.TaskType"));
		data.setBenchStep(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.BenchStep"));
		data.setVersion(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.Version"));
		data.setEndState(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.EndState"));
		data.setSrcInstanceUuid(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.SrcInstanceUuid"));
		data.setClientType(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ClientType"));
		data.setState(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.State"));
		data.setDstIp(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DstIp"));
		data.setSrcPublicIp(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.SrcPublicIp"));
		data.setBackupId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.BackupId"));
		data.setSqlCompleteReuse(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.SqlCompleteReuse"));
		data.setSmartPressureTime(_ctx.integerValue("DescribeCloudbenchTaskResponse.Data.SmartPressureTime"));
		data.setArchiveState(_ctx.integerValue("DescribeCloudbenchTaskResponse.Data.ArchiveState"));
		data.setStatus(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.Status"));
		data.setWorkDir(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.WorkDir"));
		data.setArchiveOssTableName(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ArchiveOssTableName"));
		data.setDtsJobId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DtsJobId"));
		data.setDtsJobState(_ctx.integerValue("DescribeCloudbenchTaskResponse.Data.DtsJobState"));
		data.setDstPort(_ctx.integerValue("DescribeCloudbenchTaskResponse.Data.DstPort"));
		data.setDtsJobClass(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DtsJobClass"));
		data.setClientGatewayId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ClientGatewayId"));
		data.setDescription(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.Description"));
		data.setErrorCode(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ErrorCode"));
		data.setTableSchema(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.TableSchema"));
		data.setDtsJobStatus(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.DtsJobStatus"));
		data.setSrcInstanceArea(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.SrcInstanceArea"));
		data.setBenchStepStatus(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.BenchStepStatus"));
		data.setSource(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.Source"));
		data.setArchiveJobId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.ArchiveJobId"));
		data.setTopic(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.Topic"));
		data.setRequestDuration(_ctx.longValue("DescribeCloudbenchTaskResponse.Data.RequestDuration"));
		data.setTaskId(_ctx.stringValue("DescribeCloudbenchTaskResponse.Data.TaskId"));
		data.setRate(_ctx.longValue("DescribeCloudbenchTaskResponse.Data.Rate"));
		describeCloudbenchTaskResponse.setData(data);
	 
	 	return describeCloudbenchTaskResponse;
	}
}