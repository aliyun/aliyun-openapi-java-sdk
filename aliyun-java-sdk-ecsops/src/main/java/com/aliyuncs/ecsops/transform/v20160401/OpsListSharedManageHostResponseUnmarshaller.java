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

import com.aliyuncs.ecsops.model.v20160401.OpsListSharedManageHostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListSharedManageHostResponseUnmarshaller {

	public static OpsListSharedManageHostResponse unmarshall(OpsListSharedManageHostResponse opsListSharedManageHostResponse, UnmarshallerContext _ctx) {
		
		opsListSharedManageHostResponse.setRequestId(_ctx.stringValue("OpsListSharedManageHostResponse.RequestId"));
		opsListSharedManageHostResponse.setTotalCount(_ctx.longValue("OpsListSharedManageHostResponse.TotalCount"));
		opsListSharedManageHostResponse.setNextToken(_ctx.stringValue("OpsListSharedManageHostResponse.NextToken"));

		List<String> managedHostIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsListSharedManageHostResponse.ManagedHostIdSet.Length"); i++) {
			managedHostIdSet.add(_ctx.stringValue("OpsListSharedManageHostResponse.ManagedHostIdSet["+ i +"]"));
		}
		opsListSharedManageHostResponse.setManagedHostIdSet(managedHostIdSet);
	 
	 	return opsListSharedManageHostResponse;
	}
}