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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorSLSGroupResponse;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorSLSGroupResponse.Data;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorSLSGroupResponse.Data.SLS;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHybridMonitorSLSGroupResponseUnmarshaller {

	public static DescribeHybridMonitorSLSGroupResponse unmarshall(DescribeHybridMonitorSLSGroupResponse describeHybridMonitorSLSGroupResponse, UnmarshallerContext _ctx) {
		
		describeHybridMonitorSLSGroupResponse.setRequestId(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.RequestId"));
		describeHybridMonitorSLSGroupResponse.setCode(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.Code"));
		describeHybridMonitorSLSGroupResponse.setMessage(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.Message"));
		describeHybridMonitorSLSGroupResponse.setSuccess(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.Success"));
		describeHybridMonitorSLSGroupResponse.setPageSize(_ctx.longValue("DescribeHybridMonitorSLSGroupResponse.PageSize"));
		describeHybridMonitorSLSGroupResponse.setPageNumber(_ctx.longValue("DescribeHybridMonitorSLSGroupResponse.PageNumber"));
		describeHybridMonitorSLSGroupResponse.setTotal(_ctx.longValue("DescribeHybridMonitorSLSGroupResponse.Total"));

		List<Data> list = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHybridMonitorSLSGroupResponse.List.Length"); i++) {
			Data data = new Data();
			data.setSLSGroupName(_ctx.longValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupName"));
			data.setSLSGroupDescription(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupDescription"));
			data.setCreateTime(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].CreateTime"));
			data.setUpdateTime(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].UpdateTime"));

			List<SLS> sLSGroupConfig = new ArrayList<SLS>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupConfig.Length"); j++) {
				SLS sLS = new SLS();
				sLS.setSLSRegion(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupConfig["+ j +"].SLSRegion"));
				sLS.setSLSProject(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupConfig["+ j +"].SLSProject"));
				sLS.setSLSLogstore(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupConfig["+ j +"].SLSLogstore"));
				sLS.setSLSUserId(_ctx.stringValue("DescribeHybridMonitorSLSGroupResponse.List["+ i +"].SLSGroupConfig["+ j +"].SLSUserId"));

				sLSGroupConfig.add(sLS);
			}
			data.setSLSGroupConfig(sLSGroupConfig);

			list.add(data);
		}
		describeHybridMonitorSLSGroupResponse.setList(list);
	 
	 	return describeHybridMonitorSLSGroupResponse;
	}
}