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

import com.aliyuncs.sas.model.v20181203.DescribePropertyProcDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyProcDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyProcDetailResponse.PropertyProc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyProcDetailResponseUnmarshaller {

	public static DescribePropertyProcDetailResponse unmarshall(DescribePropertyProcDetailResponse describePropertyProcDetailResponse, UnmarshallerContext _ctx) {
		
		describePropertyProcDetailResponse.setRequestId(_ctx.stringValue("DescribePropertyProcDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyProcDetailResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyProcDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyProcDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyProcDetailResponse.PageInfo.CurrentPage"));
		describePropertyProcDetailResponse.setPageInfo(pageInfo);

		List<PropertyProc> propertys = new ArrayList<PropertyProc>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyProcDetailResponse.Propertys.Length"); i++) {
			PropertyProc propertyProc = new PropertyProc();
			propertyProc.setPname(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Pname"));
			propertyProc.setEuidName(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].EuidName"));
			propertyProc.setInstanceName(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].InstanceName"));
			propertyProc.setPid(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Pid"));
			propertyProc.setPath(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Path"));
			propertyProc.setCmdline(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Cmdline"));
			propertyProc.setName(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Name"));
			propertyProc.setUser(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].User"));
			propertyProc.setMd5(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Md5"));
			propertyProc.setCreate(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Create"));
			propertyProc.setCreateTimestamp(_ctx.longValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].CreateTimestamp"));
			propertyProc.setStartTime(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].StartTime"));
			propertyProc.setUuid(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].Uuid"));
			propertyProc.setInstanceId(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].InstanceId"));
			propertyProc.setIntranetIp(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].IntranetIp"));
			propertyProc.setInternetIp(_ctx.stringValue("DescribePropertyProcDetailResponse.Propertys["+ i +"].InternetIp"));

			propertys.add(propertyProc);
		}
		describePropertyProcDetailResponse.setPropertys(propertys);
	 
	 	return describePropertyProcDetailResponse;
	}
}