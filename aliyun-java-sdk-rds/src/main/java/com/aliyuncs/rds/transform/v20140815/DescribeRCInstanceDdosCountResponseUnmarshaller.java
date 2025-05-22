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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceDdosCountResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceDdosCountResponse.DdosCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceDdosCountResponseUnmarshaller {

	public static DescribeRCInstanceDdosCountResponse unmarshall(DescribeRCInstanceDdosCountResponse describeRCInstanceDdosCountResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceDdosCountResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceDdosCountResponse.RequestId"));

		DdosCount ddosCount = new DdosCount();
		ddosCount.setBlackholeCount(_ctx.stringValue("DescribeRCInstanceDdosCountResponse.DdosCount.BlackholeCount"));
		ddosCount.setInstacenCount(_ctx.stringValue("DescribeRCInstanceDdosCountResponse.DdosCount.InstacenCount"));
		ddosCount.setDefenseCount(_ctx.stringValue("DescribeRCInstanceDdosCountResponse.DdosCount.DefenseCount"));
		describeRCInstanceDdosCountResponse.setDdosCount(ddosCount);
	 
	 	return describeRCInstanceDdosCountResponse;
	}
}