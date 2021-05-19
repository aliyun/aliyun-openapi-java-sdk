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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetGrantedRoleIdsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGrantedRoleIdsResponseUnmarshaller {

	public static GetGrantedRoleIdsResponse unmarshall(GetGrantedRoleIdsResponse getGrantedRoleIdsResponse, UnmarshallerContext _ctx) {
		
		getGrantedRoleIdsResponse.setRequestId(_ctx.stringValue("GetGrantedRoleIdsResponse.RequestId"));
		getGrantedRoleIdsResponse.setMessage(_ctx.stringValue("GetGrantedRoleIdsResponse.Message"));
		getGrantedRoleIdsResponse.setCode(_ctx.stringValue("GetGrantedRoleIdsResponse.Code"));
		getGrantedRoleIdsResponse.setSuccess(_ctx.booleanValue("GetGrantedRoleIdsResponse.Success"));
		getGrantedRoleIdsResponse.setHttpStatusCode(_ctx.longValue("GetGrantedRoleIdsResponse.HttpStatusCode"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetGrantedRoleIdsResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("GetGrantedRoleIdsResponse.Data["+ i +"]"));
		}
		getGrantedRoleIdsResponse.setData(data);
	 
	 	return getGrantedRoleIdsResponse;
	}
}