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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSystemLogResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSystemLogResponse.SystemLogItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemLogResponseUnmarshaller {

	public static DescribeSystemLogResponse unmarshall(DescribeSystemLogResponse describeSystemLogResponse, UnmarshallerContext _ctx) {
		
		describeSystemLogResponse.setRequestId(_ctx.stringValue("DescribeSystemLogResponse.RequestId"));
		describeSystemLogResponse.setTotal(_ctx.longValue("DescribeSystemLogResponse.Total"));

		List<SystemLogItem> systemLog = new ArrayList<SystemLogItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSystemLogResponse.SystemLog.Length"); i++) {
			SystemLogItem systemLogItem = new SystemLogItem();
			systemLogItem.setStatus(_ctx.integerValue("DescribeSystemLogResponse.SystemLog["+ i +"].Status"));
			systemLogItem.setEntityType(_ctx.integerValue("DescribeSystemLogResponse.SystemLog["+ i +"].EntityType"));
			systemLogItem.setEntityObject(_ctx.stringValue("DescribeSystemLogResponse.SystemLog["+ i +"].EntityObject"));
			systemLogItem.setGmtCreate(_ctx.longValue("DescribeSystemLogResponse.SystemLog["+ i +"].GmtCreate"));
			systemLogItem.setOpAction(_ctx.integerValue("DescribeSystemLogResponse.SystemLog["+ i +"].OpAction"));
			systemLogItem.setGmtModified(_ctx.longValue("DescribeSystemLogResponse.SystemLog["+ i +"].GmtModified"));
			systemLogItem.setOpAccount(_ctx.stringValue("DescribeSystemLogResponse.SystemLog["+ i +"].OpAccount"));
			systemLogItem.setOpDesc(_ctx.stringValue("DescribeSystemLogResponse.SystemLog["+ i +"].OpDesc"));

			systemLog.add(systemLogItem);
		}
		describeSystemLogResponse.setSystemLog(systemLog);
	 
	 	return describeSystemLogResponse;
	}
}