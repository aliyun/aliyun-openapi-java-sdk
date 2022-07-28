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
		describeRestoreTaskListResponse.setHttpStatusCode(_ctx.integerValue("DescribeRestoreTaskListResponse.HttpStatusCode"));
		describeRestoreTaskListResponse.setPageNum(_ctx.integerValue("DescribeRestoreTaskListResponse.PageNum"));
		describeRestoreTaskListResponse.setErrCode(_ctx.stringValue("DescribeRestoreTaskListResponse.ErrCode"));
		describeRestoreTaskListResponse.setSuccess(_ctx.booleanValue("DescribeRestoreTaskListResponse.Success"));
		describeRestoreTaskListResponse.setErrMessage(_ctx.stringValue("DescribeRestoreTaskListResponse.ErrMessage"));
		describeRestoreTaskListResponse.setTotalPages(_ctx.integerValue("DescribeRestoreTaskListResponse.TotalPages"));
		describeRestoreTaskListResponse.setTotalElements(_ctx.integerValue("DescribeRestoreTaskListResponse.TotalElements"));
		describeRestoreTaskListResponse.setPageSize(_ctx.integerValue("DescribeRestoreTaskListResponse.PageSize"));

		List<RestoreTaskDetail> items = new ArrayList<RestoreTaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTaskListResponse.Items.Length"); i++) {
			RestoreTaskDetail restoreTaskDetail = new RestoreTaskDetail();
			restoreTaskDetail.setRestoreStatus(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreStatus"));
			restoreTaskDetail.setFullStruAfterRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruAfterRestoreProgress"));
			restoreTaskDetail.setCrossRoleName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].CrossRoleName"));
			restoreTaskDetail.setRestoreDir(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreDir"));
			restoreTaskDetail.setCrossAliyunId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].CrossAliyunId"));
			restoreTaskDetail.setRestoreObjects(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreObjects"));
			restoreTaskDetail.setBackupPlanId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupPlanId"));
			restoreTaskDetail.setDestinationEndpointRegion(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointRegion"));
			restoreTaskDetail.setRestoreTaskCreateTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskCreateTime"));
			restoreTaskDetail.setDestinationEndpointUserName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointUserName"));
			restoreTaskDetail.setRestoreTaskFinishTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskFinishTime"));
			restoreTaskDetail.setDestinationEndpointIpPort(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointIpPort"));
			restoreTaskDetail.setDestinationEndpointDatabaseName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointDatabaseName"));
			restoreTaskDetail.setDestinationEndpointInstanceType(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceType"));
			restoreTaskDetail.setDestinationEndpointOracleSID(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointOracleSID"));
			restoreTaskDetail.setFullStruforeRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruforeRestoreProgress"));
			restoreTaskDetail.setErrMessage(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].ErrMessage"));
			restoreTaskDetail.setRestoreTaskId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskId"));
			restoreTaskDetail.setFullDataRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullDataRestoreProgress"));
			restoreTaskDetail.setContinuousRestoreProgress(_ctx.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].ContinuousRestoreProgress"));
			restoreTaskDetail.setDestinationEndpointInstanceID(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceID"));
			restoreTaskDetail.setBackupSetId(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupSetId"));
			restoreTaskDetail.setBackupGatewayId(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupGatewayId"));
			restoreTaskDetail.setRestoreTaskName(_ctx.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskName"));
			restoreTaskDetail.setRestoreTime(_ctx.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTime"));

			items.add(restoreTaskDetail);
		}
		describeRestoreTaskListResponse.setItems(items);
	 
	 	return describeRestoreTaskListResponse;
	}
}