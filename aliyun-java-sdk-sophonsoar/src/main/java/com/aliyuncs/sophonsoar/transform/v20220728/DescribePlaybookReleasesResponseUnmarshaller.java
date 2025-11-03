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

import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookReleasesResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookReleasesResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookReleasesResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlaybookReleasesResponseUnmarshaller {

	public static DescribePlaybookReleasesResponse unmarshall(DescribePlaybookReleasesResponse describePlaybookReleasesResponse, UnmarshallerContext _ctx) {
		
		describePlaybookReleasesResponse.setRequestId(_ctx.stringValue("DescribePlaybookReleasesResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribePlaybookReleasesResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribePlaybookReleasesResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribePlaybookReleasesResponse.Page.PageSize"));
		describePlaybookReleasesResponse.setPage(page);

		List<Data> records = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlaybookReleasesResponse.Records.Length"); i++) {
			Data data = new Data();
			data.setId(_ctx.integerValue("DescribePlaybookReleasesResponse.Records["+ i +"].Id"));
			data.setGmtCreate(_ctx.longValue("DescribePlaybookReleasesResponse.Records["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.longValue("DescribePlaybookReleasesResponse.Records["+ i +"].GmtModified"));
			data.setPlaybookId(_ctx.longValue("DescribePlaybookReleasesResponse.Records["+ i +"].PlaybookId"));
			data.setReleaseUuid(_ctx.stringValue("DescribePlaybookReleasesResponse.Records["+ i +"].ReleaseUuid"));
			data.setCreator(_ctx.stringValue("DescribePlaybookReleasesResponse.Records["+ i +"].Creator"));
			data.setDescription(_ctx.stringValue("DescribePlaybookReleasesResponse.Records["+ i +"].Description"));
			data.setTaskflowMd5(_ctx.stringValue("DescribePlaybookReleasesResponse.Records["+ i +"].TaskflowMd5"));
			data.setFlowFlag(_ctx.integerValue("DescribePlaybookReleasesResponse.Records["+ i +"].FlowFlag"));
			data.setFlowTag(_ctx.integerValue("DescribePlaybookReleasesResponse.Records["+ i +"].FlowTag"));

			records.add(data);
		}
		describePlaybookReleasesResponse.setRecords(records);
	 
	 	return describePlaybookReleasesResponse;
	}
}