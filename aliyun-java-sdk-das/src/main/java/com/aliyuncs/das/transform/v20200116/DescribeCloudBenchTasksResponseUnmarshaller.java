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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.DescribeCloudBenchTasksResponse;
import com.aliyuncs.das.model.v20200116.DescribeCloudBenchTasksResponse.Data;
import com.aliyuncs.das.model.v20200116.DescribeCloudBenchTasksResponse.Data.CloudbenchTasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudBenchTasksResponseUnmarshaller {

	public static DescribeCloudBenchTasksResponse unmarshall(DescribeCloudBenchTasksResponse describeCloudBenchTasksResponse, UnmarshallerContext _ctx) {
		
		describeCloudBenchTasksResponse.setRequestId(_ctx.stringValue("DescribeCloudBenchTasksResponse.RequestId"));
		describeCloudBenchTasksResponse.setCode(_ctx.stringValue("DescribeCloudBenchTasksResponse.Code"));
		describeCloudBenchTasksResponse.setMessage(_ctx.stringValue("DescribeCloudBenchTasksResponse.Message"));
		describeCloudBenchTasksResponse.setSuccess(_ctx.stringValue("DescribeCloudBenchTasksResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.Extra"));
		data.setTotal(_ctx.longValue("DescribeCloudBenchTasksResponse.Data.Total"));

		List<CloudbenchTasks> list = new ArrayList<CloudbenchTasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudBenchTasksResponse.Data.List.Length"); i++) {
			CloudbenchTasks cloudbenchTasks = new CloudbenchTasks();
			cloudbenchTasks.setDtsJobName(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DtsJobName"));
			cloudbenchTasks.setErrorMessage(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ErrorMessage"));
			cloudbenchTasks.setExternal(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].External"));
			cloudbenchTasks.setBackupType(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].BackupType"));
			cloudbenchTasks.setUserId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].UserId"));
			cloudbenchTasks.setDstType(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DstType"));
			cloudbenchTasks.setEcsInstanceId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].EcsInstanceId"));
			cloudbenchTasks.setDstInstanceUuid(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DstInstanceUuid"));
			cloudbenchTasks.setTaskType(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].TaskType"));
			cloudbenchTasks.setBenchStep(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].BenchStep"));
			cloudbenchTasks.setVersion(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Version"));
			cloudbenchTasks.setEndState(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].EndState"));
			cloudbenchTasks.setSrcInstanceUuid(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].SrcInstanceUuid"));
			cloudbenchTasks.setClientType(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ClientType"));
			cloudbenchTasks.setState(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].State"));
			cloudbenchTasks.setDstIp(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DstIp"));
			cloudbenchTasks.setSrcPublicIp(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].SrcPublicIp"));
			cloudbenchTasks.setBackupId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].BackupId"));
			cloudbenchTasks.setSqlCompleteReuse(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].SqlCompleteReuse"));
			cloudbenchTasks.setSmartPressureTime(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].SmartPressureTime"));
			cloudbenchTasks.setArchiveState(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ArchiveState"));
			cloudbenchTasks.setStatus(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Status"));
			cloudbenchTasks.setWorkDir(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].WorkDir"));
			cloudbenchTasks.setArchiveOssTableName(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ArchiveOssTableName"));
			cloudbenchTasks.setDtsJobId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DtsJobId"));
			cloudbenchTasks.setDtsJobState(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DtsJobState"));
			cloudbenchTasks.setDstPort(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DstPort"));
			cloudbenchTasks.setDtsJobClass(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DtsJobClass"));
			cloudbenchTasks.setClientGatewayId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ClientGatewayId"));
			cloudbenchTasks.setDescription(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Description"));
			cloudbenchTasks.setErrorCode(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ErrorCode"));
			cloudbenchTasks.setTableSchema(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].TableSchema"));
			cloudbenchTasks.setDtsJobStatus(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].DtsJobStatus"));
			cloudbenchTasks.setSrcInstanceArea(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].SrcInstanceArea"));
			cloudbenchTasks.setBenchStepStatus(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].BenchStepStatus"));
			cloudbenchTasks.setSource(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Source"));
			cloudbenchTasks.setArchiveJobId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].ArchiveJobId"));
			cloudbenchTasks.setTopic(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Topic"));
			cloudbenchTasks.setRequestDuration(_ctx.longValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].RequestDuration"));
			cloudbenchTasks.setTaskId(_ctx.stringValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].TaskId"));
			cloudbenchTasks.setRate(_ctx.integerValue("DescribeCloudBenchTasksResponse.Data.List["+ i +"].Rate"));

			list.add(cloudbenchTasks);
		}
		data.setList(list);
		describeCloudBenchTasksResponse.setData(data);
	 
	 	return describeCloudBenchTasksResponse;
	}
}