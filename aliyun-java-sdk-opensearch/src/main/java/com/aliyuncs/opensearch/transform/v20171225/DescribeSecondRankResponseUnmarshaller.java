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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.DescribeSecondRankResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeSecondRankResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecondRankResponseUnmarshaller {

	public static DescribeSecondRankResponse unmarshall(DescribeSecondRankResponse describeSecondRankResponse, UnmarshallerContext _ctx) {
		
		describeSecondRankResponse.setRequestId(_ctx.stringValue("DescribeSecondRankResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeSecondRankResponse.result.id"));
		result.setName(_ctx.stringValue("DescribeSecondRankResponse.result.name"));
		result.setMeta(_ctx.stringValue("DescribeSecondRankResponse.result.meta"));
		result.setActive(_ctx.booleanValue("DescribeSecondRankResponse.result.active"));
		result.setDescription(_ctx.stringValue("DescribeSecondRankResponse.result.description"));
		result.setCreated(_ctx.integerValue("DescribeSecondRankResponse.result.created"));
		result.setUpdated(_ctx.integerValue("DescribeSecondRankResponse.result.updated"));
		result.setIsDefault(_ctx.stringValue("DescribeSecondRankResponse.result.isDefault"));
		result.setIsSys(_ctx.stringValue("DescribeSecondRankResponse.result.isSys"));
		describeSecondRankResponse.setResult(result);
	 
	 	return describeSecondRankResponse;
	}
}