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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeRestorePlansResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRestorePlansResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeRestorePlansResponse.RestorePlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestorePlansResponseUnmarshaller {

	public static DescribeRestorePlansResponse unmarshall(DescribeRestorePlansResponse describeRestorePlansResponse, UnmarshallerContext _ctx) {
		
		describeRestorePlansResponse.setRequestId(_ctx.stringValue("DescribeRestorePlansResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeRestorePlansResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeRestorePlansResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeRestorePlansResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeRestorePlansResponse.PageInfo.Count"));
		describeRestorePlansResponse.setPageInfo(pageInfo);

		List<RestorePlan> restorePlans = new ArrayList<RestorePlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestorePlansResponse.RestorePlans.Length"); i++) {
			RestorePlan restorePlan = new RestorePlan();
			restorePlan.setStatus(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].Status"));
			restorePlan.setRestorePoint(_ctx.longValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].RestorePoint"));
			restorePlan.setUpdatedTime(_ctx.longValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].UpdatedTime"));
			restorePlan.setDatabaseName(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].DatabaseName"));
			restorePlan.setInstanceName(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].InstanceName"));
			restorePlan.setTargetInstanceName(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].TargetInstanceName"));
			restorePlan.setTargetDatabaseName(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].TargetDatabaseName"));
			restorePlan.setPolicyName(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].PolicyName"));
			restorePlan.setPolicyId(_ctx.longValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].PolicyId"));
			restorePlan.setTargetInstanceId(_ctx.stringValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].TargetInstanceId"));
			restorePlan.setCreatedTime(_ctx.longValue("DescribeRestorePlansResponse.RestorePlans["+ i +"].CreatedTime"));

			restorePlans.add(restorePlan);
		}
		describeRestorePlansResponse.setRestorePlans(restorePlans);
	 
	 	return describeRestorePlansResponse;
	}
}