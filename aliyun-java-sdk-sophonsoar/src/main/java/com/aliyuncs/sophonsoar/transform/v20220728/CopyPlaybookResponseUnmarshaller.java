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

import com.aliyuncs.sophonsoar.model.v20220728.CopyPlaybookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.CopyPlaybookResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.CopyPlaybookResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyPlaybookResponseUnmarshaller {

	public static CopyPlaybookResponse unmarshall(CopyPlaybookResponse copyPlaybookResponse, UnmarshallerContext _ctx) {
		
		copyPlaybookResponse.setRequestId(_ctx.stringValue("CopyPlaybookResponse.RequestId"));

		Data data = new Data();
		data.setDisplayName(_ctx.stringValue("CopyPlaybookResponse.Data.DisplayName"));
		data.setPlaybookUuid(_ctx.stringValue("CopyPlaybookResponse.Data.PlaybookUuid"));
		data.setOwnType(_ctx.stringValue("CopyPlaybookResponse.Data.OwnType"));
		data.setActive(_ctx.integerValue("CopyPlaybookResponse.Data.Active"));
		data.setLastRuntime(_ctx.longValue("CopyPlaybookResponse.Data.LastRuntime"));
		data.setPermission(_ctx.integerValue("CopyPlaybookResponse.Data.Permission"));
		data.setGmtCreate(_ctx.longValue("CopyPlaybookResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("CopyPlaybookResponse.Data.GmtModified"));
		data.setHistoryMd5(_ctx.integerValue("CopyPlaybookResponse.Data.HistoryMd5"));
		data.setSuccNum(_ctx.integerValue("CopyPlaybookResponse.Data.SuccNum"));
		data.setFailNum(_ctx.integerValue("CopyPlaybookResponse.Data.FailNum"));
		data.setFailRate(_ctx.doubleValue("CopyPlaybookResponse.Data.FailRate"));
		data.setInputParams(_ctx.stringValue("CopyPlaybookResponse.Data.InputParams"));
		data.setOutputParams(_ctx.stringValue("CopyPlaybookResponse.Data.OutputParams"));
		data.setDescription(_ctx.stringValue("CopyPlaybookResponse.Data.Description"));
		data.setLogicReleaseTaskflowMd5(_ctx.stringValue("CopyPlaybookResponse.Data.LogicReleaseTaskflowMd5"));
		data.setPlaybookStatus(_ctx.integerValue("CopyPlaybookResponse.Data.PlaybookStatus"));
		data.setTenantId(_ctx.stringValue("CopyPlaybookResponse.Data.TenantId"));
		copyPlaybookResponse.setData(data);

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("CopyPlaybookResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("CopyPlaybookResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("CopyPlaybookResponse.Page.PageSize"));
		copyPlaybookResponse.setPage(page);
	 
	 	return copyPlaybookResponse;
	}
}