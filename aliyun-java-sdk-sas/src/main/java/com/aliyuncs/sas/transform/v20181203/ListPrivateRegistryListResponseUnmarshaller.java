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

import com.aliyuncs.sas.model.v20181203.ListPrivateRegistryListResponse;
import com.aliyuncs.sas.model.v20181203.ListPrivateRegistryListResponse.ImageRegistryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivateRegistryListResponseUnmarshaller {

	public static ListPrivateRegistryListResponse unmarshall(ListPrivateRegistryListResponse listPrivateRegistryListResponse, UnmarshallerContext _ctx) {
		
		listPrivateRegistryListResponse.setRequestId(_ctx.stringValue("ListPrivateRegistryListResponse.RequestId"));

		List<ImageRegistryInfo> imageRegistryInfos = new ArrayList<ImageRegistryInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivateRegistryListResponse.ImageRegistryInfos.Length"); i++) {
			ImageRegistryInfo imageRegistryInfo = new ImageRegistryInfo();
			imageRegistryInfo.setVpcId(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].VpcId"));
			imageRegistryInfo.setToken(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].Token"));
			imageRegistryInfo.setWhiteList(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].WhiteList"));
			imageRegistryInfo.setAliUid(_ctx.longValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].AliUid"));
			imageRegistryInfo.setRegistryType(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].RegistryType"));
			imageRegistryInfo.setDomainName(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].DomainName"));
			imageRegistryInfo.setRegionId(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].RegionId"));
			imageRegistryInfo.setPassword(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].Password"));
			imageRegistryInfo.setNetType(_ctx.longValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].NetType"));
			imageRegistryInfo.setRegistryVersion(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].RegistryVersion"));
			imageRegistryInfo.setProtocolType(_ctx.longValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].ProtocolType"));
			imageRegistryInfo.setRegistryHostIp(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].RegistryHostIp"));
			imageRegistryInfo.setUserName(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].UserName"));
			imageRegistryInfo.setId(_ctx.longValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].Id"));
			imageRegistryInfo.setRegistryName(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].RegistryName"));
			imageRegistryInfo.setPersistenceDay(_ctx.longValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].PersistenceDay"));
			imageRegistryInfo.setJenkinsEnv(_ctx.stringValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].JenkinsEnv"));
			imageRegistryInfo.setTransPerHour(_ctx.integerValue("ListPrivateRegistryListResponse.ImageRegistryInfos["+ i +"].TransPerHour"));

			imageRegistryInfos.add(imageRegistryInfo);
		}
		listPrivateRegistryListResponse.setImageRegistryInfos(imageRegistryInfos);
	 
	 	return listPrivateRegistryListResponse;
	}
}