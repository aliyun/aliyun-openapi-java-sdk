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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeNodeParamTagsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeNodeParamTagsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeParamTagsResponseUnmarshaller {

	public static DescribeNodeParamTagsResponse unmarshall(DescribeNodeParamTagsResponse describeNodeParamTagsResponse, UnmarshallerContext _ctx) {
		
		describeNodeParamTagsResponse.setRequestId(_ctx.stringValue("DescribeNodeParamTagsResponse.RequestId"));

		List<Data> paramReferredPaths = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeParamTagsResponse.ParamReferredPaths.Length"); i++) {
			Data data = new Data();
			data.setParamName(_ctx.stringValue("DescribeNodeParamTagsResponse.ParamReferredPaths["+ i +"].ParamName"));

			List<String> referredPath = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNodeParamTagsResponse.ParamReferredPaths["+ i +"].ReferredPath.Length"); j++) {
				referredPath.add(_ctx.stringValue("DescribeNodeParamTagsResponse.ParamReferredPaths["+ i +"].ReferredPath["+ j +"]"));
			}
			data.setReferredPath(referredPath);

			paramReferredPaths.add(data);
		}
		describeNodeParamTagsResponse.setParamReferredPaths(paramReferredPaths);
	 
	 	return describeNodeParamTagsResponse;
	}
}