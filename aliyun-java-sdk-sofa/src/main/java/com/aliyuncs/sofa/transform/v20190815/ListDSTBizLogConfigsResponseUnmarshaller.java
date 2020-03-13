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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDSTBizLogConfigsResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTBizLogConfigsResponse.BizLogConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTBizLogConfigsResponseUnmarshaller {

	public static ListDSTBizLogConfigsResponse unmarshall(ListDSTBizLogConfigsResponse listDSTBizLogConfigsResponse, UnmarshallerContext _ctx) {
		
		listDSTBizLogConfigsResponse.setRequestId(_ctx.stringValue("ListDSTBizLogConfigsResponse.RequestId"));
		listDSTBizLogConfigsResponse.setResultCode(_ctx.stringValue("ListDSTBizLogConfigsResponse.ResultCode"));
		listDSTBizLogConfigsResponse.setResultMessage(_ctx.stringValue("ListDSTBizLogConfigsResponse.ResultMessage"));
		listDSTBizLogConfigsResponse.setPageNumber(_ctx.longValue("ListDSTBizLogConfigsResponse.PageNumber"));
		listDSTBizLogConfigsResponse.setPageSize(_ctx.longValue("ListDSTBizLogConfigsResponse.PageSize"));
		listDSTBizLogConfigsResponse.setTotalCount(_ctx.longValue("ListDSTBizLogConfigsResponse.TotalCount"));

		List<BizLogConfigsItem> bizLogConfigs = new ArrayList<BizLogConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTBizLogConfigsResponse.BizLogConfigs.Length"); i++) {
			BizLogConfigsItem bizLogConfigsItem = new BizLogConfigsItem();
			bizLogConfigsItem.setAdvSetValid(_ctx.booleanValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].AdvSetValid"));
			bizLogConfigsItem.setApp(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].App"));
			bizLogConfigsItem.setCheckCondition(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].CheckCondition"));
			bizLogConfigsItem.setId(_ctx.longValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].Id"));
			bizLogConfigsItem.setLogBeginRegex(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].LogBeginRegex"));
			bizLogConfigsItem.setLogPath(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].LogPath"));
			bizLogConfigsItem.setLogSample(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].LogSample"));
			bizLogConfigsItem.setName(_ctx.stringValue("ListDSTBizLogConfigsResponse.BizLogConfigs["+ i +"].Name"));

			bizLogConfigs.add(bizLogConfigsItem);
		}
		listDSTBizLogConfigsResponse.setBizLogConfigs(bizLogConfigs);
	 
	 	return listDSTBizLogConfigsResponse;
	}
}