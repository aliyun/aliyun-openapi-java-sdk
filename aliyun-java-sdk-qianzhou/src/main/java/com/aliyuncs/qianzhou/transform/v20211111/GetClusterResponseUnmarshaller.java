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

package com.aliyuncs.qianzhou.transform.v20211111;

import com.aliyuncs.qianzhou.model.v20211111.GetClusterResponse;
import com.aliyuncs.qianzhou.model.v20211111.GetClusterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterResponseUnmarshaller {

	public static GetClusterResponse unmarshall(GetClusterResponse getClusterResponse, UnmarshallerContext _ctx) {
		
		getClusterResponse.setRequestId(_ctx.stringValue("GetClusterResponse.requestId"));

		Data data = new Data();
		data.setClusterID(_ctx.stringValue("GetClusterResponse.data.clusterID"));
		data.setName(_ctx.stringValue("GetClusterResponse.data.name"));
		data.setRegionID(_ctx.stringValue("GetClusterResponse.data.regionID"));
		data.setState(_ctx.stringValue("GetClusterResponse.data.state"));
		data.setUserID(_ctx.stringValue("GetClusterResponse.data.userID"));
		data.setClusterType(_ctx.stringValue("GetClusterResponse.data.clusterType"));
		data.setCurrentVersion(_ctx.stringValue("GetClusterResponse.data.currentVersion"));
		data.setSecurityGroupId(_ctx.stringValue("GetClusterResponse.data.securityGroupId"));
		data.setProfile(_ctx.stringValue("GetClusterResponse.data.profile"));
		data.setSpec(_ctx.stringValue("GetClusterResponse.data.spec"));
		getClusterResponse.setData(data);
	 
	 	return getClusterResponse;
	}
}