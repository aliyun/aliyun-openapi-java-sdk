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

import com.aliyuncs.sas.model.v20181203.DescribePropertyScaDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyScaDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyScaDetailResponse.PropertySca;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyScaDetailResponseUnmarshaller {

	public static DescribePropertyScaDetailResponse unmarshall(DescribePropertyScaDetailResponse describePropertyScaDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertyScaDetailResponse.setRequestId(_ctx.stringValue("DescribePropertyScaDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyScaDetailResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyScaDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyScaDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertyScaDetailResponse.PageInfo.Count"));
		describePropertyScaDetailResponse.setPageInfo(pageInfo);

		List<PropertySca> propertys = new ArrayList<PropertySca>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyScaDetailResponse.Propertys.Length"); i++) {
			PropertySca propertySca = new PropertySca();
			propertySca.setType(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Type"));
			propertySca.setBizTypeDispaly(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].BizTypeDispaly"));
			propertySca.setProcessStarted(_ctx.longValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ProcessStarted"));
			propertySca.setInternetIp(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].InternetIp"));
			propertySca.setConfigPath(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ConfigPath"));
			propertySca.setPid(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Pid"));
			propertySca.setPort(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Port"));
			propertySca.setCmdline(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Cmdline"));
			propertySca.setBizType(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].BizType"));
			propertySca.setListenIp(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ListenIp"));
			propertySca.setVersion(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Version"));
			propertySca.setInstanceName(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].InstanceName"));
			propertySca.setListenStatus(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ListenStatus"));
			propertySca.setName(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Name"));
			propertySca.setIp(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Ip"));
			propertySca.setProcessUser(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ProcessUser"));
			propertySca.setInstanceId(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].InstanceId"));
			propertySca.setWebPath(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].WebPath"));
			propertySca.setPpid(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Ppid"));
			propertySca.setIntranetIp(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertySca.setUuid(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Uuid"));
			propertySca.setListenProtocol(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ListenProtocol"));
			propertySca.setImageName(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ImageName"));
			propertySca.setPath(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Path"));
			propertySca.setContainerName(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].ContainerName"));
			propertySca.setProof(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].Proof"));
			propertySca.setCreateTimestamp(_ctx.longValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertySca.setRuntimeEnvVersion(_ctx.stringValue("DescribePropertyScaDetailResponse.Propertys["+ i +"].RuntimeEnvVersion"));

			propertys.add(propertySca);
		}
		describePropertyScaDetailResponse.setPropertys(propertys);
	 
	 	return describePropertyScaDetailResponse;
	}
}