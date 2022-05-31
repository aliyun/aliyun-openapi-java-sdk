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
		describeUserLogResponse.setSuccess(_ctx.booleanValue("DescribeUserLogResponse.Success"));
		describeUserLogResponse.setErrorCode(_ctx.stringValue("DescribeUserLogResponse.ErrorCode"));
		describeUserLogResponse.setCode(_ctx.stringValue("DescribeUserLogResponse.Code"));
		describeUserLogResponse.setMessage(_ctx.stringValue("DescribeUserLogResponse.Message"));
		describeUserLogResponse.setDynamicMessage(_ctx.stringValue("DescribeUserLogResponse.DynamicMessage"));
		describeUserLogResponse.setPageSize(_ctx.integerValue("DescribeUserLogResponse.PageSize"));
		describeUserLogResponse.setPageNumber(_ctx.integerValue("DescribeUserLogResponse.PageNumber"));
		describeUserLogResponse.setTotalCount(_ctx.integerValue("DescribeUserLogResponse.TotalCount"));
		describeUserLogResponse.setDynamicCode(_ctx.stringValue("DescribeUserLogResponse.DynamicCode"));

		List<UserLogInfo> userLogs = new ArrayList<UserLogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserLogResponse.UserLogs.Length"); i++) {
			UserLogInfo userLogInfo = new UserLogInfo();
			userLogInfo.setEslBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].EslBarCode"));
			userLogInfo.setOperationSendTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationSendTime"));
			userLogInfo.setActionPrice(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ActionPrice"));
			userLogInfo.setUserId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].UserId"));
			userLogInfo.setPriceUnit(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].PriceUnit"));
			userLogInfo.setResultCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ResultCode"));
			userLogInfo.setItemId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemId"));
			userLogInfo.setGmtModified(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].GmtModified"));
			userLogInfo.setOperationType(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationType"));
			userLogInfo.setOperationResponseTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationResponseTime"));
			userLogInfo.setOperationStatus(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperationStatus"));
			userLogInfo.setStoreId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].StoreId"));
			userLogInfo.setItemShortTitle(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemShortTitle"));
			userLogInfo.setLogId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].LogId"));
			userLogInfo.setBePromotion(_ctx.booleanValue("DescribeUserLogResponse.UserLogs["+ i +"].BePromotion"));
			userLogInfo.setGmtCreate(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].GmtCreate"));
			userLogInfo.setEslSignal(_ctx.integerValue("DescribeUserLogResponse.UserLogs["+ i +"].EslSignal"));
			userLogInfo.setSpendTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].SpendTime"));
			userLogInfo.setItemBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemBarCode"));
			userLogInfo.setI18nResultKey(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].I18nResultKey"));

			userLogs.add(userLogInfo);
		}
		describeUserLogResponse.setUserLogs(userLogs);
	 
	 	return describeUserLogResponse;
	}
}