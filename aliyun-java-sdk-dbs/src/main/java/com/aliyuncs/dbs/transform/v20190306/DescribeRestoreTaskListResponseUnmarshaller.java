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

	public static DescribeRestoreTaskListResponse unmarshall(DescribeRestoreTaskListResponse describeRestoreTaskListResponse, UnmarshallerContext context) {
		
		describeRestoreTaskListResponse.setRequestId(context.stringValue("DescribeRestoreTaskListResponse.RequestId"));
		describeRestoreTaskListResponse.setSuccess(context.booleanValue("DescribeRestoreTaskListResponse.Success"));
		describeRestoreTaskListResponse.setErrCode(context.stringValue("DescribeRestoreTaskListResponse.ErrCode"));
		describeRestoreTaskListResponse.setErrMessage(context.stringValue("DescribeRestoreTaskListResponse.ErrMessage"));
		describeRestoreTaskListResponse.setHttpStatusCode(context.integerValue("DescribeRestoreTaskListResponse.HttpStatusCode"));
		describeRestoreTaskListResponse.setTotalPages(context.integerValue("DescribeRestoreTaskListResponse.TotalPages"));
		describeRestoreTaskListResponse.setPageSize(context.integerValue("DescribeRestoreTaskListResponse.PageSize"));
		describeRestoreTaskListResponse.setPageNum(context.integerValue("DescribeRestoreTaskListResponse.PageNum"));
		describeRestoreTaskListResponse.setTotalElements(context.integerValue("DescribeRestoreTaskListResponse.TotalElements"));

		List<RestoreTaskDetail> items = new ArrayList<RestoreTaskDetail>();
		for (int i = 0; i < context.lengthValue("DescribeRestoreTaskListResponse.Items.Length"); i++) {
			RestoreTaskDetail restoreTaskDetail = new RestoreTaskDetail();
			restoreTaskDetail.setBackupPlanId(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupPlanId"));
			restoreTaskDetail.setDestinationEndpointInstanceType(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceType"));
			restoreTaskDetail.setDestinationEndpointRegion(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointRegion"));
			restoreTaskDetail.setDestinationEndpointInstanceID(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointInstanceID"));
			restoreTaskDetail.setDestinationEndpointIpPort(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointIpPort"));
			restoreTaskDetail.setDestinationEndpointDatabaseName(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointDatabaseName"));
			restoreTaskDetail.setDestinationEndpointUserName(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointUserName"));
			restoreTaskDetail.setDestinationEndpointOracleSID(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].DestinationEndpointOracleSID"));
			restoreTaskDetail.setRestoreObjects(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreObjects"));
			restoreTaskDetail.setBackupGatewayId(context.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupGatewayId"));
			restoreTaskDetail.setRestoreDir(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreDir"));
			restoreTaskDetail.setRestoreTaskName(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskName"));
			restoreTaskDetail.setBackupSetId(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].BackupSetId"));
			restoreTaskDetail.setRestoreTime(context.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTime"));
			restoreTaskDetail.setRestoreTaskCreateTime(context.longValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskCreateTime"));
			restoreTaskDetail.setRestoreStatus(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreStatus"));
			restoreTaskDetail.setRestoreTaskId(context.stringValue("DescribeRestoreTaskListResponse.Items["+ i +"].RestoreTaskId"));
			restoreTaskDetail.setFullStruforeRestoreProgress(context.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruforeRestoreProgress"));
			restoreTaskDetail.setFullDataRestoreProgress(context.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullDataRestoreProgress"));
			restoreTaskDetail.setContinuousRestoreProgress(context.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].ContinuousRestoreProgress"));
			restoreTaskDetail.setFullStruAfterRestoreProgress(context.integerValue("DescribeRestoreTaskListResponse.Items["+ i +"].FullStruAfterRestoreProgress"));

			items.add(restoreTaskDetail);
		}
		describeRestoreTaskListResponse.setItems(items);
	 
	 	return describeRestoreTaskListResponse;
	}
}