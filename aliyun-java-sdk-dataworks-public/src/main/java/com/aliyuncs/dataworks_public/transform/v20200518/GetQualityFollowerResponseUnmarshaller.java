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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetQualityFollowerResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetQualityFollowerResponse.Follower;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityFollowerResponseUnmarshaller {

	public static GetQualityFollowerResponse unmarshall(GetQualityFollowerResponse getQualityFollowerResponse, UnmarshallerContext _ctx) {
		
		getQualityFollowerResponse.setRequestId(_ctx.stringValue("GetQualityFollowerResponse.RequestId"));
		getQualityFollowerResponse.setErrorCode(_ctx.stringValue("GetQualityFollowerResponse.ErrorCode"));
		getQualityFollowerResponse.setSuccess(_ctx.booleanValue("GetQualityFollowerResponse.Success"));
		getQualityFollowerResponse.setErrorMessage(_ctx.stringValue("GetQualityFollowerResponse.ErrorMessage"));
		getQualityFollowerResponse.setHttpStatusCode(_ctx.integerValue("GetQualityFollowerResponse.HttpStatusCode"));

		List<Follower> data = new ArrayList<Follower>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityFollowerResponse.Data.Length"); i++) {
			Follower follower = new Follower();
			follower.setProjectName(_ctx.stringValue("GetQualityFollowerResponse.Data["+ i +"].ProjectName"));
			follower.setTableName(_ctx.stringValue("GetQualityFollowerResponse.Data["+ i +"].TableName"));
			follower.setId(_ctx.longValue("GetQualityFollowerResponse.Data["+ i +"].Id"));
			follower.setEntityId(_ctx.stringValue("GetQualityFollowerResponse.Data["+ i +"].EntityId"));
			follower.setFollower(_ctx.stringValue("GetQualityFollowerResponse.Data["+ i +"].Follower"));
			follower.setAlarmMode(_ctx.integerValue("GetQualityFollowerResponse.Data["+ i +"].AlarmMode"));

			data.add(follower);
		}
		getQualityFollowerResponse.setData(data);
	 
	 	return getQualityFollowerResponse;
	}
}