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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangeResourceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangeResourceResponse.ChangeResourceOpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangeResourceResponseUnmarshaller {

	public static OpsDescribeChangeResourceResponse unmarshall(OpsDescribeChangeResourceResponse opsDescribeChangeResourceResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangeResourceResponse.setRequestId(_ctx.stringValue("OpsDescribeChangeResourceResponse.RequestId"));
		opsDescribeChangeResourceResponse.setCode(_ctx.stringValue("OpsDescribeChangeResourceResponse.Code"));
		opsDescribeChangeResourceResponse.setMessage(_ctx.stringValue("OpsDescribeChangeResourceResponse.Message"));
		opsDescribeChangeResourceResponse.setSuccess(_ctx.booleanValue("OpsDescribeChangeResourceResponse.Success"));
		opsDescribeChangeResourceResponse.setTotalCount(_ctx.integerValue("OpsDescribeChangeResourceResponse.TotalCount"));
		opsDescribeChangeResourceResponse.setPageNumber(_ctx.integerValue("OpsDescribeChangeResourceResponse.PageNumber"));
		opsDescribeChangeResourceResponse.setPageSize(_ctx.integerValue("OpsDescribeChangeResourceResponse.PageSize"));

		List<ChangeResourceOpsModel> changeResourceOpsModels = new ArrayList<ChangeResourceOpsModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels.Length"); i++) {
			ChangeResourceOpsModel changeResourceOpsModel = new ChangeResourceOpsModel();
			changeResourceOpsModel.setId(_ctx.longValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].Id"));
			changeResourceOpsModel.setZoneId(_ctx.longValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].ZoneId"));
			changeResourceOpsModel.setInstanceId(_ctx.stringValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].InstanceId"));
			changeResourceOpsModel.setRegionNo(_ctx.stringValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].RegionNo"));
			changeResourceOpsModel.setResourceType(_ctx.stringValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].ResourceType"));
			changeResourceOpsModel.setChangeTypeName(_ctx.stringValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].ChangeTypeName"));
			changeResourceOpsModel.setStatus(_ctx.integerValue("OpsDescribeChangeResourceResponse.ChangeResourceOpsModels["+ i +"].Status"));

			changeResourceOpsModels.add(changeResourceOpsModel);
		}
		opsDescribeChangeResourceResponse.setChangeResourceOpsModels(changeResourceOpsModels);
	 
	 	return opsDescribeChangeResourceResponse;
	}
}