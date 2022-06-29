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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListTargetsForPolicyResponse;
import com.aliyuncs.tag.model.v20180828.ListTargetsForPolicyResponse.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetsForPolicyResponseUnmarshaller {

	public static ListTargetsForPolicyResponse unmarshall(ListTargetsForPolicyResponse listTargetsForPolicyResponse, UnmarshallerContext _ctx) {
		
		listTargetsForPolicyResponse.setRequestId(_ctx.stringValue("ListTargetsForPolicyResponse.RequestId"));
		listTargetsForPolicyResponse.setIsRd(_ctx.booleanValue("ListTargetsForPolicyResponse.IsRd"));
		listTargetsForPolicyResponse.setRdId(_ctx.stringValue("ListTargetsForPolicyResponse.RdId"));
		listTargetsForPolicyResponse.setNextToken(_ctx.stringValue("ListTargetsForPolicyResponse.NextToken"));

		List<Target> targets = new ArrayList<Target>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetsForPolicyResponse.Targets.Length"); i++) {
			Target target = new Target();
			target.setTargetId(_ctx.stringValue("ListTargetsForPolicyResponse.Targets["+ i +"].TargetId"));
			target.setTargetType(_ctx.integerValue("ListTargetsForPolicyResponse.Targets["+ i +"].TargetType"));

			targets.add(target);
		}
		listTargetsForPolicyResponse.setTargets(targets);
	 
	 	return listTargetsForPolicyResponse;
	}
}