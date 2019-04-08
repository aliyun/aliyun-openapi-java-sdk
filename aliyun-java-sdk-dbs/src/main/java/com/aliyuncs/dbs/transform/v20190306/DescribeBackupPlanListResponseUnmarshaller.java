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

import com.aliyuncs.dbs.model.v20190306.DescribeBackupPlanListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlanListResponseUnmarshaller {

	public static DescribeBackupPlanListResponse unmarshall(DescribeBackupPlanListResponse describeBackupPlanListResponse, UnmarshallerContext context) {
		
		describeBackupPlanListResponse.setRequestId(context.stringValue("DescribeBackupPlanListResponse.RequestId"));
		describeBackupPlanListResponse.setSuccess(context.booleanValue("DescribeBackupPlanListResponse.Success"));
		describeBackupPlanListResponse.setErrCode(context.stringValue("DescribeBackupPlanListResponse.ErrCode"));
		describeBackupPlanListResponse.setErrMessage(context.stringValue("DescribeBackupPlanListResponse.ErrMessage"));
		describeBackupPlanListResponse.setHttpStatusCode(context.integerValue("DescribeBackupPlanListResponse.HttpStatusCode"));
		describeBackupPlanListResponse.setTotalPages(context.integerValue("DescribeBackupPlanListResponse.TotalPages"));
		describeBackupPlanListResponse.setPageSize(context.integerValue("DescribeBackupPlanListResponse.PageSize"));
		describeBackupPlanListResponse.setPageNum(context.integerValue("DescribeBackupPlanListResponse.PageNum"));
		describeBackupPlanListResponse.setTotalElements(context.integerValue("DescribeBackupPlanListResponse.TotalElements"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeBackupPlanListResponse.Items.Length"); i++) {
			items.add(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"]"));
		}
		describeBackupPlanListResponse.setItems(items);
	 
	 	return describeBackupPlanListResponse;
	}
}