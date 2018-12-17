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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.DescribeUserOperationLogResponse;
import com.aliyuncs.cloudesl.model.v20180801.DescribeUserOperationLogResponse.OperationLogInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserOperationLogResponseUnmarshaller {

	public static DescribeUserOperationLogResponse unmarshall(DescribeUserOperationLogResponse describeUserOperationLogResponse, UnmarshallerContext context) {
		
		describeUserOperationLogResponse.setRequestId(context.stringValue("DescribeUserOperationLogResponse.RequestId"));
		describeUserOperationLogResponse.setSuccess(context.booleanValue("DescribeUserOperationLogResponse.Success"));
		describeUserOperationLogResponse.setMessage(context.stringValue("DescribeUserOperationLogResponse.Message"));
		describeUserOperationLogResponse.setErrorCode(context.stringValue("DescribeUserOperationLogResponse.ErrorCode"));
		describeUserOperationLogResponse.setTotalCount(context.integerValue("DescribeUserOperationLogResponse.TotalCount"));
		describeUserOperationLogResponse.setPageNumber(context.integerValue("DescribeUserOperationLogResponse.PageNumber"));
		describeUserOperationLogResponse.setPageSize(context.integerValue("DescribeUserOperationLogResponse.PageSize"));

		List<OperationLogInfo> operationLogs = new ArrayList<OperationLogInfo>();
		for (int i = 0; i < context.lengthValue("DescribeUserOperationLogResponse.OperationLogs.Length"); i++) {
			OperationLogInfo operationLogInfo = new OperationLogInfo();
			operationLogInfo.setOperateType(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateType"));
			operationLogInfo.setOperateStatus(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateStatus"));
			operationLogInfo.setOperateUserId(context.longValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateUserId"));
			operationLogInfo.setOperateTime(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateTime"));
			operationLogInfo.setStoreId(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].StoreId"));
			operationLogInfo.setItemTitle(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemTitle"));
			operationLogInfo.setItemId(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemId"));
			operationLogInfo.setItemActionPrice(context.integerValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemActionPrice"));
			operationLogInfo.setItemBarCode(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemBarCode"));
			operationLogInfo.setEslBarCode(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].EslBarCode"));
			operationLogInfo.setShelfCode(context.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ShelfCode"));

			operationLogs.add(operationLogInfo);
		}
		describeUserOperationLogResponse.setOperationLogs(operationLogs);
	 
	 	return describeUserOperationLogResponse;
	}
}