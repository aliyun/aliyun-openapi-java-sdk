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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListSharedTargetsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListSharedTargetsResponse.SharedTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSharedTargetsResponseUnmarshaller {

	public static ListSharedTargetsResponse unmarshall(ListSharedTargetsResponse listSharedTargetsResponse, UnmarshallerContext _ctx) {
		
		listSharedTargetsResponse.setRequestId(_ctx.stringValue("ListSharedTargetsResponse.RequestId"));
		listSharedTargetsResponse.setNextToken(_ctx.stringValue("ListSharedTargetsResponse.NextToken"));

		List<SharedTarget> sharedTargets = new ArrayList<SharedTarget>();
		for (int i = 0; i < _ctx.lengthValue("ListSharedTargetsResponse.SharedTargets.Length"); i++) {
			SharedTarget sharedTarget = new SharedTarget();
			sharedTarget.setTargetId(_ctx.stringValue("ListSharedTargetsResponse.SharedTargets["+ i +"].TargetId"));
			sharedTarget.setUpdateTime(_ctx.stringValue("ListSharedTargetsResponse.SharedTargets["+ i +"].UpdateTime"));
			sharedTarget.setCreateTime(_ctx.stringValue("ListSharedTargetsResponse.SharedTargets["+ i +"].CreateTime"));
			sharedTarget.setResourceShareId(_ctx.stringValue("ListSharedTargetsResponse.SharedTargets["+ i +"].ResourceShareId"));
			sharedTarget.setExternal(_ctx.booleanValue("ListSharedTargetsResponse.SharedTargets["+ i +"].External"));
			sharedTarget.setTargetProperty(_ctx.stringValue("ListSharedTargetsResponse.SharedTargets["+ i +"].TargetProperty"));

			sharedTargets.add(sharedTarget);
		}
		listSharedTargetsResponse.setSharedTargets(sharedTargets);
	 
	 	return listSharedTargetsResponse;
	}
}