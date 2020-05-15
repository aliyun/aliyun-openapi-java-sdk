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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeUserLogResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeUserLogResponse.UserLogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserLogResponseUnmarshaller {

	public static DescribeUserLogResponse unmarshall(DescribeUserLogResponse describeUserLogResponse, UnmarshallerContext _ctx) {
		
		describeUserLogResponse.setRequestId(_ctx.stringValue("DescribeUserLogResponse.RequestId"));
		describeUserLogResponse.setErrorMessage(_ctx.stringValue("DescribeUserLogResponse.ErrorMessage"));
		describeUserLogResponse.setErrorCode(_ctx.stringValue("DescribeUserLogResponse.ErrorCode"));
		describeUserLogResponse.setPageNumber(_ctx.integerValue("DescribeUserLogResponse.PageNumber"));
		describeUserLogResponse.setMessage(_ctx.stringValue("DescribeUserLogResponse.Message"));
		describeUserLogResponse.setDynamicCode(_ctx.stringValue("DescribeUserLogResponse.DynamicCode"));
		describeUserLogResponse.setCode(_ctx.stringValue("DescribeUserLogResponse.Code"));
		describeUserLogResponse.setPageSize(_ctx.integerValue("DescribeUserLogResponse.PageSize"));
		describeUserLogResponse.setDynamicMessage(_ctx.stringValue("DescribeUserLogResponse.DynamicMessage"));
		describeUserLogResponse.setSuccess(_ctx.booleanValue("DescribeUserLogResponse.Success"));
		describeUserLogResponse.setTotalCount(_ctx.integerValue("DescribeUserLogResponse.TotalCount"));

		List<UserLogInfo> userLogs = new ArrayList<UserLogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserLogResponse.UserLogs.Length"); i++) {
			UserLogInfo userLogInfo = new UserLogInfo();
			userLogInfo.setResultCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ResultCode"));
			userLogInfo.setOperationSendTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationSendTime"));
			userLogInfo.setGmtCreate(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].GmtCreate"));
			userLogInfo.setStoreId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].StoreId"));
			userLogInfo.setGmtModified(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].GmtModified"));
			userLogInfo.setActionPrice(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ActionPrice"));
			userLogInfo.setOperationStatus(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationStatus"));
			userLogInfo.setPriceUnit(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].PriceUnit"));
			userLogInfo.setLogId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].LogId"));
			userLogInfo.setItemShortTitle(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemShortTitle"));
			userLogInfo.setOperationType(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationType"));
			userLogInfo.setOperationResponseTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationResponseTime"));
			userLogInfo.setSpendTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].SpendTime"));
			userLogInfo.setEslBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].EslBarCode"));
			userLogInfo.setItemId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemId"));
			userLogInfo.setItemBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemBarCode"));
			userLogInfo.setBePromotion(_ctx.booleanValue("DescribeUserLogResponse.UserLogs["+ i +"].BePromotion"));
			userLogInfo.setUserId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].UserId"));

			userLogs.add(userLogInfo);
		}
		describeUserLogResponse.setUserLogs(userLogs);
	 
	 	return describeUserLogResponse;
	}
}