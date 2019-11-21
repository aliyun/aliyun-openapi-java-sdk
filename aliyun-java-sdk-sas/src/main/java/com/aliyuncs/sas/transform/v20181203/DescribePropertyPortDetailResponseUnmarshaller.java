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

import com.aliyuncs.sas.model.v20181203.DescribePropertyPortDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyPortDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyPortDetailResponse.PropertyPort;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyPortDetailResponseUnmarshaller {

	public static DescribePropertyPortDetailResponse unmarshall(DescribePropertyPortDetailResponse describePropertyPortDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertyPortDetailResponse.setRequestId(_ctx.stringValue("DescribePropertyPortDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyPortDetailResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyPortDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyPortDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyPortDetailResponse.PageInfo.CurrentPage"));
		describePropertyPortDetailResponse.setPageInfo(pageInfo);

		List<PropertyPort> propertys = new ArrayList<PropertyPort>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyPortDetailResponse.Propertys.Length"); i++) {
			PropertyPort propertyPort = new PropertyPort();
			propertyPort.setBindIp(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].BindIp"));
			propertyPort.setPort(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].Port"));
			propertyPort.setInstanceName(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].InstanceName"));
			propertyPort.setProto(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].Proto"));
			propertyPort.setIp(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].Ip"));
			propertyPort.setCreate(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].Create"));
			propertyPort.setCreateTimestamp(_ctx.longValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertyPort.setProcName(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].ProcName"));
			propertyPort.setUuid(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].Uuid"));
			propertyPort.setInstanceId(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].InstanceId"));
			propertyPort.setIntranetIp(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertyPort.setInternetIp(_ctx.stringValue("DescribePropertyPortDetailResponse.Propertys["+ i +"].InternetIp"));

			propertys.add(propertyPort);
		}
		describePropertyPortDetailResponse.setPropertys(propertys);
	 
	 	return describePropertyPortDetailResponse;
	}
}