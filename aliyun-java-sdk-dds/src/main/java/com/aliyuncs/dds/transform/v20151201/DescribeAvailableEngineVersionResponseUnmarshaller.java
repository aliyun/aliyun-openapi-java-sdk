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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAvailableEngineVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableEngineVersionResponseUnmarshaller {

	public static DescribeAvailableEngineVersionResponse unmarshall(DescribeAvailableEngineVersionResponse describeAvailableEngineVersionResponse, UnmarshallerContext _ctx) {
		
		describeAvailableEngineVersionResponse.setRequestId(_ctx.stringValue("DescribeAvailableEngineVersionResponse.RequestId"));

		List<String> engineVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableEngineVersionResponse.EngineVersions.Length"); i++) {
			engineVersions.add(_ctx.stringValue("DescribeAvailableEngineVersionResponse.EngineVersions["+ i +"]"));
		}
		describeAvailableEngineVersionResponse.setEngineVersions(engineVersions);
	 
	 	return describeAvailableEngineVersionResponse;
	}
}