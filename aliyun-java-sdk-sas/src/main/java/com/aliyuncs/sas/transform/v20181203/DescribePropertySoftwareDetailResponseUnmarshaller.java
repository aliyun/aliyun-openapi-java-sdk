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

import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareDetailResponse.PropertySoftware;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertySoftwareDetailResponseUnmarshaller {

	public static DescribePropertySoftwareDetailResponse unmarshall(DescribePropertySoftwareDetailResponse describePropertySoftwareDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertySoftwareDetailResponse.setRequestId(_ctx.stringValue("DescribePropertySoftwareDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertySoftwareDetailResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertySoftwareDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertySoftwareDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertySoftwareDetailResponse.PageInfo.Count"));
		describePropertySoftwareDetailResponse.setPageInfo(pageInfo);

		List<PropertySoftware> propertys = new ArrayList<PropertySoftware>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertySoftwareDetailResponse.Propertys.Length"); i++) {
			PropertySoftware propertySoftware = new PropertySoftware();
			propertySoftware.setInternetIp(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].InternetIp"));
			propertySoftware.setIp(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].Ip"));
			propertySoftware.setInstanceId(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].InstanceId"));
			propertySoftware.setIntranetIp(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertySoftware.setInstallTime(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].InstallTime"));
			propertySoftware.setUuid(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].Uuid"));
			propertySoftware.setVersion(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].Version"));
			propertySoftware.setInstanceName(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].InstanceName"));
			propertySoftware.setPath(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].Path"));
			propertySoftware.setName(_ctx.stringValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].Name"));
			propertySoftware.setCreateTimestamp(_ctx.longValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertySoftware.setInstallTimeDt(_ctx.longValue("DescribePropertySoftwareDetailResponse.Propertys["+ i +"].InstallTimeDt"));

			propertys.add(propertySoftware);
		}
		describePropertySoftwareDetailResponse.setPropertys(propertys);
	 
	 	return describePropertySoftwareDetailResponse;
	}
}