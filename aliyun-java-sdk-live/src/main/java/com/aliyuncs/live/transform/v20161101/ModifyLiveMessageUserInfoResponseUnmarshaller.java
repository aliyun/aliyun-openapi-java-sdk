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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ModifyLiveMessageUserInfoResponse;
import com.aliyuncs.live.model.v20161101.ModifyLiveMessageUserInfoResponse.FailGroups;
import com.aliyuncs.live.model.v20161101.ModifyLiveMessageUserInfoResponse.SuccessGroups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyLiveMessageUserInfoResponseUnmarshaller {

	public static ModifyLiveMessageUserInfoResponse unmarshall(ModifyLiveMessageUserInfoResponse modifyLiveMessageUserInfoResponse, UnmarshallerContext _ctx) {
		
		modifyLiveMessageUserInfoResponse.setRequestId(_ctx.stringValue("ModifyLiveMessageUserInfoResponse.RequestId"));

		List<FailGroups> failList = new ArrayList<FailGroups>();
		for (int i = 0; i < _ctx.lengthValue("ModifyLiveMessageUserInfoResponse.FailList.Length"); i++) {
			FailGroups failGroups = new FailGroups();
			failGroups.setCode(_ctx.integerValue("ModifyLiveMessageUserInfoResponse.FailList["+ i +"].Code"));
			failGroups.setGroupId(_ctx.stringValue("ModifyLiveMessageUserInfoResponse.FailList["+ i +"].GroupId"));
			failGroups.setReason(_ctx.stringValue("ModifyLiveMessageUserInfoResponse.FailList["+ i +"].Reason"));
			failGroups.setSuccess(_ctx.booleanValue("ModifyLiveMessageUserInfoResponse.FailList["+ i +"].Success"));

			failList.add(failGroups);
		}
		modifyLiveMessageUserInfoResponse.setFailList(failList);

		List<SuccessGroups> successList = new ArrayList<SuccessGroups>();
		for (int i = 0; i < _ctx.lengthValue("ModifyLiveMessageUserInfoResponse.SuccessList.Length"); i++) {
			SuccessGroups successGroups = new SuccessGroups();
			successGroups.setGroupId(_ctx.stringValue("ModifyLiveMessageUserInfoResponse.SuccessList["+ i +"].GroupId"));
			successGroups.setSuccess(_ctx.booleanValue("ModifyLiveMessageUserInfoResponse.SuccessList["+ i +"].Success"));

			successList.add(successGroups);
		}
		modifyLiveMessageUserInfoResponse.setSuccessList(successList);
	 
	 	return modifyLiveMessageUserInfoResponse;
	}
}