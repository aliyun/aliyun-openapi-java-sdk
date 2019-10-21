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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainLatestBlocksResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainLatestBlocksResponseUnmarshaller {

	public static DescribeAntChainLatestBlocksResponse unmarshall(DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocksResponse, UnmarshallerContext _ctx) {
		
		describeAntChainLatestBlocksResponse.setRequestId(_ctx.stringValue("DescribeAntChainLatestBlocksResponse.RequestId"));

		List<Map<Object, Object>> result = _ctx.listMapValue("DescribeAntChainLatestBlocksResponse.Result");
		describeAntChainLatestBlocksResponse.setResult(result);
	 
	 	return describeAntChainLatestBlocksResponse;
	}
}