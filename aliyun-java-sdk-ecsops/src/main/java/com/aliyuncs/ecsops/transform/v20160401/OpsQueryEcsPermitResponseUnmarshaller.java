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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsPermitResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsPermitResponse.Permition;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsPermitResponseUnmarshaller {

	public static OpsQueryEcsPermitResponse unmarshall(OpsQueryEcsPermitResponse opsQueryEcsPermitResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsPermitResponse.setRequestId(_ctx.stringValue("OpsQueryEcsPermitResponse.RequestId"));

		List<Permition> permitions = new ArrayList<Permition>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEcsPermitResponse.Permitions.Length"); i++) {
			Permition permition = new Permition();
			permition.setPermitKey(_ctx.stringValue("OpsQueryEcsPermitResponse.Permitions["+ i +"].PermitKey"));
			permition.setPermitValue(_ctx.stringValue("OpsQueryEcsPermitResponse.Permitions["+ i +"].PermitValue"));

			permitions.add(permition);
		}
		opsQueryEcsPermitResponse.setPermitions(permitions);
	 
	 	return opsQueryEcsPermitResponse;
	}
}