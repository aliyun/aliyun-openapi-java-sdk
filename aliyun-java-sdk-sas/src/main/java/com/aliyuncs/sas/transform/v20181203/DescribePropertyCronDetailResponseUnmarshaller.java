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

import com.aliyuncs.sas.model.v20181203.DescribePropertyCronDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyCronDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyCronDetailResponse.PropertyCron;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyCronDetailResponseUnmarshaller {

	public static DescribePropertyCronDetailResponse unmarshall(DescribePropertyCronDetailResponse describePropertyCronDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertyCronDetailResponse.setRequestId(_ctx.stringValue("DescribePropertyCronDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyCronDetailResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyCronDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyCronDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyCronDetailResponse.PageInfo.CurrentPage"));
		describePropertyCronDetailResponse.setPageInfo(pageInfo);

		List<PropertyCron> propertys = new ArrayList<PropertyCron>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyCronDetailResponse.Propertys.Length"); i++) {
			PropertyCron propertyCron = new PropertyCron();
			propertyCron.setInstanceName(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].InstanceName"));
			propertyCron.setIp(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Ip"));
			propertyCron.setCreate(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Create"));
			propertyCron.setCreateTimestamp(_ctx.longValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertyCron.setUuid(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Uuid"));
			propertyCron.setInstanceId(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].InstanceId"));
			propertyCron.setIntranetIp(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertyCron.setInternetIp(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].InternetIp"));
			propertyCron.setPeriod(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Period"));
			propertyCron.setSource(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Source"));
			propertyCron.setCmd(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Cmd"));
			propertyCron.setUser(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].User"));
			propertyCron.setMd5(_ctx.stringValue("DescribePropertyCronDetailResponse.Propertys["+ i +"].Md5"));

			propertys.add(propertyCron);
		}
		describePropertyCronDetailResponse.setPropertys(propertys);
	 
	 	return describePropertyCronDetailResponse;
	}
}