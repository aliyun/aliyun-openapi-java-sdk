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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeUserRegionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeUserRegionResponse.UserRegionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeUserRegionResponseUnmarshaller {

	public static OpsDescribeUserRegionResponse unmarshall(OpsDescribeUserRegionResponse opsDescribeUserRegionResponse, UnmarshallerContext _ctx) {
		
		opsDescribeUserRegionResponse.setRequestId(_ctx.stringValue("OpsDescribeUserRegionResponse.RequestId"));
		opsDescribeUserRegionResponse.setCode(_ctx.stringValue("OpsDescribeUserRegionResponse.Code"));
		opsDescribeUserRegionResponse.setMessage(_ctx.stringValue("OpsDescribeUserRegionResponse.Message"));
		opsDescribeUserRegionResponse.setSuccess(_ctx.stringValue("OpsDescribeUserRegionResponse.Success"));
		opsDescribeUserRegionResponse.setTotalCount(_ctx.integerValue("OpsDescribeUserRegionResponse.TotalCount"));

		List<UserRegionModel> userRegionModels = new ArrayList<UserRegionModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeUserRegionResponse.UserRegionModels.Length"); i++) {
			UserRegionModel userRegionModel = new UserRegionModel();
			userRegionModel.setRegionNo(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].RegionNo"));
			userRegionModel.setIzNo(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].IzNo"));
			userRegionModel.setZoneGroupNo(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].ZoneGroupNo"));
			userRegionModel.setIzState(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].IzState"));
			userRegionModel.setZoneGroupState(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].ZoneGroupState"));
			userRegionModel.setBflag(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].Bflag"));
			userRegionModel.setParentBflag(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].ParentBflag"));
			userRegionModel.setZoneNos(_ctx.stringValue("OpsDescribeUserRegionResponse.UserRegionModels["+ i +"].ZoneNos"));

			userRegionModels.add(userRegionModel);
		}
		opsDescribeUserRegionResponse.setUserRegionModels(userRegionModels);
	 
	 	return opsDescribeUserRegionResponse;
	}
}