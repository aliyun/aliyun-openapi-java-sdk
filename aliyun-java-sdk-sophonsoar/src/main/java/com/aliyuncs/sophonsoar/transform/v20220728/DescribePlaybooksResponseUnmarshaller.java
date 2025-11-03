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

import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybooksResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybooksResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybooksResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlaybooksResponseUnmarshaller {

	public static DescribePlaybooksResponse unmarshall(DescribePlaybooksResponse describePlaybooksResponse, UnmarshallerContext _ctx) {
		
		describePlaybooksResponse.setRequestId(_ctx.stringValue("DescribePlaybooksResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribePlaybooksResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribePlaybooksResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribePlaybooksResponse.Page.PageSize"));
		describePlaybooksResponse.setPage(page);

		List<Data> playbooks = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlaybooksResponse.Playbooks.Length"); i++) {
			Data data = new Data();
			data.setDisplayName(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].DisplayName"));
			data.setPlaybookUuid(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].PlaybookUuid"));
			data.setOwnType(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].OwnType"));
			data.setActive(_ctx.integerValue("DescribePlaybooksResponse.Playbooks["+ i +"].Active"));
			data.setLastRuntime(_ctx.longValue("DescribePlaybooksResponse.Playbooks["+ i +"].LastRuntime"));
			data.setPermission(_ctx.integerValue("DescribePlaybooksResponse.Playbooks["+ i +"].Permission"));
			data.setGmtCreate(_ctx.longValue("DescribePlaybooksResponse.Playbooks["+ i +"].GmtCreate"));
			data.setPlaybookStatus(_ctx.integerValue("DescribePlaybooksResponse.Playbooks["+ i +"].PlaybookStatus"));
			data.setGmtModified(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].GmtModified"));
			data.setParamType(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].ParamType"));
			data.setDescription(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].Description"));
			data.setTenantId(_ctx.stringValue("DescribePlaybooksResponse.Playbooks["+ i +"].TenantId"));

			playbooks.add(data);
		}
		describePlaybooksResponse.setPlaybooks(playbooks);
	 
	 	return describePlaybooksResponse;
	}
}