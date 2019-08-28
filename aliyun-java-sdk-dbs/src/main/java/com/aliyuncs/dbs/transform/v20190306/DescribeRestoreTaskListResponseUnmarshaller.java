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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribeRestoreTaskListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeRestoreTaskListResponse.RestoreTaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreTaskListResponseUnmarshaller {

	public static DescribeRestoreTaskListResponse unmarshall(DescribeRestoreTaskListResponse describeRestoreTaskListResponse, UnmarshallerContext _ctx) {
		
		describeRestoreTaskListResponse.setRequestId(_ctx.stringValue("DescribeRestoreTaskListResponse.RequestId"));
		describeRestoreTaskListResponse.setSuccess(_ctx.booleanValue("DescribeRestoreTaskListResponse.Success"));
		describeRestoreTaskListResponse.setErrCode(_ctx.stringValue("DescribeRestoreTaskListResponse.ErrCode"));
		describeRestoreTaskListResponse.setErrMessage(_ctx.stringValue("DescribeRestoreTaskListResponse.ErrMessage"));
		describeRestoreTaskListResponse.setHttpStatusCode(_ctx.integerValue("DescribeRestoreTaskListResponse.HttpStatusCode"));
		describeRestoreTaskListResponse.setTotalPages(_ctx.integerValue("DescribeRestoreTaskListResponse.TotalPages"));
		describeRestoreTaskListResponse.setPageSize(_ctx.integerValue("DescribeRestoreTaskListResponse.PageSize"));
		describeRestoreTaskListResponse.setPageNum(_ctx.integerValue("DescribeRestoreTaskListResponse.PageNum"));
		describeRestoreTaskListResponse.setTotalElements(_ctx.integerValue("DescribeRestoreTaskListResponse.TotalElements"));

		List<RestoreTaskDetail> items = new ArrayList<RestoreTaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTaskListResponse.Items.Length"); i++) {
			RestoreTaskDetail restoreTaskDetail = new RestoreTaskDetail();
			restoreTaskDetail.setBackupPlanId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupPlanId"));
			restoreTaskDetail.setDestinationEndpointInstanceType(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceType"));
			restoreTaskDetail.setDestinationEndpointRegion(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointRegion"));
			restoreTaskDetail.setDestinationEndpointInstanceID(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceID"));
			restoreTaskDetail.setDestinationEndpointIpPort(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointIpPort"));
			restoreTaskDetail.setDestinationEndpointDatabaseName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointDatabaseName"));
			restoreTaskDetail.setDestinationEndpointUserName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointUserName"));
			restoreTaskDetail.setDestinationEndpointOracleSID(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointOracleSID"));
			restoreTaskDetail.setRestoreObjects(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreObjects"));
			restoreTaskDetail.setBackupGatewayId(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupGatewayId"));
			restoreTaskDetail.setRestoreDir(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreDir"));
			restoreTaskDetail.setRestoreTaskName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskName"));
			restoreTaskDetail.setBackupSetId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupSetId"));
			restoreTaskDetail.setRestoreTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTime"));
			restoreTaskDetail.setRestoreTaskCreateTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskCreateTime"));
			restoreTaskDetail.setRestoreTaskFinishTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskFinishTime"));
			restoreTaskDetail.setRestoreStatus(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreStatus"));
			restoreTaskDetail.setRestoreTaskId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskId"));
			restoreTaskDetail.setFullStruforeRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruforeRestoreProgress"));
			restoreTaskDetail.setFullDataRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullDataRestoreProgress"));
			restoreTaskDetail.setContinuousRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].ContinuousRestoreProgress"));
			restoreTaskDetail.setFullStruAfterRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruAfterRestoreProgress"));
			restoreTaskDetail.setErrMessage(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].ErrMessage"));

			items.add(restoreTaskDetail);
		}
		describeRestoreTaskListResponse.setItems(items);
	 
	 	return describeRestoreTaskListResponse;
	}
}