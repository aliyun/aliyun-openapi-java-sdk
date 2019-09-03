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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.InnerGetUserListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetUserListResponseUnmarshaller {

	public static InnerGetUserListResponse unmarshall(InnerGetUserListResponse innerGetUserListResponse, UnmarshallerContext _ctx) {
		
		innerGetUserListResponse.setRequestId(_ctx.stringValue("InnerGetUserListResponse.RequestId"));
		innerGetUserListResponse.setSuccess(_ctx.booleanValue("InnerGetUserListResponse.Success"));

		List<String> aliuids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerGetUserListResponse.Aliuids.Length"); i++) {
			aliuids.add(_ctx.stringValue("InnerGetUserListResponse.Aliuids["+ i +"]"));
		}
		innerGetUserListResponse.setAliuids(aliuids);
	 
	 	return innerGetUserListResponse;
	}
}