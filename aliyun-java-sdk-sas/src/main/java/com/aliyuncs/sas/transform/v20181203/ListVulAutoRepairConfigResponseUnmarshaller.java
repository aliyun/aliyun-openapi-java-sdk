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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListVulAutoRepairConfigResponse;
import com.aliyuncs.sas.model.v20181203.ListVulAutoRepairConfigResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListVulAutoRepairConfigResponse.VulAutoRepairConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVulAutoRepairConfigResponseUnmarshaller {

	public static ListVulAutoRepairConfigResponse unmarshall(ListVulAutoRepairConfigResponse listVulAutoRepairConfigResponse, UnmarshallerContext _ctx) {
		
		listVulAutoRepairConfigResponse.setRequestId(_ctx.stringValue("ListVulAutoRepairConfigResponse.RequestId"));
		listVulAutoRepairConfigResponse.setSuccess(_ctx.booleanValue("ListVulAutoRepairConfigResponse.Success"));
		listVulAutoRepairConfigResponse.setCode(_ctx.stringValue("ListVulAutoRepairConfigResponse.Code"));
		listVulAutoRepairConfigResponse.setMessage(_ctx.stringValue("ListVulAutoRepairConfigResponse.Message"));
		listVulAutoRepairConfigResponse.setHttpStatusCode(_ctx.integerValue("ListVulAutoRepairConfigResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListVulAutoRepairConfigResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListVulAutoRepairConfigResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListVulAutoRepairConfigResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListVulAutoRepairConfigResponse.PageInfo.Count"));
		listVulAutoRepairConfigResponse.setPageInfo(pageInfo);

		List<VulAutoRepairConfig> vulAutoRepairConfigList = new ArrayList<VulAutoRepairConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList.Length"); i++) {
			VulAutoRepairConfig vulAutoRepairConfig = new VulAutoRepairConfig();
			vulAutoRepairConfig.setId(_ctx.longValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList["+ i +"].Id"));
			vulAutoRepairConfig.setName(_ctx.stringValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList["+ i +"].Name"));
			vulAutoRepairConfig.setType(_ctx.stringValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList["+ i +"].Type"));
			vulAutoRepairConfig.setAliasName(_ctx.stringValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList["+ i +"].AliasName"));
			vulAutoRepairConfig.setReason(_ctx.stringValue("ListVulAutoRepairConfigResponse.VulAutoRepairConfigList["+ i +"].Reason"));

			vulAutoRepairConfigList.add(vulAutoRepairConfig);
		}
		listVulAutoRepairConfigResponse.setVulAutoRepairConfigList(vulAutoRepairConfigList);
	 
	 	return listVulAutoRepairConfigResponse;
	}
}