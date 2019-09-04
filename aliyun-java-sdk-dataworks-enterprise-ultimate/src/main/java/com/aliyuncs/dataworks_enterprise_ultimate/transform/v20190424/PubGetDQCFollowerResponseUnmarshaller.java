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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCFollowerResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCFollowerResponse.Follower;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubGetDQCFollowerResponseUnmarshaller {

	public static PubGetDQCFollowerResponse unmarshall(PubGetDQCFollowerResponse pubGetDQCFollowerResponse, UnmarshallerContext _ctx) {
		
		pubGetDQCFollowerResponse.setReturnCode(_ctx.stringValue("PubGetDQCFollowerResponse.ReturnCode"));

		List<Follower> returnValue = new ArrayList<Follower>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCFollowerResponse.ReturnValue.Length"); i++) {
			Follower follower = new Follower();
			follower.setProjectName(_ctx.stringValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].ProjectName"));
			follower.setTableName(_ctx.stringValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].TableName"));
			follower.setId(_ctx.longValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].Id"));
			follower.setEntityId(_ctx.stringValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].EntityId"));
			follower.setFollower(_ctx.stringValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].Follower"));
			follower.setAlarmMode(_ctx.integerValue("PubGetDQCFollowerResponse.ReturnValue["+ i +"].AlarmMode"));

			returnValue.add(follower);
		}
		pubGetDQCFollowerResponse.setReturnValue(returnValue);
	 
	 	return pubGetDQCFollowerResponse;
	}
}