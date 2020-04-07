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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeVcentersResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVcentersResponse.Vcenter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVcentersResponseUnmarshaller {

	public static DescribeVcentersResponse unmarshall(DescribeVcentersResponse describeVcentersResponse, UnmarshallerContext _ctx) {
		
		describeVcentersResponse.setRequestId(_ctx.stringValue("DescribeVcentersResponse.RequestId"));
		describeVcentersResponse.setSuccess(_ctx.booleanValue("DescribeVcentersResponse.Success"));
		describeVcentersResponse.setCode(_ctx.stringValue("DescribeVcentersResponse.Code"));
		describeVcentersResponse.setMessage(_ctx.stringValue("DescribeVcentersResponse.Message"));
		describeVcentersResponse.setTotalCount(_ctx.integerValue("DescribeVcentersResponse.TotalCount"));
		describeVcentersResponse.setPageNumber(_ctx.integerValue("DescribeVcentersResponse.PageNumber"));
		describeVcentersResponse.setPageSize(_ctx.integerValue("DescribeVcentersResponse.PageSize"));

		List<Vcenter> vcenters = new ArrayList<Vcenter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVcentersResponse.Vcenters.Length"); i++) {
			Vcenter vcenter = new Vcenter();
			vcenter.setUuid(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].Uuid"));
			vcenter.setServerId(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].ServerId"));
			vcenter.setServerType(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].ServerType"));
			vcenter.setHost(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].Host"));
			vcenter.setUsername(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].Username"));
			vcenter.setServerStatus(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].ServerStatus"));
			vcenter.setDescription(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].Description"));
			vcenter.setDetailInfo(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].DetailInfo"));
			vcenter.setPassword(_ctx.stringValue("DescribeVcentersResponse.Vcenters["+ i +"].Password"));

			vcenters.add(vcenter);
		}
		describeVcentersResponse.setVcenters(vcenters);
	 
	 	return describeVcentersResponse;
	}
}