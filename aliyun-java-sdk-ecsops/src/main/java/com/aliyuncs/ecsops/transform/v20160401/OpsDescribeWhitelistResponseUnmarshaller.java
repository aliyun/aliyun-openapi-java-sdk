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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWhitelistResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWhitelistResponse.EcsWhiteListModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeWhitelistResponseUnmarshaller {

	public static OpsDescribeWhitelistResponse unmarshall(OpsDescribeWhitelistResponse opsDescribeWhitelistResponse, UnmarshallerContext _ctx) {
		
		opsDescribeWhitelistResponse.setRequestId(_ctx.stringValue("OpsDescribeWhitelistResponse.RequestId"));
		opsDescribeWhitelistResponse.setCode(_ctx.stringValue("OpsDescribeWhitelistResponse.Code"));
		opsDescribeWhitelistResponse.setMessage(_ctx.stringValue("OpsDescribeWhitelistResponse.Message"));
		opsDescribeWhitelistResponse.setSuccess(_ctx.booleanValue("OpsDescribeWhitelistResponse.Success"));
		opsDescribeWhitelistResponse.setTotalCount(_ctx.integerValue("OpsDescribeWhitelistResponse.TotalCount"));
		opsDescribeWhitelistResponse.setPageNo(_ctx.integerValue("OpsDescribeWhitelistResponse.PageNo"));
		opsDescribeWhitelistResponse.setPageSize(_ctx.integerValue("OpsDescribeWhitelistResponse.PageSize"));

		List<EcsWhiteListModel> ecsWhiteListModels = new ArrayList<EcsWhiteListModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeWhitelistResponse.EcsWhiteListModels.Length"); i++) {
			EcsWhiteListModel ecsWhiteListModel = new EcsWhiteListModel();
			ecsWhiteListModel.setId(_ctx.longValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].Id"));
			ecsWhiteListModel.setUserName(_ctx.stringValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].UserName"));
			ecsWhiteListModel.setType(_ctx.stringValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].Type"));
			ecsWhiteListModel.setAliUid(_ctx.longValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].AliUid"));
			ecsWhiteListModel.setQuota(_ctx.integerValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].Quota"));
			ecsWhiteListModel.setGmtCreated(_ctx.stringValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].GmtCreated"));
			ecsWhiteListModel.setGmtModified(_ctx.stringValue("OpsDescribeWhitelistResponse.EcsWhiteListModels["+ i +"].GmtModified"));

			ecsWhiteListModels.add(ecsWhiteListModel);
		}
		opsDescribeWhitelistResponse.setEcsWhiteListModels(ecsWhiteListModels);
	 
	 	return opsDescribeWhitelistResponse;
	}
}