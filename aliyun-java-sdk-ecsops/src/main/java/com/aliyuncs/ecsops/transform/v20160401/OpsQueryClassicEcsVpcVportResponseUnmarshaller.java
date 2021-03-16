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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryClassicEcsVpcVportResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryClassicEcsVpcVportResponse.ClassicEcsVpcVport;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryClassicEcsVpcVportResponseUnmarshaller {

	public static OpsQueryClassicEcsVpcVportResponse unmarshall(OpsQueryClassicEcsVpcVportResponse opsQueryClassicEcsVpcVportResponse, UnmarshallerContext _ctx) {
		
		opsQueryClassicEcsVpcVportResponse.setRequestId(_ctx.stringValue("OpsQueryClassicEcsVpcVportResponse.RequestId"));

		List<ClassicEcsVpcVport> classicEcsVpcVportSet = new ArrayList<ClassicEcsVpcVport>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryClassicEcsVpcVportResponse.ClassicEcsVpcVportSet.Length"); i++) {
			ClassicEcsVpcVport classicEcsVpcVport = new ClassicEcsVpcVport();
			classicEcsVpcVport.setInstanceId(_ctx.stringValue("OpsQueryClassicEcsVpcVportResponse.ClassicEcsVpcVportSet["+ i +"].InstanceId"));
			classicEcsVpcVport.setVportId(_ctx.stringValue("OpsQueryClassicEcsVpcVportResponse.ClassicEcsVpcVportSet["+ i +"].VportId"));

			classicEcsVpcVportSet.add(classicEcsVpcVport);
		}
		opsQueryClassicEcsVpcVportResponse.setClassicEcsVpcVportSet(classicEcsVpcVportSet);
	 
	 	return opsQueryClassicEcsVpcVportResponse;
	}
}