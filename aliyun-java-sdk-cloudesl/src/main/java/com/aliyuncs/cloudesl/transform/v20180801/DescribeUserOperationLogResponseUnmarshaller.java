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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserOperationLogResponseUnmarshaller {

	public static DescribeUserOperationLogResponse unmarshall(DescribeUserOperationLogResponse describeUserOperationLogResponse, UnmarshallerContext _ctx) {
		
		describeUserOperationLogResponse.setRequestId(_ctx.stringValue("DescribeUserOperationLogResponse.RequestId"));
		describeUserOperationLogResponse.setSuccess(_ctx.booleanValue("DescribeUserOperationLogResponse.Success"));
		describeUserOperationLogResponse.setMessage(_ctx.stringValue("DescribeUserOperationLogResponse.Message"));
		describeUserOperationLogResponse.setErrorCode(_ctx.stringValue("DescribeUserOperationLogResponse.ErrorCode"));
		describeUserOperationLogResponse.setTotalCount(_ctx.integerValue("DescribeUserOperationLogResponse.TotalCount"));
		describeUserOperationLogResponse.setPageNumber(_ctx.integerValue("DescribeUserOperationLogResponse.PageNumber"));
		describeUserOperationLogResponse.setPageSize(_ctx.integerValue("DescribeUserOperationLogResponse.PageSize"));

		List<OperationLogInfo> operationLogs = new ArrayList<OperationLogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserOperationLogResponse.OperationLogs.Length"); i++) {
			OperationLogInfo operationLogInfo = new OperationLogInfo();
			operationLogInfo.setOperateType(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateType"));
			operationLogInfo.setOperateStatus(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateStatus"));
			operationLogInfo.setOperateUserId(_ctx.longValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateUserId"));
			operationLogInfo.setOperateTime(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].OperateTime"));
			operationLogInfo.setStoreId(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].StoreId"));
			operationLogInfo.setItemTitle(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemTitle"));
			operationLogInfo.setItemId(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemId"));
			operationLogInfo.setItemActionPrice(_ctx.integerValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemActionPrice"));
			operationLogInfo.setItemBarCode(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ItemBarCode"));
			operationLogInfo.setEslBarCode(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].EslBarCode"));
			operationLogInfo.setShelfCode(_ctx.stringValue("DescribeUserOperationLogResponse.OperationLogs["+ i +"].ShelfCode"));

			operationLogs.add(operationLogInfo);
		}
		describeUserOperationLogResponse.setOperationLogs(operationLogs);
	 
	 	return describeUserOperationLogResponse;
	}
}