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

import com.aliyuncs.sophonsoar.model.v20220728.DescribeComponentPlaybookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeComponentPlaybookResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentPlaybookResponseUnmarshaller {

	public static DescribeComponentPlaybookResponse unmarshall(DescribeComponentPlaybookResponse describeComponentPlaybookResponse, UnmarshallerContext _ctx) {
		
		describeComponentPlaybookResponse.setRequestId(_ctx.stringValue("DescribeComponentPlaybookResponse.RequestId"));

		List<Data> playbooks = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeComponentPlaybookResponse.Playbooks.Length"); i++) {
			Data data = new Data();
			data.setDisplayName(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].DisplayName"));
			data.setPlaybookUuid(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].PlaybookUuid"));
			data.setOwnType(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].OwnType"));
			data.setInputParams(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].InputParams"));
			data.setOutputParams(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].OutputParams"));
			data.setDescription(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].Description"));
			data.setTenantId(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].TenantId"));
			data.setParamType(_ctx.stringValue("DescribeComponentPlaybookResponse.Playbooks["+ i +"].ParamType"));

			playbooks.add(data);
		}
		describeComponentPlaybookResponse.setPlaybooks(playbooks);
	 
	 	return describeComponentPlaybookResponse;
	}
}