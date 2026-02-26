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

import com.aliyuncs.sas.model.v20181203.PageImageRegistryResponse;
import com.aliyuncs.sas.model.v20181203.PageImageRegistryResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.PageImageRegistryResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageImageRegistryResponseUnmarshaller {

	public static PageImageRegistryResponse unmarshall(PageImageRegistryResponse pageImageRegistryResponse, UnmarshallerContext _ctx) {
		
		pageImageRegistryResponse.setRequestId(_ctx.stringValue("PageImageRegistryResponse.RequestId"));
		pageImageRegistryResponse.setSuccess(_ctx.booleanValue("PageImageRegistryResponse.Success"));
		pageImageRegistryResponse.setCode(_ctx.stringValue("PageImageRegistryResponse.Code"));
		pageImageRegistryResponse.setMessage(_ctx.stringValue("PageImageRegistryResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("PageImageRegistryResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("PageImageRegistryResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("PageImageRegistryResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("PageImageRegistryResponse.PageInfo.Count"));
		pageImageRegistryResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageImageRegistryResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("PageImageRegistryResponse.List["+ i +"].Id"));
			listItem.setGmtCreate(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].GmtModified"));
			listItem.setAliUid(_ctx.longValue("PageImageRegistryResponse.List["+ i +"].AliUid"));
			listItem.setRegistryName(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].RegistryName"));
			listItem.setRegistryType(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].RegistryType"));
			listItem.setProtocolType(_ctx.integerValue("PageImageRegistryResponse.List["+ i +"].ProtocolType"));
			listItem.setNetType(_ctx.integerValue("PageImageRegistryResponse.List["+ i +"].NetType"));
			listItem.setVpcId(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].VpcId"));
			listItem.setRegistryHostIp(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].RegistryHostIp"));
			listItem.setDomainName(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].DomainName"));
			listItem.setUserName(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].UserName"));
			listItem.setPassword(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].Password"));
			listItem.setRegionId(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].RegionId"));
			listItem.setToken(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].Token"));
			listItem.setWhiteList(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].WhiteList"));
			listItem.setBlackList(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].BlackList"));
			listItem.setTransPerHour(_ctx.integerValue("PageImageRegistryResponse.List["+ i +"].TransPerHour"));
			listItem.setPersistenceDay(_ctx.integerValue("PageImageRegistryResponse.List["+ i +"].PersistenceDay"));
			listItem.setImageCount(_ctx.integerValue("PageImageRegistryResponse.List["+ i +"].ImageCount"));
			listItem.setJenkinsEnv(_ctx.stringValue("PageImageRegistryResponse.List["+ i +"].JenkinsEnv"));

			list.add(listItem);
		}
		pageImageRegistryResponse.setList(list);
	 
	 	return pageImageRegistryResponse;
	}
}