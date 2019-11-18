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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribeUserLogResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribeUserLogResponse.UserLogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserLogResponseUnmarshaller {

	public static DescribeUserLogResponse unmarshall(DescribeUserLogResponse describeUserLogResponse, UnmarshallerContext _ctx) {
		
		describeUserLogResponse.setRequestId(_ctx.stringValue("DescribeUserLogResponse.RequestId"));
		describeUserLogResponse.setErrorMessage(_ctx.stringValue("DescribeUserLogResponse.ErrorMessage"));
		describeUserLogResponse.setPageNumber(_ctx.integerValue("DescribeUserLogResponse.PageNumber"));
		describeUserLogResponse.setErrorCode(_ctx.stringValue("DescribeUserLogResponse.ErrorCode"));
		describeUserLogResponse.setMessage(_ctx.stringValue("DescribeUserLogResponse.Message"));
		describeUserLogResponse.setDynamicCode(_ctx.stringValue("DescribeUserLogResponse.DynamicCode"));
		describeUserLogResponse.setPageSize(_ctx.integerValue("DescribeUserLogResponse.PageSize"));
		describeUserLogResponse.setCode(_ctx.stringValue("DescribeUserLogResponse.Code"));
		describeUserLogResponse.setDynamicMessage(_ctx.stringValue("DescribeUserLogResponse.DynamicMessage"));
		describeUserLogResponse.setTotalCount(_ctx.integerValue("DescribeUserLogResponse.TotalCount"));
		describeUserLogResponse.setSuccess(_ctx.booleanValue("DescribeUserLogResponse.Success"));

		List<UserLogInfo> userLogs = new ArrayList<UserLogInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserLogResponse.UserLogs.Length"); i++) {
			UserLogInfo userLogInfo = new UserLogInfo();
			userLogInfo.setOperateType(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperateType"));
			userLogInfo.setOperateUserId(_ctx.longValue("DescribeUserLogResponse.UserLogs["+ i +"].OperateUserId"));
			userLogInfo.setMac(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].Mac"));
			userLogInfo.setItemActionPrice(_ctx.integerValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemActionPrice"));
			userLogInfo.setStoreId(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].StoreId"));
			userLogInfo.setEslBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].EslBarCode"));
			userLogInfo.setOperateStatus(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperateStatus"));
			userLogInfo.setItemBarCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemBarCode"));
			userLogInfo.setItemId(_ctx.longValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemId"));
			userLogInfo.setShelfCode(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ShelfCode"));
			userLogInfo.setOperateTime(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].OperateTime"));
			userLogInfo.setItemTitle(_ctx.stringValue("DescribeUserLogResponse.UserLogs["+ i +"].ItemTitle"));

			userLogs.add(userLogInfo);
		}
		describeUserLogResponse.setUserLogs(userLogs);
	 
	 	return describeUserLogResponse;
	}
}