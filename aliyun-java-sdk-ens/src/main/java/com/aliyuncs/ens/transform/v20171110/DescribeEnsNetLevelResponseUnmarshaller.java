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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsNetLevelResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsNetLevelResponse.EnsNetLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsNetLevelResponseUnmarshaller {

	public static DescribeEnsNetLevelResponse unmarshall(DescribeEnsNetLevelResponse describeEnsNetLevelResponse, UnmarshallerContext _ctx) {
		
		describeEnsNetLevelResponse.setRequestId(_ctx.stringValue("DescribeEnsNetLevelResponse.RequestId"));
		describeEnsNetLevelResponse.setCode(_ctx.integerValue("DescribeEnsNetLevelResponse.Code"));

		List<EnsNetLevel> ensNetLevels = new ArrayList<EnsNetLevel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsNetLevelResponse.EnsNetLevels.Length"); i++) {
			EnsNetLevel ensNetLevel = new EnsNetLevel();
			ensNetLevel.setEnsNetLevelCode(_ctx.stringValue("DescribeEnsNetLevelResponse.EnsNetLevels["+ i +"].EnsNetLevelCode"));

			ensNetLevels.add(ensNetLevel);
		}
		describeEnsNetLevelResponse.setEnsNetLevels(ensNetLevels);
	 
	 	return describeEnsNetLevelResponse;
	}
}