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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.CrossAccountVerifyTokenResponse;
import com.aliyuncs.market.model.v20151101.CrossAccountVerifyTokenResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CrossAccountVerifyTokenResponseUnmarshaller {

	public static CrossAccountVerifyTokenResponse unmarshall(CrossAccountVerifyTokenResponse crossAccountVerifyTokenResponse, UnmarshallerContext _ctx) {
		
		crossAccountVerifyTokenResponse.setRequestId(_ctx.stringValue("CrossAccountVerifyTokenResponse.RequestId"));
		crossAccountVerifyTokenResponse.setSuccess(_ctx.booleanValue("CrossAccountVerifyTokenResponse.Success"));
		crossAccountVerifyTokenResponse.setCode(_ctx.stringValue("CrossAccountVerifyTokenResponse.Code"));
		crossAccountVerifyTokenResponse.setMessage(_ctx.stringValue("CrossAccountVerifyTokenResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CrossAccountVerifyTokenResponse.Result.Name"));
		result.setUid(_ctx.stringValue("CrossAccountVerifyTokenResponse.Result.Uid"));
		result.setAuthTime(_ctx.longValue("CrossAccountVerifyTokenResponse.Result.AuthTime"));

		List<String> authRoles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CrossAccountVerifyTokenResponse.Result.AuthRoles.Length"); i++) {
			authRoles.add(_ctx.stringValue("CrossAccountVerifyTokenResponse.Result.AuthRoles["+ i +"]"));
		}
		result.setAuthRoles(authRoles);
		crossAccountVerifyTokenResponse.setResult(result);
	 
	 	return crossAccountVerifyTokenResponse;
	}
}