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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.DescribePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyResponseUnmarshaller {

	public static DescribePolicyResponse unmarshall(DescribePolicyResponse describePolicyResponse, UnmarshallerContext _ctx) {
		
		describePolicyResponse.setRequestId(_ctx.stringValue("DescribePolicyResponse.RequestId"));
		describePolicyResponse.setArn(_ctx.stringValue("DescribePolicyResponse.Arn"));
		describePolicyResponse.setName(_ctx.stringValue("DescribePolicyResponse.Name"));
		describePolicyResponse.setDescription(_ctx.stringValue("DescribePolicyResponse.Description"));
		describePolicyResponse.setKmsInstance(_ctx.stringValue("DescribePolicyResponse.KmsInstance"));
		describePolicyResponse.setAccessControlRules(_ctx.stringValue("DescribePolicyResponse.AccessControlRules"));

		List<String> permissions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyResponse.Permissions.Length"); i++) {
			permissions.add(_ctx.stringValue("DescribePolicyResponse.Permissions["+ i +"]"));
		}
		describePolicyResponse.setPermissions(permissions);

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyResponse.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("DescribePolicyResponse.Resources["+ i +"]"));
		}
		describePolicyResponse.setResources(resources);
	 
	 	return describePolicyResponse;
	}
}