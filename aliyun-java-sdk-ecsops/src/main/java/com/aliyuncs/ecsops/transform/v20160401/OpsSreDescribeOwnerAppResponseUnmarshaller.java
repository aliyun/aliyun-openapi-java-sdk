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

import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerAppResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerAppResponse.OwnerApps;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSreDescribeOwnerAppResponseUnmarshaller {

	public static OpsSreDescribeOwnerAppResponse unmarshall(OpsSreDescribeOwnerAppResponse opsSreDescribeOwnerAppResponse, UnmarshallerContext _ctx) {
		
		opsSreDescribeOwnerAppResponse.setRequestId(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.RequestId"));
		opsSreDescribeOwnerAppResponse.setMessage(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Message"));
		opsSreDescribeOwnerAppResponse.setPageSize(_ctx.integerValue("OpsSreDescribeOwnerAppResponse.PageSize"));
		opsSreDescribeOwnerAppResponse.setTotal(_ctx.integerValue("OpsSreDescribeOwnerAppResponse.Total"));
		opsSreDescribeOwnerAppResponse.setPageNo(_ctx.integerValue("OpsSreDescribeOwnerAppResponse.PageNo"));
		opsSreDescribeOwnerAppResponse.setCode(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Code"));
		opsSreDescribeOwnerAppResponse.setSuccess(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Success"));

		List<OwnerApps> data = new ArrayList<OwnerApps>();
		for (int i = 0; i < _ctx.lengthValue("OpsSreDescribeOwnerAppResponse.Data.Length"); i++) {
			OwnerApps ownerApps = new OwnerApps();
			ownerApps.setOwnerAppTagName(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Data["+ i +"].OwnerAppTagName"));
			ownerApps.setOwnerApp(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Data["+ i +"].OwnerApp"));
			ownerApps.setGmtCreate(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Data["+ i +"].GmtCreate"));
			ownerApps.setGmtModified(_ctx.stringValue("OpsSreDescribeOwnerAppResponse.Data["+ i +"].GmtModified"));
			ownerApps.setId(_ctx.longValue("OpsSreDescribeOwnerAppResponse.Data["+ i +"].Id"));

			data.add(ownerApps);
		}
		opsSreDescribeOwnerAppResponse.setData(data);
	 
	 	return opsSreDescribeOwnerAppResponse;
	}
}