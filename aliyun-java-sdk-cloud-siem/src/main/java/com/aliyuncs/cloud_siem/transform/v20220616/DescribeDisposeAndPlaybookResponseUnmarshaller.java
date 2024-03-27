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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeAndPlaybookResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeAndPlaybookResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeAndPlaybookResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeAndPlaybookResponse.Data.ResponseDataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeAndPlaybookResponse.Data.ResponseDataItem.PlaybookListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisposeAndPlaybookResponseUnmarshaller {

	public static DescribeDisposeAndPlaybookResponse unmarshall(DescribeDisposeAndPlaybookResponse describeDisposeAndPlaybookResponse, UnmarshallerContext _ctx) {
		
		describeDisposeAndPlaybookResponse.setRequestId(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.RequestId"));
		describeDisposeAndPlaybookResponse.setSuccess(_ctx.booleanValue("DescribeDisposeAndPlaybookResponse.Success"));
		describeDisposeAndPlaybookResponse.setCode(_ctx.integerValue("DescribeDisposeAndPlaybookResponse.Code"));
		describeDisposeAndPlaybookResponse.setMessage(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeDisposeAndPlaybookResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeDisposeAndPlaybookResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("DescribeDisposeAndPlaybookResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setEntityId(_ctx.longValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].EntityId"));
			responseDataItem.setOpcodeMap(_ctx.mapValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].OpcodeMap"));
			responseDataItem.setEntityInfo(_ctx.mapValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].EntityInfo"));
			responseDataItem.setDispose(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].Dispose"));
			responseDataItem.setAlertNum(_ctx.integerValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].AlertNum"));

			List<String> opcodeSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].OpcodeSet.Length"); j++) {
				opcodeSet.add(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].OpcodeSet["+ j +"]"));
			}
			responseDataItem.setOpcodeSet(opcodeSet);

			List<String> scope = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].Scope.Length"); j++) {
				scope.add(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].Scope["+ j +"]"));
			}
			responseDataItem.setScope(scope);

			List<PlaybookListItem> playbookList = new ArrayList<PlaybookListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList.Length"); j++) {
				PlaybookListItem playbookListItem = new PlaybookListItem();
				playbookListItem.setOpCode(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].OpCode"));
				playbookListItem.setOpLevel(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].OpLevel"));
				playbookListItem.setDescription(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].Description"));
				playbookListItem.setDisplayName(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].DisplayName"));
				playbookListItem.setTaskConfig(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].TaskConfig"));
				playbookListItem.setName(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].Name"));
				playbookListItem.setWafPlaybook(_ctx.booleanValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].WafPlaybook"));

				List<String> paramConfig = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].ParamConfig.Length"); k++) {
					paramConfig.add(_ctx.stringValue("DescribeDisposeAndPlaybookResponse.Data.ResponseData["+ i +"].PlaybookList["+ j +"].ParamConfig["+ k +"]"));
				}
				playbookListItem.setParamConfig(paramConfig);

				playbookList.add(playbookListItem);
			}
			responseDataItem.setPlaybookList(playbookList);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		describeDisposeAndPlaybookResponse.setData(data);
	 
	 	return describeDisposeAndPlaybookResponse;
	}
}