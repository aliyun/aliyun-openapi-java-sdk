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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribePatternTypesResponse;
import com.aliyuncs.ess.model.v20140828.DescribePatternTypesResponse.PatternType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePatternTypesResponseUnmarshaller {

	public static DescribePatternTypesResponse unmarshall(DescribePatternTypesResponse describePatternTypesResponse, UnmarshallerContext _ctx) {
		
		describePatternTypesResponse.setRequestId(_ctx.stringValue("DescribePatternTypesResponse.RequestId"));

		List<PatternType> patternTypes = new ArrayList<PatternType>();
		for (int i = 0; i < _ctx.lengthValue("DescribePatternTypesResponse.PatternTypes.Length"); i++) {
			PatternType patternType = new PatternType();
			patternType.setInstanceType(_ctx.stringValue("DescribePatternTypesResponse.PatternTypes["+ i +"].InstanceType"));
			patternType.setInstanceFamilyLevel(_ctx.stringValue("DescribePatternTypesResponse.PatternTypes["+ i +"].InstanceFamilyLevel"));
			patternType.setInstanceTypeFamily(_ctx.stringValue("DescribePatternTypesResponse.PatternTypes["+ i +"].InstanceTypeFamily"));
			patternType.setCores(_ctx.integerValue("DescribePatternTypesResponse.PatternTypes["+ i +"].Cores"));
			patternType.setMemory(_ctx.floatValue("DescribePatternTypesResponse.PatternTypes["+ i +"].Memory"));

			patternTypes.add(patternType);
		}
		describePatternTypesResponse.setPatternTypes(patternTypes);
	 
	 	return describePatternTypesResponse;
	}
}