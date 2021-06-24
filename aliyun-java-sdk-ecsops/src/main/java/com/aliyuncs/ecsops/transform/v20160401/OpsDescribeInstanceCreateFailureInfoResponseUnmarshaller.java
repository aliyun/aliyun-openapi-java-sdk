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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceCreateFailureInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceCreateFailureInfoResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstanceCreateFailureInfoResponseUnmarshaller {

	public static OpsDescribeInstanceCreateFailureInfoResponse unmarshall(OpsDescribeInstanceCreateFailureInfoResponse opsDescribeInstanceCreateFailureInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstanceCreateFailureInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.RequestId"));
		opsDescribeInstanceCreateFailureInfoResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstanceCreateFailureInfoResponse.TotalCount"));
		opsDescribeInstanceCreateFailureInfoResponse.setNextToken(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.NextToken"));
		opsDescribeInstanceCreateFailureInfoResponse.setPageSize(_ctx.integerValue("OpsDescribeInstanceCreateFailureInfoResponse.PageSize"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setGmtCreated(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].GmtCreated"));
			resource.setSuggestAction(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].SuggestAction"));
			resource.setAliUid(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].AliUid"));
			resource.setInstanceId(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].InstanceId"));
			resource.setFailureReason(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].FailureReason"));
			resource.setFailureLevel(_ctx.stringValue("OpsDescribeInstanceCreateFailureInfoResponse.Resources["+ i +"].FailureLevel"));

			resources.add(resource);
		}
		opsDescribeInstanceCreateFailureInfoResponse.setResources(resources);
	 
	 	return opsDescribeInstanceCreateFailureInfoResponse;
	}
}