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

package com.aliyuncs.es_serverless.transform.v20220822;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.es_serverless.model.v20220822.DescibeRegionsResponse;
import com.aliyuncs.es_serverless.model.v20220822.DescibeRegionsResponse.RegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescibeRegionsResponseUnmarshaller {

	public static DescibeRegionsResponse unmarshall(DescibeRegionsResponse descibeRegionsResponse, UnmarshallerContext _ctx) {
		
		descibeRegionsResponse.setRequestId(_ctx.stringValue("DescibeRegionsResponse.requestId"));

		List<RegionInfo> result = new ArrayList<RegionInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescibeRegionsResponse.result.Length"); i++) {
			RegionInfo regionInfo = new RegionInfo();
			regionInfo.setRegionId(_ctx.stringValue("DescibeRegionsResponse.result["+ i +"].regionId"));
			regionInfo.setLocalName(_ctx.stringValue("DescibeRegionsResponse.result["+ i +"].localName"));
			regionInfo.setEndpoint(_ctx.stringValue("DescibeRegionsResponse.result["+ i +"].endpoint"));

			result.add(regionInfo);
		}
		descibeRegionsResponse.setResult(result);
	 
	 	return descibeRegionsResponse;
	}
}